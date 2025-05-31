package com.example;

import java.util.ArrayList;

public class Paciente  extends Persona implements Agendable{
    private String telefono;
    private ArrayList<Cita> citas;


    public Paciente(String nombre, String identificacion,  String telefono){
        super(nombre, identificacion);
        this.telefono = telefono;
        this.citas = new ArrayList<>();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }

    @Override
    public void agendarCita(Cita cita) {
        citas.add(cita);
        System.out.println("Cita agendada para el paciente " + getNombre());
    }

    @Override
    public void cancelarCita(Cita cita) {
        citas.remove(cita);
        System.out.println("Cita cancelada para el paciente " + getNombre());
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Paciente: " + getNombre() + " - ID: " + getIdentificacion() + " - Tel: " + telefono);
    }
}
