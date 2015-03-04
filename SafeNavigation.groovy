class Empresa {
	def nombre
	Direccion direccion
}
class Direccion {
	Calle calle
	String codigoPostal
	String ciudad
}
class Calle {
	String nombre
	String numero
}

def empresa = new Empresa()

//En Java
/*try{
	System.out.println(empresa.getDireccion().getCalle().getNombre());
} catch(NullPointerException npe){
	npe.printStackTrace();
}*/

if (empresa != null){
	if (empresa.getDireccion() != null){
		if (empresa.getDireccion().getCalle() != null){
			System.out.println(empresa.getDireccion().getCalle().getNombre());
		}
	}
}

if (empresa != null && empresa.getDireccion() != null && empresa.getDireccion().getCalle() != null){
	System.out.println(empresa.getDireccion().getCalle().getNombre());
}

//En Groovy
println empresa?.direccion?.calle?.nombre
