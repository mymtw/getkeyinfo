package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.drm.C14216b;
import java.io.IOException;
import p505aj.C14003j;
import p505aj.C14014t;
import p594jh.C17939k1;
import p594jh.C17954o0;
import p595ji.C17994f;

/* renamed from: com.google.android.exoplayer2.source.i */
public interface C14344i {

    /* renamed from: com.google.android.exoplayer2.source.i$a */
    public static final class C14345a extends C17994f {
        public C14345a(Object obj) {
            super(obj, -1);
        }

        /* renamed from: b */
        public final C14345a mo47785b(Object obj) {
            C17994f fVar;
            if (this.f39346a.equals(obj)) {
                fVar = this;
            } else {
                fVar = new C17994f(this.f39347b, this.f39348c, this.f39350e, this.f39349d, obj);
            }
            return new C14345a(fVar);
        }

        public C14345a(Object obj, int i, long j) {
            super(-1, -1, i, j, obj);
        }

        public C14345a(C17994f fVar) {
            super(fVar);
        }

        public C14345a(Object obj, long j, int i, int i2) {
            super(i, i2, -1, j, obj);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.i$b */
    public interface C14346b {
        /* renamed from: a */
        void mo47786a(C14344i iVar, C17939k1 k1Var);
    }

    /* renamed from: a */
    void mo47650a(C14346b bVar);

    /* renamed from: b */
    void mo47651b(Handler handler, C14347j jVar);

    /* renamed from: c */
    void mo47652c(C14347j jVar);

    /* renamed from: d */
    void mo47653d(C14346b bVar, C14014t tVar);

    /* renamed from: e */
    C17954o0 mo47622e();

    /* renamed from: f */
    void mo47623f(C14304h hVar);

    /* renamed from: g */
    void mo47654g(C14346b bVar);

    /* renamed from: h */
    C14304h mo47624h(C14345a aVar, C14003j jVar, long j);

    /* renamed from: i */
    void mo47655i(C14346b bVar);

    /* renamed from: j */
    void mo47656j(Handler handler, C14216b bVar);

    /* renamed from: k */
    void mo47657k(C14216b bVar);

    /* renamed from: l */
    void mo47625l() throws IOException;
}
