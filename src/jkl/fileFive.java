package jkl;

import javax.swing.*;

public class fileFive {
    public static void main(String[] args) {
        String w, h;
        Double wconverted, hconverted, jibu;
        w = JOptionPane.showInputDialog("Enter the weight in kgs");
        h = JOptionPane.showInputDialog("Enter the height in m");
        wconverted = Double.parseDouble(w);
        hconverted = Double.parseDouble(h);
        jibu = wconverted / Math.pow(hconverted, 2);
        if (jibu < 18.5) {
            JOptionPane.showMessageDialog(null, "underweight");
        } else if (jibu < 30) {
            JOptionPane.showMessageDialog(null, "Healthy Weight");
        } else if (jibu < 35) {
            JOptionPane.showMessageDialog(null, "Obese 1");
        } else if (jibu < 40) {
            JOptionPane.showMessageDialog(null, "Obese 2");
        } else if (jibu < 50) {
            JOptionPane.showMessageDialog(null, "Obese 3");
        } else if (jibu < 60) {
            JOptionPane.showMessageDialog(null, "Obese 4");
        }
    }
}
