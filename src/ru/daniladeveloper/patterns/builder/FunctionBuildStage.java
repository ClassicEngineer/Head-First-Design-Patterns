package ru.daniladeveloper.patterns.builder;

public class FunctionBuildStage extends BuildStage {

    public FunctionBuildStage(LangCode code) {
        this.all = code;
    }


    public FunctionBuildStage(LangCode all, LangCode functionContent) {
        this(all);
        all.putMacros(Macros.FUNCTION_CONTENT, functionContent);
    }

}
