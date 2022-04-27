package com.ceiba.manejador;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ManejadorComandoRespuestaServicio<C, S, R> {

	@Transactional
	void ejecutar(List<C> comando, String s);
}