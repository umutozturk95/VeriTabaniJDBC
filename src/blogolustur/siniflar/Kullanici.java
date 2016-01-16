/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogolustur.siniflar;
import java.sql.Timestamp;
/**
 *
 * @author Umut Ozturk;
 */
public class Kullanici {
    
    private int kullaniciID;
    private String kullaniciEmail;
    private String kullaniciSifre;
    private String kullaniciAdSoyad;
    private String kullaniciIzin;
    private Timestamp kayitTarih;
    
    public void bosKullaniciOlustur(){
        this.kullaniciAdSoyad="Yeni Kullanici";
        this.kullaniciEmail="deneme@deneme.com";
        this.kullaniciSifre="deneme";
        this.kullaniciIzin="A";
        this.kayitTarih=Araclar.yeniTimeStampOlustur();
        
    }
    public String getKullaniciAdSoyad(){
        return this.kullaniciAdSoyad;
        
    }
    public void setKullaniciAdSoyad(String kullaniciAdSoyad){
        this.kullaniciAdSoyad=kullaniciAdSoyad;
        
    }
    public String getKullaniciEmail(){
        return this.kullaniciEmail;
        
        
    }
    public void setKullaniciEmail(String kullaniciEmail){
        this.kullaniciEmail=kullaniciEmail;
    }
    public int getKullaniciID() {
        
        return this.kullaniciID;
    }
    
    public void setKullaniciID(int kullaniciID){
        this.kullaniciID=kullaniciID;
    }
    public void setKullaniciIzin(String kullaniciIzin){
           this.kullaniciIzin=kullaniciIzin;
        
    }
    public String getKullaniciIzin(){
        return this.kullaniciIzin;
    }
    public String getKullaniciSifre(){
        return this.kullaniciSifre;
        
    }
    public void setKullaniciSifre(String kullaniciSifre){
        
        this.kullaniciSifre=kullaniciSifre;
    }
    public Timestamp  getKayitTarih(){
        return kayitTarih;
    }
    public void setKayitTarih(Timestamp kayitTarih){
       this.kayitTarih=kayitTarih;        
    }
}
