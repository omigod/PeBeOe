/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo_lowongan_kerja;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wakya
 */
public class Aplikasi {

    ArrayList<Perusahaan> listPerusahaan = new ArrayList<>();
    ArrayList<Pelamar> listPelamar = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public ArrayList<Perusahaan> getListPerusahaan() {
        return this.listPerusahaan;
    }
    
    public ArrayList<Pelamar> getListPelamar(){
                return this.listPelamar;
    }

    public void addPerusahaan(String nama, String namaPerusahaan) {
        Perusahaan p = new Perusahaan(nama, namaPerusahaan);

        listPerusahaan.add(p);
    }

    public void addPelamar(String nmPelamar, String idPelamar) {
        Pelamar pe = new Pelamar(nmPelamar, idPelamar);
        listPelamar.add(pe);
    }

    public Pelamar getPelamar(String nmPelamar) {
        for (int i = 0; i < listPelamar.size(); i++) {
            if (listPelamar.get(i).getNamaOrang().equalsIgnoreCase(nmPelamar)) {
                return listPelamar.get(i);
            }

        }
        return null;
    }

    public Perusahaan getPerusahaan(String namaPerusahaan) {
        for (int i = 0; i < listPerusahaan.size(); i++) {
            if (listPerusahaan.get(i).getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                return listPerusahaan.get(i);
            }

        }
        return null;
    }

    public void hapusPelamar(String namaPelamar) {
        for (int i = 0; i < listPelamar.size(); i++) {
            if (listPelamar.get(i).getNamaOrang().equalsIgnoreCase(namaPelamar)) {
                listPelamar.remove(i);
            }
        }
    }

    public void hapusPerusahaan(String namaPerusahaan) {
        for (int i = 0; i < listPerusahaan.size(); i++) {
            if (listPerusahaan.get(i).getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                listPerusahaan.remove(i);
            }

        }
    }

    public void updatePerusahan(int indexYgMauDiupdate, Perusahaan dataYgBaru) {
        listPerusahaan.set(indexYgMauDiupdate, dataYgBaru);
    }

    public String searchPerusahaan(String namaPerusahaan) {
        String s ="";
        
        for (int i = 0; i < listPerusahaan.size(); i++) {
            if (listPerusahaan.get(i).getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                s=s+"===============" + listPerusahaan.get(i).getNamaPerusahaan() + "===============\n";
                s=s+"pemilik perusahaan : " + listPerusahaan.get(i).getNamaOrang()+"\n";
                s=s+"Lowongan yang tersedia : ";
                if (listPerusahaan.get(i).getnLowongan() != 0) {
                    for (int j = 0; j < listPerusahaan.get(i).getnLowongan(); j++) {
                        s=s+(j + 1) + ". " + listPerusahaan.get(i).getLowongan(j).getNamaLowongan()+"\n";
                    }
                } else {
                    s=s+"Tidak ada\n";
                }
                s=s+"==================================\n";
            }
                
        }
        return s;
        
    }

   public String searchPelamar(String namaPelamar) {
        String s="";
        
        for (int i = 0; i < listPelamar.size(); i++) {
            if (listPelamar.get(i).getNamaOrang().equalsIgnoreCase(namaPelamar)) {
                s=s+"=============================================\n";
                s=s+"ID                      : " + listPelamar.get(i).getIdPelamar()+"\n";
                s=s+"Nama                    : " + listPelamar.get(i).getNamaOrang()+"\n";

                s=s+"Berkas : ";
                if (listPelamar.get(i).getnBerkas() != 0) {
                    for (int j = 0; j < listPelamar.get(i).getnBerkas(); j++) {
                        s=s+"Id berkas           : " + listPelamar.get(i).getBerkas(j).getIdBerkas()+"\n";
                        s=s+"Jenis Berkas        : " + listPelamar.get(i).getBerkas(j).getJenisBerkas()+"\n";
                        s=s+"Tgl Masuk Berkas    : " + listPelamar.get(i).getBerkas(j).getTglMasukBerkas()+"\n";
                    }
                } else {
                    s=s+"Berkas belum diisi\n";
                }
                s=s+"===============================================\n";

            }
        }
        return s;
    }

    public String searchLowongan(String namaLowongan) {
        String s="";
        for (int i = 0; i < listPerusahaan.size(); i++) {
            for (int j = 0; j < listPerusahaan.get(i).getnLowongan(); j++) {
                if (listPerusahaan.get(i).getLowongan(j).getNamaLowongan().equalsIgnoreCase(namaLowongan)) {
                    s= s+"Lowongan tersebut tersedia pada perusahaan " + listPerusahaan.get(i).getNamaPerusahaan()+"\n";

                }
            }
        }
        return s;
    }

