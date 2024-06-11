
package br.com.estreladasaude.visao;

import br.com.estreladasaude.utils.Validar;
import br.com.estreladasaude.controle.ControlePaciente;
import java.awt.Color;


public class MenuPrincipal extends javax.swing.JFrame {

    private TelaCadastro telaCadastro = null;
    private TelaAtualizarCadastro telaAtualizarCadastro;
    
    public MenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCPFInicial = new javax.swing.JTextField();
        btnContinuarInicial = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Início"));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Bem vindo a clínica Estrela da Saúde!");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel2.setText("Para iniciarmos o atendimento, por favor, insira seu CPF abaixo:");

        txtCPFInicial.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtCPFInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFInicialActionPerformed(evt);
            }
        });

        btnContinuarInicial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnContinuarInicial.setText("Continuar");
        btnContinuarInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarInicialActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("CPF:");

        lblErro.setBackground(new java.awt.Color(255, 0, 0));
        lblErro.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblErro.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txtCPFInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblErro))
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btnContinuarInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPFInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblErro))
                .addGap(55, 55, 55)
                .addComponent(btnContinuarInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarInicialActionPerformed
        String cpf = txtCPFInicial.getText();
        
        ControlePaciente controle = new ControlePaciente();
        
        if(Validar.cpf(cpf)){
            lblErro.setText("️✔️️");
            lblErro.setForeground(Color.GREEN);
            if(controle.buscarPacientePorCPF(cpf)){
                telaAtualizarCadastro = new TelaAtualizarCadastro(cpf);
                telaAtualizarCadastro.setVisible(true);
                dispose();   
            }else if(telaCadastro == null){ 
                telaCadastro = new TelaCadastro(true);
                dispose();
                telaCadastro.setVisible(true);
            }    
            
                  
        }else
            lblErro.setText("CPF inválido");
    }//GEN-LAST:event_btnContinuarInicialActionPerformed

    private void txtCPFInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFInicialActionPerformed

    }//GEN-LAST:event_txtCPFInicialActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuarInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErro;
    private javax.swing.JTextField txtCPFInicial;
    // End of variables declaration//GEN-END:variables
}
