package com.kotlin_portfolio_manager.domain

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class Portfolio(){
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    val Id : Long = 0



}