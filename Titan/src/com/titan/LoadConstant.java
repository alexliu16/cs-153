package com.titan;

public class LoadConstant extends ExpressionType {

    Object value;
    LoadConstant(String type, Object value) {
         super(type);
        this.value = value;
    }

    public String toString() {
        return "ldc " + value;
    }
}
