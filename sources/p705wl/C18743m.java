package p705wl;

import java.security.GeneralSecurityException;
import java.util.Set;
import p705wl.C18745o;

/* renamed from: wl.m */
public final class C18743m implements C18745o.C18746a {

    /* renamed from: a */
    public final /* synthetic */ C18731e f41517a;

    public C18743m(C18731e eVar) {
        this.f41517a = eVar;
    }

    /* renamed from: a */
    public final Class<?> mo70234a() {
        return this.f41517a.getClass();
    }

    /* renamed from: b */
    public final Set<Class<?>> mo70235b() {
        return this.f41517a.f41502b.keySet();
    }

    /* renamed from: c */
    public final C18730d mo70236c(Class cls) throws GeneralSecurityException {
        try {
            return new C18730d(this.f41517a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final C18730d mo70237d() {
        C18731e eVar = this.f41517a;
        return new C18730d(eVar, eVar.f41503c);
    }
}
