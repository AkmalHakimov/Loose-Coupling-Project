package uz.shiftacademy;

public class PayMe implements OnlinePaymentTypeServiceInterface {
    @Override
    public Double pay(Integer amount) {
        return amount-(amount*(0.02));
    }
}
