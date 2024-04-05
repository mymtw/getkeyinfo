package p190n6;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.p054a.C6162c;
import java.util.HashMap;
import java.util.HashSet;
import p008a7.C0041a;
import p199o6.C7623d;

/* renamed from: n6.a */
public final class C7485a implements C0041a {

    /* renamed from: a */
    public ThreadLocal f16685a = new ThreadLocal();

    /* renamed from: b */
    public volatile HashSet f16686b;

    /* renamed from: c */
    public volatile HashMap f16687c;

    static {
        new C6162c("BC", "threadLocalEcImplicitlyCa");
        new C6162c("BC", "ecImplicitlyCa");
        new C6162c("BC", "threadLocalDhDefaultParams");
        new C6162c("BC", "DhDefaultParams");
        new C6162c("BC", "acceptableEcCurves");
        new C6162c("BC", "additionalEcParameters");
    }

    public C7485a() {
        new ThreadLocal();
        this.f16686b = new HashSet();
        this.f16687c = new HashMap();
    }

    /* renamed from: a */
    public final C7623d mo19824a() {
        C7623d dVar = (C7623d) this.f16685a.get();
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