   public String displayPelamar() {
        String s = " ";
    
        for (int i = 0; i < listPelamar.size(); i++) {
            //s = s +"=============================================\n";
            s = s +"ID                      : " + listPelamar.get(i).getIdPelamar()+"\n";
            s = s +"Nama                    : " + listPelamar.get(i).getNamaOrang()+"\n";

            s=s+"Berkas : \n";
            if (listPelamar.get(i).getnBerkas() != 0) {
                for (int j = 0; j < listPelamar.get(i).getnBerkas(); j++) {
                    s=s+"Id berkas           : " + listPelamar.get(i).getBerkas(j).getIdBerkas()+"\n";
                    s=s+"Jenis Berkas        : " + listPelamar.get(i).getBerkas(j).getJenisBerkas()+"\n";
                    s=s+"Tgl Masuk Berkas    : " + listPelamar.get(i).getBerkas(j).getTglMasukBerkas()+"\n";

                }

            } else {
                s=s+"Berkas belum diisi\n";
            }
            s=s+"===============================================\n";

        }
        return s;
    }

    public String displayPerusahaan() {
       
        String s = "";
        for (int i = 0; i < listPerusahaan.size(); i++) {
            s=s+"===============" + listPerusahaan.get(i).getNamaPerusahaan() + "===============\n";
            s=s+"pemilik perusahaan : " + listPerusahaan.get(i).getNamaOrang()+"\n";
            s=s+"Lowongan yang tersedia : \n";
            if (listPerusahaan.get(i).getnLowongan() != 0) {
                for (int j = 0; j < listPerusahaan.get(i).getnLowongan(); j++) {
                    s=s+(j + 1) + ".) " + listPerusahaan.get(i).getLowongan(j).getNamaLowongan()+"\t";
                    s=s+"Deadline : "+listPerusahaan.get(i).getLowongan(j).getDeadline()+"\n";
                }
            } else {
                s=s+"Tidak ada\n";
            }
           s=s+"==================================\n";

        }
        return s;
    }

    public void displayBerkasDiTerima(String nmPerusahaan, String namaLowongan) {
        for (int i = 0; i < getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getnBTerima(); i++) {
            System.out.println("\t Diterima Sebagai " + getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getNamaLowongan());
            System.out.println("id Berkas    : " + getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getBerkasDiterima(i).getIdBerkas());
            System.out.println("jenis bekas  : " + getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getBerkasDiterima(i).getJenisBerkas());
            System.out.println("tgl Masuk Berkas : " + getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getBerkasDiterima(i).getTglMasukBerkas());
            System.out.println("=====================================================================");
        }
    }

