import java.util.*;

public class Main
{
   public static int sn(int n){
        int s = (n*(n+1)/2);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum=0;
            while(a!=b){
                sum++;
                if(sn(sum)>= Math.abs(a-b) && sn(sum) % 2 == Math.abs(a-b)%2){
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
