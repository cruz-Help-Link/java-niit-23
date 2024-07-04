class ThrowsExecpt {

    // This method throws an exception to be handled

    static void accessMe() throws IllegalAccessException {
        System.out.println("Inside accessMe(). ");
        throw new IllegalAccessException("GOTTCHA!!!");
    }
    public void alpha() {
        char cha;
        for(cha ='a'; cha<= 'z'; cha++) {
            System.out.print(cha);
        }
        System.out.println();
    }
    
// throw keyword in exception handling

	public void maths() {
        try {
			double x=3/0;
			throw new ArithmeticException();
		}
		catch (ArithmeticException e) {
			// e.printStackTrace();
            System.out.println("problem");
		}
    }
	

    // This is a caller function
    public static void main(String args[]) {
        ThrowsExecpt te = new ThrowsExecpt();

        try {
            accessMe();
        } catch (IllegalAccessException e) {
            System.out.println("Caught in Main.");
        }
        finally {
            te.maths();
            te.alpha();
        }
    }
}
