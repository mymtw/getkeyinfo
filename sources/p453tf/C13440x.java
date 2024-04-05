package p453tf;

import android.os.Handler;
import com.facebook.GraphRequest;
import p365hg.C12879l0;
import p401mg.C13080a;

/* renamed from: tf.x */
public final class C13440x {

    /* renamed from: a */
    public final long f29440a = C13418j.f29388h.get();

    /* renamed from: b */
    public long f29441b;

    /* renamed from: c */
    public long f29442c;

    /* renamed from: d */
    public long f29443d;

    /* renamed from: e */
    public final Handler f29444e;

    /* renamed from: f */
    public final GraphRequest f29445f;

    /* renamed from: tf.x$a */
    public static final class C13441a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ GraphRequest.C12195b f29446b;

        public C13441a(GraphRequest.C12195b bVar, long j, long j2) {
            this.f29446b = bVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    ((GraphRequest.C12199f) this.f29446b).onProgress();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    public C13440x(Handler handler, GraphRequest graphRequest) {
        this.f29444e = handler;
        this.f29445f = graphRequest;
        String str = C13418j.f29381a;
        C12879l0.m20603g();
    }

    /* renamed from: a */
    public final void mo46121a() {
        long j = this.f29441b;
        if (j > this.f29442c) {
            GraphRequest.C12195b bVar = this.f29445f.f27231g;
            long j2 = this.f29443d;
            if (j2 > 0 && (bVar instanceof GraphRequest.C12199f)) {
                Handler handler = this.f29444e;
                if (handler != null) {
                    handler.post(new C13441a(bVar, j, j2));
                } else {
                    ((GraphRequest.C12199f) bVar).onProgress();
                }
                this.f29442c = this.f29441b;
            }
        }
    }
}
