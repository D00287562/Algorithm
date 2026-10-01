public class Fahrenheit {

    public static void main(String [] args){
        System.out.println(ToFahrenheit(23));
    }

    public static double ToFahrenheit (double conv) {

        double fah = conv * (9.0 / 5.0) + 32;
        return fah;
    }
}
