//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TODO 1. Дан список строк произвольного размера. Вывести в консоль список,
    // внутри которого располагаются данные элементы, но каждый элемент
    // представлен в реверсивном виде. Входной список: {"one", "two", "three"}.
    // Выходные данные: [eno, owt, eerht].
    println("1. Задание\n")

    val listNumber = listOf(
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten"
    )

    val reversedList = listNumber.map { it.reversed() }

    println(reversedList)

    getLine("=")

    //TODO 2. Создать список целых чисел. В новый список сохранить квадрат
    // элементов старого списка с условием, что исходный элемент меньше или
    // равен 3. Входной список: {1, 2, 3, 4, 5}. Выходные данные: [1, 4, 9]
    println("2. Задание\n")

    val listNumberTwo = listOf(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    )

    val listNumberTransformSquare = listNumberTwo.filter { it <= 3 }.map { it * it }

    println(listNumberTransformSquare)

    getLine("=")

    //TODO 3. Написать два списка. Один содержит значения цвета на английском
    // языке, второй – значение цвета на русском. Объединить списки и вывести
    // информацию, содержащую значение и его перевод. Выходные данные:
    // {"red", "blue", "white"}, {"красный", "синий", "белый"}.
    // Выходные данные: [Значение: red, перевод: красный, Значение: blue,
    // перевод: синий, Значение: white, перевод: белый]
    println("3. Задание\n")

    val colorRu = listOf(
        "красный",
        "оранжевый",
        "желтый",
        "зеленый",
        "голубой",
        "синий",
        "фиолетовый"
    )

    val colorEN = listOf(
        "red",
        "orange",
        "yellow",
        "green",
        "light",
        "blue",
        "blue",
        "purple"
    )

    val colorTranslation = colorEN.zip(colorRu){en, ru ->
        "Значение: $en, перевод: $ru"
    }

    println(colorTranslation)

    getLine("=")

    //TODO 4. Дан массив строк, содержащий название месяцев. Посчитать общее
    // количество символов, содержащееся во всех строковых элементах.
    // Выходные данные: {"Jan", "Feb", "Mar", "Apr", "May}. Выходные данные: 15.
    println("4. Задание\n")

    val listYear = listOf(
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
        )

    val listYearCharLength = listYear.sumOf { it.length }

    println(listYearCharLength)

    getLine("^")

}