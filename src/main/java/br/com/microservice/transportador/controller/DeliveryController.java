package br.com.microservice.transportador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.transportador.dto.DeliveryDTO;
import br.com.microservice.transportador.dto.VoucherDTO;
import br.com.microservice.transportador.service.IDeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
	
	@Autowired
	private IDeliveryService deliveryService;

	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reservaEntrega(@RequestBody DeliveryDTO pedidoDTO) {
		return deliveryService.bookDelivery(pedidoDTO);
	}
}
