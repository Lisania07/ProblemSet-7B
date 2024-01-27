import java.util.ArrayList;

public class QUESTION3{
    
   public static ArrayList<Integer> addBigInt(ArrayList<Integer> bigIntA, ArrayList<Integer> bigIntB ){

        ArrayList<Integer> sum= new ArrayList<Integer>();
        int index1=bigIntA.size()-1;
        int index2=bigIntB.size()-1;
        int carry = 0;
        while(index1>=0 || index2>=0){
            int e1, e2;
            if(index1<0){
                e1=0;
            }else{
                e1=bigIntA.get(index1);
            }
            if(index2<0){
                e2=0;
            }else{
                e2=bigIntB.get(index2);
            }
            int s=e1+e2+carry;
            carry=s/10;
            s=s%10;
            sum.add(0,s); 
            index1--;
            index2--;
        }
        if(carry>0){
            sum.add(0, carry);
        }
        return sum;
   }
   public static void main(String[] args){
       ArrayList<Integer> n1=new ArrayList<Integer>();
       n1.add(1);
       n1.add(1);
       n1.add(1);
       ArrayList<Integer> n2=new ArrayList<Integer>();
       n2.add(1);
       n2.add(1);
       n2.add(1);
       n2.add(1);
       ArrayList<Integer> n3=addBigInt(n1,n2);
      
       System.out.println(n3);
    }
   
}
