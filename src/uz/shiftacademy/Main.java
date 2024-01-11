package uz.shiftacademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1-Add User");
            System.out.println("2-Add Payment");
            System.out.println("3-Report");
            int x = scanner.nextInt();
            switch (x){
                case 1:
                company.addUser();
                    break;
                case 2:
                    company.addPayment();
                    break;
                case 3:
                    company.reports();
                    break;
            }
        }

    }
}