fun main() {
    var numArray=arrayOf(10,20,30,40,50)
    println(numArray[0])
    println(numArray[1])
    println(numArray[4])
    var nameArray=arrayOf("Lucy","Amekwi","Verah",)
    println(nameArray[2])
    var countryArray=arrayOf("Kenya",0.9,true)
    println(countryArray[2])
    var namesArray=arrayOf("Verah","Lucy","Gachomo","Julie")
    var names=namesArray.get(2)
    println(names)
    var numbers1=arrayOf(10,20,40,50)
    println(numbers1[3])
    println(numbers1.contentToString())
    var nam=arrayOf("lucy","amekwi")
    println(nam[0])
    println(nam.contentToString())
    var Kenya=arrayOf(52000,66.95,"Uhuru Kenyatta",true)
    var country=arrayOf("kenya","uganda")
    println(country.get(0))
    country.set(0, "Rwanda")
    println(country.contentToString())
    var country2=country.plus("Zambia")
    println(country2.contentToString())
    var newcountry=arrayOf("uganda","Zambia")
    country=country.plus(newcountry)
    println(country.indexOf("Zambia"))
    var nums=arrayOf(60,40,45,98,34,23,60,34,76)
    println(nums.count())
    println(nums.sum())
    var sum=nums[2]+nums[3]
    println(sum)
    println(nums.minOrNull())
    println(nums.maxOrNull())
    println(nums.average())
    var sortedNums =nums.sortedArrayDescending()
    println(sortedNums.contentToString())
    var numbers= arrayOf(34,56,87,90,12,3,58)
    numbers.forEach { numbers ->
    println(numbers +100)

        printUppercaseNames(arrayOf("john","kelo","joe"))

    }

}
    fun printUppercaseNames(names:Array<String>){
    names.forEach { x->
     println(x.uppercase())}

}