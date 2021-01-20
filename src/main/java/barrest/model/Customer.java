package barrest.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
@NoArgsConstructor
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
    private Integer flatNumber;

    @Column(name = "post_code")
    private String postCode;

    private String city;

    private String nip;

    public Customer( String companyName, String street, String houseNumber, int flatNumber, String postCode, String city, String nip ) {
        this.companyName = companyName;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.postCode = postCode;
        this.city = city;
        this.nip = nip;
    }
}
