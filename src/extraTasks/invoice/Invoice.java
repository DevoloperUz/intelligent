package extraTasks.invoice;

public class Invoice {
    private final String INVOICE_NUMBER;
    private int cost;
    private boolean status;
    private String paidBy;


    public Invoice(String INVOICE_NUMBER, int cost, boolean status) {
        this.INVOICE_NUMBER = INVOICE_NUMBER;
        this.cost = cost;
        this.status = status;
    }

    public String getINVOICE_NUMBER() {
        return INVOICE_NUMBER;
    }

    public int getCost() {
        return cost;
    }

    public boolean isStatus() {
        return status;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "INVOICE_NUMBER='" + INVOICE_NUMBER + '\'' +
                ", cost=" + cost +
                ", status=" + status +
                ", paidBy='" + paidBy + '\'' +
                '}';
    }
}
