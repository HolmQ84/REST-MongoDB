package si.restmongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Order {

    @Id
    private String id;
    private long userId;
    private long productId;
    private double price;
}
