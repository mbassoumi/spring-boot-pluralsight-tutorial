package com.boot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShipwreckService {

	@Autowired
	private ShipwreckRepository shipwreckRepository;


	public List<Shipwreck> list() {
		return shipwreckRepository.findAll();
	}

	public Shipwreck create(Shipwreck shipwreck) {
		return shipwreckRepository.saveAndFlush(shipwreck);
	}

	public Shipwreck get(Long id) {
		return shipwreckRepository.findOne(id);
	}

	public Shipwreck update(Long id, Shipwreck shipwreck) {
		Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
		BeanUtils.copyProperties(shipwreck,existingShipwreck);
		return shipwreckRepository.saveAndFlush(existingShipwreck);
	}

	public Shipwreck delete(Long id) {
		Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
		shipwreckRepository.delete(existingShipwreck);
		return existingShipwreck;
	}
}
