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
public class Blog {
    
    private int blogID;
    private int kullaniciID;
    private String blogBaslik;
    private String aciklama;
    private Timestamp olusturmaTarih;
    
    public void yeniKullaniciIcinBlogBilgisiHazirla(Kullanici k){
          this.kullaniciID=k.getKullaniciID();
          this.blogBaslik="Merhaba Ben "+k.getKullaniciAdSoyad()+
               ". Bloguma hos geldiniz.";
          this.aciklama="Bu otomatik oluşturulmuş bir blogdur. " +
                "Blog içeriğini değiştirmek istiyorsanız kullanıcı adı " +
                "ve şifreniz ile sisteme giriş yapınız. ";
          
          
          this.olusturmaTarih=Araclar.yeniTimeStampOlustur();
    }
    
    public String getAciklama(){
        return aciklama;
    }
    public void setAciklama(String aciklama){
        this.aciklama=aciklama;
    }
    
    public  String getBlogBaslik(){
        return this.blogBaslik;
    }
    public void setBlogBaslik(String blogBaslik){
        this.blogBaslik=blogBaslik;
        
    }
    public int getBlogID(){
        return blogID;
               
    }
    public void setBlogID(int blogID){
        this.blogID=blogID;        
    }
    
    public int getKullaniciID(){
        return kullaniciID;
    }
    public void setKullaniciID(int kullaniciID){
        
        this.kullaniciID=kullaniciID;
    }
    
    public Timestamp getOlusturmaTarih(){
        return this.olusturmaTarih;
        
    }
    public void setOlusturmaTarih(Timestamp olusturmaTarih){
        this.olusturmaTarih=olusturmaTarih;
    }
    
}
