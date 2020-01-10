package br.com.microservice.transportador.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.transportador.model.Delivery;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long>{

}
