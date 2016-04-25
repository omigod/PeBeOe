/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sisfo_lowongan_kerja.Aplikasi;
import View.MainMenu;

/**
 *
 * @author Wakya
 */
public class ControllerMainMenu implements ActionListener {

    MainMenu mainmenu;

    Aplikasi app;

    public ControllerMainMenu(Aplikasi app) {
        this.mainmenu = new MainMenu();
        this.mainmenu.setVisible(true);
        
        this.app= app;

        this.mainmenu.getPerusahaan().addActionListener(this);
        this.mainmenu.getPelamar().addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(mainmenu.getPerusahaan())){
            this.mainmenu.setVisible(false);
            ControllerPerusahaan cmm= new ControllerPerusahaan(app);
            
        }
        
        else if(x.equals(mainmenu.getPelamar())){
            this.mainmenu.setVisible(false);
            ControllerPelamar cp = new ControllerPelamar(app);
        }

    }

}
