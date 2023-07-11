package ru.daniladeveloper.patterns.builder;

import javax.lang.model.element.Modifier;

public class ProgrammBuildStage extends BuildStage {

    public ProgrammBuildStage() {
        all = new LangCode();
    }

    public ClassBuildStage buildClass() {
        ClassName name = RandomUtil.getRandomClassName();
        String modifier = Modifier.PUBLIC.toString();

        all.append(modifier).wh().append(name).blockStart()
            .newLine()
            .addMacros(Macros.CLASS_CONTENT).newLine()
            .blockEnd();

        return new ClassBuildStage(all);
    }

    public BuildStage buildClass(ClassName name) {
        return null;
    }

    public BuildStage buildClass(ClassName name, Modifier... modifiers) {
        return null;
    }


    public TerminalBuildStage hello() {
        LangCode code = LangCode.fromString("System.out.println(\"AhaHAHAHAHAH\")");
        return buildClass().buildMainWithCode(code).death();
    }
}
