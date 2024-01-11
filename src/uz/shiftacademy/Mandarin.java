package uz.shiftacademy;

public class Mandarin implements OnlinePaymentTypeServiceInterface{

    @Override
    public Double pay(Integer amount) {
        return amount-(amount*(0.01));
    }
}
