package emsamablajecomputadoras.creacional;

public class Main {

	public static void main(String[] args) {
		SistemaOperativo sistemaOperativo1 = new SistemaOperativo("Windows",10,"PRO 64 bits");
		Mainboard mainBo1 = new Mainboard("Strix ", "x99");		
	    Computador comp1 = new EnsamblajeBuilder()
	        .marca("Asus")
	        .modelo("ROG")
	        .ram(32)
	        .almacenamiento(1000)
	        .sistemaOperativo1
	        .mainBo1.build();   
	    
	    SistemaOperativo sistemaOperativo2 = new SistemaOperativo("Windows",10,"Home 64 bits");
		Mainboard mainBo2 = new Mainboard("Strix ", "x99");		
	    Computador comp2 = new EnsamblajeBuilder()
	        .marca("Asus")
	        .modelo("Zenbook")
	        .ram(16)
	        .almacenamiento(500)
	        .sistemaOperativo1
	        .mainBo1.build();   
	    
	  }
	
	}
	
	