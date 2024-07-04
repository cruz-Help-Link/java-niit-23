// package kidneysale;

class Kidney{
    String name = "Munirat";
    //INSTANCE METHOD
    void getHelp() {
        System.out.println("Welcome " + name);
    }
    //2nd Method- STATIC METHOD
    static int getNumber(int num, int gone) {
        return num;
    }
    public static void main(String[] args) {
        Kidney k = new Kidney();
        k.getHelp();
        getNumber(4,8); //method signature..
    }
}