public class Procesador 
 {
 	
	private final Escuchas escuchas;
	 String contenido;

	 public Procesador()

	 public void editar(String contenido){
		 this.contenido = contenido;
		 escuchas.TextoEditado();
	 }

	 public String ver_contenido(){
		 return this.contenido;
	 }

	 public void addProcesadorListener(ProcesadorListener l){
		 this.escuchas.agregar(l);
	 }


}
