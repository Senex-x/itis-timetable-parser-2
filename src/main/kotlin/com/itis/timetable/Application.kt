package com.itis.timetable

import com.itis.timetable.plugins.configureDatabases
import com.itis.timetable.plugins.configureRouting
import com.itis.timetable.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureRouting()
}