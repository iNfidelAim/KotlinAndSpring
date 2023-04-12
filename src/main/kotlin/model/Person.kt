package model

import jakarta.persistence.Entity
import jakarta.persistence.Table


@Entity
@Table(name  = "Person")
class Person {

    private val id: Int? = null;

    private val name: String = "";

    private val age: Int? = null;

}