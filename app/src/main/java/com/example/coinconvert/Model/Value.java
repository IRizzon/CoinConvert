package com.example.coinconvert.Model;

public class Value {

    public String Value;
    public String Result;

    public Value(){}

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        this.Result = result;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        this.Value = value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "Value='" + Value + '\'' +
                ", Result='" + Result + '\'' +
                '}';
    }
}
