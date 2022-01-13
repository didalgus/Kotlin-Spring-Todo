package com.example.KotlinSpringTodo.controller

import com.example.KotlinSpringTodo.entity.TodoEntity
import com.example.KotlinSpringTodo.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@Controller
class TodoController(@Autowired private val todoRepository: TodoRepository) {
    
    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    fun listTodo(model: Model) : String{
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }
    
    @RequestMapping("/", method = arrayOf(RequestMethod.POST))
    fun addTodo(todo: TodoEntity, model: Model) : String {
        todoRepository.save(todo)
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }
    
    @RequestMapping("/delete", method = arrayOf(RequestMethod.GET))
    fun deleteTodo(@RequestParam(name = "todoId") todoId: Long, model: Model): String {
        todoRepository.deleteByTodoId(todoId)
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }
    
}
