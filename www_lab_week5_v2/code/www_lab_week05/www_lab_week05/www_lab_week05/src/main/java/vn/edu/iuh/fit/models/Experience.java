package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "experience")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "company", nullable = false, length = 120)
    private String company;
    @Column(name = "from_date",nullable = false)
    private LocalDate fromDate;
    @Column(name = "role",nullable = false, length = 100)
    private String role;
    @Column(name = "to_date",nullable = false)
    private String toDate;
    @Column(name = "work_desc",nullable = false, length = 400)
    private String workDesc;
    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;

}
