package ChapterThree;

import javax.swing.*;

public class JOptionPane {

    public static void main(String[] args) {

     String name = javax.swing.JOptionPane.showInputDialog("Enter your name");
     javax.swing.JOptionPane.showMessageDialog(null,"Hello"+name);

     int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter your age"));
        javax.swing.JOptionPane.showMessageDialog(null,"your age is"+age);

        double height = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter your height"));
        javax.swing.JOptionPane.showMessageDialog(null,"your age is"+ height);



    }


}
