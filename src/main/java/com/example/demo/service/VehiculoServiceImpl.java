package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	public List<Vehiculo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscarTodos();
	}

	@Override
	public Vehiculo buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscarPlaca(placa);
	}

}
