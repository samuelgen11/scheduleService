package it.perigea.formazione.scheduler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.perigea.formazione.scheduler.entity.URLEntity;

@Repository
public interface URLRepository extends JpaRepository<URLEntity, Integer> {

	public List<URLEntity> findByAPIMethodName(String APIMethodName);
}
