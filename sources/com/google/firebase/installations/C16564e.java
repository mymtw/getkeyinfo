package com.google.firebase.installations;

import com.google.firebase.installations.local.C16573b;
import p605kk.C18124h;

/* renamed from: com.google.firebase.installations.e */
public final class C16564e implements C16569i {

    /* renamed from: a */
    public final C16570j f36761a;

    /* renamed from: b */
    public final C18124h<C16566g> f36762b;

    public C16564e(C16570j jVar, C18124h<C16566g> hVar) {
        this.f36761a = jVar;
        this.f36762b = hVar;
    }

    /* renamed from: a */
    public final boolean mo59079a(Exception exc) {
        this.f36762b.mo69679c(exc);
        return true;
    }

    /* renamed from: b */
    public final boolean mo59080b(C16573b bVar) {
        if (!bVar.isRegistered() || this.f36761a.mo59081a(bVar)) {
            return false;
        }
        this.f36762b.mo69678b(C16566g.builder().setToken(bVar.getAuthToken()).setTokenExpirationTimestamp(bVar.getExpiresInSecs()).setTokenCreationTimestamp(bVar.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
