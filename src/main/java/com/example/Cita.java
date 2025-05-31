package com.example;


public class Cita {
    private String fecha;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    // Sobrecarga de constructores
    public Cita(String fecha, String hora, Medico medico, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Cita() {
        this.fecha = "";
        this.hora = "";
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void mostrarCita() {
        System.out.println("Cita: " + fecha + " a las " + hora +
            "\nPaciente: " + paciente.getNombre() +
            "\nMédico: " + medico.getNombre() + " (" + medico.getEspecialidad() + ")");
    }
}
