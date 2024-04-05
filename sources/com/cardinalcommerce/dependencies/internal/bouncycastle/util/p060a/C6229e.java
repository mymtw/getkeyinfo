package com.cardinalcommerce.dependencies.internal.bouncycastle.util.p060a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.util.a.e */
public class C6229e extends IllegalStateException {

    /* renamed from: a */
    private Throwable f13561a;

    public C6229e(String str, Throwable th) {
        super(str);
        this.f13561a = th;
    }

    public Throwable getCause() {
        return this.f13561a;
    }
}
