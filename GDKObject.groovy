def numeros = [5,6,7,8,9,10]
numeros.each{ println it }

def cadena = 'ABCDEFGHIJK'
cadena.each{ println it }

def numero = 9876543
numero.each{ println it }

println numeros.any { it % 2 == 0}
println numeros.every { it > 7 }
println numeros.findAll { it in 8..15 }
println numeros.collect { 'Numero ' + it }

numeros.eachWithIndex{ num, idx ->
	println "$idx: $num"
}