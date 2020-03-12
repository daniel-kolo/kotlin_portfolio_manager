package com.kotlin_portfolio_manager.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(firstName: String, lastName: String, email: String, password: String){

    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    val Id : Long = 0

    val firstName = firstName
    val lastName = lastName
    val email = email
    val password = password


}