package barrest.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name")
    private String companyName;

    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "flat_number")
    private int flatNumber;

    @Column(name = "post_code")
    private String postCode;

    private String city;

    private String nip;

    public int getId() {
        return id;
    }
}
