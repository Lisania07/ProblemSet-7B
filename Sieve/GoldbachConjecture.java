import java.util.ArrayList;
public class GoldbachConjecture
{

        public static ArrayList<Integer> findPrimes(int n){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=2;i<=n;i++){
            primes.add(i);
        }

        for(int i=0; i<primes.size();i++){
            int p=primes.get(i);
            for (int j=i+1;j<primes.size(); j++){
                if (primes.get(j)%p==0) {
                    primes.remove(j);
                    j--;
                }
            }
        }
        return primes;
    } 

      public static void goldbachConjecture(int n){

        ArrayList<Integer>primes=findPrimes(n);

        for (int prime:primes){
            int prime2=n-prime;
            if (primes.contains(prime2)){
                System.out.println(n+" = " +prime+" + "+prime2);
                return;
            }
        }
    }
    
     public static void main(String[] args){
        for(int i=4;i<=100; i+=2){
            findPrimes(i);
        }
    }
}
