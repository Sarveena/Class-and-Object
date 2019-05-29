Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23

============================================================================================================================

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int n,l,q,i,x,y;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        LinkedList<Integer> a = new LinkedList<Integer>();

        for(i=0;i<n;i++)
        {
           a.add(sc.nextInt());
        }
        q = sc.nextInt();

        for(i=0;i<q;i++)
        {
            String q1 = sc.next();
            if(q1.equals("Insert"))
            {
                x = sc.nextInt();
                y = sc.nextInt();
                a.add(x,y);
            }
            else
            {
                x = sc.nextInt();
                a.remove(x);
            }
        }

        for(Integer output:a)
        {
            System.out.print(output+" ");
        }
    }
}

