fun main() {
    try {
        println("Какой вид спорта проверять")
        var sport = readln()
        println("Сколько студентов внести")
        var n = readln()!!.toInt()
        for (i in 1..n){
            var st1: Student = Student(sport)
            print("Введите имя: ")
            st1.name = readln()
            print("Введите отчество: ")
            st1.sname = readln()
            print("Введите фамилию: ")
            st1.surname = readln()
            print("Введите год рождения: ")
            st1.year = readln()!!.toInt()
            print("Введите группу: ")
            st1.group = readln()
            print("Введите пол: ")
            st1.gender = readln()
            print("Введите высоту: ")
            st1.height = readln()!!.toDouble()
            print("Введите вес: ")
            st1.weight = readln()!!.toDouble()
            println(st1.PersonToString())
            println(st1.Age())
            when {
                (st1.Age() != "Возраст не соответствует") -> println(st1.Static())
            }
        }
    }
    catch (e:Exception){

    }
}