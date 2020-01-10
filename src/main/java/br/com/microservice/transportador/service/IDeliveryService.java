package br.com.microservice.transportador.service;

import br.com.microservice.transportador.dto.DeliveryDTO;
import br.com.microservice.transportador.dto.VoucherDTO;

public interface IDeliveryService {
	
	public VoucherDTO bookDelivery(DeliveryDTO pedidoDTO);

}
