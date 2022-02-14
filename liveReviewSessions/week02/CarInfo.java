package week02;

public class CarInfo {

    public static void main(String[] args) {
        int year = 2022;
        String make = "Audi";
        String model = "A6";
        boolean transmission = true;
        String transmissionAutomatic = "Automatic Transmission :";
        String colour = "Black";
        int mileage = 0;
        int price = 100_000;
        System.out.println(year + " "+ make + " " + model + "\n" + transmissionAutomatic + " " + transmission +
                "\n"+ colour +" / " + mileage + " mile / "+ "€"+ price );

        double priceInTl = price * 15.5;
        double taxRate = 1.80;
        double priceAfterTaxInTl = priceInTl + (priceInTl *taxRate);
        System.out.println("priceAfterTax = " + priceAfterTaxInTl);


    }
}
