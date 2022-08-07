package com.roman.cqrs.query

interface QueryHandler<R, Q : Query<R>> {

    fun handle(query: Q): R

}