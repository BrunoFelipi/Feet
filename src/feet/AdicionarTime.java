package feet;

import javax.swing.JOptionPane;

public class AdicionarTime extends javax.swing.JFrame {

    private BancoDeDados bd;
    private Time time;    
    private Time timeClonado;
    private Editor editor;
    
    public AdicionarTime(BancoDeDados bd, Editor editor) {
        initComponents();
        this.bd = bd;
        this.editor = editor;
        this.editor.setEnabled(false);
        popularComboTime();
        popularComboEstadio();
        popularComboTecnico();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNomeTime = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        comboClonarTime = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        btnClonar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboPais = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboEstadio = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboTecnico = new javax.swing.JComboBox();
        btnCriarTime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Time");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Clonar time:");

        comboClonarTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum time selecionado" }));
        comboClonarTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboClonarTimeFocusLost(evt);
            }
        });
        comboClonarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClonarTimeActionPerformed(evt);
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

        jLabel6.setText("País:");

        comboPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Equador", "Paraguai", "Uruguai", "Peru", "Venezuela" }));
        comboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Argentina", "Bolivia", "Brasil", "Chile", "Colômbia", "Equador", "Paraguai", "Uruguai", "Peru", "Venezuela" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Estadio:");

        jLabel4.setText("Técnico:");

        btnCriarTime.setText("Criar Time");
        btnCriarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCriarTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboClonarTime, 0, 236, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClonar)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(campoNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(comboPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(comboEstadio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(comboTecnico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(comboClonarTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClonar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCriarTime)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void popularComboTime(){
        
        for(Time t : this.bd.getListaTimes()){
            comboClonarTime.addItem(t);
        }
        
    }
    
    private void popularComboEstadio(){
        
        for(Estadio e : this.bd.getListaEstadios()){
            comboEstadio.addItem(e);
        }
        
    }
    
    private void popularComboTecnico(){
        
        for(Tecnico tec : this.bd.getListaTecnicos()){
            comboTecnico.addItem(tec);
        }
        
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.editor.setEnabled(true);
        this.editor.popularTabelaTimes();
        
    }//GEN-LAST:event_formWindowClosing

    private void comboClonarTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboClonarTimeFocusLost

    }//GEN-LAST:event_comboClonarTimeFocusLost

    private void comboClonarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClonarTimeActionPerformed

        if(!comboClonarTime.getSelectedItem().equals("Nenhum time selecionado")){
            btnClonar.setEnabled(true);
        } else {
            btnClonar.setEnabled(false);
        }

    }//GEN-LAST:event_comboClonarTimeActionPerformed

    private void btnClonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClonarActionPerformed
/*
        if(!comboClonarTime.getSelectedItem().equals("Nenhum time selecionado")){
            this.timeClonado = (Time) comboClonarTime.getSelectedItem();

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
*/
    }//GEN-LAST:event_btnClonarActionPerformed

    private void comboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPaisActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void btnCriarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarTimeActionPerformed

        if(campoNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o nome do time");
            return;
        }
        
        String estado = comboEstado.getSelectedItem() + "";
        String pais = comboPais.getSelectedItem() + "";
        Estadio e = (Estadio) comboEstadio.getSelectedItem();
        Tecnico tec = (Tecnico) comboTecnico.getSelectedItem();
                
        this.time = new Time(this.bd.getNextIdTime(), campoNome.getText(), estado, pais, e, tec);
        
        this.editor.getBd().getListaTimes().add(this.time);
        
        JOptionPane.showMessageDialog(null, "Time " + this.time.getNome() + " criado!");        
        
    }//GEN-LAST:event_btnCriarTimeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClonar;
    private javax.swing.JButton btnCriarTime;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox comboClonarTime;
    private javax.swing.JComboBox comboEstadio;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JComboBox comboPais;
    private javax.swing.JComboBox comboTecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblNomeTime;
    // End of variables declaration//GEN-END:variables
}
