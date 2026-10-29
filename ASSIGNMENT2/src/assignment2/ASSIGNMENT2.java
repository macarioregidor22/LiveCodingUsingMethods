/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2;

/**
 *
 * @author ADMIN
 */
public class ASSIGNMENT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int rio = EvenOdd(20);
        System.out.println(rio);

        // Example call to classifyTriangle:
        int result = classifyTriangle(3, 3, 3);
        System.out.println(result);
    } // <-- Close main method ONLY

    static int EvenOdd(int oddeven) {
        int status;
        if (oddeven % 2 == 0) {
            status = 1;
        } else {
            status = 0;
        }
        return status;
    }

    public static int classifyTriangle(int a, int b, int c) {
        // Validation: Positive lengths
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }
        
        // Validation: Triangle inequality theorem
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }

        // Classification logic
        if (a == b && b == c) {
            return 1; // Equilateral
        } else if (a == b || b == c || a == c) {
            return 2; // Isosceles
        } else {
            return 3; // Scalene
        }
    }

}