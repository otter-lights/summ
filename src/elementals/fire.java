/*
 * Elementals - Rachel
 * this is the form that will ask random question quizzes about the fire topic
 */
package elementals;

import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author rachelroutly
 */
public class fire extends javax.swing.JFrame {
    
    player character;
    home house;
    training train;
    /**
     * Creates new form fire
     * @param c
     */
    public fire(player c) {
        initComponents();
        character = c;
        chooseQuestions();
        fireVal.setText(String.valueOf(character.getFire()));
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
        fireVal = new javax.swing.JLabel();
        homeBttn = new javax.swing.JButton();
        questionOne = new javax.swing.JLabel();
        questionTwo = new javax.swing.JLabel();
        questionThree = new javax.swing.JLabel();
        answerOne = new javax.swing.JComboBox<>();
        answerTwo = new javax.swing.JComboBox<>();
        answerThree = new javax.swing.JComboBox<>();
        submitBttn = new javax.swing.JButton();
        skipOne = new javax.swing.JButton();
        skipTwo = new javax.swing.JButton();
        skipThree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elementals/images/fire-icon.png"))); // NOI18N
        jLabel1.setText("  :");

        fireVal.setText("       ");

        homeBttn.setText("Back to Home");
        homeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBttnActionPerformed(evt);
            }
        });

        questionOne.setText(" --");

        questionTwo.setText(" --");

        questionThree.setText(" --");

        submitBttn.setText("Submit");
        submitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBttnActionPerformed(evt);
            }
        });

        skipOne.setText("Skip");
        skipOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipOneActionPerformed(evt);
            }
        });

        skipTwo.setText("Skip");
        skipTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipTwoActionPerformed(evt);
            }
        });

        skipThree.setText("Skip");
        skipThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipThreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fireVal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(questionOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(questionTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(questionThree, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(skipThree))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 523, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submitBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerThree, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(answerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(skipOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(answerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(skipTwo))
                            .addComponent(homeBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fireVal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionOne)
                    .addComponent(answerOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skipOne))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skipTwo))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionThree)
                    .addComponent(answerThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skipThree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(submitBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeBttn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBttnActionPerformed
        // closes the current form and opens home form
        if(house == null){
            System.out.println("yeet");
            house = new home(character);
        }
        this.setVisible(false);
        house.setVisible(true);
    }//GEN-LAST:event_homeBttnActionPerformed
    //variable to track number of correct answers
    int numCorrect = 0;
    private void submitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBttnActionPerformed
        //if the selected item is the same as the correct answer at the same index of the correct array the numCorrect increases        
        if(correct[numOne] == answerOne.getSelectedItem()){
            numCorrect++;
        }
        //checks for correct again
        if(correct[numTwo] == answerTwo.getSelectedItem()){
            numCorrect++;
        }
        //checks for correct again
        if(correct[numThree] == answerThree.getSelectedItem()){
            numCorrect++;
        }
        //gets the fire value
        double d = character.getFire();
        //adds the correct amount to the character's fire value
        switch (numCorrect) {
            case 1:
                character.setFire(d + 0.3);
                break;
            case 2:
                character.setFire(d + 0.6);
                break;
            case 3:
                character.setFire(d + 1.0);
                break;
            default:
                break;
        }
        //closes current form and opens training form
        if(train == null){
            train = new training(character);
        }
        this.setVisible(false);
        train.setVisible(true);
    }//GEN-LAST:event_submitBttnActionPerformed

    private void skipOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipOneActionPerformed
        // calls the skipQuestion method
        skipQuestion();
    }//GEN-LAST:event_skipOneActionPerformed

    private void skipTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipTwoActionPerformed
        // calls the skipQuestion method
        skipQuestion();
    }//GEN-LAST:event_skipTwoActionPerformed

    private void skipThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipThreeActionPerformed
        // calls the skipQuestion method
        skipQuestion();
        
    }//GEN-LAST:event_skipThreeActionPerformed
    //global variables for the question and answer arrays   
    String[] questions = {"Three to four billion years ago the sun emitted how much power?", 
                                "How has fire NOT been used by humans?", 
                                "Without _____ fire will generally contain itself", 
                                "What plant can light itself on fire?", 
                                "95% of structural fires in ______ are due to arson", 
                                "What type of forest fire spreads by burning tree tops?", 
                                "What winds spread most fires in southern california?", 
                                "______ % of all wildfires are caused by humans",
                                "Around _____ % of lightning strikes cause fire",
                                "What is the standard measurement unit of heat, according to the SI?",
                                "_____ of all fire deaths happen in a home where there is no fire alarm", 
                                "Burning Mountain in Australia has had underground coals burning for how many years?", 
                                "What country holds the record for the longest campfire?",
                                "Without gravity what shape would fire burn in?",
                                "Which compound does NOT turn fire green?"};
    
    String[] correct = {"70% of today",
                        "Sustenance",
                        "Gravity",
                        "Dictamnus albus",
                        "Detroit",
                        "Crown Fire",
                        "Santa Ana",
                        "90",
                        "15",
                        "Joules",
                        "2/3",
                        "6000",
                        "Netherlands",
                        "Circle",
                        "Calcium"};
    
    String[] wrong1 =  {"50% of today",
                        "Rituals",
                        "Salts",
                        "Acroptilon repens",
                        "Chicago",
                        "Head Fire",
                        "Cali Breath",
                        "50",
                        "30",
                        "Celcius",
                        "1/2",
                        "2500",
                        "England",
                        "Square",
                        "Copper Sulfate"};
    
    String[] wrong2 =  {"The Same",
                        "Cooking",
                        "Water",
                        "Grayia spinosa",
                        "New York",
                        "Crest Fire",
                        "Santa Maria",
                        "60",
                        "45",
                        "Farenheight",
                        "3/4",
                        "4 000",
                        "America",
                        "Teardrop",
                        "Borax"};
    
    String[] wrong3 =  {"124% of today",
                        "Signaling",
                        "Nitrogen",
                        "Holodiscus discolor",
                        "Florida",
                        "Leaf Fire",
                        "El Nino",
                        "80",
                        "60",
                        "Kelvin",
                        "100%",
                        "10 000",
                        "Belgium",
                        "Triangle",
                        "Boric Acid"};
    
    //sets random numbers for 1-3 (used for choosing/finding questions)
    Random rand = new Random(); 
    int numOne = rand.nextInt((15 - 1) + 1) + 1;
    int numTwo = rand.nextInt((15 - 1) + 1) + 1;
    int numThree = rand.nextInt((15 - 1) + 1) + 1;
    
    //chooses three question and calls the random order method
    public void chooseQuestions(){           
        questionOne.setText(questions[numOne]);
        ranOrder(numOne, answerOne);
        
        questionTwo.setText(questions[numTwo]);
        ranOrder(numTwo, answerTwo);
        
        questionThree.setText(questions[numThree]);
        ranOrder(numThree, answerThree);
    }
    
    //randomizes the order of the answers
    public void ranOrder(int n, JComboBox<String> question){
        //makes a random number between 1 and 4, that will indicated which of the four slots the correct answer should be in
        int order = rand.nextInt((4 - 1) + 1) + 1;
        //if it is 1 --> first slot, 2 --> second slot and so on
        if(order <= 1){
            question.addItem(correct[n]);
            question.addItem(wrong1[n]);
            question.addItem(wrong2[n]);
            question.addItem(wrong3[n]);
        }   
        else if(order <= 2){           
            question.addItem(wrong1[n]);
            question.addItem(correct[n]);
            question.addItem(wrong2[n]);
            question.addItem(wrong3[n]);
        } 
        else if(order <= 3){
            question.addItem(wrong1[n]);           
            question.addItem(wrong2[n]);
            question.addItem(correct[n]);
            question.addItem(wrong3[n]);
        }
        else{
            question.addItem(wrong1[n]);            
            question.addItem(wrong2[n]);
            question.addItem(wrong3[n]);
            question.addItem(correct[n]);
        }       
    }
    //handles the clicking of the skip question button
    public void skipQuestion(){
        //gets the XP value of the character
        int xpValue = character.getXP();
        //if they have more than 1 xp, the number of correct answers increases by one, and the xp value drops by 1
        if(xpValue >= 1){
            character.setXP(xpValue - 1);
            numCorrect++;
        }
        //if not they are notified with a pop up message
        else{
            JOptionPane.showMessageDialog (null, "You Don't Have Enough XP to Skip a Question", "Not Allowed", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> answerOne;
    private javax.swing.JComboBox<String> answerThree;
    private javax.swing.JComboBox<String> answerTwo;
    private javax.swing.JLabel fireVal;
    private javax.swing.JButton homeBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel questionOne;
    private javax.swing.JLabel questionThree;
    private javax.swing.JLabel questionTwo;
    private javax.swing.JButton skipOne;
    private javax.swing.JButton skipThree;
    private javax.swing.JButton skipTwo;
    private javax.swing.JButton submitBttn;
    // End of variables declaration//GEN-END:variables
}
