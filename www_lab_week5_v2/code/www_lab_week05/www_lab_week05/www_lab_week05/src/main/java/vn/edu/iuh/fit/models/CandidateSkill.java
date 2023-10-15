package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.SkillLevel;
import vn.edu.iuh.fit.ids.CandidateSkillID;

@Entity
@Data
@Table(name = "candidate_skill")
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CandidateSkillID.class)
public class CandidateSkill {
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "can_id", nullable = false)
    private Candidate candidate;

    @Enumerated
    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", length = 1000)
    private String moreInfos;

}
