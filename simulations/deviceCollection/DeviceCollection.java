import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DeviceCollection implements Comparator<Device>{

    @Override
    public int compare(Device d1, Device d2) {
        if (d1.cost > d2.cost) {
            return 1;
        } else if (d1.cost < d2.cost) {
            return -1;
        } else return 0;
    }
    public static void main(String[] args) {
        ArrayList<Device> deviceList=new ArrayList<Device>();

        deviceList.add(new Device("Storage", "Hard Drive", 1200));

        deviceList.add(new Device("Input", "Keyboard", 980));

        deviceList.add(new Device("Output", "Speakers", 2200));
        
        deviceList.add(new Device("Processsing", "V Card", 2100));


        for(Device device : deviceList){ // looping throgh list using obj od Device class, triggers overriden toString()
            System.out.println(device);
        }
        
        Collections.sort(deviceList,new DeviceCollection());
        System.out.println("\n Device List sorted by cost");
        
        for(Device device : deviceList){ // looping throgh list using obj od Device class, triggers overriden toString()
            System.out.println(device);
        }

        Comparator<Device> devCost = (d1, d2) -> d1.cost - d2.cost; 
        Device expensive = deviceList.stream()
        .max(devCost) 
        .orElse(null); 
        System.out.println(expensive+ " using max"); 

        Object[] obj = deviceList.stream().toArray(); 
                    Arrays.stream(obj).forEach(System.out::print); 
                    System.out.println("TO ARRAY");

        String allDevices = deviceList.stream() 
            .map(d -> d.type) 
            .reduce("Devices Available:",(d1, d2) -> d1 + ", " + d2) 
            .orElse(null); 
            System.out.println(allDevices); 

    //.parallelStream()
    // .reduce(d1, d2) -> d1 + " " + d2, (d1, d2) -> d1 + " " + d2 ); 
    // .reduce("Devices Available:", (d1, d2) -> d1 + " " + d2, (d1, d2) -> d1 + " " + StringUtils.remove(d2, "All names: "));

       
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     System.out.println("Enter Catchphrase---->>>> ");
        //     String s = br.readLine();

            
        //     String s1 = " Is this realistic";
        //     System.out.println("Output ---------->>>>>>>> " + s.toUpperCase() + s1);
        // }
        //  catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("Exception");
        // }
    }
}

// public class DeviceCostSort 
// }

