package com.example.billy.firstappkotlin.nullNonNullAndElvis

fun main() {
    var NotNullString: String? = "abc"
    NotNullString = null

    var len = if (NotNullString != null) NotNullString.length else -1
    //the same like top
    var len1 = NotNullString?.length ?: -1
    //chac chan khac null su dung !!.
    val nullableList: List<Int?> = listOf(3, 5, null, 7)
    val intList: List<Int> = nullableList.filterNotNull()
    println("inlist = $intList")

}