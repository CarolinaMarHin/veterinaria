package com.ceiba.manejador;

import org.springframework.transaction.annotation.Transactional;

public interface ManejadorComandoRespuesta<C, R> {

	@Transactional
	void ejecutar(C comando) throws Exception;
}