package Services;

import static Services.Cipher.caesarCipher;

public class Decrypt {
    public static String decrypt(String text, int key) {
        return caesarCipher(text, -key);
    }
}
