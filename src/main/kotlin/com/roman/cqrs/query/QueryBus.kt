package com.roman.cqrs.query

import java.util.concurrent.TimeUnit

interface QueryBus {

    fun <R> executeAndWait(query: Query<R>): R

    fun <R> executeAndWait(query: Query<R>, timeout: Long): R

    fun <R> executeAndWait(query: Query<R>, timeout: Long, unit: TimeUnit): R

    fun <R> execute(query: Query<R>): R

    fun <R> execute(query: Query<R>, timeout: Long): R

    fun <R> execute(query: Query<R>, timeout: Long, unit: TimeUnit): R

}