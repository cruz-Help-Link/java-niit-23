public class CarRace{
    private static int noOfVehicles = 5; 
    private static Vehicle[] vehicles;

    public static void main(String[] args){
        try{
            vehicles = new Vehicle[5];
            for(int i = 0; i < noOfVehicles; i++){
                vehicles[i]=new Vehicle(i);
                Thread t = new Thread(vehicles[i]);
                t.start();
                Thread.sleep(2000);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}