fun main()
{
    var age = readln()!!.toDouble()
    when
    {
        (age>=0)&&(age<=2) -> println("младенец")
        (age>=3)&&(age<=14) -> println("ребенок")
        (age>=15)&&(age<=18) -> println("подросток")
        (age>=19)&&(age<=50) -> println("взрослый")
        (age>=51)&&(age<=90) -> println("пенсионер")
        (age>=91) -> println("умер")
        else -> println("Введите нормальный возраст")
    }
}