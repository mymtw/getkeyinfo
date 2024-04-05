package com.google.firebase.installations;

import com.google.firebase.installations.local.C16573b;
import p605kk.C18124h;

/* renamed from: com.google.firebase.installations.f */
public final class C16565f implements C16569i {

    /* renamed from: a */
    public final C18124h<String> f36763a;

    public C16565f(C18124h<String> hVar) {
        this.f36763a = hVar;
    }

    /* renamed from: a */
    public final boolean mo59079a(Exception exc) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo59080b(C16573b bVar) {
        if (!bVar.isUnregistered() && !bVar.isRegistered() && !bVar.isErrored()) {
            return false;
        }
        this.f36763a.mo69680d(bVar.getFirebaseInstallationId());
        return true;
    }
}
