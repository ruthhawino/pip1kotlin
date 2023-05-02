fun main() {
    citizenshipDetails("Ruth",19,"Kenyan")


 val output = addition(12,13,74,19)
    println(output)

    val result=averageValues(12.0,13.0,24.2,30.0,3.7)



    val person = Human(
        "Ruth Awino",
        19,
        "+254712345678",
        "awinoruth@gmail.com",
        75.5,
        false
    )
}

//1. Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)


fun citizenshipDetails(name:String,age:Int,nationality:String){
    println("Hello my name is $name ,I am $age years old and I am a $nationality")
}

//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)

fun addition(num1:Int,num2:Int,num3:Int,num4:Int,):Int{

        return num1+num2+num3+num4
}

//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)

fun averageValues(value1:Double,value2:Double,value3:Double,value4:Double,value5:Double):Double {
    val total = value1 + value2 + value3 + value4 + value5
    val average = total / 5
    return average

}

   // 4. You are creating an app to capture a person’s records. Some of the data you will
   // capture includes full name, age, phone number, email, weight in kg, and citizen. For the
  //  citizen field, you will track whether a student is a Ugandan or not. (3 points)

class Human(var fullName: String,var age: Int,var phoneNumber: String,
            var email: String,var weightInKg: Double,var isUgandanCitizen: Boolean)