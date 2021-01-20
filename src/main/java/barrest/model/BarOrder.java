package barrest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="barorder")
public class BarOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "ENUM('OPENED', 'CLOSED'")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "payment", columnDefinition = "ENUM('INVOICE', 'RECEIPT'")
    @Enumerated(EnumType.STRING)
    private Payment paymentDoc;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    Product product;

}
