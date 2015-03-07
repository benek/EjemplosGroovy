def cadena = 'sisinosinonosisinosi'
println cadena.count('no')

def titulo = 'Acta de Nacimiento'
println titulo.center(40)
println titulo.center(40, "GROOVY")
println titulo.center(40, "~")

def n = "10.003"
println n.isBigDecimal()
println n.isBigInteger()
println n.isDouble()
println n.isFloat()
println n.isLong()
println n.isNumber()

def textoLargo = """
Estimado usuario,
Su contraseña ha expirado, favor de cambiarla dentro del portal.

La Administracion."""

println textoLargo.readLines()
println cadena.reverse()

println cadena.toList()

println "Hola " << "Mundo!" //left shift

def abc = "abcdefghijklmnopqrstuvwxyz"
println abc - "defg"

print "uname -a".execute().getText()