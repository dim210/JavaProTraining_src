package com.itea.StyrenkoD.Lection10.Dz;

public class Auth {

    public static void doAuth(String login, String password, String confirmPassword) {
        try {
            if (isValidLogin(login) && isValidpassword(password) && isValidConfirmPassword(password, confirmPassword)) {
                System.out.println("Авторизация успешная!");
            }
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally блок");
        }

    }

    private static boolean isValidLogin(String login) throws WrongLoginException {
        if (login.replaceAll("\\w+", "").length() == 0) {
            return true;
        } else {
            throw new WrongLoginException("логин должен содержать только буквы, цифры и символ подчеркивания!");
        }
    }

    private static boolean isValidpassword(String password) throws WrongPasswordException {
        if (password.replaceAll("\\w+", "").length() == 0) {
            return true;
        } else {
            throw new WrongPasswordException("пароль должен содержать только буквы, цифры и символ подчеркивания!");
        }
    }

    private static boolean isValidConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (isValidpassword(password) && password.equals(confirmPassword)) {
            return true;
        } else {
            System.out.println("ошибка при подтверждении пароля!");
            return false;
        }
    }
}
