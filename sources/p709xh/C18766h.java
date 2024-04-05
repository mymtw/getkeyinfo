package p709xh;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18351j;
import p644ph.C18364t;
import p644ph.C18368v;
import p709xh.C18759b;

/* renamed from: xh.h */
public abstract class C18766h {

    /* renamed from: a */
    public final C18762d f41576a = new C18762d();

    /* renamed from: b */
    public C18368v f41577b;

    /* renamed from: c */
    public C18351j f41578c;

    /* renamed from: d */
    public C18764f f41579d;

    /* renamed from: e */
    public long f41580e;

    /* renamed from: f */
    public long f41581f;

    /* renamed from: g */
    public long f41582g;

    /* renamed from: h */
    public int f41583h;

    /* renamed from: i */
    public int f41584i;

    /* renamed from: j */
    public C18767a f41585j = new C18767a();

    /* renamed from: k */
    public long f41586k;

    /* renamed from: l */
    public boolean f41587l;

    /* renamed from: m */
    public boolean f41588m;

    /* renamed from: xh.h$a */
    public static class C18767a {

        /* renamed from: a */
        public Format f41589a;

        /* renamed from: b */
        public C18759b.C18760a f41590b;
    }

    /* renamed from: xh.h$b */
    public static final class C18768b implements C18764f {
        /* renamed from: a */
        public final C18364t mo70246a() {
            return new C18364t.C18366b(-9223372036854775807L);
        }

        /* renamed from: b */
        public final long mo70247b(C18346e eVar) {
            return -1;
        }

        /* renamed from: c */
        public final void mo70248c(long j) {
        }
    }

    /* renamed from: a */
    public void mo70256a(long j) {
        this.f41582g = j;
    }

    /* renamed from: b */
    public abstract long mo70249b(C14077r rVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public abstract boolean mo70250c(C14077r rVar, long j, C18767a aVar) throws IOException;

    /* renamed from: d */
    public void mo70251d(boolean z) {
        if (z) {
            this.f41585j = new C18767a();
            this.f41581f = 0;
            this.f41583h = 0;
        } else {
            this.f41583h = 1;
        }
        this.f41580e = -1;
        this.f41582g = 0;
    }
}
