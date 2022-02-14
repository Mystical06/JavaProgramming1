package day05_Concatenation;

/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */
public class ShippingAddress {
    public static void main(String[] args) {
        /*
        String name = "Mustafa Aydin";
        String buildingNumber = "111A";
        String streetName = "Apple Grove";
        String city = "Enfield";
        String borough = "London";
        String country = "UK";
        String postCode = "EN1 3DB";
        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " / "
                + borough + "\n" + postCode + "\n" + country);
         */

        String name = "Mustafa Aydin",
                buildingNumber = "111A",
                streetName = "Apple Grove",
                city = "Enfield",
                borough = "London",
                country = "UK",
                postCode = "EN1 3DB";
       /* System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " / "
              + borough + "\n" + postCode + "\n" + country); */
        String shippingAddress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " / "
                + borough + "\n" + postCode + "\n" + country;

        System.out.println(shippingAddress);

    }

}
