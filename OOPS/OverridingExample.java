package OOPS;

// Parent class
class Bank {
    double getInterestRate() {
        return 0.0; // base interest rate
    }
}

// Child class 1
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

// Child class 2
class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

// Child class 3
class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 6.75;
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
