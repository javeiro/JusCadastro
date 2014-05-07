package com.acrs.juscadastro;

import com.acrs.juscadastro.control.JusCadastroControl;
import com.acrs.juscadastro.util.SplashScreen;
import com.acrs.juscadastro.view.FrmJusCadastro;
import com.acrs.juscadastro.view.PnlSplashScreen;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author acrs
 */
public class JusCadastro {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        SplashScreen splash = new SplashScreen(2000);
        splash.showSplash(new PnlSplashScreen(), 300, 126);
        try {
            JusCadastroControl.iniciar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Base de dados indisponível.", "Erro:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        splash.waitSplashAndExit();
        new FrmJusCadastro().setVisible(true);
    }            
}
