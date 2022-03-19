package ru.netology.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {}

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya","qwerty123");
    }

    @Value
    public static class VerificationCode{
        private String Code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {

        return new VerificationCode("12345");
    }

    @Value
    public static class CardInfo{
        private String cardNumber;
        public String cardBalance;
    }


    public static CardInfo getFirstCardInfo() {

        return new CardInfo("5559000000000001", "10000");
    }


    public static CardInfo getSecondCardInfo() {

        return new CardInfo("5559000000000002", "10000");
    }


    public static int getBalanceFirstCardAfterTransfer(int balance, int amount) {

        return balance - amount;
    }


    public static int getBalanceSecondCardAfterTransfer(int balance, int amount) {

        return balance + amount;
    }
}
