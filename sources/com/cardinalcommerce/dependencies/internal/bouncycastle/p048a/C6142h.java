package com.cardinalcommerce.dependencies.internal.bouncycastle.p048a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.a.h */
public class C6142h extends Exception {

    /* renamed from: a */
    private Throwable f13282a;

    public C6142h() {
    }

    public C6142h(String str) {
        super(str);
    }

    public C6142h(String str, Throwable th) {
        super(str);
        this.f13282a = th;
    }

    public Throwable getCause() {
        return this.f13282a;
    }
}
