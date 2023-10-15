package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.SkillType;

import java.util.List;

@Entity
@Table(name = "skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")

    private long id;
    @Column(name = "skill_escription", nullable = false)
    private String skillDescription;
    @Column(name = "skill_name", nullable = false, length = 150)
    private String skillName;
    @Enumerated
    @Column(name = "skill_type", length = 300, nullable = false)
    private SkillType type;
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

}
