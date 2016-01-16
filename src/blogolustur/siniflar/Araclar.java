/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogolustur.siniflar;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Umut Ozturk
 */

public class Araclar {
    
   public static Timestamp yeniTimeStampOlustur(){      
     return new Timestamp((new java.util.Date()).getTime());         
   }
   public static String tarihZamanGoster(Timestamp ts){
       Date date=new Date(ts.getTime());
       String gosterim="dd/MM/yyyy - (hh:mm)";
       SimpleDateFormat sdf=new SimpleDateFormat(gosterim);
       return sdf.format(date);
   }
   
   public static String sadeceTarihGoster(Timestamp ts){
      Date date=new Date(ts.getTime()); 
      String  gosterim="dd/MM/yyyy";
      SimpleDateFormat sdf=new SimpleDateFormat(gosterim);
      return sdf.format(date);
      
      
   }
   
   public static String sadeceZamanGoster(Timestamp ts){
       Date date=new Date(ts.getTime());
       String gosterim="hh:mm";
       SimpleDateFormat sdf=new SimpleDateFormat(gosterim);
       return sdf.format(date);
   }
   
    
}
