package br.com.microservice.transportador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.transportador.dto.DeliveryDTO;
import br.com.microservice.transportador.dto.VoucherDTO;
import br.com.microservice.transportador.service.IDeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
	
	@Autowired
	private IDeliveryService deliveryService;

	@PostMapping
	public VoucherDTO bookDelivery(@RequestBody DeliveryDTO deliveryDTO) {
		return deliveryService.bookDelivery(deliveryDTO);
	}
}
