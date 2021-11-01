alow_scm_jenkinsfile = false

@merge libraries{
    maven{
      message = "From MAVEN App repository main branch date 01.11.21!"
    }
    docker{
      message = "DOCKER variable from Maven App repository!"     
    }
}
