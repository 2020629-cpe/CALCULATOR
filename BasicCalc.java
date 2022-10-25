package basiccalc;

import javax.swing.*;
import java.awt.event.*;

public class BasicCalc extends JFrame {
    
    public BasicCalc() {
        initComponents();
    }

    //using switch case to calculate
    public void calculation(){
        switch(calculate){
            case 1 -> {
                answer = number + Double.parseDouble(num_display.getText());
                num_display.setText(Double.toString(answer));
            }
            case 2 -> {
                answer = number - Double.parseDouble(num_display.getText());
                num_display.setText(Double.toString(answer));
            }
            case 3 -> {
                answer = number * Double.parseDouble(num_display.getText());
                num_display.setText(Double.toString(answer));
            }
            case 4 -> {
                answer = number / Double.parseDouble(num_display.getText());
                num_display.setText(Double.toString(answer));
            }
        }
    }
     
    //displaying and properties of components
    private void initComponents() {

        num_zero = new JButton();
        num_one = new JButton();
        num_two = new JButton();
        num_three = new JButton();
        num_four = new JButton();
        num_five = new JButton();
        num_six = new JButton();
        num_seven = new JButton();
        num_eight = new JButton();
        num_nine = new JButton();
        num_add = new JButton();
        num_subtract = new JButton();
        num_divide = new JButton();
        num_multiply = new JButton();
        num_clear = new JButton();
        num_delete = new JButton();
        num_dot = new JButton();
        num_equals = new JButton();
        num_display = new JTextField();
        num_2nd_display = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator App");
        setResizable(false);

        num_display.setEditable(false);
        num_display.setBackground(new java.awt.Color(214, 217, 223));
        num_display.setFont(new java.awt.Font("Helvetica", 1, 24));
        num_display.setHorizontalAlignment(JTextField.TRAILING);
        num_display.setText("0");
        num_display.setBorder(null);
        num_display.addActionListener(e -> this.num_displayActionPerformed(e));

        num_clear.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_clear.setText("C");
        num_clear.setBorder(BorderFactory.createEtchedBorder());
        num_clear.setBorderPainted(false);
        num_clear.setFocusable(false);
        num_clear.addActionListener((ActionEvent e) -> {
            num_clearActionPerformed(e);
        });

        num_delete.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_delete.setText("D");
        num_delete.setBorder(BorderFactory.createEtchedBorder());
        num_delete.setBorderPainted(false);
        num_delete.setFocusable(false);
        num_delete.addActionListener((ActionEvent e) -> {
            num_deleteActionPerformed(e);
        });

        num_divide.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_divide.setText("÷");
        num_divide.setBorder(BorderFactory.createEtchedBorder());
        num_divide.setBorderPainted(false);
        num_divide.setFocusable(false);
        num_divide.addActionListener((ActionEvent e) -> {
            num_divideActionPerformed(e);
        });

        num_multiply.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_multiply.setText("*");
        num_multiply.setBorder(BorderFactory.createEtchedBorder());
        num_multiply.setBorderPainted(false);
        num_multiply.setFocusable(false);
        num_multiply.addActionListener((ActionEvent e) -> {
            num_multiplyActionPerformed(e);
        });

        num_nine.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_nine.setText("9");
        num_nine.setBorder(BorderFactory.createEtchedBorder());
        num_nine.setBorderPainted(false);
        num_nine.setFocusable(false);
        num_nine.addActionListener((ActionEvent e) -> {
            num_nineActionPerformed(e);
        });

        num_eight.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_eight.setText("8");
        num_eight.setBorder(BorderFactory.createEtchedBorder());
        num_eight.setBorderPainted(false);
        num_eight.setFocusable(false);
        num_eight.addActionListener((ActionEvent e) -> {
            num_eightActionPerformed(e);
        });

        num_seven.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_seven.setText("7");
        num_seven.setBorder(BorderFactory.createEtchedBorder());
        num_seven.setBorderPainted(false);
        num_seven.setFocusable(false);
        num_seven.addActionListener((ActionEvent e) -> {
            num_sevenActionPerformed(e);
        });

        num_six.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_six.setText("6");
        num_six.setBorder(BorderFactory.createEtchedBorder());
        num_six.setBorderPainted(false);
        num_six.setFocusable(false);
        num_six.addActionListener((ActionEvent e) -> {
            num_sixActionPerformed(e);
        });

        num_subtract.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_subtract.setText("-");
        num_subtract.setBorder(BorderFactory.createEtchedBorder());
        num_subtract.setBorderPainted(false);
        num_subtract.setFocusable(false);
        num_subtract.addActionListener((ActionEvent e) -> {
            num_subtractActionPerformed(e);
        });

        num_five.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_five.setText("5");
        num_five.setBorder(BorderFactory.createEtchedBorder());
        num_five.setBorderPainted(false);
        num_five.setFocusable(false);
        num_five.addActionListener((ActionEvent e) -> {
            num_fiveActionPerformed(e);
        });

        num_four.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_four.setText("4");
        num_four.setBorder(BorderFactory.createEtchedBorder());
        num_four.setBorderPainted(false);
        num_four.setFocusable(false);
        num_four.addActionListener((ActionEvent e) -> {
            num_fourActionPerformed(e);
        });

        num_add.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_add.setText("+");
        num_add.setBorder(BorderFactory.createEtchedBorder());
        num_add.setBorderPainted(false);
        num_add.setFocusable(false);
        num_add.addActionListener((ActionEvent e) -> {
            num_addActionPerformed(e);
        });

        num_two.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_two.setText("2");
        num_two.setBorder(BorderFactory.createEtchedBorder());
        num_two.setBorderPainted(false);
        num_two.setFocusable(false);
        num_two.addActionListener((ActionEvent e) -> {
            num_twoActionPerformed(e);
        });

        num_one.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_one.setText("1");
        num_one.setBorder(BorderFactory.createEtchedBorder());
        num_one.setBorderPainted(false);
        num_one.setFocusable(false);
        num_one.addActionListener((ActionEvent e) -> {
            num_oneActionPerformed(e);
        });

        num_three.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_three.setText("3");
        num_three.setBorder(BorderFactory.createEtchedBorder());
        num_three.setBorderPainted(false);
        num_three.setFocusable(false);
        num_three.addActionListener((ActionEvent e) -> {
            num_threeActionPerformed(e);
        });

        num_dot.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_dot.setText(".");
        num_dot.setBorder(BorderFactory.createEtchedBorder());
        num_dot.setBorderPainted(false);
        num_dot.setFocusable(false);
        num_dot.addActionListener((ActionEvent e) -> {
            num_dotActionPerformed(e);
        });

        num_zero.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_zero.setText("0");
        num_zero.setBorder(BorderFactory.createEtchedBorder());
        num_zero.setBorderPainted(false);
        num_zero.setFocusable(false);
        num_zero.addActionListener((ActionEvent e) -> {
            num_zeroActionPerformed(e);
        });

        num_equals.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_equals.setText("=");
        num_equals.setBorder(BorderFactory.createEtchedBorder());
        num_equals.setBorderPainted(false);
        num_equals.setFocusable(false);
        num_equals.addActionListener((ActionEvent e) -> {
            num_equalsActionPerformed(e);
        });

        num_2nd_display.setFont(new java.awt.Font("Helvetica", 0, 12));
        num_2nd_display.setHorizontalAlignment(SwingConstants.RIGHT);
        num_2nd_display.setText(" ");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(num_2nd_display, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num_display)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num_zero, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num_dot, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num_equals, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num_seven, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num_clear, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(num_delete, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num_eight, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(num_nine, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num_four, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num_five, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num_six, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num_one, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num_two, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num_three, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(num_multiply, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(num_add, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num_subtract, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num_divide, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(num_2nd_display, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num_display, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num_clear, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_delete, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_divide, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num_seven, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_eight, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_nine, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_multiply, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num_four, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_five, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_six, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_subtract, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num_one, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_two, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_three, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_add, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num_zero, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_dot, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_equals, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pack();
    }
    
    //functions
    private void num_zeroActionPerformed(ActionEvent e) {                                          
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "0");
        }else{
            num_display.setText(num_display.getText() + "0");
        }
    }  

    private void num_oneActionPerformed(ActionEvent e) {                                          
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "1");
        }else{
            num_display.setText(num_display.getText() + "1");
        }
    } 
    
    private void num_twoActionPerformed(ActionEvent e) {                                          
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "2");
        }else{
            num_display.setText(num_display.getText() + "2");
        }
    }

    private void num_threeActionPerformed(ActionEvent e) {                                          
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "3");
        }else{
            num_display.setText(num_display.getText() + "3");
        }
    }  

    private void num_fourActionPerformed(ActionEvent e) {                                          
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "4");
        }else{
            num_display.setText(num_display.getText() + "4");
        }
    }  

    private void num_fiveActionPerformed(ActionEvent e) {                                          
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "5");
        }else{
            num_display.setText(num_display.getText() + "5");
        }
    }          

    private void num_sixActionPerformed(ActionEvent e) {                                         
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "6");
        }else{
            num_display.setText(num_display.getText() + "6");
        }
    }     

    private void num_sevenActionPerformed(ActionEvent e) {                                         
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "7");
        }else{
            num_display.setText(num_display.getText() + "7");
        }
    }         

    private void num_eightActionPerformed(ActionEvent e) {                                         
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "8");
        }else{
            num_display.setText(num_display.getText() + "8");
        }
    } 

    private void num_nineActionPerformed(ActionEvent e) {                                         
        if(num_display.getText().equals("0") == true){
        num_display.setText("");
        num_display.setText(num_display.getText() + "9");
        }else{
            num_display.setText(num_display.getText() + "9");
        }
    }

    private void num_addActionPerformed(ActionEvent e) {                                          
        number = Double.parseDouble(num_display.getText());
        calculate = 1;
        num_display.setText("0");
        num_2nd_display.setText(number + " + ");
    } 
    
    private void num_subtractActionPerformed(ActionEvent e) {                                          
        number = Double.parseDouble(num_display.getText());
        calculate = 2;
        num_display.setText("0");
        num_2nd_display.setText(number + " - ");
    }   

    private void num_divideActionPerformed(ActionEvent e) {                                         
        number = Double.parseDouble(num_display.getText());
        calculate = 4;
        num_display.setText("0");
        num_2nd_display.setText(number + " ÷ ");
    }  

    private void num_multiplyActionPerformed(ActionEvent e) {                                         
        number = Double.parseDouble(num_display.getText());
        calculate = 3;
        num_display.setText("0");
        num_2nd_display.setText(number + " * ");
    }   

    private void num_dotActionPerformed(ActionEvent e) {                                          
        try {
         Integer.parseInt(num_display.getText());
             num_display.setText(num_display.getText() + ".");
                }
                catch (NumberFormatException evt) {
            }
    }     

    private void num_clearActionPerformed(ActionEvent e) {                                         
        num_display.setText("0");
        num_2nd_display.setText("");
    }                                        

    private void num_deleteActionPerformed(ActionEvent e) {                                         
        int length = num_display.getText().length();
        int number = num_display.getText().length() - 1;
        String store;
        
        if (length > 0 ){
            StringBuilder del = new StringBuilder(num_display.getText());
            del.deleteCharAt(number);
            store = del.toString();
            num_display.setText(store);
            if(num_display.getText().equals("") == true){
                num_display.setText("0");
            }
        }else{
             num_display.setText("0");
        }
    }                                                                            

    private void num_equalsActionPerformed(ActionEvent e) {                                          
        calculation();
        num_2nd_display.setText(" ");
    }                                         
                                       
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BasicCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new BasicCalc().setVisible(true);
        });
    }

    // Variables declaration                       
    private JButton num_zero, num_one, num_two, num_three, num_four, num_five, num_six, num_seven, num_eight, num_nine;
    private JButton num_dot, num_equals, num_add, num_subtract, num_divide, num_multiply;
    private JButton num_clear, num_delete;
    private JTextField num_display;
    private JLabel num_2nd_display;
    double number, answer;
    int calculate;

    private void num_displayActionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

