class GetSet {

    // Member variable of this class
    private String name;

    // Method 1 - Getter
    public String getName() {
        return name;
    }

    // Method 2 - Setter
    public void setName(String N) {

        // This keyword refers to current instance itself
        this.name = N;
    }

    //The getter and setter methods provide read-only or write-only access to our class fields.

    public static void main(String[] args) {
        // Creating an object of class
        GetSet obj = new GetSet();
        // obj.name = "UMMM"; try in a different class

        // Setting the name by calling setter method
        obj.setName("Munirat");
        // Getting the name by calling getter method
        System.out.println(obj.getName());

        //getName()  // provides read-only access
        //setName() // provides write-only access
    }
}
