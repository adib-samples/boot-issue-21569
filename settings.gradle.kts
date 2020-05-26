rootProject.name = "backend"

include("platform")
include(":components:util")
include(":app")

fun setChildProjectsNames(parent: ProjectDescriptor) {
    parent.children.forEach { childProject ->
        childProject.buildFileName = "${childProject.name}.gradle.kts"
        setChildProjectsNames(childProject)
    }
}
setChildProjectsNames(rootProject);
