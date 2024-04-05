package com.cardinalcommerce.dependencies.internal.bouncycastle.asn1;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.s */
public class C6148s extends IllegalStateException {

    /* renamed from: a */
    private Throwable f13285a;

    public C6148s(String str) {
        super(str);
    }

    public C6148s(String str, Throwable th) {
        super(str);
        this.f13285a = th;
    }

    public Throwable getCause() {
        return this.f13285a;
    }
}
