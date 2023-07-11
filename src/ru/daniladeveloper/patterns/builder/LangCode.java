package ru.daniladeveloper.patterns.builder;


import java.util.HashMap;
import java.util.Map;


public class LangCode  {
    @Override
    public String toString() {
        return content.toString();
    }

    private StringBuilder content;

    private HashMap<Macros, LangCode> macrosToValue;

    public LangCode() {
        this.content = new StringBuilder();
        this.macrosToValue = new HashMap<>();
    }

    public LangCode(LangCode code) {
        this.content = new StringBuilder(code.content);
        this.macrosToValue = new HashMap<>();
    }

    public static LangCode empty () {
        return new LangCode();
    }

    public  LangCode addMacros(Macros macros) {
      this.content.append(macros);
      this.macrosToValue.putIfAbsent(macros, empty());
      return this;
    }

    public static LangCode fromString(String code) {
        LangCode LangCode = new LangCode();
        LangCode.append(code);
        return LangCode;
    }

    public LangCode append(String code) {
        this.content.append(code);
        return this;
    }

    public LangCode append(Object code) {
        this.content.append(code);
        return this;
    }

    public LangCode newLine(){
        this.content.append("\n");
        return this;
    }

    public LangCode wh(){
        this.content.append(" ");
        return this;
    }

    public LangCode blockStart(){
        this.content.append("{");
        return this;
    }


    public LangCode code(LangCode code) {
        this.content.append(code.content);
        return this;
    }

    public LangCode blockEnd() {
        this.content.append("}");
        return this;
    }

    public void putMacros(Macros macros, LangCode code) {
        macrosToValue.put(macros, code);
    }

    public LangCode compile() {
        String result = content.toString();
        for (Map.Entry<Macros, LangCode> entry : macrosToValue.entrySet()) {
            Macros macros = entry.getKey();
            LangCode LangCode = entry.getValue();
            result = result.replaceAll(String.valueOf(macros),
                LangCode.content.toString());
        }
        return LangCode.fromString(result);
    }

    public LangCode ident() {
        content.append(" ");
        return this;
    }
}
