package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.b */
public class C6173b extends BadPaddingException {

    /* renamed from: a */
    private final Throwable f13409a;

    public C6173b(String str, Throwable th) {
        super(str);
        this.f13409a = th;
    }

    public Throwable getCause() {
        return this.f13409a;
    }
}
