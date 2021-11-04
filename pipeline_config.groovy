alow_scm_jenkinsfile = false
pipeline_template = "maven_template"

libraries{
    maven{
      message = "From MAVEN App repository main branch date 01.11.21!"
    }
    docker{
      location = "DOCKER variable from Maven App repository!"     
    }
    gradle{
        message = "HELLO from GRADLE-app repository! This is message variable."
        number = 5
    }
}
