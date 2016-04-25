/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Wakya
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sisfo_lowongan_kerja.Aplikasi;
import View.Perusahaan;

public class ControllerPerusahaan implements ActionListener{
    
   
    Perusahaan p ;
    
    Aplikasi app;
    
    public ControllerPerusahaan(Aplikasi ap){
        this.p = new Perusahaan();
        this.p.setVisible(true);
        this.app = ap;
        
        this.p.getTambahPerusahaan().addActionListener(this);
        this.p.getHapusPerusahaan().addActionListener(this);
        this.p.getCariPerusahaan().addActionListener(this);
        this.p.getTambahLowongan().addActionListener(this);
        this.p.getHapusLowongan().addActionListener(this);
        this.p.getCariLowongan().addActionListener(this);
        this.p.getTampilkanPerusahaan().addActionListener(this);
        this.p.getTampilkanPelamarLowongan().addActionListener(this);
        this.p.getTampilkanBerkasDiterima().addActionListener(this);
        this.p.getCariLowongan().addActionListener(this);
        this.p.getTampilkanPelamarLowongan().addActionListener(this);
        this.p.getButtonBack().addActionListener(this);
        
    }
    
//  public void setLmm (ArrayList<Perusahaan> lmm){
//        this.listPerusahaan = lmm;
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(p.getTambahPerusahaan())){
            this.p.setVisible(false);
            ControllerTambahPerusahaan cp = new ControllerTambahPerusahaan(app);
           
        }
        else if(x.equals(p.getTampilkanPerusahaan())){
            this.p.setVisible(false);
            ControllerTampilkanPerusahaan ctp = new ControllerTampilkanPerusahaan(app);
            ctp.showDatas();
            
        }
        
        else if(x.equals(p.getHapusPerusahaan())){
            this.p.setVisible(false);
            ControllerHapusPerusahaan chp = new ControllerHapusPerusahaan(app);
            
        }
        
        else if(x.equals(p.getCariPerusahaan())){
            this.p.setVisible(false);
            ControllerCariPerusahaan ccp = new ControllerCariPerusahaan(app);
        }
        
        else if(x.equals(p.getTambahLowongan())){
            this.p.setVisible(false);
            ControllerTambahLowongan ctl = new ControllerTambahLowongan(app);
        }
        
        else if(x.equals(p.getHapusLowongan())){
            this.p.setVisible(false);
            ControllerHapusLowongan chl = new ControllerHapusLowongan(app);
        }
        
         else if(x.equals(p.getCariLowongan())){
            this.p.setVisible(false);
            ControllerCariLowongan chl = new ControllerCariLowongan(app);
        }
         else if(x.equals(p.getButtonBack())){
             this.p.setVisible(false);
             ControllerMainMenu cmm = new ControllerMainMenu(app);
         }
         else if(x.equals(p.getTampilkanPelamarLowongan())){
             this.p.setVisible(false);
             ControllerTampilkanPelamarLowongan ctpl = new ControllerTampilkanPelamarLowongan(app);
         }
    }
    
    
    
}
