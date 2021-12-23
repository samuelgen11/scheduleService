package it.perigea.formazione.scheduler.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.perigea.formazione.scheduler.entity.CronEntity;

@Repository
public interface CronRepository  extends JpaRepository<CronEntity,Integer>{
	
	public CronEntity findByIdCron(Integer idCron);
}
