package ua.ithillel.lectures.lecture5.order;

import ua.ithillel.lectures.lecture5.service.DeliveryService;
import ua.ithillel.lectures.lecture5.service.UberDeliveryService;

public class TaxiOrder extends AbstractOrder {

    private String taxiNumber;

    public TaxiOrder(long id, String date, String address) {
        super(id, date, address);
    }

    @Override
    public DeliveryService getDeliveryService() {
        return new UberDeliveryService();
    }

    public String getTaxiNumber() {
        return taxiNumber;
    }

    public void setTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
    }
}
