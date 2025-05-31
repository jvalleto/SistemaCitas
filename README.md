# Sistema de Agendamiento de Citas Médicas 🩺

Este proyecto es una aplicación de consola desarrollada en Java que permite agendar, mostrar y cancelar citas médicas entre pacientes y médicos. 
El sistema fue construido aplicando los principios fundamentales de la Programación Orientada a Objetos (POO).

---

## 🧠 Objetivos Académicos

Este proyecto fue creado con fines educativos para practicar los siguientes conceptos de POO:

- ✅ Clases y atributos
- ✅ Constructores y sobrecarga
- ✅ Encapsulamiento y métodos de acceso (`get` y `set`)
- ✅ Métodos generales
- ✅ Herencia (`Paciente` y `Medico` heredan de `Persona`)
- ✅ Clases abstractas (`Persona`)
- ✅ Polimorfismo (`mostrarDatos`, `agendarCita`, etc.)
- ✅ Interfaces (`Agendable`)
- ✅ Gestión de dependencias básica (estructura de paquetes)

---

## 🛠️ Tecnologías

- **Lenguaje:** Java 17+
- **Entorno:** Visual Studio Code
- **Compilación:** Manual desde consola (`javac` y `java`)
- **Organización:** Paquete `com.example`

---

## 📁 Estructura del Proyecto


---

## 🚀 Cómo ejecutar el proyecto

1. Abre una terminal en la carpeta raíz del proyecto.
2. Compila los archivos:

```bash
javac com/example/*.java

Paciente: Carlos Pérez - ID: 123456 - Tel: 3120001122
Médico: Dra. María López - ID: 654321 - Especialidad: Dermatología
Cita agendada para el paciente Carlos Pérez
Cita agendada para el médico Dra. María López
Cita: 2025-06-05 a las 10:00 AM
Paciente: Carlos Pérez
Médico: Dra. María López (Dermatología)
Cita cancelada para el paciente Carlos Pérez
Cita cancelada para el médico Dra. María López
