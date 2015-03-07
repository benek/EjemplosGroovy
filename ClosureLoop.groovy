def loop(closure){
	for (int i = 0; i <= 5; i++){
		closure.call(i)
	}
}
loop({println it})
def alCuadrado = {
	println it * it
}
loop(alCuadrado)
def alCubo = {
	println it * it * it
}
loop(alCubo)