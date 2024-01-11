package uz.shiftacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    public List<User> users = new ArrayList<>();

    public void addUser() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("user ismini kirit");
        user.setName(scanner.nextLine());
        users.add(user);
        System.out.println("user qo'shildi!");
    }

    public void addPayment() {
        User user = selectedUser();
        user.addPayment();
    }

    private User selectedUser() {
        System.out.println("Qaysi userga qo'shmoqchisiz");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i+1) + ". " + users.get(i).getName());
        }
        int x = scanner.nextInt()-1;
        User user = users.get(x);
        return user;
    }

    public void reports() {
        for (int i = 0; i < users.size(); i++) {
            for (Payment payment : users.get(i).payments) {
                System.out.println(((i+1) + ". " + users.get(i).getName() + " qo'shgan summasi: " + payment.getAmount()));
            }
        }
    }
}
