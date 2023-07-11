package ru.daniladeveloper.patterns.builder;

public class ClassBuildStage extends BuildStage {

    private static final LangCode MAIN_FUNCTION = LangCode.fromString("public static void main(String[] args)");

    public ClassBuildStage(LangCode code) {
        this.all = code;
    }


    public FunctionBuildStage buildMainWithCode(LangCode content) {
        LangCode mainFunction = new LangCode(MAIN_FUNCTION).wh()
            .blockStart().newLine()
            .ident()
            .addMacros(Macros.FUNCTION_CONTENT).newLine()
            .blockEnd();

        all.putMacros(Macros.CLASS_CONTENT, mainFunction);

        return new FunctionBuildStage(mainFunction, content);
    }

    public FunctionBuildStage buildMain() {
        this.all.append(MAIN_FUNCTION).wh().blockStart();
        return new FunctionBuildStage(this.all);
    }
}
