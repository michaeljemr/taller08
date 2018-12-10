/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsamablajecomputadoras.creacional;

/**
 *
 * @author CltControl
 */
public class EnsamblajeBuilder {
    private int ram;
    private SistemaOperativo os;
    private int almacenamiento;
    private Mainboard placa;
    private String marca;
    private String modelo;
    private boolean coolerExterno;
    
    public EnsamblajeBuilder(){};
    
    public EnsamblajeBuilder ram(int ram){
        this.ram=ram;
        return this;
    }
    
    public EnsamblajeBuilder sistemaOperativo(SistemaOperativo os){
        this.os=os;
        return this;
    }
    
    public EnsamblajeBuilder almacenamiento(int almacenamiento){
        this.almacenamiento=almacenamiento;
        return this;
    } 
    
    public EnsamblajeBuilder mainboard(Mainboard placa){
        this.placa=placa;
        return this;
    } 
    
    public EnsamblajeBuilder marca(String marca){
        this.marca=marca;
        return this;
    } 

    public EnsamblajeBuilder modelo (String modelo) {
        this.modelo = modelo;
        return this;
    }

    public EnsamblajeBuilder cooler(boolean coolerExterno) {
        this.coolerExterno = coolerExterno;
        return this;
    }
    
    public Computador build(){
        return new Computador(this);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public SistemaOperativo getOs() {
        return os;
    }

    public void setOs(SistemaOperativo os) {
        this.os = os;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public Mainboard getPlaca() {
        return placa;
    }

    public void setPlaca(Mainboard placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isCoolerExterno() {
        return coolerExterno;
    }

    public void setCoolerExterno(boolean coolerExterno) {
        this.coolerExterno = coolerExterno;
    }
         
    
    
    
    
}
