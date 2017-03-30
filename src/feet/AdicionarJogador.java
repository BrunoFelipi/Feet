package feet;

import javax.swing.JOptionPane;

public class AdicionarJogador extends javax.swing.JFrame {

    private BancoDeDados bd;
    private Time time;
    private Jogador jogador;
    private Jogador jogadorClonado;
    private Editor editor;
    
    public AdicionarJogador(BancoDeDados bd, Time time, Editor editor) {
        initComponents();
        this.bd = bd;
        this.time = time;
        this.editor = editor;
        this.editor.setEnabled(false);
        popularComboClonarJogador();
        this.lblNomeTime.setText(this.time.getNome());
        this.lblValorAgressividade.setText(sliderAgressividade.getValue() + "");
        this.lblValorForca.setText(sliderForca.getValue() + "");
        this.lblValorIdade.setText(sliderIdade.getValue() + "");
        enabledCamposEdicaoJogador(true);
    }

    private void enabledCamposEdicaoJogador(boolean visible){
        campoNome.setEnabled(visible);
        sliderIdade.setEnabled(visible);
        sliderForca.setEnabled(visible);
        comboHabilidade.setEnabled(visible);
        checkCraque.setEnabled(visible);        
        comboHabilidade.setEnabled(visible);
        comboMelhorPe.setEnabled(visible);
        comboPais.setEnabled(visible);
        comboTitular.setEnabled(visible);
        comboPosicao.setEnabled(visible);
        sliderAgressividade.setEnabled(visible);
        btnAdicionar.setEnabled(visible);
    }
    
