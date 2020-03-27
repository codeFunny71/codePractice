package concurrency.primeGenerator;

public class PrimeGenerator extends Thread {
    @Override
    public void run(){
        long number = 1L;
        while(true){
            if (isPrime(number)){
                System.out.printf("Number %d is Prime\n", number);
            }
            // When is interrupted, write a message and ends
            if (isInterrupted()) {
                System.out.print("The Prime Generator has been Interrupted\n");
                return;
            }
            number++;
        }
    }

    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }
        for (long i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
