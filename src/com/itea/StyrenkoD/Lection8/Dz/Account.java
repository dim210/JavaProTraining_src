package com.itea.StyrenkoD.Lection8.Dz;

public class Account {
    private String accountNum;
    private final int DAYSINYEAR = 366;
    private int lastBalanceDay = 1;
    private BalanceDay[] balanceDays = new BalanceDay[DAYSINYEAR];

    private boolean isAddBalanceDay(int newDay) {
        if (newDay < lastBalanceDay) {
            System.out.println("нельзя выполнять операции за прошлую дату!");
            return false;
        } else if (newDay > DAYSINYEAR) {
            System.out.println("в году может быть не более " + DAYSINYEAR + " дней!");
            return false;
        } else {
            if (balanceDays[newDay] == null) {
                balanceDays[newDay] = new BalanceDay(newDay);
            }
            return true;
        }
    }

    public Account(String accountNum) {
        this.accountNum = accountNum;
    }

    public void addTransaction(int balanceDay, double amt, int trnType) {
        if (isAddBalanceDay(balanceDay)) {
            balanceDays[balanceDay].addTransaction(amt, trnType);
            System.out.println("транзакция записана!");
        }
    }

    public void TransactionsForPeriod(int fromDay, int toDay) {
        for (int i = fromDay; i <= toDay; i++) {
            if (balanceDays[i] != null) {
                System.out.println("day: " + balanceDays[i].getBalanceDay() + "\n transactions:\n" + balanceDays[i]);
            }
        }
    }

    private class BalanceDay {
        private int balanceDay;
        private final int MAXTRNCOUNT = 100;
        private Transaction[] transactions = new Transaction[MAXTRNCOUNT];
        private int trnCount = 0;

        public BalanceDay(int balanceDay) {
            this.balanceDay = balanceDay;
        }

        public int getBalanceDay() {
            return balanceDay;
        }

        public void addTransaction(double trnAmount, int trnType) {
            if (trnCount >= MAXTRNCOUNT - 1) {
                System.out.println("может быть не более 100 транзакций в день");
            } else {
                this.transactions[++trnCount] = new Transaction(trnAmount, trnType);
            }
        }

        @Override
        public String toString() {
            String allTransactions = "";
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] != null) {
                    allTransactions = allTransactions + "trn#:" + i + ": " + this.transactions[i] + "\n";
                }
            }
            return allTransactions;
        }
    }

    private class Transaction {
        private double trnAmount;
        private int trnType;

        public Transaction(double trnAmount, int trnType) {
            this.trnAmount = trnAmount;
            this.trnType = trnType;
        }

        public double getTrnAmount() {
            return trnAmount;
        }

        public String getTrnTypeDescr() {
            String descr;
            switch (trnType) {
                case 0:
                    descr = "зачисление";
                    break;
                case 1:
                    descr = "списание";
                    break;
                case 2:
                    descr = "снятие наличных";
                    break;
                default:
                    descr = "другое";
                    break;
            }
            return descr;
        }

        @Override
        public String toString() {
            return "Amount:" + this.trnAmount + " type:" + this.getTrnTypeDescr();
        }
    }
}
