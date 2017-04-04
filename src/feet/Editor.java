package feet;

import feet.bancodedados.BancoDeDados;
import feet.estadios.Estadio;
import feet.times.Time;
import feet.times.AdicionarTime;
import feet.tecnicos.Tecnico;
import feet.jogadores.Jogador;
import feet.jogadores.AdicionarJogador;
import feet.tecnicos.AdicionarTecnico;
import feet.tecnicos.TrocarImagemTecnico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class Editor extends javax.swing.JFrame {

    private BancoDeDados bd;
    private DefaultTableModel dtmTimes;
    private DefaultTableModel dtmJogadores;
    private DefaultTableModel dtmTecnicos;
    private DefaultTableModel dtmEstadios;
    private Inicio ini;
    private Time timeSelecionado;
    private Jogador jogadorSelecionado;
    private Tecnico tecnicoSelecionado;
    private Estadio estadioSelecionado;
    
    public Editor(BancoDeDados bd, Inicio ini) {
        initComponents();
        popularComboPais();
        popularComboEstado();
        this.bd = bd;
        this.ini = ini;
        this.ini.setVisible(false);
        this.dtmTimes = (DefaultTableModel) this.tabelaTimes.getModel();
        this.dtmJogadores = (DefaultTableModel) this.tabelaJogadores.getModel();
        this.dtmTecnicos = (DefaultTableModel) this.tabelaTecnicos.getModel();
        this.dtmEstadios = (DefaultTableModel) this.tabelaEstadios.getModel();                               
        popularTabelaTimes();
        this.lblValorForca.setText(sliderForcaJogador.getValue() + "");
        this.lblValorIdade.setText(sliderIdadeJogador.getValue() + "");
        enabledCamposEdicaoJogador(false);
        enabledCamposEdicaoTime(false);
        popularTabelaTecnicos();
        popularTabelaEstadios();
    }

    private void enabledCamposEdicaoTime(boolean visible){
        campoNomeTime.setEnabled(visible);
        comboPaisTime.setEnabled(visible);
        comboEstadoTime.setEnabled(visible);
        btnRemoverTime.setEnabled(visible);       
        btnAlterarTime.setEnabled(visible);       
    }
    
    private void enabledCamposEdicaoTecnico(boolean visible){
        campoNomeTecnico.setEnabled(visible);
        comboPaisTecnico.setEnabled(visible);
        sliderOfensivoTecnico.setEnabled(visible);
        comboTimeTecnico.setEnabled(visible);
        
        btnRemoverTime.setEnabled(visible);       
        btnAlterarTime.setEnabled(visible);       
    }
    
    private void enabledCamposEdicaoJogador(boolean visible){
        campoNomeJogador.setEnabled(visible);
        sliderIdadeJogador.setEnabled(visible);
        sliderForcaJogador.setEnabled(visible);
        comboHabilidadeJogador.setEnabled(visible);
        checkCraque.setEnabled(visible);        
        btnAlterarJogador.setEnabled(visible);
        btnRemoverJogador.setEnabled(visible);
        btnAdicionarJogador.setEnabled(visible);
        comboHabilidadeJogador.setEnabled(visible);
        comboMelhorPe.setEnabled(visible);
        comboPaisJogador.setEnabled(visible);
        comboTitular.setEnabled(visible);
        comboPosicao.setEnabled(visible);
        sliderAgressividadeJogador.setEnabled(visible);
    }
    
    public void popularTabelaEstadios(){
        
        int rowCount = this.dtmEstadios.getRowCount();
        
        for (int i = rowCount - 1; i >= 0; i--) {
            this.dtmEstadios.removeRow(i);
        }
        
        for(Estadio e : getBd().getListaEstadios()){
            this.dtmEstadios.addRow(new Object[]{e});
        }
        
    }
    
    public void popularTabelaTecnicos(){
        
        int rowCount = this.dtmTecnicos.getRowCount();
        
        for (int i = rowCount - 1; i >= 0; i--) {
            this.dtmTecnicos.removeRow(i);
        }
        
        for(Tecnico t : getBd().getListaTecnicos()){
            this.dtmTecnicos.addRow(new Object[]{t});
        }
    }
    
    public void popularTabelaTimes(){
        
        int rowCount = this.dtmTimes.getRowCount();
        
        for (int i = rowCount - 1; i >= 0; i--) {
            this.dtmTimes.removeRow(i);
        }
        
        for(Time t : getBd().getListaTimes()){
            this.dtmTimes.addRow(new Object[]{t});
        }        
    }
    
    public void popularTabelaJogadores(){
        
        int rowCount = this.dtmJogadores.getRowCount();
        
        for (int i = rowCount - 1; i >= 0; i--) {
            this.dtmJogadores.removeRow(i);
        }
        
        for(Jogador j : this.timeSelecionado.getListaJogadores()){
            this.dtmJogadores.addRow(new Object[]{j});
        }        
    }
    
    private void popularComboPais(){
        this.comboPaisTime.addItem("Argentina");
        this.comboPaisTime.addItem("Brasil");
        this.comboPaisTime.addItem("Bolivia");
        this.comboPaisTime.addItem("Colombia");
        this.comboPaisTime.addItem("Chile");
        this.comboPaisTime.addItem("Colombia");
        this.comboPaisTime.addItem("Peru");
        this.comboPaisTime.addItem("Venezuela");        
    }
    
    private void popularComboEstado(){
        
        if(comboPaisTime.getSelectedItem().equals("Brasil")){
            this.comboEstadoTime.setEnabled(true);
            this.comboEstadoTime.addItem("Acre");
            this.comboEstadoTime.addItem("Paraná");
            this.comboEstadoTime.addItem("Santa Catarina");
            this.comboEstadoTime.addItem("Rio Grande do Sul");
            this.comboEstadoTime.addItem("São Paulo");
            this.comboEstadoTime.addItem("Rio de Janeiro");            
        } else {
            this.comboEstadoTime.setEnabled(false);
        }
    }
        
    public BancoDeDados getBd() {
        return bd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTimes = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNomeTime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboPaisTime = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboEstadoTime = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAdicionarTime = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaJogadores = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        campoNomeJogador = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        sliderIdadeJogador = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        sliderForcaJogador = new javax.swing.JSlider();
        jLabel10 = new javax.swing.JLabel();
        comboHabilidadeJogador = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        checkCraque = new javax.swing.JCheckBox();
        lblValorIdade = new javax.swing.JLabel();
        lblValorForca = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboPosicao = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        comboMelhorPe = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        comboTitular = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        comboPaisJogador = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        sliderAgressividadeJogador = new javax.swing.JSlider();
        lblValorAgressividade = new javax.swing.JLabel();
        lblEstadio = new javax.swing.JLabel();
        lblTecnico = new javax.swing.JLabel();
        btnAdicionarJogador = new javax.swing.JButton();
        btnRemoverJogador = new javax.swing.JButton();
        btnAlterarJogador = new javax.swing.JButton();
        btnAlterarTime = new javax.swing.JButton();
        btnRemoverTime = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaTecnicos = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        campoNomeTecnico = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        comboPaisTecnico = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sliderOfensivoTecnico = new javax.swing.JSlider();
        comboTimeTecnico = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        btnAlterarImagemTecnico = new javax.swing.JButton();
        valorSliderOfensivo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnAlterarTecnico = new javax.swing.JButton();
        btnAdicionarTecnico = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaEstadios = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tabelaTimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTimes.getTableHeader().setReorderingAllowed(false);
        tabelaTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTimesMouseClicked(evt);
            }
        });
        tabelaTimes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaTimesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaTimes);
        if (tabelaTimes.getColumnModel().getColumnCount() > 0) {
            tabelaTimes.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nome:");

        jLabel2.setText("País:");

        comboPaisTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisTimeActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado:");

        jLabel4.setText("Estádio:");

        jLabel5.setText("Técnico:");

        btnAdicionarTime.setText("Adicionar");
        btnAdicionarTime.setContentAreaFilled(false);
        btnAdicionarTime.setOpaque(true);
        btnAdicionarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTimeActionPerformed(evt);
            }
        });

        tabelaJogadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaJogadoresMouseClicked(evt);
            }
        });
        tabelaJogadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaJogadoresKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaJogadores);
        if (tabelaJogadores.getColumnModel().getColumnCount() > 0) {
            tabelaJogadores.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Nome:");

        jLabel8.setText("Idade:");

        sliderIdadeJogador.setBackground(new java.awt.Color(255, 255, 255));
        sliderIdadeJogador.setForeground(new java.awt.Color(255, 255, 255));
        sliderIdadeJogador.setMaximum(35);
        sliderIdadeJogador.setMinimum(17);
        sliderIdadeJogador.setValue(20);
        sliderIdadeJogador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderIdadeJogadorStateChanged(evt);
            }
        });

        jLabel9.setText("Força:");

        sliderForcaJogador.setBackground(new java.awt.Color(255, 255, 255));
        sliderForcaJogador.setForeground(new java.awt.Color(255, 255, 255));
        sliderForcaJogador.setValue(30);
        sliderForcaJogador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderForcaJogadorStateChanged(evt);
            }
        });

        jLabel10.setText("Habilidade");

        comboHabilidadeJogador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armação", "Cabeceio", "Camisa 10", "Cruzamento", "Defesa", "Desarme", "Finalização", "Força", "Goleiro", "Imprevisibilidade", "Passe", "Velocidade" }));

        jLabel11.setText("Craque:");

        checkCraque.setBackground(new java.awt.Color(255, 255, 255));

        lblValorIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorIdade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblValorForca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorForca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel12.setText("Posição:");

        comboPosicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Goleiro", "Zagueiro", "Lateral-Direito", "Lateral-Esquerdo", "Volante", "Meio-Campo", "Atacante" }));

        jLabel13.setText("Pé:");

        comboMelhorPe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direito", "Esquerdo", "Ambos" }));

        jLabel14.setText("Titular:");

        comboTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titular", "Reserva", "Afastado" }));

        jLabel15.setText("País:");

        comboPaisJogador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Equador", "Paraguai", "Uruguai", "Peru", "Venezuela" }));

        jLabel16.setText("Agressividade");

        sliderAgressividadeJogador.setBackground(new java.awt.Color(255, 255, 255));
        sliderAgressividadeJogador.setForeground(new java.awt.Color(255, 255, 255));
        sliderAgressividadeJogador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAgressividadeJogadorStateChanged(evt);
            }
        });

        lblValorAgressividade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorAgressividade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNomeJogador))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboHabilidadeJogador, 0, 247, Short.MAX_VALUE)
                            .addComponent(comboTitular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(checkCraque)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboPaisJogador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboPosicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboMelhorPe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sliderAgressividadeJogador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sliderForcaJogador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(sliderIdadeJogador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValorIdade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(lblValorForca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorAgressividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValorIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliderIdadeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderForcaJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorForca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderAgressividadeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorAgressividade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMelhorPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHabilidadeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(comboTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkCraque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboPaisJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        lblEstadio.setForeground(new java.awt.Color(0, 0, 204));
        lblEstadio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadio.setText(" ");

        lblTecnico.setForeground(new java.awt.Color(0, 0, 204));
        lblTecnico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTecnico.setText(" ");

        btnAdicionarJogador.setText("Adicionar Jogador");
        btnAdicionarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarJogadorActionPerformed(evt);
            }
        });

        btnRemoverJogador.setText("Remover Jogador");
        btnRemoverJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverJogadorActionPerformed(evt);
            }
        });

        btnAlterarJogador.setText("Alterar");
        btnAlterarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarJogadorActionPerformed(evt);
            }
        });

        btnAlterarTime.setText("Alterar");
        btnAlterarTime.setContentAreaFilled(false);
        btnAlterarTime.setEnabled(false);
        btnAlterarTime.setOpaque(true);
        btnAlterarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTimeActionPerformed(evt);
            }
        });

        btnRemoverTime.setText("Remover");
        btnRemoverTime.setContentAreaFilled(false);
        btnRemoverTime.setEnabled(false);
        btnRemoverTime.setOpaque(true);
        btnRemoverTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnAlterarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdicionarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoverJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 84, Short.MAX_VALUE))))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(campoNomeTime, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(lblEstadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPaisTime, 0, 100, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(lblTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEstadoTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnAlterarTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionarTime, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoverTime, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(11, 11, 11)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPaisTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstadoTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionarTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemoverTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAdicionarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRemoverJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAlterarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Times", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tabelaTecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Técnico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTecnicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTecnicosMouseClicked(evt);
            }
        });
        tabelaTecnicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaTecnicosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaTecnicos);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Nome:");

        jLabel18.setText("País:");

        jLabel19.setText("Ofensivo:");

        jLabel20.setText("Time:");

        sliderOfensivoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        sliderOfensivoTecnico.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderOfensivoTecnicoStateChanged(evt);
            }
        });

        comboTimeTecnico.setEnabled(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );

        btnAlterarImagemTecnico.setText("Alterar Imagem");
        btnAlterarImagemTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarImagemTecnicoActionPerformed(evt);
            }
        });

        valorSliderOfensivo.setText("         ");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterarTecnico.setText("Alterar");
        btnAlterarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTecnicoActionPerformed(evt);
            }
        });

        btnAdicionarTecnico.setText("Adicionar");
        btnAdicionarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTecnicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderOfensivoTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(comboTimeTecnico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboPaisTecnico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoNomeTecnico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorSliderOfensivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterarImagemTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdicionarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoNomeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPaisTecnico)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sliderOfensivoTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorSliderOfensivo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(comboTimeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarImagemTecnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdicionarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Técnicos", jPanel4);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        tabelaEstadios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estadio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaEstadios);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Estádios", jPanel5);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Jogadores", jPanel14);

        btnVoltar.setText("Voltar");
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setOpaque(true);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.ini.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        this.dispose();
        this.ini.setVisible(true);
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tabelaTimesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaTimesKeyPressed
        enabledCamposEdicaoTime(true);
        popularDadosTime();
        
    }//GEN-LAST:event_tabelaTimesKeyPressed

    private void tabelaTimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTimesMouseClicked
        enabledCamposEdicaoTime(true);
        popularDadosTime();
        
    }//GEN-LAST:event_tabelaTimesMouseClicked

    private void btnAdicionarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTimeActionPerformed

        new AdicionarTime(getBd(), this).setVisible(true);
        
    }//GEN-LAST:event_btnAdicionarTimeActionPerformed

    private void sliderIdadeJogadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderIdadeJogadorStateChanged
        lblValorIdade.setText(sliderIdadeJogador.getValue() + "");        
    }//GEN-LAST:event_sliderIdadeJogadorStateChanged

    private void sliderForcaJogadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderForcaJogadorStateChanged
        lblValorForca.setText(sliderForcaJogador.getValue() + "");        
    }//GEN-LAST:event_sliderForcaJogadorStateChanged

    private void btnAdicionarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarJogadorActionPerformed

        new AdicionarJogador(getBd(), this.timeSelecionado, this).setVisible(true);
        
    }//GEN-LAST:event_btnAdicionarJogadorActionPerformed

    private void tabelaJogadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaJogadoresMouseClicked

        popularDadosJogador();
        
    }//GEN-LAST:event_tabelaJogadoresMouseClicked

    private void tabelaJogadoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaJogadoresKeyPressed
        popularDadosJogador();
    }//GEN-LAST:event_tabelaJogadoresKeyPressed

    private void comboPaisTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaisTimeActionPerformed
        popularComboEstado();        
    }//GEN-LAST:event_comboPaisTimeActionPerformed

    private void sliderAgressividadeJogadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAgressividadeJogadorStateChanged
        lblValorAgressividade.setText(sliderAgressividadeJogador.getValue() + "");        
    }//GEN-LAST:event_sliderAgressividadeJogadorStateChanged

    private void btnAlterarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarJogadorActionPerformed

        this.jogadorSelecionado.setNome(campoNomeJogador.getText());
        this.jogadorSelecionado.setIdade(sliderIdadeJogador.getValue());
        this.jogadorSelecionado.setForca(sliderForcaJogador.getValue());
        this.jogadorSelecionado.setAgressividade(sliderAgressividadeJogador.getValue());
        this.jogadorSelecionado.setPosicao(comboPosicao.getSelectedItem() + "");
        this.jogadorSelecionado.setMelhorPe(comboMelhorPe.getSelectedItem() + "");
        this.jogadorSelecionado.setHabilidade(comboHabilidadeJogador.getSelectedItem() + "");
        this.jogadorSelecionado.setTitular(comboTitular.getSelectedItem() + "");
        this.jogadorSelecionado.setCraque(checkCraque.isSelected());
        this.jogadorSelecionado.setPais(comboPaisJogador.getSelectedItem() + "");
        
        popularTabelaJogadores();
        
        JOptionPane.showMessageDialog(null, "Jogador editado com sucesso");
    }//GEN-LAST:event_btnAlterarJogadorActionPerformed

    private void btnRemoverJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverJogadorActionPerformed
        
        getBd().removeJogador(this.jogadorSelecionado);
        getBd().removeJogadorInTime(this.jogadorSelecionado, this.timeSelecionado);
        
        popularTabelaTimes();
        popularTabelaJogadores();        
        clearCamposJogador();
        btnAdicionarJogador.setEnabled(true);
    }//GEN-LAST:event_btnRemoverJogadorActionPerformed

    private void btnAlterarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTimeActionPerformed

        this.timeSelecionado.setNome(campoNomeTime.getText().trim());
        this.timeSelecionado.setPais(comboPaisTime.getSelectedItem() + "");
        this.timeSelecionado.setEstado(comboEstadoTime.getSelectedItem() + "");
        
        popularTabelaTimes();

        JOptionPane.showMessageDialog(null, "Time editado com sucesso");
        
    }//GEN-LAST:event_btnAlterarTimeActionPerformed

    private void btnRemoverTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverTimeActionPerformed
        
        getBd().removeAllJogadoresTime(this.timeSelecionado);
        getBd().getListaTimes().remove(this.timeSelecionado);
        popularTabelaTimes();
        popularTabelaJogadores();
        clearCamposTime();
        clearCamposJogador();
        enabledCamposEdicaoTime(false);
        enabledCamposEdicaoJogador(false);
        
    }//GEN-LAST:event_btnRemoverTimeActionPerformed

    private void tabelaTecnicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTecnicosMouseClicked

        popularDadosTreinador();
        
    }//GEN-LAST:event_tabelaTecnicosMouseClicked

    private void sliderOfensivoTecnicoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderOfensivoTecnicoStateChanged

        valorSliderOfensivo.setText(sliderOfensivoTecnico.getValue() + "");        
        
    }//GEN-LAST:event_sliderOfensivoTecnicoStateChanged

    private void tabelaTecnicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaTecnicosKeyPressed

        popularDadosTreinador();
        
    }//GEN-LAST:event_tabelaTecnicosKeyPressed

    private void btnAlterarImagemTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarImagemTecnicoActionPerformed

        new TrocarImagemTecnico(getBd(), this, this.tecnicoSelecionado).setVisible(true);
        
    }//GEN-LAST:event_btnAlterarImagemTecnicoActionPerformed

    private void btnAlterarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTecnicoActionPerformed

        this.tecnicoSelecionado.setNome(campoNomeTecnico.getText());
        this.tecnicoSelecionado.setPais(comboPaisTecnico.getSelectedItem() + "");
        this.tecnicoSelecionado.setOfensivo(sliderOfensivoTecnico.getValue());        
        
        popularTabelaTecnicos();
        
    }//GEN-LAST:event_btnAlterarTecnicoActionPerformed

    private void btnAdicionarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTecnicoActionPerformed

        new AdicionarTecnico(this.bd, this).setVisible(true);
        this.setEnabled(false);
        
    }//GEN-LAST:event_btnAdicionarTecnicoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        this.tecnicoSelecionado = (Tecnico) this.dtmTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), tabelaTecnicos.getSelectedColumn()); 
        
        this.bd.removeTecnico(this.tecnicoSelecionado);
        
        if(this.tecnicoSelecionado.getTime() != null){
            this.bd.removeTecnicoInTime(this.tecnicoSelecionado.getTime());    
        }
        
        popularTabelaTecnicos();
        
        if(this.dtmTecnicos.getRowCount() > 0){
            enabledCamposEdicaoTecnico(true);
            this.tabelaTecnicos.setRowSelectionInterval(0, 0);
            popularDadosTreinador();
            
        } else {            
            clearCamposTecnico();
            enabledCamposEdicaoTecnico(false);    
        }
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void popularDadosTreinador(){
        
        this.tecnicoSelecionado = (Tecnico) this.dtmTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), tabelaTecnicos.getSelectedColumn()); 
        
        campoNomeTecnico.setText(this.tecnicoSelecionado.getNome());
        comboPaisTecnico.setSelectedItem(this.tecnicoSelecionado.getPais());
        sliderOfensivoTecnico.setValue(this.tecnicoSelecionado.getOfensivo());
        comboTimeTecnico.addItem(this.tecnicoSelecionado.getTime() + "");        
    }
    
    private void clearCamposTecnico(){
        
        campoNomeTecnico.setText("");
        comboPaisTecnico.setSelectedIndex(0);
        sliderOfensivoTecnico.setValue(50);
        comboTimeTecnico.removeAllItems();        
        
    }
    
    private void clearCamposJogador(){
        
        campoNomeJogador.setText("");
        sliderIdadeJogador.setValue(20);
        sliderForcaJogador.setValue(30);
        sliderAgressividadeJogador.setValue(50);
        comboPosicao.setSelectedIndex(0);
        comboMelhorPe.setSelectedIndex(0);
        comboHabilidadeJogador.setSelectedIndex(0);
        comboTitular.setSelectedIndex(0);
        checkCraque.setSelected(false);
        comboPaisJogador.setSelectedIndex(0);
        enabledCamposEdicaoJogador(false);        
    }
    
    private void clearCamposTime(){
        
        campoNomeTime.setText("");        
        comboPaisJogador.setSelectedIndex(0);
        comboEstadoTime.setSelectedIndex(0);
        lblEstadio.setText("");
        lblTecnico.setText("");
        enabledCamposEdicaoJogador(false);        
    }
    
    public void popularDadosTime(){        
        
        this.timeSelecionado = (Time) this.dtmTimes.getValueAt(tabelaTimes.getSelectedRow(), tabelaTimes.getSelectedColumn());        
        
        campoNomeTime.setText(this.timeSelecionado.getNome());
        comboPaisTime.setSelectedItem(this.timeSelecionado.getPais());
        popularComboEstado();
        comboEstadoTime.setSelectedItem(this.timeSelecionado.getEstado());
        
        if(this.timeSelecionado.getEstadio() == null){            
            lblEstadio.setText("Sem Estádio");
        } else {
            lblEstadio.setText(this.timeSelecionado.getEstadio().getNome());
        }
        
        if(this.timeSelecionado.getTecnico() == null){
            lblTecnico.setText("Sem Técnico");    
        } else {
            lblTecnico.setText(this.timeSelecionado.getTecnico().getNome());
        }
        
        btnAlterarTime.setEnabled(true);
        btnAdicionarTime.setEnabled(true);
        btnRemoverTime.setEnabled(true);        
        popularTabelaJogadores();        
    }
    
    public void popularDadosJogador(){        
        
        this.jogadorSelecionado = (Jogador) this.dtmJogadores.getValueAt(tabelaJogadores.getSelectedRow(), tabelaJogadores.getSelectedColumn());
        campoNomeJogador.setText(this.jogadorSelecionado.getNome());        
        sliderForcaJogador.setValue(this.jogadorSelecionado.getForca());
        sliderIdadeJogador.setValue(this.jogadorSelecionado.getIdade());
        comboPosicao.setSelectedItem(this.jogadorSelecionado.getPosicao());
        comboMelhorPe.setSelectedItem(this.jogadorSelecionado.getMelhorPe());
        comboHabilidadeJogador.setSelectedItem(this.jogadorSelecionado.getHabilidade());
        checkCraque.setSelected(this.jogadorSelecionado.isCraque());
        comboPaisJogador.setSelectedItem(this.jogadorSelecionado.getPais());        
        sliderAgressividadeJogador.setValue(this.jogadorSelecionado.getAgressividade());
        
        enabledCamposEdicaoJogador(true);
        popularTabelaJogadores();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarJogador;
    private javax.swing.JButton btnAdicionarTecnico;
    private javax.swing.JButton btnAdicionarTime;
    private javax.swing.JButton btnAlterarImagemTecnico;
    private javax.swing.JButton btnAlterarJogador;
    private javax.swing.JButton btnAlterarTecnico;
    private javax.swing.JButton btnAlterarTime;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRemoverJogador;
    private javax.swing.JButton btnRemoverTime;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoNomeJogador;
    private javax.swing.JTextField campoNomeTecnico;
    private javax.swing.JTextField campoNomeTime;
    private javax.swing.JCheckBox checkCraque;
    private javax.swing.JComboBox<String> comboEstadoTime;
    private javax.swing.JComboBox<String> comboHabilidadeJogador;
    private javax.swing.JComboBox<String> comboMelhorPe;
    private javax.swing.JComboBox<String> comboPaisJogador;
    private javax.swing.JComboBox<String> comboPaisTecnico;
    private javax.swing.JComboBox<String> comboPaisTime;
    private javax.swing.JComboBox<String> comboPosicao;
    private javax.swing.JComboBox<String> comboTimeTecnico;
    private javax.swing.JComboBox<String> comboTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEstadio;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblTecnico;
    private javax.swing.JLabel lblValorAgressividade;
    private javax.swing.JLabel lblValorForca;
    private javax.swing.JLabel lblValorIdade;
    private javax.swing.JSlider sliderAgressividadeJogador;
    private javax.swing.JSlider sliderForcaJogador;
    private javax.swing.JSlider sliderIdadeJogador;
    private javax.swing.JSlider sliderOfensivoTecnico;
    private javax.swing.JTable tabelaEstadios;
    private javax.swing.JTable tabelaJogadores;
    private javax.swing.JTable tabelaTecnicos;
    private javax.swing.JTable tabelaTimes;
    private javax.swing.JLabel valorSliderOfensivo;
    // End of variables declaration//GEN-END:variables
}
