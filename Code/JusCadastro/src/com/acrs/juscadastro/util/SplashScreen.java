/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.util;

import java.awt.*;
import javax.swing.*;

public class SplashScreen extends JWindow {
    
    private int duration;
    
    public SplashScreen(int d) {
        duration = d;
    }
    
// Este é um método simples para mostrar uma tela de apresentção

// no centro da tela durante a quantidade de tempo passada no construtor

    public void showSplash(JPanel pnl, int width, int height) {        
        
        // Obtem painel splashscreen
        setContentPane(pnl);
        
        // Configura a posição e o tamanho da janela
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        
        // Torna visível
        setVisible(true);
    }
    
    public void waitSplashAndExit() {
        // Espera ate que os recursos estejam carregados
        try { Thread.sleep(duration); } catch (Exception e) {}        
        setVisible(false);
        this.dispose();
    }
    
}
