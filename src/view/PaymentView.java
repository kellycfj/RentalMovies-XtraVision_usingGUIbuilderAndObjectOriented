/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//import controller.CardController;
import model.Card;

import model.Creditcard;
import model.Transaction;
import model.Movie;
import controller.DatabaseController;
import java.util.Date;
import javax.swing.JOptionPane;
import controller.MoviesTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Movies;
import view.Congratulation;
import model.Transaction;
import view.Basket2;
import view.Congratulation;
import view.MovieList;

/**
 *
 * @author ingridferrante
 * @author kelly
 */
public class PaymentView extends javax.swing.JFrame {

    protected final Date startDate;
    protected final Date endDate;
    protected final double totalPrice;
    int [] idmovies;
    protected Movie movie;
    /**
     * Creates new form Payment
     */
    public PaymentView(Date startDate, Date endDate, double price, int [] idmovies) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = price;
        this.idmovies = idmovies;
        initComponents();
    
    }

    public PaymentView()
    {
        startDate = null;
        endDate = null;
        totalPrice = 0;
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

        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldCardNumber = new javax.swing.JTextField();
        jTextFieldCvv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxMonth = new javax.swing.JComboBox<>();
        jComboBoxYear = new javax.swing.JComboBox<>();
        jTextFieldCardName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backBasket = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Copperplate", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("XTRA VISION XPRESS");

        jTextField4.setText("CARD NAME");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField6.setText("CARD NAME");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email: ");

        jLabel12.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("cvv: ");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("PAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextFieldCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCardNumberActionPerformed(evt);
            }
        });

        jTextFieldCvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCvvActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("XTRA VISION XPRESS");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("card name: ");

        jLabel10.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("card number: ");

        jLabel11.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("cvv: ");

        jLabel13.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Expires month: ");

        jComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        jComboBoxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMonthActionPerformed(evt);
            }
        });

        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025" }));
        jComboBoxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxYearActionPerformed(evt);
            }
        });

        jTextFieldCardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCardNameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Expires year: ");

        jLabel2.setText("jLabel2");

        backBasket.setBackground(new java.awt.Color(153, 153, 153));
        backBasket.setText("Back");
        backBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBasketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(359, 359, 359)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(backBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel3)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCvv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(backBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel3)
                    .addContainerGap(420, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCardNumberActionPerformed

    private void jTextFieldCvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCvvActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
        try{
                  
            DatabaseController db = new DatabaseController();
            boolean checkCardExistDB = db.checkIfCardExist(jTextFieldCardNumber.getText());
            
//            if(checkCardExistDB == false)
//            {
//                //new customer
//                if(idmovies.length > 2)
//                {
//                    JOptionPane.showMessageDialog(this, "New customers can only rent 2 movies at the same time ");
//                    MovieList backMovieChoice = new MovieList();
//                    backMovieChoice.show();
//                    
//                }
//            }else{
//                
//                if(idmovies.length > 3)
//                {
//                    JOptionPane.showMessageDialog(this, "Returning customers can only rent 4 movies at the same time ");
//                    MovieList backMovieChoice = new MovieList();
//                    backMovieChoice.show();
//                }else{
                
                    //take card information from user
                    Creditcard card = new Creditcard(jTextFieldCardNumber.getText() ,
                        jTextFieldCardName.getText(), 
                        Integer.parseInt(jComboBoxMonth.getSelectedItem().toString()),
                        Integer.parseInt(jComboBoxYear.getSelectedItem().toString()),
                        Integer.parseInt(jTextFieldCvv.getText()));
                        card.checkCardValidation(card);

                    //database
                    boolean create = db.createCardInDatabase(card);

                    //create order
                    Transaction transaction = new Transaction(jTextFieldCardNumber.getText(), startDate, endDate, totalPrice );

                    boolean createTransaction = db.CreateOrderInDatabase(transaction);
                    db.updateQuantityMoviesRented(idmovies);//take idmovies from to deduct stock quantity


                    //show option pane with movies id and title to be returned later 

                    if(createTransaction){
                        
                        JOptionPane.showMessageDialog(this, "Success! Your disc code is: "  );
                        //JOptionPane.showMessageDialog(this, "Success! Your disc code is: " +  bask.idMovies.toString());

                    }      


                    //TODO: if(createTransaction == true) { db.UpdateStockCountInDatabase(..)
                        Congratulation c1 = new Congratulation();
                        c1.show(); // display the congratulation page

                   
                
                
                //}
               
            //}
             
                
                dispose(); // close current frame after open movielist
  
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " +  ex.getMessage());
                    
                    
        }
        
//           try{
//                  
//            DatabaseController db = new DatabaseController();
//            boolean checkCardExistDB = db.checkIfCardExist(jTextFieldCardNumber.getText());
//            
//            if(checkCardExistDB == false)
//            {
//                //new customer
//                if(idmovies.length > 2)
//                {
//                    JOptionPane.showMessageDialog(this, "New customers can only rent 2 movies at the same time ");
//                    MovieList backMovieChoice = new MovieList();
//                    backMovieChoice.show();
//                    
//                }
//            }else{
//                
//                if(idmovies.length > 3)
//                {
//                    JOptionPane.showMessageDialog(this, "Returning customers can only rent 4 movies at the same time ");
//                    MovieList backMovieChoice = new MovieList();
//                    backMovieChoice.show();
//                }else{
//                
//                    //take card information from user
//                    Creditcard card = new Creditcard(jTextFieldCardNumber.getText() ,
//                        jTextFieldCardName.getText(), 
//                        Integer.parseInt(jComboBoxMonth.getSelectedItem().toString()),
//                        Integer.parseInt(jComboBoxYear.getSelectedItem().toString()),
//                        Integer.parseInt(jTextFieldCvv.getText()));
//                        card.checkCardValidation(card);
//
//                    //database
//                    boolean create = db.createCardInDatabase(card);
//
//                    //create order
//                    Transaction transaction = new Transaction(jTextFieldCardNumber.getText(), startDate, endDate, totalPrice );
//
//                    boolean createTransaction = db.CreateOrderInDatabase(transaction);
//                    db.updateQuantityMoviesRented(idmovies);//take idmovies from to deduct stock quantity
//
//
//                    //show option pane with movies id and title to be returned later 
//
//                    if(createTransaction){
//                        
//                        JOptionPane.showMessageDialog(this, "Success! Your disc code is: "  );
//                        //JOptionPane.showMessageDialog(this, "Success! Your disc code is: " +  bask.idMovies.toString());
//
//                    }      
//
//
//                    //TODO: if(createTransaction == true) { db.UpdateStockCountInDatabase(..)
//                        Congratulation c1 = new Congratulation();
//                        c1.show(); // display the congratulation page
//
//                   
//                
//                
//                }
//               
//            }
//             
//                
//                dispose(); // close current frame after open movielist
//  
//        }
//        catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "Error: " +  ex.getMessage());
//                    
//                    
//        }
//        
//        JOptionPane.showMessageDialog(this,
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldCardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCardNameActionPerformed

    private void jComboBoxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMonthActionPerformed

    private void jComboBoxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxYearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBasketActionPerformed
        Basket2 b = new Basket2();
        b.show(); 
        dispose();
    }//GEN-LAST:event_backBasketActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentView().setVisible(true);
            }
        });
    }
    
    //new customer can rent up to 2 movies 
     private boolean limitBasketQuantatyOfMovies(boolean cardExistsInDatabase) {
       
//        if(!cardExistsInDatabase){
//            if(Transaction.length > 2){ //if movie choice is greater than 2
//                JOptionPane.showMessageDialog(this, "Please return some movies! New customer can rent up to 2 movies.");
//                return false;
//            }
//
//
//        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBasket;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxMonth;
    private javax.swing.JComboBox<String> jComboBoxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextFieldCardName;
    private javax.swing.JTextField jTextFieldCardNumber;
    private javax.swing.JTextField jTextFieldCvv;
    // End of variables declaration//GEN-END:variables

    
    //
    private boolean checkIfCardExist(boolean checkCardExistDB) {
        
        Basket2 b = new Basket2();
        MovieList m = new MovieList();

        if(!checkCardExistDB){
            if(m.table.getSelectedRow() > 2){
                JOptionPane.showMessageDialog(this, "Sorry,");
                return false;
            } 
        }
        
        return true;

        }

        
       
    }
    

    
   
