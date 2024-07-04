public interface SalaryCalculator {
    int calculateSalary();
}

class FirstAlgo implements SalaryCalculator {
    private int pay;
    private int days;

    FirstAlgo(int pay, int days) {
        this.pay = pay;
        this.days = days;
    }

    public int calculateSalary() {
         // int noDays = new int(days);
        //  double noDays = days;
        //  int salary;
        //  return salary = pay * noDays;
         return salary = pay * days;

    }

}

class SecAlgo implements SalaryCalculator {
    public int calculateSalary() {
        return 1090.34;
    }
}

class SalaryObjFactory {
    static SalaryCalculator getSalary() {
        String algorithm = getAlgoValueFromPropertyFile();
        switch (algorithm) {
            case "1":
                int pay = getPayFromPropertyFile();
                int days = getDaysFromPropertyFile();
                return new FirstAlgo(pay, days);

            case "2":
                return new SecAlgo();

            default:
            System.out.println("nanna");
            return new SecAlgo();
        }
    }
    public static int getDaysFromPropertyFile() {
        return 24;
    }

    public static int getPayFromPropertyFile() {
        return 120;
    }

    private static String getAlgoValueFromPropertyFile() {
        return "2";
    }

    public static void main(String[] args) {
        getSalary();
    }
}




// int value = (int)data;