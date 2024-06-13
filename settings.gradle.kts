rootProject.name = "FancyHolograms"

include("api")
include("implementation_1_20_6")
include("implementation_1_20_4")
include("implementation_1_20_2")
include("implementation_1_20_1")
include("implementation_1_19_4")
include("nms:v1_19_4")
findProject(":nms:v1_19_4")?.name = "v1_19_4"
