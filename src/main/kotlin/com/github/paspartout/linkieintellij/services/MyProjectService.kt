package com.github.paspartout.linkieintellij.services

import com.github.paspartout.linkieintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
