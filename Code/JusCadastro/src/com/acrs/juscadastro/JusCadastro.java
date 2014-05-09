package com.acrs.juscadastro;

import com.acrs.juscadastro.control.JusCadastroControl;
import com.acrs.juscadastro.util.SplashScreen;
import com.acrs.juscadastro.view.FrmJusCadastro;
import com.acrs.juscadastro.view.PnlSplashScreen;

/**
 *
 * @author acrs
 */
public class JusCadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SplashScreen splash = new SplashScreen(2000);
        splash.showSplash(new PnlSplashScreen(), 300, 126);
        
        JusCadastroControl.iniciarORM();
        
        splash.waitSplashAndExit();
        
        new FrmJusCadastro().setVisible(true);
    }            
}
