package structural.pattern.adapter;

// This is the adapter class


public class BankCustomer extends BankDetails implements CreditCard {
    public void giveBankDetails() {
        String customername = "Kumar";
        long accno = 123456789;
        String bankname = "ABC Bank";
        setAccHolderName(customername);
        setAccNumber(accno);
        setBankName(bankname);
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return ("The Account number " + accno + " of " + accholdername + " in " + bname + "bank is valid and authenticated for issuing the credit card. ");
    }
}