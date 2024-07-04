public class SwitchThrid { 
    public void whenUnavailable() {
        System.out.println("The switch case will accept only 1-3");
    }
   public void switchDemo1(int x){ 
        switch (x){ 
            case 1 -> System.out.println("Your number is one");
            case 2 -> System.out.print("Your number is two"); 
            case 3 -> diff(); 

            default -> whenUnavailable(); 
        } 
            System.out.println(": " + x); 
    }
    public static void main(String[] args) {
        SwitchThrid st = new SwitchThrid();
        st.switchDemo1(3);
    }
}
