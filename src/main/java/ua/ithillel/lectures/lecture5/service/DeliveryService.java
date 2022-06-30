package ua.ithillel.lectures.lecture5.service;

import ua.ithillel.lectures.lecture5.order.AbstractOrder;

public interface DeliveryService {

    AbstractOrder deliverOrder(AbstractOrder order);

}
