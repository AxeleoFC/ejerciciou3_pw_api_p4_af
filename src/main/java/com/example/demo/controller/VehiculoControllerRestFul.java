package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.IVehiculoService;

@Controller
@RequestMapping(path = "/vehiculos")
public class VehiculoControllerRestFul {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping(path = "/todos")
	public List<Vehiculo> todosLosVehiculos(){
		return this.vehiculoService.buscarTodos();
	}
	
	@GetMapping(path = "/c/{placa}")
	public Vehiculo todosPorPlaca(@PathVariable String placa){
		System.out.println(placa);
		System.out.println(this.vehiculoService.buscarPlaca(placa));
		return this.vehiculoService.buscarPlaca(placa);
	}
	
}
