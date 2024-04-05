package com.google.common.hash;

enum Funnels$ByteArrayFunnel implements Funnel<byte[]> {
    INSTANCE;

    public String toString() {
        return "Funnels.byteArrayFunnel()";
    }

    public void funnel(byte[] bArr, C16276j jVar) {
        jVar.mo57889c(bArr);
    }
}
