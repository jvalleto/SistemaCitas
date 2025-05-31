package com.example;

public class SistemaCitas {
    public static void main(String[] args) {
        // Crear pacientes y médicos
        Paciente paciente1 = new Paciente("Carlos Pérez", "123456", "3120001122");
        Medico medico1 = new Medico("Dra. María López", "654321", "Dermatología");

        // Mostrar datos
        paciente1.mostrarDatos();
        medico1.mostrarDatos();

        // Crear cita
        Cita cita1 = new Cita("2025-06-05", "10:00 AM", medico1, paciente1);

        // Agendar la cita
        paciente1.agendarCita(cita1);
        medico1.agendarCita(cita1);

        // Mostrar información de la cita
        cita1.mostrarCita();

        // Cancelar la cita
        paciente1.cancelarCita(cita1);
        medico1.cancelarCita(cita1);
    }
}