
package br.com.estreladasaude.visao;

import br.com.estreladasaude.modelo.Paciente;
import br.com.estreladasaude.controle.ControlePaciente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaAtualizarCadastro extends javax.swing.JFrame {
    private String cpf;
    
    public TelaAtualizarCadastro(String cpf) {
        this.cpf = cpf;
        initComponents();
        atualizarTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaciente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Paciente", "CPF", "Data de Nascimento", "Celular", "Email", "Convênio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPaciente);
        if (tblPaciente.getColumnModel().getColumnCount() > 0) {
            tblPaciente.getColumnModel().getColumn(0).setMinWidth(50);
            tblPaciente.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Confirme ou atualize seus dados ");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 348, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Cadastro confirmado com sucesso! Por favor, dirija-se a recepção");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPaciente;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela(){
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                ControlePaciente controle = new ControlePaciente();
                String colunas[] = {"Código", "Paciente", "CPF", "Data de nascimento", "Celular", "Email", "Convênio"};
                DefaultTableModel modelo = new DefaultTableModel(null, colunas){
                    public boolean isCellEditable(int row, int column){
                    // Torna a primeira coluna (coluna "Código") não editável
                    return column != 0;
                    }
                };
                Paciente paciente = controle.buscarPaciente(cpf);
                
                
                    modelo.addRow(new Object[]{
                        paciente.getCodigo(),
                        paciente.getNome(),
                        paciente.getCpf(),
                        paciente.getDataN(),
                        paciente.getCell(),
                        paciente.getEmail(),
                        paciente.getConvenio()});
                
                
                tblPaciente.setModel(modelo);
                
            }
        });
    }

}
