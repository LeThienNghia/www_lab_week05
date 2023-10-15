package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    private long id;
    private String jobDesc;
    private String jobName;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

}
