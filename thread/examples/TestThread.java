
// Java Pogram to synchronized method by
// using an anonymous class
import java.io.*;

class Test {
    synchronized void test_function(int n) {
        // synchronized method
        for (int i = 1; i <= 3; i++) {
            System.out.println(n + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Driver Class
public class TestThread {
    // Main function
    public static void main(String args[]) {
        // only one object
        final Test obj = new Test();

        Thread a = new Thread() {
            public void run() {
                obj.test_function(15);
            }
        };

        Thread b = new Thread() {
            public void run() {
                obj.test_function(30);
            }
        };

        a.start();
        b.start();
    }
}

// Java code to demonstrate how to prevent garbage collection
// of an object using finalize method
class A { 
	static A y; 
	void f() 
	{ 
		A x = new A(); 
	} 
	public void finalize() 
	{ 
		y = this; // Putting the reference id of the current object  into the static variable y 

		System.out.println("Object reference saved. The object won't be collected by the garbage collector"); 
	} 
	public static void main(String a[]) 
	{ A ac = new A();
		ac.f(); // function called 
	} 

	//making an object undeletable is risky, and increases the chances of memory leaks.
}
