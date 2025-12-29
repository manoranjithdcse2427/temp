import java.util.*;

class main{
    static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num <= 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5;i <= Math.sqrt(num);i += 6){
            if(num % i == 0 || num % (i+2) == 0) return false;
        } 
        return true;
    }
	public static void main (String[] args){
	    int n1 = 25,n2 = 89,counter = 0,sum = 0,altsum = 0;
	    for(int i = n1;i <= n2;i++){
	        if(isPrime(i)){
	            counter++;
	            sum += i;
	            if(counter % 2 != 0){
	                System.out.println(i + " ");
	                altsum += i;
	            }
	        }
	    }
	    System.out.println("Sum of Primes : " + sum);
	    System.out.println("Sum of Alternative Primes : " + altsum/counter);
	}
}
