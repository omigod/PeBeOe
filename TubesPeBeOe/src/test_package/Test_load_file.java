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

/**
 *
 * @author Wakya
 */
public class Test_load_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Driverclass driver=new Driverclass();
        try {
            driver=driver.loadData();
        } catch (IOException ex) {
            Logger.getLogger(Test_load_file.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test_load_file.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(driver.getArrPelamar().get(0).getIdPelamar());
    }
    
}
