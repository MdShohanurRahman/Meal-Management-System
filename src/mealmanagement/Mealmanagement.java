package mealmanagement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Mealmanagement {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        
        LogIn ob = new LogIn();
        ob.setVisible(true);
        ob.setResizable(false);
        ob.setLocationRelativeTo(null);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
