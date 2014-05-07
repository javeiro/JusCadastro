/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acrs.juscadastro.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import javax.swing.JLabel;
 
public class Timer extends Thread {
 
	public JLabel label;
	private Date data;
	private DateFormat formato;
 
	public Timer() {		
		formato = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
	}
 
	@Override
	public void run() {
 
		while (true) {
			try {
				data = new Date();
				label.setText(formato.format(data));
				Timer.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
 
}