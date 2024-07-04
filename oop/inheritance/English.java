import java.util.Scanner;

class Language {
    protected String state = "My Language is"; // Language attribute

    public void speak() { // Language method
        System.out.println("I speak my Language!");
    }

    public void enuciateWord(String word) {
         System.out.println( "The word is " + word.toUpperCase());    
    }
}

class English extends Language {
    private String tongue = "English";
    // English attribute
// public String enuciateWord(String word) {
//         return "The word is " + word.toUpperCase();
//     }
    public static void main(String[] args) {
        // Create a English object
        English eng = new English();

        // Call the speak() method (from the Language class) on the eng object
        eng.speak();

        // Display the value of the brand attribute (from the Language class) and the
        // value of the modelName from the English class
        System.out.println(eng.state + " " + eng.tongue);
        String words = "pure";

        
        eng.enuciateWord(words);
        English e1 = new English("BMW", new ArmoredCar());
    }
}