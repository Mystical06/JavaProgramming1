package day32_Constructors;

public class Carpet {
public double width, lenght;
public double unitPrice;
public boolean isPersian;

    public Carpet(double width, double lenght, double unitPrice, boolean isPersian) {
        this.width = width;
        this.lenght = lenght;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calcCost(){
        double totalCost= (width * lenght) *unitPrice;
        if (isPersian){
            totalCost+=200;
        }
        return totalCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width + "m²"+
                ", lenght=" + lenght + "m²"+
                ", unitPrice= £" + unitPrice +"/m²"+
                ", isPersian=" + isPersian +
                ", total price= £" + calcCost() +
                '}';
    }
}
/*
warmup task:
	1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)

				Add a constructor to set all the instances

                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitPrice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */