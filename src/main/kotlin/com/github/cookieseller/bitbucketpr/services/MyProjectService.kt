package com.github.cookieseller.bitbucketpr.services

import com.intellij.openapi.project.Project
import com.github.cookieseller.bitbucketpr.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
