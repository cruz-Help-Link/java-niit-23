public class SalaryLoading {
    final int netPay = 10000;
    int ask;

    public void calculateSalary() {
        System.out.println(netPay);
    }

    public void calculateSalary(int taxDeduction, boolean truth) {
        int pay;
        pay = netPay - taxDeduction;
        System.out.println(pay);
    }

    public void calculateSalary(int taxDeduction, int incentives) {
        int pay;
        pay = netPay - taxDeduction + incentives;
        System.out.println(pay);
    }

    public void calculateSalary(String name, int months) {
        int pay;
        pay = netPay / months;
        System.out.println(name + " " + pay);
    }

    public void calculateSalary(char gender, double netGain, boolean truth) {
        double percentages, percentage1 = 5, percentage2 = 100; percentages = percentage1 / percentage2;
        double pay;
        pay = netGain - percentages * netGain;
        System.out.println(pay + " " + gender + " " + percentages);
    }

    public static void main(String[] args) {
        SalaryLoading sl = new SalaryLoading();
        sl.calculateSalary('M', 10000, true);

    }
}
