package barrest.controller;

import barrest.model.BarOrder;
import barrest.service.BarOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BarOrderController {

    @Autowired
    BarOrderService barOrderService;

    @PostMapping("/barorders")
    public void addBarOrder( @RequestBody BarOrder barOrder ) {
        barOrderService.addBarOrder(barOrder);
    }

    @GetMapping("/barorders")
    public List<BarOrder> getBarOrders() {
        return barOrderService.getBarOrders();
    }

    
}
