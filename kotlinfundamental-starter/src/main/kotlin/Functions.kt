fun main() {
    val user = setUser( name= "Evan", hobby= "Swimming", age= 15 )
    println(user)
}

fun setUser(name: String,hobby: String, age: Int) = "My name is $name, i like $hobby and I,m $age years old"
