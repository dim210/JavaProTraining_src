package com.itea.StyrenkoD.Lection10.Dz;

public class AuthMain {
    public static void main(String[] args) {
        String login = "#@Asb%f12_";
        String password = "#@pas%f12_";
        String confirmPassword = "#@pas%f12_";
        Auth.doAuth(login,password,confirmPassword);

        login = "Asbf12_";
        password = "#@pas%f12_";
        confirmPassword = "#@pas%f12_";
        Auth.doAuth(login,password,confirmPassword);

        login = "Asbf12_";
        password = "pasf12_";
        confirmPassword = "#@pas%f12_";
        Auth.doAuth(login,password,confirmPassword);

        login = "Asbf12_";
        password = "pasf12_";
        confirmPassword = "pasf12_";
        Auth.doAuth(login,password,confirmPassword);
    }
}
