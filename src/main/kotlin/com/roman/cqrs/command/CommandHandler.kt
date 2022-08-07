package com.roman.cqrs.command

interface CommandHandler<R, C : Command<R>> {

    fun handle(command: C): R

}