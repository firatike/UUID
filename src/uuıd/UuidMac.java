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
public class UuidMac {
    //Bu girilen mac adresine göre uuid oluşturuyor ama 50 karakter uzunluğunda değil
    
    public static String uuidOlusturma(String macAddress) {
        UUID uuid = UUID.nameUUIDFromBytes(macAddress.getBytes());
        String uuidString = uuid.toString();
        if (uuidString.length() > 50) {
            return uuidString.substring(0, 50);
        }
        return uuidString;
    }
    public static void main(String[] args) {
        String macAddress = "01:12:23:34:45:56";
        String uuid = uuidOlusturma(macAddress);
        System.out.println(uuid);
    }
}
