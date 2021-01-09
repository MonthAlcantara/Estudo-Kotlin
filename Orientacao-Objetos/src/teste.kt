fun main() {
    contaAte5()
    contaDe5A1()
    contaDe10A1PulandoDe2Em2()

}

private fun contaDe10A1PulandoDe2Em2() {
    for (i in 10 downTo 1 step 2) {
        print(i)
    }
}

private fun contaDe5A1() {
    for (i in 5 downTo 1) {
        print(i)
    }
    println()
}

private fun contaAte5() {
    for (i in 1..5) {
        print(i);
    }
    println()
}