package gov.usgs.aqcu.reference;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gov.usgs.aqcu.config.AquariusReferenceListProperties;

import gov.usgs.aqcu.util.LogExecutionTime;

@Repository
public class PeriodReferenceService {
	private AquariusReferenceListProperties aquariusReferenceListProperties;

	@Autowired
	public PeriodReferenceService(AquariusReferenceListProperties aquariusReferenceListProperties) {
		this.aquariusReferenceListProperties = aquariusReferenceListProperties;
	}

        @LogExecutionTime
	public List<String> get() {
		//TODO: Persist this list somewhere else?
		return aquariusReferenceListProperties.getPeriods();
	}
}