package com.titan;

public class IdentifierLoadStoreSlot extends ExpressionType {

    String code;
    int slot;
    public IdentifierLoadStoreSlot(String type, String code, int slot) {
        super(type);
        this.code = code;
        this.slot = slot;
    }

    public String toString() {
        return type + code + " " + slot;
    }
}
