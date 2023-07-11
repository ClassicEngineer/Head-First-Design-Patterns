package ru.daniladeveloper.patterns.builder;

public abstract class BuildStage {

    LangCode all;


    TerminalBuildStage death() {
        return new TerminalBuildStage(all);
    }
}
