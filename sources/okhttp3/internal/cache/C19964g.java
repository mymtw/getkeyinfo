package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p756lr.C19882a0;
import p756lr.C19893f;
import p756lr.C19899k;

/* renamed from: okhttp3.internal.cache.g */
public final class C19964g extends C19899k {

    /* renamed from: c */
    public boolean f44119c;

    /* renamed from: d */
    public final C19857l<IOException, C19394m> f44120d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19964g(C19882a0 a0Var, C19857l<? super IOException, C19394m> lVar) {
        super(a0Var);
        C19383o.m32797g(a0Var, "delegate");
        this.f44120d = lVar;
    }

    /* renamed from: O */
    public final void mo68512O(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "source");
        if (this.f44119c) {
            fVar.skip(j);
            return;
        }
        try {
            super.mo68512O(fVar, j);
        } catch (IOException e) {
            this.f44119c = true;
            this.f44120d.invoke(e);
        }
    }

    public final void close() {
        if (!this.f44119c) {
            try {
                super.close();
            } catch (IOException e) {
                this.f44119c = true;
                this.f44120d.invoke(e);
            }
        }
    }

    public final void flush() {
        if (!this.f44119c) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f44119c = true;
                this.f44120d.invoke(e);
            }
        }
    }
}
