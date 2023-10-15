package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import vn.edu.iuh.fit.ids.JobSkillID;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidate")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id", nullable = false)
    private long id;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(name = "dob", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private LocalDate dob;


    @OneToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill> candidateSkills;

    @Column(name = "phone", nullable = false, length = 15)
    private String phone;
    @Column(name = "email", nullable = false)
    private String email;
    @OneToMany(mappedBy = "candidate", fetch = FetchType.EAGER)
    private List<Experience> experiences;

    public Candidate(String fullName, LocalDate dob, Address address, String phone, String email) {
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }


}
