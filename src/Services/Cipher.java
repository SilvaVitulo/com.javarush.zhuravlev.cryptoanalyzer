package Services;

import Utilits.Alphabet;

public class Cipher {
    public static char shiftCharacter(char c, int key, char[] alphabet) {
        int index = -1;
        for (int i = 0; i < alphabet.length; i++) {
            if (c == alphabet[i]) {
                index = i;
                break;
            }
        }

    if(index !=-1) {
        int newIndex = (index + key) % alphabet.length;
        if (newIndex < 0) {
            newIndex += alphabet.length;
        }
        return alphabet[newIndex];
    }
    return c;
}

public static String caesarCiper(String text, int key) {
    StringBuilder result = new StringBuilder();
    for(char c : text.toCharArray()){
        result.append(Cipher.shiftCharacter(c, key, Alphabet.ALPHABET_RUS));
    }
    return result.toString();
}
}


