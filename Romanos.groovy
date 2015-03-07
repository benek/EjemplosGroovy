romanos = [I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000]
def romanoArabigo(String romano) {
    int arabigo = 0;
    romano.size().times {
        arabigo += ((romanos.get(romano[it])) < ((it >= (romano.length() - 1)) ? 0 : romanos.get(romano[it + 1]))) ? -(romanos.get(romano[it])) : (romanos.get(romano[it]));
    };
    println arabigo;
}





romanoArabigo("MMMDCCCLXXXVIII")

def a = (true) ?: (3.times{return it})
println a