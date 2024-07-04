public class MultiGenericContainer<T, S> {

    private T firstPosition;
    private S secondPosition;

    public MultiGenericContainer(T firstPosition, S secondPosition) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
    }

    public T getFirstPosition() {
        return firstPosition;
    }

    public void setFirstPosition(T firstPosition) {
        this.firstPosition = firstPosition;
    }

    public S getSecondPosition() {
        return secondPosition;
    }

    public void setSecondPosition(S secondPosition) {
        this.secondPosition = secondPosition;
    }

    public static void main(String[] args) {
        MultiGenericContainer<String, String> mondayWeather = new MultiGenericContainer<String, String>("Monday",
                "Sunny");
        MultiGenericContainer<Integer, Double> dayOfWeekDegrees = new MultiGenericContainer<Integer, Double>(1, 78.0);

        String mondayForecast = mondayWeather.getFirstPosition();
        // The Double type is unboxed--to double, in this case. More on this in next
        // section!
        double sundayDegrees = dayOfWeekDegrees.getSecondPosition();
        System.out.println("Today is " + mondayForecast + " with a temperature of " + sundayDegrees);
    }

}