public class HolaMundo{
	private String nombre;
	private String apellido;
	public static void main(String[] args){
		HolaMundo hm = new HolaMundo();
		hm.setNombre("Javier");
		hm.setApellido("Ramirez");
		System.out.println(hm.saludar());
	}
	public String saludar(){
		return "Hola " + nombre + " " + apellido;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getApellido(){
		return apellido;
	}
}