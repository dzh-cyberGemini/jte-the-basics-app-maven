alow_scm_jenkinsfile = false
pipeline_template = "maven_template"

libraries{
    maven{
      message = "From MAVEN App repository main branch date 08.11.21!"
    }
    gradle{
        message = "HELLO from GRADLE-app repository! This is message variable."
        number = 23
    }
}
