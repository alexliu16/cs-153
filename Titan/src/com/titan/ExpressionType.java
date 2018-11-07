package com.titan;

public class ExpressionType {

    protected String type;

    public ExpressionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isInteger() {
        return type.equals("i");
    }

    public boolean isFloat() {
        return type.equals("f");
    }

    @Override
    public String toString() {
        return "";
    }
}
