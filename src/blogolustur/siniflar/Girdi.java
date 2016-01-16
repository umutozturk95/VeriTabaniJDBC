/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogolustur.siniflar;
import java.sql.Timestamp;
/**
 *
 * @author HP
 */
public class Girdi {
    private int girdiID;
    private int blogID;
    private int kullaniciID;
    private String girdiBaslik;
    private String girdiIcerik;
    private Timestamp girdiTarih;
    
    public void hosgeldinGirdisiHazirla(Kullanici k,Blog b){
          this.blogID=b.getBlogID();
          this.kullaniciID=k.getKullaniciID();
          this.girdiBaslik="Bloguma Hos Geldiniz.";
          this.girdiIcerik="Bu bir deneme girdisidir. Yeni girdi eklemek" +
                "ya da bu girdiyi degistirmek icin giris linkini kullaniniz";
          this.girdiTarih=Araclar.yeniTimeStampOlustur();
          
        
    }
    
    public int getBlogID(){
        return this.blogID;
        
    }
    public void setBlogID(int blogID){
        this.blogID=blogID;
    }
    public String getGirdiBaslik(){
        return this.girdiBaslik;
    }
    
    public void setGirdiBaslik(String girdiBaslik){
        this.girdiBaslik=girdiBaslik;
    }
    
    public int getGirdiID(){
        return this.girdiID;
        
    }
    public void setGirdiID(int girdiID){
        this.girdiID=girdiID;
     }       
    public String getGirdiIcerik(){
        return this.girdiIcerik;
        
    }
    public void setGirdiIcerik(String girdiIcerik){
        this.girdiIcerik=girdiIcerik;
        
    }
    public int getKullaniciID() {
        return kullaniciID;
    }
    public void setKullaniciID(int kullaniciID){
        this.kullaniciID=kullaniciID;
    }
    public Timestamp getGirdiTarih(){
        return this.girdiTarih;
    }
    public void setGirdiTarih(Timestamp girdiTarih){
        this.girdiTarih=girdiTarih;
    }
            
}
