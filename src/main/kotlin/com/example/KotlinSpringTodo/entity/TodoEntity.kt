package com.example.KotlinSpringTodo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class TodoEntity (@Id @GeneratedValue var todoId: Long = 0, var content: String = "")
