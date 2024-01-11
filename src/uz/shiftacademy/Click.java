package uz.shiftacademy;

public class Click implements OnlinePaymentTypeServiceInterface{
    @Override
    public Double pay(Integer amount) {
        return amount-(amount*(0.03));
    }
}
