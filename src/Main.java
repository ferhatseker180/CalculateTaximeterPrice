import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Defining variable
        double finalPrice;
        double startPrice = 10.0, minPrice = 20.0, eachKMPrice = 2.20;

        // Take KM information with Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please indicate the distance in km");
        double km = input.nextDouble();

        // Calculate fee to be paid
        finalPrice = startPrice + (km*eachKMPrice);
        System.out.println(finalPrice>20 ? "You must pay: " + finalPrice + "TL" : "You must pay : " + minPrice+ "TL");

    }
}