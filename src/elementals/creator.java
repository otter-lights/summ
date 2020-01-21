/*
 * Elementals - Rachel Routly
 * this page allows users to create a new character game save
 */
package elementals;

//imports for the program to deal with files, colors, and random numbers
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rachelroutly
 */
public class creator extends javax.swing.JFrame {
    
    //global variables for the forms referenced and the character made by the program
    home house;
    start starter;
    player character;
    loginForm login;

    /**
     * Creates new form creator
     * @param s
     */
    public creator(start s) {
        initComponents();
        //placing the colour chooser in the JPanel
        colorChooser.setPreviewPanel(new JPanel());
        starter = s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        uNameField = new javax.swing.JTextField();
        pWordField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        charNameField = new javax.swing.JTextField();
        colorChooser = new javax.swing.JColorChooser();
        jLabel5 = new javax.swing.JLabel();
        fireBttn = new javax.swing.JButton();
        waterBttn = new javax.swing.JButton();
        iceBttn = new javax.swing.JButton();
        earthBttn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fireStat = new javax.swing.JLabel();
        earthStat = new javax.swing.JLabel();
        waterStat = new javax.swing.JLabel();
        iceStat = new javax.swing.JLabel();
        backBttn = new javax.swing.JButton();
        createBttn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Character Creation");

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        jLabel4.setText("Character Name: ");

        jLabel5.setText("Choose Your Character's Colour:");

        fireBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elementals/images/fire-icon.png"))); // NOI18N
        fireBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireBttnActionPerformed(evt);
            }
        });

        waterBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elementals/images/water-icon.png"))); // NOI18N
        waterBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterBttnActionPerformed(evt);
            }
        });

        iceBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elementals/images/ice-icon.png"))); // NOI18N
        iceBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceBttnActionPerformed(evt);
            }
        });

        earthBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elementals/images/earth-icon.png"))); // NOI18N
        earthBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earthBttnActionPerformed(evt);
            }
        });

        fireStat.setText(" ");

        earthStat.setText(" ");

        waterStat.setText(" ");

        iceStat.setText(" ");

        backBttn.setText("Back To Menu");
        backBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBttnActionPerformed(evt);
            }
        });

        createBttn.setText("Create Character");
        createBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBttnActionPerformed(evt);
            }
        });

        jLabel6.setText("Click to Roll for Statistics");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(waterBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fireBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(earthBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(iceBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(earthStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fireStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iceStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(waterStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addComponent(createBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(charNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pWordField))))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(uNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(charNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(earthBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(earthStat)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fireBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fireStat)
                                .addGap(20, 20, 20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(waterBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(waterStat)
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iceBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(iceStat)
                                .addGap(22, 22, 22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //creates global variables for the random number and element values
    Random ran = new Random();
    double fire, earth, ice, water;
    
    private void fireBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireBttnActionPerformed
        //gets two doubles, between 1-5 and adds them together, this makes it more likely to get mid range numbers
        double num1 = ran.nextDouble() * 5.0;  
        double num2 = ran.nextDouble() * 5.0; 
        
        double num = num1 + num2;       
        //sets fire to the random number, formated to one decimal
        DecimalFormat numberFormat = new DecimalFormat("0.0");
        fire = Double.parseDouble(numberFormat.format(num));
        //shows the value on screen
        fireStat.setText(numberFormat.format(fire));
        //doesn't allow rerolling
        fireBttn.setEnabled(false);
    }//GEN-LAST:event_fireBttnActionPerformed

    private void earthBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earthBttnActionPerformed
        //gets two doubles, between 1-5 and adds them together, this makes it more likely to get mid range numbers
        double num1 = ran.nextDouble() * 5.0;  
        double num2 = ran.nextDouble() * 5.0; 
        
        double num = num1 + num2; 
        //sets ice to the next random number, formatted to one decimal 
        DecimalFormat numberFormat = new DecimalFormat("0.0");
        earth = Double.parseDouble(numberFormat.format(num));
        //shows the value on screen
        earthStat.setText(numberFormat.format(earth));
        //doesn't allow rerolling
        earthBttn.setEnabled(false);
    }//GEN-LAST:event_earthBttnActionPerformed

    private void waterBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterBttnActionPerformed
        //gets two doubles, between 1-5 and adds them together, this makes it more likely to get mid range numbers
        double num1 = ran.nextDouble() * 5.0;  
        double num2 = ran.nextDouble() * 5.0; 
        
        double num = num1 + num2;  
        //sets water to the next double formatted to one decimal place
        DecimalFormat numberFormat = new DecimalFormat("0.0");
        water = Double.parseDouble(numberFormat.format(num));
        //shows the value on screen
        waterStat.setText(numberFormat.format(water));
        //doesn't allow rerolling
        waterBttn.setEnabled(false);
    }//GEN-LAST:event_waterBttnActionPerformed

    private void iceBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceBttnActionPerformed
        //gets two doubles, between 1-5 and adds them together, this makes it more likely to get mid range numbers
        double num1 = ran.nextDouble() * 5.0;  
        double num2 = ran.nextDouble() * 5.0; 
        
        double num = num1 + num2;
        //sets ice to the next double formatted to one decimal place
        DecimalFormat numberFormat = new DecimalFormat("0.0");
        ice = Double.parseDouble(numberFormat.format(num));
        //shows the value on screen
        iceStat.setText(numberFormat.format(ice));
        //doesn't allow rerolling
        iceBttn.setEnabled(false);
    }//GEN-LAST:event_iceBttnActionPerformed

    private void backBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttnActionPerformed
        //closes the current window and opens the start window 
        this.setVisible(false);
        
        start starter = new start();
        starter.setVisible(true); 
    }//GEN-LAST:event_backBttnActionPerformed

    private void createBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBttnActionPerformed
        //fetching the values from the form 
        String username = uNameField.getText();
        String password = pWordField.getText();
        String characterName = charNameField.getText();
        Color color = colorChooser.getColor();
        //setting the starting XP value to 0
        int exp = 0;
        //setting variables for each part of the RGB color value (easier to store line by line)
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        
        //creates the character of player class
        character = new player(username, password, characterName, red, blue, green, fire, earth, ice, water, exp);
         
        //try to write changes into a new file
        try{
            //make the new file, named according the players username
            File file = new File("src//elementals//character_saves//" + uNameField.getText() + ".txt");

            //if the file cannot be created, inform the user that the username they chose is taken
            if (file.createNewFile() == false){
                JOptionPane.showMessageDialog (null, "This Username is Taken", "Username Error", JOptionPane.INFORMATION_MESSAGE);
            } 
            
            //Write the players information into the created file, done line by line (allows reading later)
            FileWriter writer = new FileWriter(file);
            writer.write(username + "\n" + 
                            password + "\n" + 
                            characterName + "\n" + 
                            red + "\n" + 
                            green + "\n" + 
                            blue + "\n" + 
                            fire + "\n" + 
                            earth + "\n" + 
                            ice + "\n" + 
                            water + "\n" +
                            exp);
            writer.close();
            }
        //prints the error message if it is unable to complete the try
        catch(IOException e){
            System.out.println(e);
        }
        //then brings the user to the home page
        if(house == null){
            house = new home(character);
        }    
        this.setVisible(false); 
        house.setVisible(true);  
    }//GEN-LAST:event_createBttnActionPerformed

    /**
     *
     * @return */
    
    public player getPlayer(){
        return this.character;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBttn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField charNameField;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JButton createBttn;
    private javax.swing.JButton earthBttn;
    private javax.swing.JLabel earthStat;
    private javax.swing.JButton fireBttn;
    private javax.swing.JLabel fireStat;
    private javax.swing.JButton iceBttn;
    private javax.swing.JLabel iceStat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pWordField;
    private javax.swing.JTextField uNameField;
    private javax.swing.JButton waterBttn;
    private javax.swing.JLabel waterStat;
    // End of variables declaration//GEN-END:variables
}
