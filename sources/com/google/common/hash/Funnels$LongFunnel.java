package com.google.common.hash;

enum Funnels$LongFunnel implements Funnel<Long> {
    INSTANCE;

    public String toString() {
        return "Funnels.longFunnel()";
    }

    public void funnel(Long l, C16276j jVar) {
        jVar.mo57871b(l.longValue());
    }
}
