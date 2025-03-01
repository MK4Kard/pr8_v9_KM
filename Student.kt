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
            (age < 15 || age > 40) -> return "Возраст не соответствует"
        }
        return "Возраст: $age"
    }
    fun Sport():String{
        // бокс, ММА, Дзюдо, борьба, лёгкая атлетика
        var text = ""
        when {
            sport == "бокс" -> when {
                (weight > 48 || weight < 91)&&(height > 160 || height < 172) -> text = "Подходит для $sport"
                else -> text = "Не подходит"
            }
            sport == "ММА" -> when {
                (weight > 56 || weight < 110)&&(height > 178 || height < 185) -> text = "Подходит для $sport"
                else -> text = "Не подходит"
            }
            sport == "дзюдо" -> when {
                (weight > 40 || weight < 100)&&(height > 174 || height < 185) -> text = "Подходит для $sport"
                else -> text = "Не подходит"
            }
            sport == "борьба" -> when {
                (weight > 56 || weight < 110)&&(height > 178 || height < 185) -> text = "Подходит для $sport"
                else -> text = "Не подходит"
            }
            sport == "лёгкая атлетика" -> when {
                (weight > 40 || weight < 75)&&(height > 160 || height < 200) -> text = "Подходит для $sport"
                else -> text = "Не подходит"
            }
            else -> text = "Нет вида спорта"
        }
        return text
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
                in 17..40 -> when{
                    (height < 160 || height > 210) -> return "Рост не соответствует нормам"
                }
            }
            (gender == "Ж") -> when (age){
                in 15..16 -> when{
                    (height < 154 || height > 170) -> return "Рост не соответствует нормам"
                }
                in 17..40 -> when{
                    (height < 163 || height > 200) -> return "Рост не соответствует нормам"
                }
            }
        }
        when { // проверка веса
            (gender == "М") -> when (age){
                in 15..16 -> when{
                    (weight < 45 || weight > 76) -> return "Вес не соответствует нормам"
                }
                in 17..40 -> when{
                    (weight < 55 || weight > 110) -> return "Вес не соответствует нормам"
                }
            }
            (gender == "Ж") -> when (age){
                in 15..16 -> when{
                    (weight < 44 || weight > 60) -> return "Вес не соответствует нормам"
                }
                in 17..40 -> when{
                    (weight < 50 || weight > 70) -> return "Вес не соответствует нормам"
                }
            }
        }
        return "Группа: $group\n" +
                "Пол: $gender, Рост: $height, Вес: $weight"
    }
}
