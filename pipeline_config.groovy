alow_scm_jenkinsfile = false

libraries{
    maven{
      message = "From MAVEN App repository main branch date 01.11.21!"
    }
    docker{
      location = "DOCKER variable from Maven App repository!"     
    }
    gradle
}
