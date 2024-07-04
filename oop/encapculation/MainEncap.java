// fields to calculate area
class AreaEncap {

    private int length;
    private int breadth;

    // constructor to initialize values
    AreaEncap(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        final int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class MainEncap {
    public static void main(String[] args) {
        // GetSet obj = new GetSet();
        // obj.name = "UMMM";

        AreaEncap area = new AreaEncap(2, 16);
        area.getArea();
    }
}
