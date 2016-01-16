/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogolustur;

import blogolustur.siniflar.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class BlogOlustur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
        VeritabaniIslemleri vi=new VeritabaniIslemleri();
        vi.baglan();
        
        vi.tumTablolariTemizle();
        
        Kullanici kullanici=new Kullanici();
        kullanici.bosKullaniciOlustur();
        vi.kullaniciOlustur(kullanici);
        kullanici.setKullaniciID(vi.kullaniciIDsiniBul(kullanici.getKullaniciEmail()));
        
        Blog blog=new Blog();
        blog.yeniKullaniciIcinBlogBilgisiHazirla(kullanici);
        vi.blogOlustur(blog);
        blog.setBlogID(vi.blogIDsiniBul(blog.getOlusturmaTarih()));
        
        
        Girdi girdi=new Girdi();
        girdi.hosgeldinGirdisiHazirla(kullanici, blog);
        vi.girdiOlustur(girdi);
        girdi.setGirdiID(vi.girdiIDsiniBul(girdi.getGirdiTarih()));
        
        
        Yorum yorum=new Yorum();
        yorum.hosGeldinYorumuHazirla(girdi, kullanici);
        vi.yorumOlustur(yorum);
        vi.yorumOlustur(yorum);
        vi.yorumOlustur(yorum);
        //Transaction ornegi icin...
        List<Kullanici> kullaniciList=new ArrayList<Kullanici>();
         
        for(int i=0;i<100;i++){
            
            Kullanici k=new Kullanici();
            k.bosKullaniciOlustur();
            k.setKullaniciEmail(k.getKullaniciEmail()+i);
            kullaniciList.add(k);
            
            
        }
        //kullaniciList.get(1).setKullaniciEmail(null);
        vi.kullanicilariListedenEkle(kullaniciList);
        vi.baglantiyiKes();
        
        
        
      }
      catch(Exception ex){
          ex.printStackTrace();
          
      }
    }  
    
}
