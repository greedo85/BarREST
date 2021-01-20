package barrest.service;

import barrest.model.BarOrder;
import barrest.repository.BarOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarOrderService {

    private BarOrderRepository barOrderRepository;

    @Autowired

    public BarOrderService( BarOrderRepository barOrderRepository ) {
        this.barOrderRepository = barOrderRepository;
    }

    public List<BarOrder> getBarOrders() {
        return barOrderRepository.findAll();
    }

    public BarOrder addBarOrder( BarOrder barOrder ) {
       return barOrderRepository.save(barOrder);
    }
}
