alow_scm_jenkinsfile = false

libraries{
    maven{
      message = "This line is from Maven App repository main branch date 01.11.21!"
    }
    docker{
       message = "DOCKER variable from Maven App repository!"     
    }
}
