fun main() {

    println("Введите количество строк и столбцов: ")
    val a = readln().toInt()
    val b = readln().toInt()
    val mass: Array<Array<Int>> = Array(a) {
        Array(b) {
            (100..999).random()
        }
    }


    var stroka:String = ""
    for (i in 0..a-1) {
        for (j in 0..b-1){
            stroka += mass[i][j].toString()
        }

    }

    for (i in 0..a-1) {
        println()
        for (j in 0..b-1){
            print(mass[i][j].toString()+"\t")
        }

    }

    println()
    println("В массиве использовано ${stroka.toSet().size} различных цифр")
}