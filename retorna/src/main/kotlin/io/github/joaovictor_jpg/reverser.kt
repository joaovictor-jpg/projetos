package io.github.joaovictor_jpg

fun main() {

    println("Digiti uma string: ");
    var str: String? = readLine();
    var reverser: String = "";

    for(i in str?.length!! - 1 downTo 0) reverser += str[i];

    println(reverser);
}