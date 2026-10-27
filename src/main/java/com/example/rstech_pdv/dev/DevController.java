package com.example.rstech_pdv.dev;

import com.example.rstech_pdv.entrance.Entrance;
import com.example.rstech_pdv.entrance.EntranceRepository;
import com.example.rstech_pdv.sale.Sale;
import com.example.rstech_pdv.sale.SaleRepository;
import com.example.rstech_pdv.user.UserRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/dev")
public class DevController {

    private final MongoTemplate mongo;
    private final UserRepository userRepository;
    private final EntranceRepository entranceRepository;
    private final SaleRepository saleRepository;

    public DevController(MongoTemplate mongo,
                         UserRepository userRepository,
                         EntranceRepository entranceRepository,
                         SaleRepository saleRepository) {
        this.mongo = mongo;
        this.userRepository = userRepository;
        this.entranceRepository = entranceRepository;
        this.saleRepository = saleRepository;
    }

    @GetMapping("/collections")
    public Set<String> collections() {
        return mongo.getCollectionNames();
    }

    @GetMapping("/users")
    public List<String> users() {
        return userRepository.findAll().stream()
                .map(u -> u.getName() + " | " + u.getType())
                .toList();
    }

    @GetMapping("/entrances")
    public List<Entrance> entrances() {
        return entranceRepository.findAll();
    }

    @GetMapping("/sales")
    public List<Sale> sales() {
        return saleRepository.findAll();
    }
}