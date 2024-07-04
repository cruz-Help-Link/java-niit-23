public class MultipleExceptionDemo {
    public static void main(String[] args) {
        int arr[]={2,3,0},num1=42,result,index;
        try{
            System.out.println("Enter the Index:::");
            index=new java.util.Scanner(System.in).nextInt();//Keyboard
            result=num1/arr[index]; 
            System.out.println("Result:"+result);
        }
        //if index=2 then it will raise 
        catch(ArithmeticException ae){
        System.out.println("Arithmetic Exception Occured");
        }
        //if index=3 It will raise ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException ae1){
        System.out.println("Array Index Out Of Bounds Exception Occured");
        }
        catch(Exception e){
        System.out.println("Other Exception Occured");
        }
    }
}