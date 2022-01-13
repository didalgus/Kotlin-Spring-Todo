package com.example.KotlinSpringTodo.repository

import com.example.KotlinSpringTodo.entity.TodoEntity
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional

interface TodoRepository : JpaRepository<TodoEntity, Long> {

    @Transactional
    fun deleteByTodoId(todoId: Long)
}
