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

// java -cp build/libs/com.itis.timetable.itis-timetable-parser-2-0.0.1.jar com.itis.timetable.ApplicationKt
// ./gradlew buildFatJar