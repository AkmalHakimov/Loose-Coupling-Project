package uz.shiftacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    private String name;
    List<Payment> payments = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Miqdorni kirit: ");
        int paymentAmount  = scanner.nextInt();
        System.out.println("qaysi typega qo'shmoqchisan?");
        System.out.println("1-Mandarin");
        System.out.println("2-Click");
        System.out.println("3-PayMe");
        int x = scanner.nextInt();
        Payment payment;
        Double paidAmount;
        switch (x){
            case 1:
                Mandarin mandarin = new Mandarin();
                payment = new Payment(mandarin);
                paidAmount = mandarin.pay(paymentAmount);
                payment.setAmount(paidAmount);
                payments.add(payment);
                break;
            case 2:
                Click click = new Click();
                paidAmount = click.pay(paymentAmount);
                payment = new Payment(click);
                payment.setAmount(paidAmount);
                payments.add(payment);
                break;
            case 3:
                PayMe payMe = new PayMe();
                paidAmount = payMe.pay(paymentAmount);
                payment = new Payment(payMe);
                payment.setAmount(paidAmount);
                payments.add(payment);
                break;
        }

        System.out.println("to'lov qilindi!");
    }
}
