package com.google.android.datatransport.runtime;

import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.C6495c;
import com.google.android.datatransport.C6518e;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.q */
public final class C6558q implements C6518e {

    /* renamed from: a */
    public final Set<C6493a> f14488a;

    /* renamed from: b */
    public final C6556p f14489b;

    /* renamed from: c */
    public final C6560s f14490c;

    public C6558q(Set set, C6556p pVar, C6611t tVar) {
        this.f14488a = set;
        this.f14489b = pVar;
        this.f14490c = tVar;
    }

    /* renamed from: a */
    public final C6559r mo18642a(String str, C6493a aVar, C6495c cVar) {
        if (this.f14488a.contains(aVar)) {
            return new C6559r(this.f14489b, str, aVar, cVar, this.f14490c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{aVar, this.f14488a}));
    }
}
