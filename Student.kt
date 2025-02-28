class Student(_sport: String) {
    var name = ""
    var sname = ""
    var surname = ""
    var gender = ""
    var group = ""
    var year: Int = 0
    var height: Double = 0.0
    var weight: Double = 0.0
    var sport: String
    init{
        sport = _sport
    }
    fun PersonToString():String{ //выводит ФИО
        return "Имя: $name Отчество: $sname Фамилия: $surname"
    }
    fun Age():String{ //высчитывает сколько лет студенту
        var age = 2025 - year
        when {
            (age < 15 || age > 26) -> return "Возраст не соответствует"
        }
        return "Возраст: $age"
    }
    fun Sport():String{
        return sport
    }
    fun Static():String{ //выводит данные о студенте
        var age = 2025 - year
        when {
            (gender == "М" || gender == "м"|| gender == "мужской") -> gender = "М"
            (gender == "Ж" || gender == "ж"|| gender == "женский") -> gender = "Ж"
            else -> gender = "-"
        }
        when { // проверка роста
            (gender == "М") -> when (age){
                in 15..16 -> when{
                    (height < 156 || height > 180) -> return "Рост не соответствует нормам"
                }
                in 17..26 -> when{
                    (height < 160 || height > 210) -> return "Рост не соответствует нормам"
                }
            }
            (gender == "Ж") -> when (age){
                in 15..16 -> when{
                    (height < 154 || height > 170) -> return "Рост не соответствует нормам"
                }
                in 17..26 -> when{
                    (height < 163 || height > 200) -> return "Рост не соответствует нормам"
                }
            }
        }
        when { // проверка веса
            (gender == "М") -> when (age){
                in 15..16 -> when{
                    (weight < 45 || weight > 76) -> return "Вес не соответствует нормам"
                }
                in 17..26 -> when{
                    (weight < 55 || weight > 80) -> return "Вес не соответствует нормам"
                }
            }
            (gender == "Ж") -> when (age){
                in 15..16 -> when{
                    (weight < 154 || weight > 170) -> return "Вес не соответствует нормам"
                }
                in 17..26 -> when{
                    (weight < 163 || weight > 200) -> return "Вес не соответствует нормам"
                }
            }
        }
        return "Группа: $group" +
                "Пол: $gender, Рост: $height, Вес: $weight"
    }
}