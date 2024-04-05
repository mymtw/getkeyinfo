package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.C14216b;
import java.io.IOException;
import java.util.UUID;
import p635oh.C18292b;

public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: g */
    static void m22143g(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession != drmSession2) {
            if (drmSession2 != null) {
                drmSession2.mo47273a((C14216b.C14217a) null);
            }
            if (drmSession != null) {
                drmSession.mo47274b((C14216b.C14217a) null);
            }
        }
    }

    /* renamed from: a */
    void mo47273a(C14216b.C14217a aVar);

    /* renamed from: b */
    void mo47274b(C14216b.C14217a aVar);

    /* renamed from: c */
    UUID mo47275c();

    /* renamed from: d */
    boolean mo47276d() {
        return false;
    }

    /* renamed from: e */
    C18292b mo47277e();

    /* renamed from: f */
    DrmSessionException mo47278f();

    int getState();
}
