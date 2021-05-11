package Classes

//Construstor com argumentos, idade pode receber um inteiro ou null
class Person(val firstName: String, val lastName: String, val age: Int ?) {
}

class Person2(val firstName: String, val lastName: String, val age: Int ?) {
    init {
        require(firstName.trim().length >0 ){"Invalid firstname argument"}
        require(lastName.trim().length >0 ){"Invalid firstname argument"}
        if(age != null){
            require(age >0 && age <150){"Invalid firstname argument"}
        }
    }
}

fun main(args: Array<String>){

    val person1 = Person("Cezar", "Augusto", null)
    println("${person1.firstName}, ${person1.lastName}, ${person1.age}")
    println("${person1.firstName}, ${person1.lastName}, ${person1.age?.toString()?:"?"}")
    //Chamando a impressão de idade, caso o atributo esteja null, operador elvis substitui.



    val person2 = Person2("Cezar", "Augusto", 50)
    


}




