import java.util.ArrayList;

public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);  
        int p = 0;
        boolean[] isPrime = new boolean[N + 1];
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < isPrime.length; i++) {
            if (i >= 2) {
                isPrime[i] = true;
            } else {
                isPrime[i] = false;
            }
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                if (isprimenum(i)) {
                    arr.add(String.valueOf(i));  
                    p = i;
                    for (int j = 2; j < isPrime.length; j++) {
                        if (j % p == 0 && j != p) {
                            isPrime[j] = false;
                        }
                    }
                }
            }
        }

        println(arr,N);
    }

    public static boolean isprimenum(int num) {
        int counter = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter > 1 || num == 0 || num == 1) {
            return false;
        }
        return true;
    }

    public static void println(ArrayList<String> arr,int num) {
        int size = arr.size();
    double percent = ((double) size / num) * 100; 
    int percentInt = (int) Math.round(percent);

        System.out.println("Prime numbers up to " + num +":");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("There are " + size + " primes between 2 and "+ num + " (" + percentInt + "% are primes)" );


    }
}
