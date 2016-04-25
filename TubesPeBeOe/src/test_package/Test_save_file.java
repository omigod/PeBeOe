/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_package;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sisfo_lowongan_kerja.Driverclass;
import sisfo_lowongan_kerja.Pelamar;


/**
 *
 * @author Wakya
 */
public class Test_save_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pelamar lamar=new Pelamar();
        //lamar.setId("P001");
        Driverclass driver=new Driverclass();
        //driver.addPelamar(lamar);
        try {
            driver.saveData(driver);
        } catch (IOException ex) {
            Logger.getLogger(Test_save_file.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
