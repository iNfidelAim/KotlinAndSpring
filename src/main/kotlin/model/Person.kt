package model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table


@Entity
@Table(name  = "Person")
class Person {

    @Column(name = "Id")
    private val id: Int? = null;

    @Column(name = "name")
    private val name: String = "";

    @Column(name = "age")
    private val age: Int? = null;

}