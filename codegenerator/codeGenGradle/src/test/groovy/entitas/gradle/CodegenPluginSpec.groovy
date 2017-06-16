package entitas.gradle

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

//@groovy.transform.TypeChecked
class CodegenPluginSpec extends Specification {


    void 'Queremos comprobar que se genero correctamente el Plugin de generacion de codigo'() {
        given:
        Project project = ProjectBuilder.builder().build()

        when:
        project.getPlugins().apply 'entitas.codegen'

        then:
        project.getTasks().getByPath("codegen") instanceof CodeGenerationTask


    }

    void 'Queremos comprobar que se genero correctamente la tarea de generacion de codigo'() {
        given:
        Project project = ProjectBuilder.builder().build()

        when:
        Task task = project.task('codegen', type: CodeGenerationTask)

        then:
        task instanceof CodeGenerationTask


    }


    void 'Queremos comprobar que se obtiene la configuracion por defecto'() {
        given:
        Properties prop = new Properties()
        Project project = ProjectBuilder.builder().build()
        project.getPlugins().apply 'entitas.codegen'

        when:
        CodeGenerationPluginExtension ext = project.getExtensions().getByName("entitas") as CodeGenerationPluginExtension
        ext.configure(prop)
        ext.getDefaultProperties()

        then:
        ext.getProperties().get("targetPackage") == "entitas.generated"
        ext.getTargetPackage() == "entitas.generated"
        ext.getDataProviders().size() == 3
        ext.getCodeGenerators().size() == 1
        ext.getPlugins().size() == 1
        ext.getPackages() == null


    }

    void 'Queremos comprobar que la configuracion en el build se obtiene desde el plugin'() {
        given:
        Properties prop = new Properties()
        Project project = ProjectBuilder.builder().build()
        project.getPlugins().apply 'entitas.codegen'


        when:
        CodeGenerationPluginExtension ext = project.getExtensions().getByName("entitas") as CodeGenerationPluginExtension

        ext.configure(prop)
        ext.setTargetPackage("test.gen")


        then:
//        hasEntitas == true
         ext.getProperties().get("targetPackage") == "test.gen"
//        ext.getTargetPackage() == "entitas.generated"
//        ext.getDataProviders().size() == 3
//        ext.getCodeGenerators().size() == 1
//        ext.getPlugins().size() == 1
//        ext.getPackages() == null


    }

    void 'Queremos comprobar que se lanza correctamente la tarea de generacion de codigo'() {
        given:
        Properties prop = new Properties()
        Project project = ProjectBuilder.builder().build()
        project.getPlugins().apply 'java'
        project.getPlugins().apply 'entitas.codegen'

        CodeGenerationTask task = project.getTasks().getByPath("codegen") as CodeGenerationTask
        CodeGenerationPluginExtension ext = project.getExtensions().create("entitas",CodeGenerationPluginExtension.class)

        ext.configure(prop)
        ext.setTargetPackage("test.gen")
        ext.setSearchPackagesKey("ilargia.entitas.fixtures.components")

        when:
        task.run()

        then:
        task instanceof CodeGenerationTask


    }


}

