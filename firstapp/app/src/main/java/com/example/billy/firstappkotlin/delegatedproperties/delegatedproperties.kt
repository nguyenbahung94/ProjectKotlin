package com.example.billy.firstappkotlin.delegatedproperties

import kotlin.reflect.KProperty

class User{
    var todayTask:String by DelegatedUser()
}
class DelegatedUser{
      operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
          return "$thisRef,thanks for delegating ${property.name} to me!"
      }
    operator fun setValue(thisRef: Any?,property: KProperty<*>,value:String){
         print("assigned to ${property.name} in $thisRef.Details:$value")
      }
}