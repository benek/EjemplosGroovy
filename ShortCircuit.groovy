def a(){
	println "estoy en a()"
	true
}
def b() {
	println "estoy en b()"
	false
}
println a() | b()
println a() || b()