// fields to calculate area
class AreaEncap {

    int length;
    int breadth;

    // constructor to initialize values
    AreaEncap(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        // GetSet obj = new GetSet();
        // obj.name = "UMMM";

        AreaEncap area = new AreaEncap(2, 16);
        area.getArea();
    }
}
