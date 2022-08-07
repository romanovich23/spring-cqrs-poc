package com.roman.cqrs.command

import com.roman.cqrs.query.Query
import java.util.concurrent.TimeUnit

interface CommandBus {

    fun <R> executeAndWait(command: Command<R>): R

    fun <R> executeAndWait(command: Command<R>, timeout: Long): R

    fun <R> executeAndWait(command: Command<R>, timeout: Long, unit: TimeUnit): R

    fun <R> execute(command: Command<R>): R

    fun <R> execute(command: Command<R>, timeout: Long): R

    fun <R> execute(command: Command<R>, timeout: Long, unit: TimeUnit): R

}