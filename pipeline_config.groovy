alow_scm_jenkinsfile = false

libraries{
    maven{
      message = "From MAVEN App repository main branch date 08.11.21!"
    }
    gradle{
        message = "HELLO from GRADLE-app repository! This is message variable."
        number = 23
    }
}
