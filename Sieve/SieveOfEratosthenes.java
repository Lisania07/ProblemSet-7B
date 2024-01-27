import java.util.ArrayList;

public class SieveOfEratosthenes{

    public static ArrayList<Integer> findPrimes(int n){
        ArrayList<Integer>primes=new ArrayList<>();
        for(int i=2; i<=n; i++){
            primes.add(i);
        }

        for(int i=0; i<primes.size(); i++){
            int p=primes.get(i);
            for(int j=i+1; j<primes.size(); j++){
                if (primes.get(j)%p==0){
                    primes.remove(j);
                    j--;
                }
            }
        }
        return primes;
    }
    
    public static void main(String[]args){
        ArrayList<Integer>PrimesUnder100= findPrimes(100);
        System.out.println(PrimesUnder100);
    }
}