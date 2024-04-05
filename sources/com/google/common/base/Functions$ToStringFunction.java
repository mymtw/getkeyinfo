package com.google.common.base;

enum Functions$ToStringFunction implements C15784e<Object, String> {
    INSTANCE;

    public String toString() {
        return "Functions.toStringFunction()";
    }

    public String apply(Object obj) {
        obj.getClass();
        return obj.toString();
    }
}
