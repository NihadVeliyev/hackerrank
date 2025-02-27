package java;

import java.util.Scanner;

public class javaloops2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of queries
        int t = sc.nextInt();

        // Process each query
        for (int i = 0; i < t; i++) {
            // Read the values for a, b, and n
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            // Initialize the sum (starting with 'a')
            int sum = a;

            // Generate the series for this query
            for (int j = 0; j < n; j++) {
                // For the j-th term, add b * (2^j) to the sum
                sum += b * (1 << j); // (1 << j) is equivalent to 2^j
                System.out.print(sum + " "); // Print the sum for this term
            }

            // Move to the next line after printing the series for this query
            System.out.println();
        }

        sc.close();
    }
}
