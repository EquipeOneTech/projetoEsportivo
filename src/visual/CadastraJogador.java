/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import javax.swing.JOptionPane;
import objts.Jogador;


/**
 *
 * @author Alunos
 */
public class CadastraJogador extends javax.swing.JInternalFrame {

    /**
     * Creates new form Janela1
     */
    public CadastraJogador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGRUPO = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNascimento = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        edtNomeJogador = new javax.swing.JTextField();
        edtNascimento = new javax.swing.JTextField();
        edtSalario = new javax.swing.JTextField();
        btnCadastrarJogador = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        edtAltura = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        edtPeso = new javax.swing.JTextField();
        lblPes = new javax.swing.JLabel();
        lblPosicao = new javax.swing.JLabel();
        edtPosicao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radioTITULAR = new javax.swing.JRadioButton();
        radioRESERVA = new javax.swing.JRadioButton();
        radioSUSPENSO = new javax.swing.JRadioButton();
        radioSAUDE = new javax.swing.JRadioButton();
        comboTime = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Medico"));

        lblNascimento.setText("Nascimento:");

        lblNome.setText("Nome:");

        lblSalario.setText("Salário:");

        btnCadastrarJogador.setText("Cadastrar");
        btnCadastrarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarJogadorActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblAltura.setText("Altura:");

        lblPes.setText("Peso:");

        lblPosicao.setText("Posição");

        jLabel4.setText("Status:");

        radioGRUPO.add(radioTITULAR);
        radioTITULAR.setSelected(true);
        radioTITULAR.setText("Titular");

        radioGRUPO.add(radioRESERVA);
        radioRESERVA.setText("Reserva");

        radioGRUPO.add(radioSUSPENSO);
        radioSUSPENSO.setText("Suspenso");

        radioGRUPO.add(radioSAUDE);
        radioSAUDE.setText("Saúde");

        comboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Time:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblNascimento)
                            .addComponent(lblAltura)
                            .addComponent(lblPes)
                            .addComponent(lblPosicao))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edtPosicao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edtPeso, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edtAltura, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edtNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnCadastrarJogador)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(radioTITULAR)
                                .addGap(18, 18, 18)
                                .addComponent(radioRESERVA)
                                .addGap(18, 18, 18)
                                .addComponent(radioSUSPENSO)
                                .addGap(18, 18, 18)
                                .addComponent(radioSAUDE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSalario)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboTime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(edtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicao)
                    .addComponent(edtPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioTITULAR)
                    .addComponent(radioRESERVA)
                    .addComponent(radioSUSPENSO)
                    .addComponent(radioSAUDE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarJogador)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
    }// </editor-fold>//GEN-END:initComponents

       

   
    private void btnCadastrarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarJogadorActionPerformed
        String posicao = null;
        if(radioRESERVA.isSelected()){
            posicao = "Reserva";
        }else if(radioSAUDE.isSelected()){
            posicao = "Saude";
        }else if(radioSUSPENSO.isSelected()){
            posicao = "Suspenso";
        }else if(radioTITULAR.isSelected()){
            posicao = "Titular";
        }
        int altura = Integer.parseInt(edtAltura.getText()); 
        int peso = Integer.parseInt(edtPeso.getText());
        double salario = Double.parseDouble(edtSalario.getText());
        
        Jogador jogador = new Jogador(edtNomeJogador.getText(), edtNascimento.getText(),altura,
        peso,edtPosicao.getText(), posicao, salario);
        //String nome, String nascimento, int altura, int peso, String posicao, String status, double salario        
    }//GEN-LAST:event_btnCadastrarJogadorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarJogador;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboTime;
    private javax.swing.JTextField edtAltura;
    private javax.swing.JTextField edtNascimento;
    private javax.swing.JTextField edtNomeJogador;
    private javax.swing.JTextField edtPeso;
    private javax.swing.JTextField edtPosicao;
    private javax.swing.JTextField edtSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPes;
    private javax.swing.JLabel lblPosicao;
    private javax.swing.JLabel lblSalario;
    private javax.swing.ButtonGroup radioGRUPO;
    private javax.swing.JRadioButton radioRESERVA;
    private javax.swing.JRadioButton radioSAUDE;
    private javax.swing.JRadioButton radioSUSPENSO;
    private javax.swing.JRadioButton radioTITULAR;
    // End of variables declaration//GEN-END:variables
}
