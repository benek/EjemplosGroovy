def x = 7
def resultado = ""
switch (x){
	case "algo":
		resultado = "palabra algo"
		break
	case 5:
		resultado = "numero 5"
		break
	case [4, 5, 6, 7, "lista"]:
		resultado = "esta en la lista"
		break
	case 10..100:
		resultado = "esta en el rango"
		break
	case Integer:
		resultado = "es un entero"
		break
	default:
		resultado = "no es de ninguno de los tipos"
}