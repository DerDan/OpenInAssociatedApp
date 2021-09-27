package com.github.derdan.openinassociatedapp.services

import com.intellij.openapi.project.Project
import com.github.derdan.openinassociatedapp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
