package co.edu.uniquindio.poo.model;

import javafx.scene.image.Image;

public class Pickup extends Vehiculo {
    private Integer numeroPasajeros;
    private Integer numeroPuertas;
    private Boolean aireAcondicionado;
    private Boolean camaraReversa;
    private Integer numeroBolsasAire;
    private Boolean abs;
    private Boolean traccion4x4;
    private Float capacidadCajaCarga;

    public Pickup (String marca, String modelo, Integer cambios, Float velocidadMaxima, Float cilindraje, Image foto, Transmision transmision, Estado estado, Combustible combustible, Integer numeroPasajeros, Integer numeroPuertas, Boolean aireAcondicionado, Boolean camaraReversa, Integer numeroBolsasAire, Boolean abs, Boolean traccion4x4, Float capacidadCajaCarga) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, foto, transmision, estado, combustible);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.traccion4x4 = traccion4x4;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public Boolean getCamaraReversa() {
        return camaraReversa;
    }
    public void setCamaraReversa(Boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public Integer getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(Integer numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public Boolean getAbs() {
        return abs;
    }
    public void setAbs(Boolean abs) {
        this.abs = abs;
    }

    public Boolean getTraccion4x4() {
        return traccion4x4;
    }
    public void setTraccion4x4(Boolean traccion4x4) {
        this.traccion4x4 = traccion4x4;
    }

    public Float getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }
    public void setCapacidadCajaCarga(Float capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String toString() {
        return "Pickup [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", numeroBolsasAire=" + numeroBolsasAire + ", abs=" + abs + ", traccion4x4=" + traccion4x4 + ", capacidadCajaCarga=" + capacidadCajaCarga + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getCambios()=" + getCambios() + ", getVelocidadMaxima()=" + getVelocidadMaxima() + ", getCilindraje()=" + getCilindraje() + ", getFoto()=" + getFoto() + ", getTransmision()=" + getTransmision() + ", getEstado()=" + getEstado() + ", getCombustible()=" + getCombustible() + "]";
    }
}