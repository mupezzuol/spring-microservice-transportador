package br.com.microservice.transportador.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class DeliveryDTO {

	private Long orderId;
	private LocalDate deliveryDate;
	private String originAddress;
	private String destinationAddress;
	
}
