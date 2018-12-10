    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsamablajecomputadoras.creacional;

/**
 *
 * @author Palacios
 */
public class Computador {
    private int ram;
    private SistemaOperativo os;
    private int almacenamiento;
    private Mainboard placa;
    private String marca;
    private String modelo;
    private boolean coolerExterno;

    private Computador() {
    }

   Computador (EnsamblajeBuilder builder){
       this.ram=builder.getRam();
       this.os=builder.getOs();
       this.almacenamiento=builder.getAlmacenamiento();
       this.placa=builder.getPlaca();
       this.marca=builder.getMarca();
       this.modelo=builder.getModelo();
       this.coolerExterno=true;
   }
    
      
    
    public String especificacionesTecnicas(){
        return "Especificiaciones Técnicas:\n"
               +"Modelo : "+modelo+"\n"
               +"Marca: "+marca+"\n"
               +"Mainboard: "+placa+"\n"
               +"Memoria Ram: "+ram+"\n"
               +"Disco duro: "+almacenamiento+"\n"
               +"Sistema Operativo: "+os+"\n" ;
               
    }
    
    
    
    
}
