package com.itis.timetable

import com.itis.timetable.plugins.configureDatabases
import com.itis.timetable.plugins.configureRouting
import com.itis.timetable.plugins.configureSecurity
import com.itis.timetable.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureSecurity()
    configureRouting()
}
