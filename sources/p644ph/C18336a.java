package p644ph;

import android.support.p013v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import p513bj.C14049b0;
import p513bj.C14075p;
import p644ph.C18364t;

/* renamed from: ph.a */
public abstract class C18336a {

    /* renamed from: a */
    public final C18337a f40256a;

    /* renamed from: b */
    public final C18342f f40257b;

    /* renamed from: c */
    public C18339c f40258c;

    /* renamed from: d */
    public final int f40259d;

    /* renamed from: ph.a$a */
    public static class C18337a implements C18364t {

        /* renamed from: a */
        public final C18340d f40260a;

        /* renamed from: b */
        public final long f40261b;

        /* renamed from: c */
        public final long f40262c = 0;

        /* renamed from: d */
        public final long f40263d;

        /* renamed from: e */
        public final long f40264e;

        /* renamed from: f */
        public final long f40265f;

        /* renamed from: g */
        public final long f40266g;

        public C18337a(C18340d dVar, long j, long j2, long j3, long j4, long j5) {
            this.f40260a = dVar;
            this.f40261b = j;
            this.f40263d = j2;
            this.f40264e = j3;
            this.f40265f = j4;
            this.f40266g = j5;
        }

        /* renamed from: d */
        public final C18364t.C18365a mo47833d(long j) {
            C18367u uVar = new C18367u(j, C18339c.m30971a(this.f40260a.mo13304b(j), this.f40262c, this.f40263d, this.f40264e, this.f40265f, this.f40266g));
            return new C18364t.C18365a(uVar, uVar);
        }

        /* renamed from: g */
        public final boolean mo47834g() {
            return true;
        }

        /* renamed from: i */
        public final long mo47835i() {
            return this.f40261b;
        }
    }

    /* renamed from: ph.a$b */
    public static final class C18338b implements C18340d {
        /* renamed from: b */
        public final long mo13304b(long j) {
            return j;
        }
    }

    /* renamed from: ph.a$c */
    public static class C18339c {

        /* renamed from: a */
        public final long f40267a;

        /* renamed from: b */
        public final long f40268b;

        /* renamed from: c */
        public final long f40269c;

        /* renamed from: d */
        public long f40270d;

        /* renamed from: e */
        public long f40271e;

        /* renamed from: f */
        public long f40272f;

        /* renamed from: g */
        public long f40273g;

        /* renamed from: h */
        public long f40274h;

        public C18339c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f40267a = j;
            this.f40268b = j2;
            this.f40270d = j3;
            this.f40271e = j4;
            this.f40272f = j5;
            this.f40273g = j6;
            this.f40269c = j7;
            this.f40274h = m30971a(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: a */
        public static long m30971a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return C14049b0.m21637j(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    /* renamed from: ph.a$d */
    public interface C18340d {
        /* renamed from: b */
        long mo13304b(long j);
    }

    /* renamed from: ph.a$e */
    public static final class C18341e {

        /* renamed from: d */
        public static final C18341e f40275d = new C18341e(-9223372036854775807L, -1, -3);

        /* renamed from: a */
        public final int f40276a;

        /* renamed from: b */
        public final long f40277b;

        /* renamed from: c */
        public final long f40278c;

        public C18341e(long j, long j2, int i) {
            this.f40276a = i;
            this.f40277b = j;
            this.f40278c = j2;
        }

        /* renamed from: a */
        public static C18341e m30973a(long j) {
            return new C18341e(-9223372036854775807L, j, 0);
        }
    }

    /* renamed from: ph.a$f */
    public interface C18342f {
        /* renamed from: a */
        C18341e mo69868a(C18346e eVar, long j) throws IOException;

        /* renamed from: b */
        void mo69869b() {
        }
    }

    public C18336a(C18340d dVar, C18342f fVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.f40257b = fVar;
        this.f40259d = i;
        this.f40256a = new C18337a(dVar, j, j2, j3, j4, j5);
    }

    /* renamed from: b */
    public static int m30964b(C18346e eVar, long j, C18363s sVar) {
        if (j == eVar.f40294d) {
            return 0;
        }
        sVar.f40327a = j;
        return 1;
    }

    /* renamed from: a */
    public final int mo69866a(C18346e eVar, C18363s sVar) throws IOException {
        boolean z;
        C18346e eVar2 = eVar;
        C18363s sVar2 = sVar;
        while (true) {
            C18339c cVar = this.f40258c;
            C14075p.m21696h(cVar);
            long j = cVar.f40272f;
            long j2 = cVar.f40273g;
            long j3 = cVar.f40274h;
            if (j2 - j <= ((long) this.f40259d)) {
                this.f40258c = null;
                this.f40257b.mo69869b();
                return m30964b(eVar2, j, sVar2);
            }
            long j4 = j3 - eVar2.f40294d;
            if (j4 < 0 || j4 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                z = false;
            } else {
                eVar2.mo69879j((int) j4);
                z = true;
            }
            if (!z) {
                return m30964b(eVar2, j3, sVar2);
            }
            eVar2.f40296f = 0;
            C18341e a = this.f40257b.mo69868a(eVar2, cVar.f40268b);
            int i = a.f40276a;
            if (i == -3) {
                this.f40258c = null;
                this.f40257b.mo69869b();
                return m30964b(eVar2, j3, sVar2);
            } else if (i == -2) {
                long j5 = a.f40277b;
                long j6 = a.f40278c;
                cVar.f40270d = j5;
                cVar.f40272f = j6;
                cVar.f40274h = C18339c.m30971a(cVar.f40268b, j5, cVar.f40271e, j6, cVar.f40273g, cVar.f40269c);
            } else if (i == -1) {
                long j7 = a.f40277b;
                long j8 = a.f40278c;
                cVar.f40271e = j7;
                cVar.f40273g = j8;
                cVar.f40274h = C18339c.m30971a(cVar.f40268b, cVar.f40270d, j7, cVar.f40272f, j8, cVar.f40269c);
            } else if (i == 0) {
                long j9 = a.f40278c - eVar2.f40294d;
                if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    eVar2.mo69879j((int) j9);
                }
                this.f40258c = null;
                this.f40257b.mo69869b();
                return m30964b(eVar2, a.f40278c, sVar2);
            } else {
                throw new IllegalStateException("Invalid case");
            }
        }
    }

    /* renamed from: c */
    public final void mo69867c(long j) {
        long j2 = j;
        C18339c cVar = this.f40258c;
        if (cVar == null || cVar.f40267a != j2) {
            long b = this.f40256a.f40260a.mo13304b(j2);
            C18337a aVar = this.f40256a;
            C18339c cVar2 = r1;
            C18339c cVar3 = new C18339c(j, b, aVar.f40262c, aVar.f40263d, aVar.f40264e, aVar.f40265f, aVar.f40266g);
            this.f40258c = cVar2;
        }
    }
}
