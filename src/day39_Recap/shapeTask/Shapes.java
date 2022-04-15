package day39_Recap.shapeTask;

public class Shapes {

    private String name;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        if (name==null){
            System.err.println("Name cannot be null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shapes(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double  perimeter(){
        return 0;
    }



    @Override
    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter ='" + perimeter() + '\'' +
                '}';

    }

}




/*
Shape:
	variable:
		name

	Add A constructor to set the filed

	Methods:
		area(){return 0}
		perimeter{return 0}
		toString(): name, area, perimeter


Circle
	r
	pi

	toString(): name, r, pi, area, perimeter

Square
	s

	toString(): name, s, area, perimeter

Rectangle
	l
	w

	toString(): name, l, w, area, perimeter

....
 */