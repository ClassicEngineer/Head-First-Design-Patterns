package ru.daniladeveloper.patterns.builder;

public class Lang {
    public static ProgrammBuildStage build() {
        return new LangBuilder().build();
    }
}
