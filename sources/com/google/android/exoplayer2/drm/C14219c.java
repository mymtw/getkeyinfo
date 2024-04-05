package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.DrmSession;
import p010a9.C0048b;
import p635oh.C18292b;
import p635oh.C18295e;

/* renamed from: com.google.android.exoplayer2.drm.c */
public interface C14219c {

    /* renamed from: a */
    public static final C14220a f31569a = new C14220a();

    /* renamed from: com.google.android.exoplayer2.drm.c$a */
    public class C14220a implements C14219c {
        /* renamed from: a */
        public final DrmSession mo47288a(Looper looper, C14216b.C14217a aVar, Format format) {
            if (format.drmInitData == null) {
                return null;
            }
            return new C14223e(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
        }

        /* renamed from: c */
        public final Class<C18295e> mo47290c(Format format) {
            if (format.drmInitData != null) {
                return C18295e.class;
            }
            return null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.c$b */
    public interface C14221b {

        /* renamed from: e0 */
        public static final C0048b f31570e0 = new C0048b();

        void release();
    }

    /* renamed from: a */
    DrmSession mo47288a(Looper looper, C14216b.C14217a aVar, Format format);

    /* renamed from: b */
    C14221b mo47289b(Looper looper, C14216b.C14217a aVar, Format format) {
        return C14221b.f31570e0;
    }

    /* renamed from: c */
    Class<? extends C18292b> mo47290c(Format format);

    void prepare() {
    }

    void release() {
    }
}
