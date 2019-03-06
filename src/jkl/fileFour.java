package jkl;

import javax.swing.*;

public class fileFour {
    public static void main(String[] args) {
        String f,g,h;
        Double fconverted,gconverted,hconverted, answer;
        f= JOptionPane.showInputDialog("Enter the height");
        g =JOptionPane.showInputDialog("Enter the width");
        h =JOptionPane.showInputDialog("Enter the radius");
        fconverted=Double.parseDouble(f);
        gconverted=Double.parseDouble(g);
        hconverted=Double.parseDouble(h);
        answer =(fconverted*gconverted*hconverted);
        JOptionPane.showMessageDialog(null,String.valueOf(answer));

    }
}
