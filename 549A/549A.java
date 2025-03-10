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
