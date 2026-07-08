package com.example.cadastro.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}