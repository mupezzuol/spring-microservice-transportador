package br.com.microservice.transportador.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.transportador.dto.DeliveryDTO;
import br.com.microservice.transportador.dto.VoucherDTO;
import br.com.microservice.transportador.model.Delivery;
import br.com.microservice.transportador.repository.DeliveryRepository;
import br.com.microservice.transportador.service.IDeliveryService;

@Service
public class DeliveryService implements IDeliveryService{
	
	@Autowired
	private DeliveryRepository deliveryRepository;

	@Override
	public VoucherDTO bookDelivery(DeliveryDTO pedidoDTO) {
		
		Delivery entrega = new Delivery();
		entrega.setSearchDate(pedidoDTO.getDeliveryDate());
		entrega.setDeliveryForecast(pedidoDTO.getDeliveryDate().plusDays(1l));
		entrega.setDestinationAddress(pedidoDTO.getDestinationAddress());
		entrega.setOriginAddress(pedidoDTO.getOriginAddress());
		entrega.setOrderId(pedidoDTO.getOrderId());
		
		deliveryRepository.save(entrega);
		
		VoucherDTO voucher = new VoucherDTO();
		voucher.setNumber(entrega.getId());
		voucher.setDeliveryForecast(entrega.getDeliveryForecast());
		return voucher;
	}

}
