alow_scm_jenkinsfile = false

libraries{
    maven{
      message = "From MAVEN App repository main branch date 05.11.21!"
    }
    docker{
      location = "DOCKER variable from Maven App repository!"     
    }
    gradle{
        message = "HELLO from GRADLE-app repository! This is message variable."
        number = 23
    }
}
