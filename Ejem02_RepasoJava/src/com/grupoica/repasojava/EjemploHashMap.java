package com.grupoica.repasojava;

import java.util.HashMap;
import java.util.Scanner;

import com.grupoica.repasojava.modelo.Usuario;


public class EjemploHashMap {
	public static HashMap<String, Usuario> diccUsuarios = new HashMap<>();
	public static void probandoHashMap() {
		diccUsuarios.put("luis", new Usuario("Luis", 18));
		diccUsuarios.put("Ana", new Usuario("Ana", 20));
		diccUsuarios.put("Luisa", new Usuario("Luisa", 30));
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el usuario: ");
		String nombre = sc.nextLine();
		System.out.println("El usuario es " + diccUsuarios.get(nombre));
		sc.close();
		}
	}
	

