public class Genericfxvc<T, S> {
    private T t;
    private S s;

    Genericfxvc(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setS(S s) {
        this.s = s;
    }

    public S getS() {
        return s;
    }

    public static void main(String[] args) {
        // specify the data types
        Genericfxvc<String, Integer> gf = new Genericfxvc<String, Integer>("Acc No:", 453098230);

        Genericfxvc<String, Integer> gf2 = new Genericfxvc<String, Integer>("Acc No:", 563773661);
        System.out.println("Key ---> " + gf2.getT()); 
        System.out.println("Value ---> " + gf2.getS()); 
        boolean comp = GenUtil.compare(gf, gf2);
        System.out.println(comp);
    }
}

class GenUtil {
    public static boolean compare(Genericfxvc<String, Integer> gf, Genericfxvc<String, Integer> gf2) {
        return gf.getT().equals(gf2.getT()) && gf.getS().equals(gf2.getS());
    }
}

// E -element
// T - type
// K - key
// V - value
// S,U,V -2ND, 3RD, 4TH
