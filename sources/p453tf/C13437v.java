package p453tf;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p365hg.C12879l0;
import p401mg.C13080a;
import p453tf.C13426p;

/* renamed from: tf.v */
public final class C13437v extends FilterOutputStream implements C13439w {

    /* renamed from: b */
    public final long f29431b = C13418j.f29388h.get();

    /* renamed from: c */
    public long f29432c;

    /* renamed from: d */
    public long f29433d;

    /* renamed from: e */
    public C13440x f29434e;

    /* renamed from: f */
    public final C13426p f29435f;

    /* renamed from: g */
    public final Map<GraphRequest, C13440x> f29436g;

    /* renamed from: h */
    public final long f29437h;

    /* renamed from: tf.v$a */
    public static final class C13438a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C13437v f29438b;

        /* renamed from: c */
        public final /* synthetic */ C13426p.C13427a f29439c;

        public C13438a(C13437v vVar, C13426p.C13427a aVar) {
            this.f29438b = vVar;
            this.f29439c = aVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    C13426p pVar = this.f29438b.f29435f;
                    ((C13426p.C13428b) this.f29439c).mo46105b();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13437v(FilterOutputStream filterOutputStream, C13426p pVar, HashMap hashMap, long j) {
        super(filterOutputStream);
        C19383o.m32797g(hashMap, "progressMap");
        this.f29435f = pVar;
        this.f29436g = hashMap;
        this.f29437h = j;
        String str = C13418j.f29381a;
        C12879l0.m20603g();
    }

    /* renamed from: a */
    public final void mo46109a(GraphRequest graphRequest) {
        this.f29434e = graphRequest != null ? this.f29436g.get(graphRequest) : null;
    }

    /* renamed from: b */
    public final void mo46114b(long j) {
        C13440x xVar = this.f29434e;
        if (xVar != null) {
            long j2 = xVar.f29441b + j;
            xVar.f29441b = j2;
            if (j2 >= xVar.f29442c + xVar.f29440a || j2 >= xVar.f29443d) {
                xVar.mo46121a();
            }
        }
        long j3 = this.f29432c + j;
        this.f29432c = j3;
        if (j3 >= this.f29433d + this.f29431b || j3 >= this.f29437h) {
            mo46116d();
        }
    }

    public final void close() throws IOException {
        super.close();
        for (C13440x a : this.f29436g.values()) {
            a.mo46121a();
        }
        mo46116d();
    }

    /* renamed from: d */
    public final void mo46116d() {
        if (this.f29432c > this.f29433d) {
            Iterator it = this.f29435f.f29414e.iterator();
            while (it.hasNext()) {
                C13426p.C13427a aVar = (C13426p.C13427a) it.next();
                if (aVar instanceof C13426p.C13428b) {
                    Handler handler = this.f29435f.f29411b;
                    if (handler != null) {
                        handler.post(new C13438a(this, aVar));
                    } else {
                        ((C13426p.C13428b) aVar).mo46105b();
                    }
                }
            }
            this.f29433d = this.f29432c;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        C19383o.m32797g(bArr, "buffer");
        this.out.write(bArr);
        mo46114b((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C19383o.m32797g(bArr, "buffer");
        this.out.write(bArr, i, i2);
        mo46114b((long) i2);
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        mo46114b(1);
    }
}
