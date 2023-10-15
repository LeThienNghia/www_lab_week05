package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.ids.JobSkillID;
import vn.edu.iuh.fit.models.JobSkill;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillID> {
}