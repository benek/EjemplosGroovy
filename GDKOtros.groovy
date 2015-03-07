def archivo = new File("Autos.txt")

println archivo.getText()
println archivo.readLines()

def anio = 1956

archivo.setText("Vocho $anio")
archivo.write("Vocho $anio") //alias de setText()
archivo.append(" Clasico")
println archivo.getText()
println archivo.size()

def directorio = new File("//usr")
def directorioZsh = new File("//usr//lib//zsh")
directorio.eachDir { println it }
directorioZsh.eachDirRecurse { println it }

directorio.eachDirMatch("lib") { println it }

directorio.eachFile { println it }
directorioZsh.eachFileRecurse { println it }