    public void menu() {
        try {
            while (true) {
                BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("        MENU    ");
                System.out.println("1. Menu Perusahaan");
                System.out.println("2. Menu Pelamar   ");
                System.out.println("Pilihan = ");
                int pilihanMenu = input.nextInt();

                switch (pilihanMenu) {

                    case 1:
                        System.out.println("1. Add       perusahaan");
                        System.out.println("2. Display   perusahaan");
                        System.out.println("3. Delete    perusahaan");
                        System.out.println("4. Search    lowongan");
                        System.out.println("5. Add       lowongan");
                        System.out.println("6. Delete    lowongan");
                        System.out.println("7. saerch    Perusahaan");
                        System.out.println("8. liat Pelamar Lowongan");
                        System.out.println("9. liat berkas yang diterima");

                        System.out.println("Pilihan = ");
                        int pilihanSubMenu = input.nextInt();

                        switch (pilihanSubMenu) {
                            case 1:
                                System.out.print("nama pemilik : ");
                                String nama = input2.readLine();
                                System.out.print("nama perusahaan : ");
                                String namaP = input2.readLine();
                                addPerusahaan(nama, namaP);
                                break;
                            case 2:
                                System.out.println(displayPerusahaan()); 
                                break;
                            case 3:
                                System.out.println("Hapus perusahaan : ");
                                String nmPerusahaan1 = input2.readLine();
                                hapusPerusahaan(nmPerusahaan1);
                                break;
                            case 4:
                                System.out.println("cari nama lowongan : ");
                                String namaLowongan = input2.readLine();
                                searchLowongan(namaLowongan);
                                break;
                            case 5:
                                System.out.println("Nama perusahaan : ");
                                String nmPerusahaan2 = input2.readLine();
                                System.out.println("id Lowongan : ");
                                String id = input2.readLine();
                                System.out.println("Nama Lowongan : ");
                                String nmLowongan = input2.readLine();
                                System.out.println("Deadline : ");
                                String deadline = input2.readLine();
                                getPerusahaan(nmPerusahaan2).createLowongan(id, nmLowongan, deadline);
                                break;
                            case 6:
                                System.out.println("Nama perusahaan : ");
                                String nmPerusahaan3 = input2.readLine();

                                System.out.println("id lowongan yang akan dihapus : ");
                                String namaL = input2.readLine();
                                getPerusahaan(nmPerusahaan3).remLowongan(namaL);
                                break;

                            case 7:
                                System.out.println("cari nama perusahaan : ");
                                String nmPerusahaan4 = input2.readLine();
                                searchPerusahaan(nmPerusahaan4);

                                break;
                            case 8:
                                System.out.println("pilih nama perusahaan : ");
                                String nmPerusahaan5 = input2.readLine();

                                System.out.println("pilih nama lowongan : ");
                                String nmlow = input2.readLine();
                                for (int i = 0; i < listPerusahaan.size(); i++) {
                                    for (int j = 0; j < listPerusahaan.get(i).getnLowongan(); j++) {
                                        System.out.println("ID berkas Pelamar : " + getPerusahaan(nmPerusahaan5).getLowongan(nmlow).getBerkasMasuk(j).getIdBerkas());
                                        break;
                                    }
                                    break;

                                }

                                System.out.println("1. terima berkas ?");
                                System.out.println("2. kembali ke Menu awal");
                                int opsi = Integer.parseInt(input2.readLine());
                                if (opsi == 1) {
                                    System.out.println("Pilih nama pelamar yang ingin diterima ");
                                    String nmPell = input2.readLine();
                                    System.out.println("pilih ID berkas yang ingin diterima ");
                                    String idBerkas3 = input2.readLine();
                                    getPerusahaan(nmPerusahaan5).getLowongan(nmlow).terimaBerkas(getPelamar(nmPell).getBerkas(idBerkas3));
                                }

                                break;
                            case 9:
                                System.out.println("masukkan Nama perusahaan : ");
                                String nmPerusahaan7 = input2.readLine();
                                System.out.println("masukkan nama lowongan yang ingin diliat ");
                                String nmloww = input2.readLine();
                                //System.out.println(getPerusahaan(iindexper).getLowongan(iindexlow).getnBTerima());
                                displayBerkasDiTerima(nmPerusahaan7, nmloww);
                                break;

                        }
                        break;

                    case 2:
                        System.out.println("1. add      pelamar ");
                        System.out.println("2. display  pelamar ");
                        System.out.println("3. delete   pelamar ");
                        System.out.println("4. search   pelamar ");
                        System.out.println("5. create   berkas ");
                        System.out.println("6. masukkan minat lowongan kerja");

                        int subPilihan = input.nextInt();
                        switch (subPilihan) {
                            case 1:
                                System.out.print("Nama      : ");
                                String nama = input2.readLine();
                                System.out.print("Id pelamar : ");
                                String id = input2.readLine();
                                addPelamar(nama, id);
                                break;

                            case 2:
                                displayPelamar();
                                break;
                            case 3:
                                System.out.println("hapus nama pelamar : ");
                                String namaPel = input2.readLine();
                                hapusPelamar(namaPel);
                                break;
                            case 4:
                                System.out.println("cari nama pelamar : ");
                                String nmPel = input2.readLine();
                                searchPelamar(nmPel);
                                break;
                            case 5:
                                System.out.println("Nama Pelamar : ");
                                String nmPelamar11 = input2.readLine();
                                System.out.println("Id berkas : ");
                                String idBerkas = input2.readLine();
                                System.out.println("Jenis Berkas : ");
                                String jenisBerkas = input2.readLine();
                                System.out.println("Tanggal Masuk Berkas : ");
                                String tglMasuk = input2.readLine();
                                getPelamar(nmPelamar11).createBerkas(idBerkas, jenisBerkas, tglMasuk);
                                break;
                            case 6:
                                System.out.println("Nama pelamar : ");
                                String nmPelamar2 = input2.readLine();
                                System.out.println("pilih nama perusahaan ");
                                String nmPerusahaan6 = input2.readLine();
                                System.out.println("ID berkas : ");
                                String idBerkas1 = input2.readLine();
                                System.out.println("nama lowongan : ");
                                String nmLow1 = input2.readLine();

                                getPerusahaan(nmPerusahaan6).getLowongan(nmLow1).addBerkas(getPelamar(nmPelamar2).getBerkas(idBerkas1));

                        }
                }
            }
        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("kelebihan array "+arr.getMessage() );
        } catch (Throwable ex) {
            System.out.println("error : " + ex.getMessage());
        }

    }

    public static void main(String[] args) {
        Aplikasi ap = new Aplikasi();
        ap.menu();
    }
}
