package com.example;
import java.util.ArrayList;

public class Medico extends Persona implements Agendable {
    private String especialidad;
    private ArrayList<Cita> citas;

    public Medico(String nombre, String identificacion, String especialidad) {
        super(nombre, identificacion);
        this.especialidad = especialidad;
        this.citas = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void agendarCita(Cita cita) {
        citas.add(cita);
        System.out.println("Cita agendada para el médico " + getNombre());
    }

    @Override
    public void cancelarCita(Cita cita) {
        citas.remove(cita);
        System.out.println("Cita cancelada para el médico " + getNombre());
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Médico: " + getNombre() + " - ID: " + getIdentificacion() + " - Especialidad: " + especialidad);
    }
}
