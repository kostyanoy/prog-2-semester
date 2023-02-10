package data

import kotlinx.serialization.Serializable

@Serializable
data class Album(
    val name: String, //Поле не может быть null, Строка не может быть пустой
    val length: Long = 1  //Значение поля должно быть больше 0
)