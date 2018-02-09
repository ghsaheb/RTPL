import java.util.*;
public class Code  {

int mult(int x, int y){
	return x * y;
}
public static void run(){
	int x;
	System.out.println(10);
boolean rv = false;
    System.out.println("Before loop");
long safetyTimer0 = System.currentTimeMillis();
    while (true){
if (System.currentTimeMillis() > 10 + safetyTimer0){System.out.println("Safety time reached"); break;} 
        System.out.println("Inside loop");
    }
    if (rv == true){
        System.out.println("True was taken");
    }
    else {
        System.out.println("False was taken");
    }

boolean rv2 = true;
    if (rv2 == true){
        System.out.println("Second true");
    }
    else {
        System.out.println("Second false");
    }

long safetyTimer1 = System.currentTimeMillis();
    while (true){
if (System.currentTimeMillis() > 10 + safetyTimer1){System.out.println("Safety time reached"); break;} 
            System.out.println("Inside second loop");
    }
    System.out.println("End of code");
}

}