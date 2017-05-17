package com.ilargia.games.entitas.codeGeneration.plugins.dataProviders.components.providers;

import com.ilargia.games.entitas.codeGeneration.SourceDataFile;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.TypeVariableSource;

import java.util.List;


public class GenericsDataComponentDataProvider implements IComponentDataProvider {

    public static String GENERIC_DATA_INFOS = "GenericInfos";

    @Override
    public void provide(SourceDataFile data) {
        List<TypeVariableSource<JavaClassSource>> generics = data.fileContent.getOrigin().getTypeVariables();
        setGenericsData(data, generics);
    }

    public static List<String> getGenericsData(SourceDataFile data) {
        return (List<String>) data.get(GENERIC_DATA_INFOS);
    }

    public static void setGenericsData(SourceDataFile data, List<TypeVariableSource<JavaClassSource>> generics) {
        data.put(GENERIC_DATA_INFOS, generics);
    }

}
