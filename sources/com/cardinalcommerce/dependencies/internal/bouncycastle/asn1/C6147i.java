package com.cardinalcommerce.dependencies.internal.bouncycastle.asn1;

import java.io.IOException;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.i */
public class C6147i extends IOException {

    /* renamed from: a */
    private Throwable f13284a;

    public C6147i(String str) {
        super(str);
    }

    public C6147i(String str, Throwable th) {
        super(str);
        this.f13284a = th;
    }

    public Throwable getCause() {
        return this.f13284a;
    }
}
