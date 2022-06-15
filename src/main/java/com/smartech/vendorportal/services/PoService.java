package com.smartech.vendorportal.services;

import java.util.List;

import com.smartech.vendorportal.entities.Po;


public interface PoService {
	
	List<Po> retriveAllPO();
	Po addPO(Po po);
	void deletePOById(Long id);
	Po updatePO(Po po);
	Po retrieveOneById(Long id);
	List<Po> retriveAllPOByUser(String email);

}
