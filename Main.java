import Jama.Matrix;
import java.lang.Math.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double e1_ls1 = 1;
        double e1_ls2 = 1;
        double e1_ls3 = 1;
        double e1_rs = 1;
        double e2_ls1 = 1;
        double e2_ls2 = 1;
        double e2_ls3 = 1;
        double e2_rs = 1;
        double e3_ls1 = 1;
        double e3_ls2 = 1;
        double e3_ls3 = 1;
        double e3_rs = 1;
        String equation1 = "";
        String equation2 = "";
        String equation3 = "";
        Scanner scan = new Scanner(System.in);
        //Equation 1 inprocessing
        System.out.println("FIRST equation: please input your first numerical term! ^o^/");
        e1_ls1 = scan.nextDouble();
        System.out.println("Please enter your second numerical term!");
        e1_ls2 = scan.nextDouble();
        System.out.println("And your third numerical term?");
        e1_ls3 = scan.nextDouble();
        System.out.println("Please enter the term on the right side of the equals sign!");
        e1_rs = scan.nextDouble();
        System.out.println(e1_rs + "... that's a tricky one... @_@'");
        //Equation 2 inprocessing
        System.out.println("SECOND equation: please input your first numerical term!");
        e2_ls1 = scan.nextDouble();
        System.out.println("Please enter your second numerical term!");
        e2_ls2 = scan.nextDouble();
        System.out.println("And your third numerical term?");
        e2_ls3 = scan.nextDouble();
        System.out.println("Please enter the term on the right side of the equals sign!");
        e2_rs = scan.nextDouble();
        System.out.println(e2_rs + "... that's a tricky one... @_@'");
        //Equation 3 inprocessing
        System.out.println("THIRD equation: please input your first numerical term!");
        e3_ls1 = scan.nextDouble();
        System.out.println("Please enter your second numerical term!");
        e3_ls2 = scan.nextDouble();
        System.out.println("And your third numerical term?");
        e3_ls3 = scan.nextDouble();
        System.out.println("Please enter the term on the right side of the equals sign!");
        e3_rs = scan.nextDouble();
        System.out.println(e3_rs + "... that's a tricky one... @_@'");
        scan.close();
        
       /*Scanner repl1 = new Scanner(equation1);
        while (repl1.hasNextInt()) {
        try {
        e1_ls1 = repl1.nextInt();
        e1_ls2 = repl1.nextInt();
        e1_ls3 = repl1.nextInt();
        repl1.useDelimiter("=");
        e1_rs = repl1.nextInt();
        repl1.close();
        } catch (NoSuchElementException e) {
            System.out.println("I hate scanners");
        }
    }
    Scanner repl2 = new Scanner(equation2);
    while (repl2.hasNextInt()) {
        try {
        e2_ls1 = repl2.nextInt();
        e2_ls2 = repl2.nextInt();
        e2_ls3 = repl2.nextInt();
        repl2.useDelimiter("=");
        e2_rs = repl2.nextInt();
        repl2.close();
        } catch (NoSuchElementException e) {
            System.out.println("I hate scanners");
        }
    }
    Scanner repl3 = new Scanner(equation2);
    while (repl3.hasNextInt()) {
        try {
        e3_ls1 = repl3.nextInt();
        e3_ls2 = repl3.nextInt();
        e3_ls3 = repl3.nextInt();
        repl3.useDelimiter("=");
        e3_rs = repl3.nextInt();
        repl3.close();
        } catch (NoSuchElementException e) {
            System.out.println("I hate scanners");
        }
    } */
            try {
            double [][] lArray3 = {{e1_ls1, e2_ls1, e3_ls1},{e1_ls2, e2_ls2, e3_ls2}, {e1_ls3, e2_ls3, e3_ls3}};
            double [][] rArray3 = {{e1_rs, e2_rs, e3_rs}};
            Matrix left3 = new Matrix(lArray3);
            Matrix right3 = new Matrix(rArray3);
            Matrix answer3 = left3.solve(right3);
            System.out.println("First (leftmost) variable x= " + Math.round(answer3.get(0,0)));
            System.out.println("Second variable y= " + Math.round(answer3.get(1,0)));
            System.out.println("Third (rightmost) variable z= " + Math.round(answer3.get(2,0)));
            } catch (RuntimeException exp) {
                System.out.println("Input ERROR, please try again!!!");
            }
        }
    }
