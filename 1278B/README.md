# A and B

# [Descrição](https://codeforces.com/contest/1278/problem/B)
You are given two integers a
 and b
. You can perform a sequence of operations: during the first operation you choose one of these numbers and increase it by 1
; during the second operation you choose one of these numbers and increase it by 2
, and so on. You choose the number of these operations yourself.

For example, if a=1
 and b=3
, you can perform the following sequence of three operations:

add 1
 to a
, then a=2
 and b=3
;
add 2
 to b
, then a=2
 and b=5
;
add 3
 to a
, then a=5
 and b=5
.
Calculate the minimum number of operations required to make a
 and b
 equal.

## Input
The first line contains one integer t
 (1≤t≤100
) — the number of test cases.

The only line of each test case contains two integers a
 and b
 (1≤a,b≤109
).

## Output
For each test case print one integer — the minimum numbers of operations required to make a
 and b
 equal.

# Java21

```java 
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
}```
