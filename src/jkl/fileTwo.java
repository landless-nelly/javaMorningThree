package jkl;

import javax.swing.*;

public class fileTwo {
    public static void main(String[] args) {
        String num1, num2;
        Double num1converted,num2converted,jibu;
        num1 = JOptionPane.showInputDialog("Enter the first number");
        num2 =JOptionPane.showInputDialog("Enter the second number");
        num1converted =Double.parseDouble(num1);
        num2converted =Double.parseDouble(num2);
        jibu =num1converted+num2converted;
        JOptionPane.showMessageDialog(null,String.valueOf(jibu));
    }
}
