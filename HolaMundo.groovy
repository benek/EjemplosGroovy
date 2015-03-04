class HolaMundo{
	def nombre
	def apellido
	static main(args){
		HolaMundo hm = new HolaMundo()
		hm.nombre = "Javier"
		hm.apellido = "Ramirez"
		println hm.saludar()
	}
	def saludar(){
		"""Hola $nombre $apellido,

Te recordamos que el evento del Java Dev Day es el 29 de agosto.

Te esperamos.
La Administracion."""
	}
}