package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19933c;
import p735br.C18980c;
import p756lr.C19888c0;
import p756lr.C19890d0;
import p756lr.C19893f;
import p756lr.C19896h;
import p756lr.C19897i;
import p756lr.C19912w;

/* renamed from: okhttp3.internal.cache.b */
public final class C19958b implements C19888c0 {

    /* renamed from: b */
    public boolean f44109b;

    /* renamed from: c */
    public final /* synthetic */ C19897i f44110c;

    /* renamed from: d */
    public final /* synthetic */ C19959c f44111d;

    /* renamed from: e */
    public final /* synthetic */ C19896h f44112e;

    public C19958b(C19897i iVar, C19933c.C19938d dVar, C19912w wVar) {
        this.f44110c = iVar;
        this.f44111d = dVar;
        this.f44112e = wVar;
    }

    /* renamed from: J */
    public final long mo68544J(C19893f fVar, long j) throws IOException {
        C19383o.m32797g(fVar, "sink");
        try {
            long J = this.f44110c.mo68544J(fVar, j);
            if (J == -1) {
                if (!this.f44109b) {
                    this.f44109b = true;
                    this.f44112e.close();
                }
                return -1;
            }
            fVar.mo72735f(this.f44112e.mo72745l(), fVar.f43876c - J, J);
            this.f44112e.mo72706A();
            return J;
        } catch (IOException e) {
            if (!this.f44109b) {
                this.f44109b = true;
                this.f44111d.abort();
            }
            throw e;
        }
    }

    public final void close() throws IOException {
        if (!this.f44109b && !C18980c.m32103g(this, TimeUnit.MILLISECONDS)) {
            this.f44109b = true;
            this.f44111d.abort();
        }
        this.f44110c.close();
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f44110c.mo68547m();
    }
}
