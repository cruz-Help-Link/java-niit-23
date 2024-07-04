import java.io.ByteArrayInputStream;

public class ByteInputClass {
    byte[] bytesSource(){ 
        return new byte[]{34, 56, 78, 90, 23, 45, 57}; 
    }
    public void readerTy() {
        byte[] buffer = bytesSource(); 
        try(ByteArrayInputStream bys = new ByteArrayInputStream(buffer)){ 
            int data = bys.read(); 
            while(data != -1) {
                System.out.print(data + " "); 
                //prints: 42 43 44 
                data = bys.read(); 
            } 
        } catch (Exception e){ 
            e.getMessage(); 
        }
    }
    public static void main(String[] args) {
        ByteInputClass bic = new ByteInputClass();
        bic.readerTy();
        // Scanner sc = new Scanner(System.in); 
        // System.out.print("Enter something: "); 
        // while(sc.hasNext())
        // { 
        // String line = sc.nextLine(); 
        // if("end".equals(line)){ 
        //     System.exit(0); 
        // } 
        // System.out.println(line); 
        // }
    }
}
