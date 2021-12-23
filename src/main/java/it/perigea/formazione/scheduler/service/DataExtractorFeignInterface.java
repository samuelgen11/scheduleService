package it.perigea.formazione.scheduler.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import it.perigea.formazione.comuni.dto.AbbreviationsDto;
import it.perigea.formazione.comuni.dto.ExecutionDto;
import it.perigea.formazione.comuni.dto.ProcessDto;
import it.perigea.formazione.comuni.dto.SomministrationsDto;

@FeignClient(name = "data-extractor-service", url = "http://localhost:9091")
public interface DataExtractorFeignInterface {

	@RequestMapping("/Vaccini/postSomm")
	public List<SomministrationsDto> postJsonMessage();

	@RequestMapping("/Vaccini/provinceExtractor")
	public List<AbbreviationsDto> provinceClient();

	@RequestMapping("/Vaccini/getListProcess")
	public List<ProcessDto> getAllProcess();

	@RequestMapping("/Vaccini/getListExecutions")
	public List<ExecutionDto> getAllExecutions();

}
