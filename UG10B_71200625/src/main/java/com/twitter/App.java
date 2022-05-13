package com.twitter;

import java.util.Scanner;

public class App {
    public static String validUsername;
    public static String validPassword;

    public static void main(String[] args) throws UsernameException, TweetException, BioException, LoginException {
        User user = new User("u71200625", "p71200625");
        login(user);

    }

    public static void login(User user) throws LoginException {
        boolean valid = false;
        while (!valid) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Username : ");
            String usernameLogin = inp.nextLine();
            System.out.print("Password : ");
            String passwordLogin = inp.nextLine();
            try {
                if (usernameLogin.isEmpty()) {
                    throw new LoginException(1);
                } else if (passwordLogin.isEmpty()) {
                    throw new LoginException(2);
                } else if (!usernameLogin.equals(user.getUsername()) && !passwordLogin.equals(user.getPassword())) {
                    throw new LoginException(3);
                }
                valid = true;
                System.out.println("Selamat datang di Twitter, " + user.getUsername());
                System.out.println("Kamu diminta untuk mengganti username, silahkan masukan username kamu");
            } catch (LoginException e) {
                System.out.println("Error : " + e.geterror_message());
            }
        }
    }
    public static String username() throws UsernameException{
        boolean isValid = false;
        String username = "";

        while (!isValid) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Username\t:");
            username = inp.nextLine();
            try {
                if (username.isEmpty()) {
                    throw new UsernameException(1);
                } else if (username.length() < 6) {
                    throw new UsernameException(2);
                }
                isValid = true;
            } catch (UsernameException e) {
                System.out.println("Error : " + e.geterror_message());
            }
        }
        return username;
    }


}