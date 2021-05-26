package com.github.gasrodriguez.intellijpluginsv.services

import com.github.gasrodriguez.intellijpluginsv.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
