import java.util.Scanner;
/**
 * Created by dell on 07/03/2015.
 */
Scanner sc=new Scanner(System.in)
println("ingrese la palabra a cambiar")
int i=1
def primera=sc.nextLine()
def salida=""

primera.each{
    if(it.equals("o")|| it.equals("O")){
        i.times {salida=salida+"X"}
        i++
    }
    else{salida=salida+it}
}
println(salida)