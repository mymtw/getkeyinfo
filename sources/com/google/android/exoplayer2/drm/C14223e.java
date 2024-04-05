package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.UUID;
import p594jh.C17912g;
import p635oh.C18292b;

/* renamed from: com.google.android.exoplayer2.drm.e */
public final class C14223e implements DrmSession {

    /* renamed from: a */
    public final DrmSession.DrmSessionException f31571a;

    public C14223e(DrmSession.DrmSessionException drmSessionException) {
        this.f31571a = drmSessionException;
    }

    /* renamed from: a */
    public final void mo47273a(C14216b.C14217a aVar) {
    }

    /* renamed from: b */
    public final void mo47274b(C14216b.C14217a aVar) {
    }

    /* renamed from: c */
    public final UUID mo47275c() {
        return C17912g.f38897a;
    }

    /* renamed from: d */
    public final boolean mo47276d() {
        return false;
    }

    /* renamed from: e */
    public final C18292b mo47277e() {
        return null;
    }

    /* renamed from: f */
    public final DrmSession.DrmSessionException mo47278f() {
        return this.f31571a;
    }

    public final int getState() {
        return 1;
    }
}
