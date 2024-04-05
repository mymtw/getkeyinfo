package com.google.common.hash;

enum Funnels$UnencodedCharsFunnel implements Funnel<CharSequence> {
    INSTANCE;

    public String toString() {
        return "Funnels.unencodedCharsFunnel()";
    }

    public void funnel(CharSequence charSequence, C16276j jVar) {
        C16269c cVar = (C16269c) jVar;
        cVar.getClass();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            cVar.mo57876j(charSequence.charAt(i));
        }
    }
}
