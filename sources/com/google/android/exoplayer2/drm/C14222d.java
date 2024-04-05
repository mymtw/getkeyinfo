package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.C14224f;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p635oh.C18292b;
import p635oh.C18295e;

/* renamed from: com.google.android.exoplayer2.drm.d */
public final class C14222d implements C14224f {
    /* renamed from: a */
    public final Class<C18295e> mo47335a() {
        return C18295e.class;
    }

    /* renamed from: b */
    public final Map<String, String> mo47336b(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final C18292b mo47337c(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final C14224f.C14228d mo47338d() {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final byte[] mo47339e() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    /* renamed from: f */
    public final void mo47340f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public final void mo47341g(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final void mo47342h(DefaultDrmSessionManager.C14208b bVar) {
    }

    /* renamed from: i */
    public final void mo47343i(byte[] bArr) {
    }

    /* renamed from: j */
    public final byte[] mo47344j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public final C14224f.C14225a mo47345k(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    public final void release() {
    }
}
