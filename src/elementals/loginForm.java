/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementals;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rachelroutly
 */
public class loginForm extends javax.swing.JFrame {
    /**
     * Creates new form loginForm
     */
    start starter;
    creator create;
    home house;
    
    public loginForm(start s) {
        initComponents();
        starter = s;
    }
    
    private player character;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uNameField = new javax.swing.JTextField();
        pWordField = new javax.swing.JTextField();
        loginBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Login");

        jLabel2.setText("username:");

        jLabel3.setText("password:");

        loginBttn.setText("Login");
        loginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginBttn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(uNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(pWordField))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBttn)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttnActionPerformed
        // TODO add your handling code here:
        String username = uNameField.getText();
        String password = pWordField.getText();
        boolean end = false;
        String uname = "";
        String pword = "";
        
        
        try{
            //creates file and buffer readers to get data from
            FileReader r = new FileReader("src//elementals//character_saves//" + username + ".txt");
            BufferedReader b = new BufferedReader(r);
            
            uname = b.readLine();
            pword = b.readLine();
            
            if(pword.equals(password)){
                String charName = b.readLine();

                String sR = b.readLine();
                String sG = b.readLine();
                String sB = b.readLine();
                
                int iR = Integer.parseInt(sR);
                int iG = Integer.parseInt(sG);
                int iB = Integer.parseInt(sB);
                
                String f = b.readLine();
                String e = b.readLine();
                String i = b.readLine();
                String w = b.readLine();
                
                String sExp = b.readLine();

                Double fire = Double.parseDouble(f);
                Double earth = Double.parseDouble(e);
                Double ice = Double.parseDouble(i);
                Double water = Double.parseDouble(w);
                
                int exp = Integer.parseInt(sExp);

                Color colour = new Color(Integer.parseInt(sR), Integer.parseInt(sG), Integer.parseInt(sB));

                character = new player(uname, pword, charName, iR, iG, iB, fire, earth, ice, water, exp);
                
                System.out.println("Correct Password");
                System.out.println(character.getUserName());
                if(house == null){
                    house = new home(character);
                }    
                this.setVisible(false); 
                house.setVisible(true);  
            }
            else{
                System.out.println("Wrong Password");
            }
            b.close();
        }
        catch(IOException e){
            System.out.println("user not valid");
        }        
    }//GEN-LAST:event_loginBttnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBttn;
    private javax.swing.JTextField pWordField;
    private javax.swing.JTextField uNameField;
    // End of variables declaration//GEN-END:variables
}
