
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ^
 */
public class things {
        public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        return "uuid = " + uuid;
    }
         public static void main(String[] args) {
 
    }
}
