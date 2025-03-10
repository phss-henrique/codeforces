# Looksery Cup 2015
# [Descrição](https://codeforces.com/contest/549/problem/A)


The developers of Looksery have to write an efficient algorithm that detects faces on a picture. Unfortunately, they are currently busy preparing a contest for you, so you will have to do it for them.

In this problem an image is a rectangular table that consists of lowercase Latin letters. A face on the image is a 2 × 2 square, such that from the four letters of this square you can make word "face".

You need to write a program that determines the number of faces on the image. The squares that correspond to the faces can overlap.

## Input
The first line contains two space-separated integers, n and m (1 ≤ n, m ≤ 50) — the height and the width of the image, respectively.

Next n lines define the image. Each line contains m lowercase Latin letters.

## Output
In the single line print the number of faces on the image.






# Java21
```java
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();  
        int m = sc.nextInt(); 
        sc.nextLine(); 
        char[][] grid = new char[n][m];
 
        
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
 
       
        Set<Character> faceSet = new HashSet<>(Arrays.asList('f', 'a', 'c', 'e'));
 
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                
                Set<Character> currentSet = new HashSet<>();
                currentSet.add(grid[i][j]);
                currentSet.add(grid[i][j + 1]);
                currentSet.add(grid[i + 1][j]);
                currentSet.add(grid[i + 1][j + 1]);
 
                
                if (currentSet.equals(faceSet)) {
                    result++;  
                }
            }
        }
 
        
        System.out.println(result);
    }
}
```
