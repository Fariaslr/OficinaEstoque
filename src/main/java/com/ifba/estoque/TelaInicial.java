package com.ifba.estoque;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TelaInicial extends javax.swing.JFrame {

    @Autowired
    ItemRepository itemRepository;

    public TelaInicial() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTirulo = new javax.swing.JLabel();
        lblNomeItem = new javax.swing.JLabel();
        txtNomeItem = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTirulo.setText("PROGRAMA DE ESTOQUE");

        lblNomeItem.setText("Nome do item");

        lblQuantidade.setText("Quantidade");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTirulo)
                    .addComponent(lblNomeItem)
                    .addComponent(txtNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCadastrar)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTirulo)
                .addGap(18, 18, 18)
                .addComponent(lblNomeItem)
                .addGap(2, 2, 2)
                .addComponent(txtNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(43, 43, 43))
        );

        setSize(new java.awt.Dimension(279, 268));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ItemModel item = new ItemModel();
        
        item.setNomeItem(txtNomeItem.getText());
        item.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        itemRepository.save(item);
        JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
        txtNomeItem.setText(null);
        txtQuantidade.setText(null);
        

    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            ApplicationContext spring = SpringApplication.run(TelaInicial.class, args);
            spring.getBean(TelaInicial.class).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lblNomeItem;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTirulo;
    private javax.swing.JTextField txtNomeItem;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
