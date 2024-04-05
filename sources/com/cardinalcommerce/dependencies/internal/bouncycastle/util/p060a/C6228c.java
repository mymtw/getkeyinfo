package com.cardinalcommerce.dependencies.internal.bouncycastle.util.p060a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.util.a.c */
public class C6228c extends IllegalStateException {

    /* renamed from: a */
    private Throwable f13560a;

    public C6228c(String str, Throwable th) {
        super(str);
        this.f13560a = th;
    }

    public Throwable getCause() {
        return this.f13560a;
    }
}
