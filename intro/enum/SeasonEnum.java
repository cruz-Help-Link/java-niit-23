public class SeasonEnum {
    enum Season{
        SPRING(20), SUMMER(35), AUTUMN(16), WINTER(7);
        private final int tempInCelcius;
        private String name = " ";
        
        Season(int tempInCelcius) {
            this.tempInCelcius = tempInCelcius;
        }

        public int gettempInCelcius() {
            return tempInCelcius;
        }

        @Override
        public String toString() {
            return this.name().charAt(0) +
                this.name.substring(1).toLowerCase() + "(" + tempInCelcius + ")";
        }
    }
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}
