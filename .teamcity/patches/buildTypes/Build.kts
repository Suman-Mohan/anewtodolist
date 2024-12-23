package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Build")) {
    expectSteps {
        maven {
            name = "Maven Build"
            id = "Maven"
            goals = "clean build"
        }
    }
    steps {
        insert(1) {
            maven {
                name = "Maven Build New"
                id = "Maven_Build_New"
            }
        }
    }
}
