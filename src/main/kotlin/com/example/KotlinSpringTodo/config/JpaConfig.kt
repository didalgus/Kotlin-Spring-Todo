package com.example.KotlinSpringTodo.config

import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(basePackages = arrayOf("com.example.KotlinSpringTodo"))
class JpaConfig
