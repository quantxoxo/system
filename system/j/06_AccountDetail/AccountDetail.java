class Account {
    String custname;
    int accno;

    Account() {
        custname = "Unknown";
        accno = 0;
    }

    Account(String name, int no) {
        custname = name;
        accno = no;
    }
}

class SavingAccount extends Account {
    double savingbal;
    double minbal;

    SavingAccount(
        String name,
        int no,
        double bal,
        double min
    ) {
        super(name, no);
        savingbal = bal;
        minbal = min;
    }
}

class AccountDetail extends SavingAccount {
    double depositamt;
    double withdrawalamt;

    AccountDetail(
        String name,
        int no,
        double bal,
        double min,
        double deposit,
        double withdrawal
    ) {
        super(name, no, bal, min);
        depositamt = deposit;
        withdrawalamt = withdrawal;
    }

    void display() {
        System.out.println("Customer Name = " + custname);
        System.out.println("Account Number = " + accno);
        System.out.println("Saving Balance = " + savingbal);
        System.out.println("Minimum Balance = " + minbal);
        System.out.println("Deposit Amount = " + depositamt);
        System.out.println("Withdrawal Amount = " + withdrawalamt);
    }

    public static void main(String[] args) {
        AccountDetail a = new AccountDetail(
            "Rahul",
            101,
            5000,
            1000,
            2000,
            500
        );

        a.display();
    }
}
