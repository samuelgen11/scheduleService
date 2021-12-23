package it.perigea.formazione.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.perigea.formazione.scheduler.entity.ScheduleEntity;


public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Integer> {
	
}
