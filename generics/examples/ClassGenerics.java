public class ClassGenerics{
    private Object obj;
    // private String name;

    public void setObject(Object obj) {
        this.obj = obj;
    }
    public Object getObject() {
        return obj;
    }
    public static void main(String[] args) {
        ClassGenerics cg = new ClassGenerics();
        cg.setObject(2334.67);
        cg.getObject();
        Filler<String> fill = new Filler<String>();
        Filler<Integer> fill2 = new Filler<Integer>();

    }
}
//GENERIC CLASS
public class Filler<T> { //T is an unknown type
    private T t;

    public void setT(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
}
