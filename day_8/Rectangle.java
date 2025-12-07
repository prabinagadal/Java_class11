package day_8;

class Rectangle{
    public double length;
    public double breadth;
    public double area;
    public double perimeter;

    Rectangle(double l,double b){
        length=l;
        breadth=b;

        rectanglearea();
            area=length * breadth;
            System.out.println("Area of rectangle is:" + area);        
        }
        perimeterarea();
            perimeter=2 * (length + breath);
            System.out.println("Perimeter of rectangle is:" + perimeter);
        }
    }

    }
