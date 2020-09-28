package junk;

import org.jetbrains.annotations.Contract;

public class Data2 {


    @Contract(pure = true)
    public static String[] storedata() {

        String[] oneDArray = new String[2];
        oneDArray[0] = "username";

        oneDArray[1] = "Lilly Gomes";

        return oneDArray;
    }
}