package spartaglobal.raindrop;

public class Raindrop {

    public static String convertNumber(int input) {
        // Check if the input has a factor of 3, 5 or 7. If it doesn't, we can return out early
        if (input % 3 != 0 && input % 5 != 0 && input % 7 != 0) {
            return "" + input;
        }

        // Otherwise, append pling, plang and/or plong based on the inputs factors of 3, 5 and 7
        String ret = "";
        if (input % 3 == 0) ret += "Pling";
        if (input % 5 == 0) ret += "Plang";
        if (input % 7 == 0) ret += "Plong";

        return ret;
    }

}
