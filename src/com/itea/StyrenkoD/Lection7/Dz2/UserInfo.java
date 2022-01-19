package com.itea.StyrenkoD.Lection7.Dz2;

import java.util.Scanner;

public class UserInfo {
    private String usrLogin;
    private String usrPassword;
    private Scanner scanner = new Scanner(System.in);
    private String answerLogin;
    private String answerPassword;

    public UserInfo(String usrLogin, String usrPassword) {
        this.setUsrLogin(usrLogin);
        this.setUsrPassword(usrPassword);
    }

    private String getUsrLogin() {
        return usrLogin;
    }

    private void setUsrLogin(String usrLogin) {
        this.usrLogin = usrLogin;
    }

    private String getUsrPassword() {
        return usrPassword;
    }

    private void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public void login() {
        System.out.println("Введите логин: ");
        this.answerLogin = scanner.next();
        System.out.println("Введите пароль: ");
        this.answerPassword = scanner.next();
        if (this.usrLogin.equalsIgnoreCase(this.answerLogin) && this.usrPassword.equals(this.answerPassword)) {
            System.out.println("Авторизация успешная!");
        } else {
            System.out.println("Неверны имя пользователя или пароль!");
        }
    }
}
