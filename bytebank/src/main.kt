//public static void main do java
fun main() {
    // Fracamente tipado. Ao atribuir valor, o Kotlin internamente consegue inferir o tipo
    val nomeBanco = "ByteBank";
    // Obrigatoriamente empre inicializar a variável
    val titular = "Junior";

    // Essa declaração :Int é o que o Kotlin faz por debaixo dos panos
    val numeroConta: Int = 1000;
    //Como o salda tende a mudar, aqui foi escolhido o var e não o val
    var saldo = 0.0;
//    saldo = 100; Não compila pois o Kotlin inferiu que saldo é do tipo Double. Diferente do JS
    saldo = 100 + 2.0;


    // Trabalha com template String, melhorando a concatenação de Strings
    println("Bem vindo ao $nomeBanco");
    println("Titular $titular");
    println("Numero da Conta: $numeroConta")
    println("Saldo: $saldo")

}