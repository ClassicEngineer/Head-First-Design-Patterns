package ru.daniladeveloper.patterns.builder;

public class TerminalBuildStage extends BuildStage {

    public TerminalBuildStage(LangCode code) {
        this.all = code.compile();
    }

    public void show() {
        System.out.println(all);
    }

    public void run() {
        System.out.println(all);
    }


}
