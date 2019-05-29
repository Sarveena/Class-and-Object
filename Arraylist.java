Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!

=========================================================================

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,j,d,q,x,y;
   /* ArrayList<Integer> val = new ArrayList<Integer>(n);
    for(i=0;i<n;i++)
    {
        val.add(sc.nextInt());
       // System.out.println(val[i]);
    }

    Iterator it = val.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }*/

     ArrayList<ArrayList<Integer>> rows = new ArrayList<>(n);
        
        for (i = 0; i < n; i++) {
             d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<Integer>(d);
            
            for (j = 0; j < d; j++) {
              /* System.out.println(*/row.add(sc.nextInt());
            }
            
            rows.add(row);
        }

        q = sc.nextInt();

        for(i=0;i<q;i++)
        {
            x = sc.nextInt();
            y = sc.nextInt();

            try
            {
                System.out.println(rows.get(x-1).get(y-1));
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("ERROR!");
            }
        }

    
}
}
