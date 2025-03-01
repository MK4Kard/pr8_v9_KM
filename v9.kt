fun main() {
    try {
        println("Какой вид спорта проверять:\n" +
                "1 - бокс, 2 - ММА, 3 - дзюдо, 4 - борьба, 5 - лёгкая атлетика")
        var sportType = readln()!!.toInt()
        var sport = ""
        when(sportType) {
            1 -> sport = "бокс"
            2 -> sport = "ММА"
            3 -> sport = "дзюдо"
            4 -> sport = "борьба"
            5 -> sport = "лёгкая атлетика"
            else -> sport = "-"
        }
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
            when {
                (st1.Age() != "Возраст не соответствует") -> println(st1.PersonToString())
            }
            println(st1.Age())
            when {
                (st1.Age() != "Возраст не соответствует") -> println(st1.Sport())
            }
            when {
                (st1.Age() != "Возраст не соответствует") -> println(st1.Static())
            }
        }
    }
    catch (e:Exception){
            println("неверный ввод")
    }
}
