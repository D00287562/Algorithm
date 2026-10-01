public class uppercase {

public static void main(String [] args) {
    System.out.println(containsUpperCase("fotball"));
}

    public static boolean containsUpperCase(String Upper) {
        for (int i = 0; i < Upper.length(); i++) {

            if (Character.isUpperCase(Upper.charAt(i))) {
                return true;
            } else {

            }


        }
        return false;
    }
}
