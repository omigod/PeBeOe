/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo_lowongan_kerja;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Wakya
 */
public class Driverclass implements Serializable{
    ArrayList<Perusahaan> arrPerusahaan;
    ArrayList<Pelamar> arrPelamar;

    public Driverclass() {
        arrPerusahaan=new ArrayList<>();
        arrPelamar=new ArrayList<>();
    }

    public ArrayList<Perusahaan> getArrPerusahaan() {
        return arrPerusahaan;
    }

    public void setArrPerusahaan(ArrayList<Perusahaan> arrPerusahaan) {
        this.arrPerusahaan.clear();
        this.arrPerusahaan.addAll(arrPerusahaan);
    }

    public ArrayList<Pelamar> getArrPelamar() {
        return arrPelamar;
    }

    public void setArrPelamar(ArrayList<Pelamar> arrPelamar) {
        this.arrPelamar.clear();
        this.arrPelamar.addAll(arrPelamar);
    }
    
    public void addPelamar(Pelamar pelamar){
        this.arrPelamar.add(pelamar);
    }
    
    public void addPerusahaan(Perusahaan perusahaan){
        this.arrPerusahaan.add(perusahaan);
    }
    
    public void clearPelamar(){
        this.arrPelamar.clear();
    }
    
    public void clearPerusahaan(){
        this.arrPerusahaan.clear();
    }
    
    public void saveData(Driverclass dr) throws FileNotFoundException, IOException{
        FileOutputStream f_out = new FileOutputStream("Data Sisfo.data");
        ObjectOutputStream obj_out = new ObjectOutputStream (f_out);
        obj_out.writeObject (dr);
    } 
    
    public Driverclass loadData() throws FileNotFoundException, IOException, ClassNotFoundException{
        Driverclass dr=null;
        FileInputStream f_in = new FileInputStream("Data Sisfo.data");
        ObjectInputStream obj_in = new ObjectInputStream (f_in);
        Object obj = obj_in.readObject();
        if(obj instanceof Driverclass){
            dr=(Driverclass)obj;
        }
        return dr;
        
    }
    
}
