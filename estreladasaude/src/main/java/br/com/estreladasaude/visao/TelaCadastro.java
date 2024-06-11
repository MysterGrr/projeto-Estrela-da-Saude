
package br.com.estreladasaude.visao;


import br.com.estreladasaude.utils.Validar;
import br.com.estreladasaude.controle.ControlePaciente;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class TelaCadastro extends javax.swing.JFrame {
    
    
    
    public TelaCadastro(boolean par) {
        initComponents();
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCPFCadastro = new javax.swing.JTextField();
        txtCell = new javax.swing.JTextField();
        txtDataN = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblAlertDataN = new javax.swing.JLabel();
        lblAlertEmail = new javax.swing.JLabel();
        lblAlertCPF = new javax.swing.JLabel();
        lblAlertCell = new javax.swing.JLabel();
        lblAlertNome = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtConvenio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Preencha seu cadastro abaixo:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel2.setText("Data de Nascimento:");

        btnCadastrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel4.setText("Celular (DDD):");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel6.setText("Nome:");

        txtCPFCadastro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtCPFCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFCadastroActionPerformed(evt);
            }
        });

        txtCell.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtCell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellActionPerformed(evt);
            }
        });

        txtDataN.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblAlertDataN.setBackground(new java.awt.Color(255, 0, 0));
        lblAlertDataN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAlertDataN.setForeground(new java.awt.Color(204, 0, 0));

        lblAlertEmail.setBackground(new java.awt.Color(255, 0, 0));
        lblAlertEmail.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAlertEmail.setForeground(new java.awt.Color(204, 0, 0));

        lblAlertCPF.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAlertCPF.setForeground(new java.awt.Color(204, 0, 0));

        lblAlertCell.setBackground(new java.awt.Color(255, 0, 0));
        lblAlertCell.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAlertCell.setForeground(new java.awt.Color(204, 0, 0));

        lblAlertNome.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAlertNome.setForeground(new java.awt.Color(204, 0, 0));
        lblAlertNome.setMaximumSize(new java.awt.Dimension(101, 21));
        lblAlertNome.setMinimumSize(new java.awt.Dimension(101, 21));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel10.setText("Convênio:");

        txtConvenio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel10)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlertCell))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlertEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlertCPF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlertNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlertDataN))
                    .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlertNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblAlertCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lblAlertCell, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblAlertDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAlertEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //Inicialização das variaveis para que sejam atribuido o valor do txtCadastro
        String nome = txtNome.getText();
        
        String cpf = txtCPFCadastro.getText();
        
        String cell = txtCell.getText();
        
        //Transforma a String do txtDataN em LocalDate
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
        String textoDataN = txtDataN.getText();
        LocalDate dataN = LocalDate.parse(textoDataN, formato);
        
        String email = txtEmail.getText();
        
        String convenio = txtConvenio.getText();
        
        //Criação da variavel booleana para que a pesistencia só seja efetuada
        //caso todas as verificações necessárias estejam corretas
        boolean validacaoSucesso = true;
        
        ControlePaciente controle = new ControlePaciente();
        
        
        if(Validar.nome(nome)){ //Validação do cpf utilizando o método da classe Validar
            lblAlertNome.setForeground(Color.GREEN);
            lblAlertNome.setText("✔");
            }else{
            lblAlertNome.setForeground(new Color(204, 0, 0));
            lblAlertNome.setText("Nome inválido!");
            validacaoSucesso = false;
        }

        
        if(Validar.cpf(cpf)){ //Validação do cpf utilizando o método da classe Validar
            lblAlertCPF.setForeground(Color.GREEN);
            lblAlertCPF.setText("✔");            
        }else{
            lblAlertCPF.setForeground(new Color(204, 0, 0));
            lblAlertCPF.setText("CPF inválido!");
            validacaoSucesso = false;
        }

        
        if(Validar.cell(cell)){ //Validação do celular utilizando o método da classe Validar
            lblAlertCell.setForeground(Color.GREEN);
            lblAlertCell.setText("️✔️️");
        }else{
            lblAlertCell.setForeground(new Color(204, 0, 0));
            lblAlertCell.setText("Celular inválido!");
            validacaoSucesso = false;
        }

        
        if(Validar.data(textoDataN)){ //Validação da data de nascimento utilizando o método da classe Validar
            lblAlertDataN.setForeground(Color.GREEN);
            lblAlertDataN.setText("️✔️️");
        }else{
            lblAlertDataN.setForeground(new Color(204, 0, 0));
            lblAlertDataN.setText("Data inválida!");
            validacaoSucesso = false;
        }

        
        if(Validar.email(email)){ //Validação do email utilizando o método da classe Validar
            lblAlertEmail.setForeground(Color.GREEN);
            lblAlertEmail.setText("️✔️️");
        }else{
            lblAlertEmail.setForeground(new Color(204, 0, 0));
            lblAlertEmail.setText("Email inválido!");
            validacaoSucesso = false;
        }
        
        
        
        if(validacaoSucesso){
            controle.novoPaciente(nome, cpf, dataN, cell, email, convenio);
            dispose();
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            JOptionPane.showMessageDialog(rootPane, "Cadastro confirmado com sucesso! Por favor, dirija-se a recepção");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro na validação! Por favor, verifique seus dados");
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCPFCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFCadastroActionPerformed

    }//GEN-LAST:event_txtCPFCadastroActionPerformed

    private void txtCellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellActionPerformed

    }//GEN-LAST:event_txtCellActionPerformed

    private void txtDataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNActionPerformed

    }//GEN-LAST:event_txtDataNActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new TelaCadastro(true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlertCPF;
    private javax.swing.JLabel lblAlertCell;
    private javax.swing.JLabel lblAlertDataN;
    private javax.swing.JLabel lblAlertEmail;
    private javax.swing.JLabel lblAlertNome;
    private javax.swing.JTextField txtCPFCadastro;
    private javax.swing.JTextField txtCell;
    private javax.swing.JTextField txtConvenio;
    private javax.swing.JTextField txtDataN;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
