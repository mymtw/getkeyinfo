package com.google.common.hash;

enum Funnels$IntegerFunnel implements Funnel<Integer> {
    INSTANCE;

    public String toString() {
        return "Funnels.integerFunnel()";
    }

    public void funnel(Integer num, C16276j jVar) {
        jVar.mo57870a(num.intValue());
    }
}
