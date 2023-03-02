package com.itis.timetable

import com.itis.timetable.plugins.configureDatabases
import com.itis.timetable.plugins.configureRouting
import com.itis.timetable.plugins.configureSecurity
import com.itis.timetable.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>): Unit = EngineMain.main(args)

//fun main() {
//    embeddedServer(Netty, port = 8000, host = "0.0.0.0", module = Application::module)
//        .start(wait = true)
//}

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureSecurity()
    configureRouting()
}

// java -cp build/libs/com.itis.timetable.itis-timetable-parser-2-0.0.1.jar com.itis.timetable.ApplicationKt