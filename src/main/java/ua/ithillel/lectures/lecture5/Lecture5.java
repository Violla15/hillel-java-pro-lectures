package ua.ithillel.lectures.lecture5;

import ua.ithillel.lectures.lecture5.manager.DeliveryManager;
import ua.ithillel.lectures.lecture5.order.AbstractOrder;
import ua.ithillel.lectures.lecture5.order.CurrierOrder;
import ua.ithillel.lectures.lecture5.order.TaxiOrder;
import ua.ithillel.lectures.lecture5.service.DeliveryService;

public class Lecture5 {

    public static void main(String[] args) {

        DeliveryManager manager = new DeliveryManager();

        TaxiOrder taxiOrder = new TaxiOrder(1, "01.09.2022", "Kyiv 2/2");
        taxiOrder.setTaxiNumber("AC0281BM");

        TaxiOrder taxiOrder2 = new TaxiOrder(2, "03.09.2022", "Lviv 1/2");
        taxiOrder.setTaxiNumber("AC0212BM");

        CurrierOrder currierOrder = new CurrierOrder(3, "04.05.2022", "Odessa 3/4");
        currierOrder.setCurrierName("Oleg");

        CurrierOrder currierOrder2 = new CurrierOrder(4, "05.05.2022", "Odessa 3/5");
        currierOrder.setCurrierName("Igor");

        manager.addOrder(taxiOrder);
        manager.addOrder(taxiOrder2);
        manager.addOrder(currierOrder);
        manager.addOrder(currierOrder2);

        manager.showOrders();
        manager.deliverOrders();

        Lecture5.StaticInner staticInner = new StaticInner();
        staticInner.method();

        Lecture5.NonStaticInner nonStaticInner = new Lecture5().new NonStaticInner();
        nonStaticInner.method();

        AbstractOrder order = new AbstractOrder(1,"2","3") {
            @Override
            public DeliveryService getDeliveryService() {
                return null;
            }

            @Override
            public String getDate() {
                return "1/2";
            }
        };
    }

    static class StaticInner {
        private int a = 5;

        private void method() {
            System.out.println("method");
        }
    }

    class NonStaticInner {

        private void method() {
            System.out.println("method");
        }
    }

}
