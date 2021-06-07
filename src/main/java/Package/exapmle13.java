package Package;

import java.util.Formatter;
import java.util.Scanner;

public class exapmle13 {
    public static void main(String[] args){
        int P, t, n;
        double r, A, interest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        P = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        interest = input.nextDouble();
        r = interest/100;
        System.out.print("Enter the number of years: ");
        t = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        n = input.nextInt();
        double part1, part2;
        part1 = (1 + r/n);
        part2 = (n*t);
        A = P * Math.pow(part1, part2);
        Formatter fmt = new Formatter();
        fmt.format("%.2f", A);
        System.out.print("$"+P+" invested at "+interest+"% for "+t+" years compounded "+n+" times per year is $"+fmt);
    }
}
