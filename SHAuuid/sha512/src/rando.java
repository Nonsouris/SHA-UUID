import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.lang.*;
public class rando{
    
public static String get_SHA_512_SecurePassword(String passwordToHash, String   salt) throws UnsupportedEncodingException{
String generatedPassword = null;
    try {
         MessageDigest md = MessageDigest.getInstance("SHA-512");
         md.update(salt.getBytes("UTF-8"));
         byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
         StringBuilder sb = new StringBuilder();
         for(int i=0; i< bytes.length ;i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
         }
         generatedPassword = sb.toString();
        } 
       catch (NoSuchAlgorithmException e){
        e.printStackTrace();
       }
    return generatedPassword;
}
 public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        return uuid;
    }
 public static void main(String[] args) throws UnsupportedEncodingException {
        String newt = "1";
        String tried = "1";
      
        for(int p= 0;p<20;p++){
        do{
            newt = generateString();
        tried = get_SHA_512_SecurePassword(newt,"");
        }while(!(tried.startsWith("00")));
        System.out.println(newt);
        //System.out.println(tried);
 }
 };
   
}