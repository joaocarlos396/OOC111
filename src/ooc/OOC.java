/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooc;

import java.util.Scanner;

/**
 *
 * @author joao
 */
public class OOC {

    private static String accountType = null;
    private static int userId = -1; // Assuming user ID is managed

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();

        while (true) {
            System.out.println("1. Register\n2. Login\n3. Admin Actions\n4. User Actions\n5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> userManager.registerUser();
                case 2 -> {
                    LoginInfo loginInfo = userManager.loginUser();
                    if (loginInfo != null) {
                        accountType = loginInfo.getAccountType();
                        userId = loginInfo.getUserId(); 
                    }
                }
                case 3 -> {
                    if ("ADMIN".equals(accountType)) {
                        handleAdminActions(userManager, scanner);
                    } else {
                        System.out.println("Access denied. Admin privileges are required.");
                    }
                }
                
                case 4 -> {
                if ("REGULAR".equals(accountType)) {
                        handleUserActions(userManager, scanner);
                    } else {
                        System.out.println("Login as a user.");
                    }
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleAdminActions(UserManager userManager, Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void handleUserActions(UserManager userManager, Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}