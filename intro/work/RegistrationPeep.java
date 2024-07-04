import java.util.Scanner;

public class RegistrationPeep {

    public enum RegistrationStatus {
        INITIATED("INITIATED"),
        SUBMITTED("SUBMITTED"),
        VERIFIED("VERIFIED");

        private String status;
        RegistrationStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return status;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Status id");
        int id = sc.nextInt();
        switch (id) {
            case 100:
                String initiated = RegistrationStatus.INITIATED.toString();
                System.out.println("------------------------------------");
                System.out.println("Registration Status is"+ " " + initiated);
                break;

            case 200:
                String submitted = RegistrationStatus.SUBMITTED.toString();
                System.out.println(submitted);
                System.out.println("------------------------------------");
                System.out.println("Registration Status is"+ " " + submitted);
            
            break;

            case 500:
            String verified = RegistrationStatus.VERIFIED.toString();
            System.out.println("------------------------------------");
            System.out.println("Registration Status is"+ " " + verified);
            break;

            default:
            System.out.println("------------------------------------");
                break;
        }

    }
        

}