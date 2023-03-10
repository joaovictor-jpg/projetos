package io.github.joaovictor_jpg

fun main() {
    var indice: Int = 13;
    var k: Int = 0;
    var soma: Int = 0;

    while (k < indice) {
        k++;
        soma += k;
    }

    println(soma);
}