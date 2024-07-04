import java.text.NumberFormat;
import java.util.Locale;

class Numbers {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        double num = 45_000;
        System.out.println(nf.format(45_000));
        System.out.println(nf.format(45_000_000));

        NumberFormat nff = NumberFormat.getCurrencyInstance(Locale.UK);
        String values = nff.getCurrency().getDisplayName();
        double money = 1345.87;
        System.out.println(values);
        System.out.println(nff.format(money));

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        String munPer = percentFormat.format(0.43);
        System.out.println(munPer);

        String name = "Munirat";
        System.out.println(name.length());

        String s1 = "ert";
        String s2 = "xyz";
        if (s1 == s2) {
            System.out.println("Both Strings are Equal");
        } else {
            System.out.println("Both Strings are Unequal");
        }
        String x1 = new String("sde");
        String x2 = new String("sde");
        if (x1 == x2) {
            System.out.println("Both Strings are Equal");
        } else {
            System.out.println("Both Strings are Unequal");
        }

    }
}