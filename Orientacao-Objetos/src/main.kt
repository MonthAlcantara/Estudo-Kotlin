fun main() {
    println("Bem vindo ao Bytebank");

//    for(i in 5 downTo 1){ For com i decrescente }
//    for(i in 5 downTo 1 step 2){ step para pular de x em x na contagem }
    for(i in 1 .. 5) {
        val titular: String = "Alex$i";
        val numeroConta: Int = 1000 + i;
        var saldo = 0.0;
        saldo -= 200;

        println("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
    }
//  If de sempre igualao do Java
//    if(saldo > 0.0){
//        println("Conta zerada")
//            }else if(saldo  == 0.0){
//        println("Conta zerada")
//    }else {
//        println("conta negativa")
//    }

    //Como cada condição tem apenas uma linha de código, as chaves são dispensadas
//    when {
//        titular.equals("Carlos") -> println("Titular é o Carlos");
//        titular.equals("João") -> println("Titular é o João");
//        else -> println("Titular é o $titular");
//    }

  //  testaCondicoes(saldo);
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta zerada")
        saldo == 0.0 -> println("Conta zerada")
        else -> println("conta negativa")
    }
}