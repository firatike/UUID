/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uuıd;

import java.util.UUID;

/**
 *
 * @author Fırat
 */
public class UuidMac50 {
    public static String uuidOlusturma(String macAddress) {
        //Bu kod 50 karakter uzunluğunda uuid oluşturuyor 
        //ama uuid oluşturduktan sonra 50 karaktere tamamlamak için sona belirlediğim F harfini ekliyor
        
        UUID uuid = UUID.nameUUIDFromBytes(macAddress.getBytes());
        String uuidString = uuid.toString();
        if (uuidString.length() > 50) {
            return uuidString.substring(0, 50);
        } else if (uuidString.length() < 50) {
            int fark = 50 - uuidString.length();
            StringBuilder sb = new StringBuilder(uuidString);
            for (int i = 0; i < fark; i++) {
                sb.append("F");
            }
            return sb.toString();
        }
        return uuidString;
    }

    public static void main(String[] args) {
        String macAddress = "01:12:23:34:45:56";
        String uuid = uuidOlusturma(macAddress);
        System.out.println(uuid);
    }
}
