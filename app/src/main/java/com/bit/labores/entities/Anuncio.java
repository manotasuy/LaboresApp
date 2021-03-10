package com.bit.labores.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Anuncio implements Serializable {

    private int id_anuncio;
    private String titulo;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_cierre;
    private boolean estado;
    private boolean experiencia;
    private int pago_hora;
    private Empleador empleador;
    private double calificacion_desde;
    private double calificacion_hasta;
    private boolean tiene_vinculo;
    private Disponibilidad disponibilidad;
    private List<Tarea> tareas;

    public int getId_anuncio() {
        return id_anuncio;
    }

    public void setId_anuncio(int id_anuncio) {
        this.id_anuncio = id_anuncio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(Date fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public int getPago_hora() {
        return pago_hora;
    }

    public void setPago_hora(int pago_hora) {
        this.pago_hora = pago_hora;
    }

    public Empleador getEmpleador() {
        return empleador;
    }

    public void setEmpleador(Empleador empleador) {
        this.empleador = empleador;
    }

    public double getCalificacion_desde() {
        return calificacion_desde;
    }

    public void setCalificacion_desde(double calificacion_desde) {
        this.calificacion_desde = calificacion_desde;
    }

    public double getCalificacion_hasta() {
        return calificacion_hasta;
    }

    public void setCalificacion_hasta(double calificacion_hasta) {
        this.calificacion_hasta = calificacion_hasta;
    }

    public boolean isTiene_vinculo() {
        return tiene_vinculo;
    }

    public void setTiene_vinculo(boolean tiene_vinculo) {
        this.tiene_vinculo = tiene_vinculo;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public Anuncio() {
    }

    public Anuncio(int id_anuncio, String titulo, String descripcion, Date fecha_inicio, Date fecha_cierre, boolean estado, boolean experiencia, int pago_hora, Empleador empleador, double calificacion_desde, double calificacion_hasta, boolean tiene_vinculo, Disponibilidad disponibilidad, List<Tarea> tareas) {
        this.id_anuncio = id_anuncio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.experiencia = experiencia;
        this.pago_hora = pago_hora;
        this.empleador = empleador;
        this.calificacion_desde = calificacion_desde;
        this.calificacion_hasta = calificacion_hasta;
        this.tiene_vinculo = tiene_vinculo;
        this.disponibilidad = disponibilidad;
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "id_anuncio=" + id_anuncio +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_cierre=" + fecha_cierre +
                ", estado=" + estado +
                ", experiencia=" + experiencia +
                ", pago_hora=" + pago_hora +
                ", empleador=" + empleador +
                ", calificacion_desde=" + calificacion_desde +
                ", calificacion_hasta=" + calificacion_hasta +
                ", tiene_vinculo=" + tiene_vinculo +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