    private void popularComboClonarJogador(){
        
        for(Jogador j : this.time.getListaJogadores()){
            comboClonarJogador.addItem(j);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNomeTime = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        comboClonarJogador = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        btnClonar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sliderIdade = new javax.swing.JSlider();
        sliderForca = new javax.swing.JSlider();
        sliderAgressividade = new javax.swing.JSlider();
        comboPosicao = new javax.swing.JComboBox<>();
        comboMelhorPe = new javax.swing.JComboBox<>();
        comboHabilidade = new javax.swing.JComboBox<>();
        checkCraque = new javax.swing.JCheckBox();
        comboTitular = new javax.swing.JComboBox<>();
        comboPais = new javax.swing.JComboBox<>();
        lblValorAgressividade = new javax.swing.JLabel();
        lblValorIdade = new javax.swing.JLabel();
        lblValorForca = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Jogador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Clonar jogador:");

        comboClonarJogador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum jogador selecionado" }));
        comboClonarJogador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboClonarJogadorFocusLost(evt);
            }
        });
        comboClonarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClonarJogadorActionPerformed(evt);
            }
        });

        btnClonar.setText("Clonar");
        btnClonar.setEnabled(false);
        btnClonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClonarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Idade:");

        jLabel4.setText("Força:");

        jLabel5.setText("Posição:");

        jLabel6.setText("País:");

        jLabel7.setText("Habilidade:");

        jLabel8.setText("Craque:");

        jLabel9.setText("Titular:");

        jLabel10.setText("Melhor pé:");

        jLabel11.setText("Agressividade:");

        sliderIdade.setBackground(new java.awt.Color(255, 255, 255));
        sliderIdade.setForeground(java.awt.Color.white);
        sliderIdade.setMaximum(35);
        sliderIdade.setMinimum(17);
        sliderIdade.setValue(23);
        sliderIdade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderIdadeStateChanged(evt);
            }
        });

        sliderForca.setBackground(new java.awt.Color(255, 255, 255));
        sliderForca.setForeground(java.awt.Color.white);
        sliderForca.setValue(30);
        sliderForca.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderForcaStateChanged(evt);
            }
        });

        sliderAgressividade.setBackground(new java.awt.Color(255, 255, 255));
        sliderAgressividade.setForeground(java.awt.Color.white);
        sliderAgressividade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAgressividadeStateChanged(evt);
            }
        });

        comboPosicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Goleiro", "Zagueiro", "Lateral-Direito", "Lateral-Esquerdo", "Volante", "Meio-Campo", "Atacante" }));

        comboMelhorPe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direito", "Esquerdo", "Ambos" }));

        comboHabilidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armação", "Cabeceio", "Camisa 10", "Cruzamento", "Defesa", "Desarme", "Finalização", "Força", "Goleiro", "Imprevisibilidade", "Passe", "Velocidade" }));

        checkCraque.setBackground(new java.awt.Color(255, 255, 255));
        checkCraque.setForeground(java.awt.Color.white);
        checkCraque.setText("jCheckBox1");

        comboTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titular", "Reserva", "Afastado" }));

        comboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Equador", "Paraguai", "Uruguai", "Peru", "Venezuela" }));
        comboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisActionPerformed(evt);
            }
        });

        lblValorAgressividade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorAgressividade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorAgressividade.setText(" ");

        lblValorIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorIdade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorIdade.setText(" ");

        lblValorForca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorForca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorForca.setText(" ");

        btnAdicionar.setText("Criar Jogador");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboClonarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClonar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(sliderAgressividade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblValorAgressividade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(sliderForca, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                .addComponent(sliderIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblValorIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblValorForca, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkCraque, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboPosicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboMelhorPe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboHabilidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboTitular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboClonarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClonar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderIdade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorIdade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderForca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(lblValorForca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderAgressividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorAgressividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboMelhorPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkCraque, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnAdicionar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPaisActionPerformed

    private void btnClonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClonarActionPerformed

        if(!comboClonarJogador.getSelectedItem().equals("Nenhum jogador selecionado")){
            this.jogadorClonado = (Jogador) comboClonarJogador.getSelectedItem();
            
            campoNome.setText(this.jogadorClonado.getNome());
            sliderIdade.setValue(this.jogadorClonado.getIdade());
            sliderForca.setValue(this.jogadorClonado.getForca());
            sliderAgressividade.setValue(this.jogadorClonado.getAgressividade());
            comboPosicao.setSelectedItem(this.jogadorClonado.getPosicao());
            comboMelhorPe.setSelectedItem(this.jogadorClonado.getMelhorPe());
            comboHabilidade.setSelectedItem(this.jogadorClonado.getHabilidade());
            comboTitular.setSelectedItem(this.jogadorClonado.getTitular());
            checkCraque.setSelected(this.jogadorClonado.isCraque());
            comboPais.setSelectedItem(this.jogadorClonado.getPais());
            enabledCamposEdicaoJogador(true);
            
        }
        
    }//GEN-LAST:event_btnClonarActionPerformed

    private void comboClonarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClonarJogadorActionPerformed

        if(!comboClonarJogador.getSelectedItem().equals("Nenhum jogador selecionado")){                       
            btnClonar.setEnabled(true);
        } else {
            btnClonar.setEnabled(false);
        }
        
    }//GEN-LAST:event_comboClonarJogadorActionPerformed

    private void sliderIdadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderIdadeStateChanged
        lblValorIdade.setText(sliderIdade.getValue() + "");        
    }//GEN-LAST:event_sliderIdadeStateChanged

    private void sliderForcaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderForcaStateChanged
        lblValorForca.setText(sliderForca.getValue() + "");
    }//GEN-LAST:event_sliderForcaStateChanged

    private void sliderAgressividadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAgressividadeStateChanged
        lblValorAgressividade.setText(sliderAgressividade.getValue() + "");
    }//GEN-LAST:event_sliderAgressividadeStateChanged

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        if(campoNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o nome do jogador");
            return;
        }
        
        this.jogador = new Jogador(this.bd.getNextIdJogador(), campoNome.getText(), sliderIdade.getValue(), sliderForca.getValue(),
                comboPosicao.getSelectedItem() + "", comboPais.getSelectedItem() + "", comboHabilidade.getSelectedItem() + "",
                checkCraque.isSelected(), comboTitular.getSelectedItem() + "", comboMelhorPe.getSelectedItem() + "", this.time, 
                sliderAgressividade.getValue());        
        
        this.editor.getBd().getListaJogadores().add(this.jogador);
        this.editor.getBd().addJogadorInTime(this.jogador, this.time);
        
        JOptionPane.showMessageDialog(null, "Jogador " + this.jogador.getNome() + " criado!");
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void comboClonarJogadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboClonarJogadorFocusLost

        enabledCamposEdicaoJogador(true);
        
    }//GEN-LAST:event_comboClonarJogadorFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.editor.setEnabled(true);
        this.editor.popularTabelaJogadores();
        
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnClonar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JCheckBox checkCraque;
    private javax.swing.JComboBox comboClonarJogador;
    private javax.swing.JComboBox<String> comboHabilidade;
    private javax.swing.JComboBox<String> comboMelhorPe;
    private javax.swing.JComboBox<String> comboPais;
    private javax.swing.JComboBox<String> comboPosicao;
    private javax.swing.JComboBox<String> comboTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblNomeTime;
    private javax.swing.JLabel lblValorAgressividade;
    private javax.swing.JLabel lblValorForca;
    private javax.swing.JLabel lblValorIdade;
    private javax.swing.JSlider sliderAgressividade;
    private javax.swing.JSlider sliderForca;
    private javax.swing.JSlider sliderIdade;
    // End of variables declaration//GEN-END:variables
}
