def edadPermitida = 18..100;
println edadPermitida
println edadPermitida.size()

def rango = -15..<30
println rango.step(2)
println rango.size()

def abecedario = 'a'..'z'
println abecedario
println abecedario.size()

println abecedario.from
println abecedario.to

for (i in 10..20){
	println "No. ${i}"
}

(10..20).each{
	println it
}

anio = 2015
switch(anio){
	case 1901..2000: println 'Siglo XX';break;
	case 2001..2100: println 'Siglo XXI';break;
}







