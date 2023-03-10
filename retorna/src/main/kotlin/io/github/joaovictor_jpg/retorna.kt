package io.github.joaovictor_jpg

fun main(args : Array<String>) {
    var t1: Int = 0;
    var t2: Int = 1;
    var t3: Int = 0;

    println("Consulta da Sequência de Fibonacci");

    println("Digite um numero: ");
    var valor: String? = readLine();
    var numero: Int? = valor?.toInt();

    if (numero != null) {
        while (numero > t3) {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            if(numero == 0 || numero == 1) {
                valor = "O número faz parte da sequência de Fibonacci."
            } else if (numero == t3) {
                valor = "O número faz parte da sequência de Fibonacci.";
            } else {
                valor = "O número digitado não faz parte da sequência de Fibonacci.";
            }
        }
    }
    println(valor);
}