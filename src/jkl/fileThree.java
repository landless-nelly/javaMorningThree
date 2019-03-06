package jkl;

import javax.swing.*;

public class fileThree {
    public static void main(String[] args) {
        String p, r, t;
        Double Pconverted, rconverted, tconverted, answer;
        p = JOptionPane.showInputDialog("Enter princple");
        r = JOptionPane.showInputDialog("Enter the rate per year");
        t = JOptionPane.showInputDialog("Enter the time in years");
        Pconverted = Double.parseDouble(p);
        tconverted = Double.parseDouble(t);
        rconverted = Double.parseDouble(r);
        answer = (Pconverted * rconverted * tconverted) / 100.0;
        JOptionPane.showMessageDialog(null, String.valueOf(answer));

    }
}
