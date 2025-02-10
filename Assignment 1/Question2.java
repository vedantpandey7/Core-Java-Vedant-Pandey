class Bank {
    public void getDetails() {
        System.out.println("Bank details are not specified.");
    }
}

class SBI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("Bank: SBI\nInterest Rate: 5.4%\nHeadquarters: Mumbai\n");
    }
}

class BOI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("Bank: BOI\nInterest Rate: 5.2%\nHeadquarters: Mumbai\n");
    }
}

class ICICI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("Bank: ICICI\nInterest Rate: 6.0%\nHeadquarters: Mumbai\n");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Bank sbi = new SBI();     
        Bank boi = new BOI();     
        Bank icici = new ICICI(); 

        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}
