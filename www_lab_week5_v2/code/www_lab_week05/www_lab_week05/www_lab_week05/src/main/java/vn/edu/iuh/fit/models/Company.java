package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "company")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id")
    private long id;
    @Column(name = "about", nullable = false, length = 2000)
    private String about;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone", nullable = false, length = 15)
    private String phone;
    @Column(name = "comp_name", nullable = false)
    private String compName;
    @Column(name = "web_url")
    private String webUrl;
    @OneToOne(optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;



}
