import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "andromeda"
for (name in listOf("Andromeda-API", "Andromeda-Server")) {
    val projName = name.toLowerCase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
