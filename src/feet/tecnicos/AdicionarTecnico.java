package feet.tecnicos;

import feet.bancodedados.BancoDeDados;
import feet.Editor;
import feet.times.Time;
import javax.swing.JOptionPane;

public class AdicionarTecnico extends javax.swing.JFrame {

    private BancoDeDados bd;
    private Time time;
    private Tecnico tecnico;
    private Tecnico tecnicoClonado;
    private Editor editor;
    
    public AdicionarTecnico(BancoDeDados bd, Editor editor) {
        initComponents();
        this.bd = bd;
        this.editor = editor;
        this.editor.setEnabled(false);
        popularComboClonarTecnico();
        this.lblValorForca.setText(sliderOfensivo.getValue() + "");
        enabledCamposEdicaoTecnico(true);
    }

    private void enabledCamposEdicaoTecnico(boolean visible){
        campoNome.setEnabled(visible);        
        sliderOfensivo.setEnabled(visible);
        comboPais.setEnabled(visible);
        btnAdicionar.setEnabled(visible);
    }
    
    private void popularComboClonarTecnico(){
                
        for(Tecnico t : this.bd.getListaTecnicos()){
            comboClonarTecnico.addItem(t);
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboClonarTecnico = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        btnClonar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sliderOfensivo = new javax.swing.JSlider();
        comboPais = new javax.swing.JComboBox<>();
        lblValorForca = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Jogador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Clonar técnico:");

        comboClonarTecnico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum técnico selecionado" }));
        comboClonarTecnico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboClonarTecnicoFocusLost(evt);
            }
        });
        comboClonarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClonarTecnicoActionPerformed(evt);
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

        jLabel4.setText("Ofensivo:");

        jLabel6.setText("País:");

        sliderOfensivo.setBackground(new java.awt.Color(255, 255, 255));
        sliderOfensivo.setForeground(java.awt.Color.white);
        sliderOfensivo.setValue(30);
        sliderOfensivo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderOfensivoStateChanged(evt);
            }
        });

        comboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Equador", "Paraguai", "Uruguai", "Peru", "Venezuela" }));
        comboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisActionPerformed(evt);
            }
        });

        lblValorForca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorForca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorForca.setText(" ");

        btnAdicionar.setText("Criar Técnico");
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboClonarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnClonar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboPais, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sliderOfensivo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblValorForca, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboClonarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClonar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliderOfensivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorForca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        if(!comboClonarTecnico.getSelectedItem().equals("Nenhum jogador selecionado")){
            this.tecnicoClonado = (Tecnico) comboClonarTecnico.getSelectedItem();
            
            campoNome.setText(this.tecnicoClonado.getNome());
            sliderOfensivo.setValue(this.tecnicoClonado.getOfensivo());            
            comboPais.setSelectedItem(this.tecnicoClonado.getPais());
            enabledCamposEdicaoTecnico(true);            
        }
        
    }//GEN-LAST:event_btnClonarActionPerformed

    private void comboClonarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClonarTecnicoActionPerformed

        if(!comboClonarTecnico.getSelectedItem().equals("Nenhum técnico selecionado")){                       
            btnClonar.setEnabled(true);
        } else {
            btnClonar.setEnabled(false);
        }
        
    }//GEN-LAST:event_comboClonarTecnicoActionPerformed

    private void sliderOfensivoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderOfensivoStateChanged
        lblValorForca.setText(sliderOfensivo.getValue() + "");
    }//GEN-LAST:event_sliderOfensivoStateChanged

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        if(campoNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o nome do técnico");
            return;
        }
        
        this.tecnico = new Tecnico(this.bd.getNextIdTecnico(), campoNome.getText(), comboPais.getSelectedItem() + "",
                sliderOfensivo.getValue(), null);        
        
        this.editor.getBd().getListaTecnicos().add(this.tecnico);
        this.editor.popularTabelaTecnicos();
        
        JOptionPane.showMessageDialog(null, "Técnico '" + this.tecnico.getNome() + "' criado!");
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void comboClonarTecnicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboClonarTecnicoFocusLost

        enabledCamposEdicaoTecnico(true);
        
    }//GEN-LAST:event_comboClonarTecnicoFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.editor.setEnabled(true);
        this.editor.popularTabelaTecnicos();
        
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnClonar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox comboClonarTecnico;
    private javax.swing.JComboBox<String> comboPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblValorForca;
    private javax.swing.JSlider sliderOfensivo;
    // End of variables declaration//GEN-END:variables
}
