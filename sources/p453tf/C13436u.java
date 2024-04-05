package p453tf;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: tf.u */
public final class C13436u extends OutputStream implements C13439w {

    /* renamed from: b */
    public final HashMap f29426b = new HashMap();

    /* renamed from: c */
    public GraphRequest f29427c;

    /* renamed from: d */
    public C13440x f29428d;

    /* renamed from: e */
    public int f29429e;

    /* renamed from: f */
    public final Handler f29430f;

    public C13436u(Handler handler) {
        this.f29430f = handler;
    }

    /* renamed from: a */
    public final void mo46109a(GraphRequest graphRequest) {
        this.f29427c = graphRequest;
        this.f29428d = graphRequest != null ? (C13440x) this.f29426b.get(graphRequest) : null;
    }

    /* renamed from: b */
    public final void mo46110b(long j) {
        GraphRequest graphRequest = this.f29427c;
        if (graphRequest != null) {
            if (this.f29428d == null) {
                C13440x xVar = new C13440x(this.f29430f, graphRequest);
                this.f29428d = xVar;
                this.f29426b.put(graphRequest, xVar);
            }
            C13440x xVar2 = this.f29428d;
            if (xVar2 != null) {
                xVar2.f29443d += j;
            }
            this.f29429e += (int) j;
        }
    }

    public final void write(byte[] bArr) {
        C19383o.m32797g(bArr, "buffer");
        mo46110b((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        C19383o.m32797g(bArr, "buffer");
        mo46110b((long) i2);
    }

    public final void write(int i) {
        mo46110b(1);
    }
}
