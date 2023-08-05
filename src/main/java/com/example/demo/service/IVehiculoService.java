package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface IVehiculoService {
	
	public List<Vehiculo> buscarTodos();
	public Vehiculo buscarPlaca(String placa);

}
