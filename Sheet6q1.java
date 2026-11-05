package sheet6q1;

public class Sheet6q1 {
    
    private String invoiceID;
    private double discount;
    private double totalInvoice;

    public Sheet6q1() {
        this.invoiceID = "1";
        this.discount = 2.5;
        this.totalInvoice = 100.0;
    }

    public Sheet6q1(String invoiceID, double discount, double totalInvoice) {
        this.invoiceID = invoiceID;
        this.discount = discount;
        this.totalInvoice = totalInvoice;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(double totalInvoice) {
        this.totalInvoice = totalInvoice;
    }

    public double calculateDiscountPrice() {
        return totalInvoice - (totalInvoice * discount / 100);
    }

    public static void main(String[] args) {
        Sheet6q1 myInvoice = new Sheet6q1();
        System.out.println(myInvoice.getInvoiceID() + " " + myInvoice.getDiscount() + 
                           " before discount: " + myInvoice.getTotalInvoice() + 
                           " after discount: " + myInvoice.calculateDiscountPrice());
        myInvoice.setDiscount(5.5);
        myInvoice.setTotalInvoice(200.0);
        System.out.println(myInvoice.getInvoiceID() + " " + myInvoice.getDiscount() + 
                           " before discount: " + myInvoice.getTotalInvoice() + 
                           " after discount: " + myInvoice.calculateDiscountPrice());
    }
}