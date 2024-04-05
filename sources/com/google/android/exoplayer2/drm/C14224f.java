package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p635oh.C18292b;

/* renamed from: com.google.android.exoplayer2.drm.f */
public interface C14224f {

    /* renamed from: com.google.android.exoplayer2.drm.f$a */
    public static final class C14225a {

        /* renamed from: a */
        public final byte[] f31572a;

        /* renamed from: b */
        public final String f31573b;

        public C14225a(String str, byte[] bArr) {
            this.f31572a = bArr;
            this.f31573b = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.f$b */
    public interface C14226b {
    }

    /* renamed from: com.google.android.exoplayer2.drm.f$c */
    public interface C14227c {
        /* renamed from: e */
        C14224f mo39e(UUID uuid);
    }

    /* renamed from: com.google.android.exoplayer2.drm.f$d */
    public static final class C14228d {

        /* renamed from: a */
        public final byte[] f31574a;

        /* renamed from: b */
        public final String f31575b;

        public C14228d(byte[] bArr, String str) {
            this.f31574a = bArr;
            this.f31575b = str;
        }
    }

    /* renamed from: a */
    Class<? extends C18292b> mo47335a();

    /* renamed from: b */
    Map<String, String> mo47336b(byte[] bArr);

    /* renamed from: c */
    C18292b mo47337c(byte[] bArr) throws MediaCryptoException;

    /* renamed from: d */
    C14228d mo47338d();

    /* renamed from: e */
    byte[] mo47339e() throws MediaDrmException;

    /* renamed from: f */
    void mo47340f(byte[] bArr, byte[] bArr2);

    /* renamed from: g */
    void mo47341g(byte[] bArr) throws DeniedByServerException;

    /* renamed from: h */
    void mo47342h(DefaultDrmSessionManager.C14208b bVar);

    /* renamed from: i */
    void mo47343i(byte[] bArr);

    /* renamed from: j */
    byte[] mo47344j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: k */
    C14225a mo47345k(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    void release();
}
