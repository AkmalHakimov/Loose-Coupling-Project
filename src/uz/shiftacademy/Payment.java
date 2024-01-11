package uz.shiftacademy;

public class Payment {

    private Double amount;

    private OnlinePaymentTypeServiceInterface onlinePaymentTypeServiceInterface;

    public Payment(OnlinePaymentTypeServiceInterface onlinePaymentTypeServiceInterface) {
        this.onlinePaymentTypeServiceInterface = onlinePaymentTypeServiceInterface;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
