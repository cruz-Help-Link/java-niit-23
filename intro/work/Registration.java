import java.util.Scanner;

public class Registration {
    private RegistrationStatus status;

    public enum RegistrationStatus {
        INITIATED,
        SUBMITTED,
        VERIFIED;
    }
    public RegistrationStatus getStatus() {
        return status;
    }

    public void setStatus(RegistrationStatus status) {
        this.status = status;
    }
    
    public int isRegisterable() {
        switch (status) {
            case INITIATED: return 5;
            case SUBMITTED: return 2;
            case VERIFIED: return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        Registration res = new Registration();
        RegistrationStatus statuss = RegistrationStatus.INITIATED;
        
        res.setStatus(statuss);
        res.getStatus();
        String output = res.getStatus().toString();
        // res.isRegisterable();
    }

}
