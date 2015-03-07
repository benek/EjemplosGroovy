def convertirRomanos(def numero) {
    def romanosNumeros = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
    def numeros =        [1000, 900, 500, 400,  100,  90,  50, 40,   10,    9,   5,   4,    1]
    def romano = ""

    if (numero < 1) {
        return romano
    }
    else {

        for (int i=0; i < romanosNumeros.size() ; i++) {
            if (numero >= numeros.get(i)) {
                romano = romanosNumeros.get(i)
                romano+=(convertirRomanos(numero-numeros.get(i)))
                return romano
            }
        }
    }
}

def convertirArabigos(String romano){
    def romanosNumeros = [M:1000, D:500, C:100, L:50, X:10, V:5, I:1]

    def arabigo = 0
    def anterior  = 0

    romano.eachWithIndex { String it, int i ->
        if(i>0){
            if(romanosNumeros.get(anterior) <=> romanosNumeros.get(it) == -1){
                arabigo+=romanosNumeros.get(it)
                arabigo-=(romanosNumeros.get(anterior)*2)
            }
            else arabigo+= romanosNumeros.get(it)
        anterior = it
        }else {
            arabigo+= romanosNumeros.get(it)
            anterior = it
        }
    }

    arabigo
}

println(convertirRomanos(1996))
println(convertirArabigos('MCMXCVI'))