package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.C19766p0;
import kotlinx.coroutines.C19770q1;
import kotlinx.coroutines.internal.C19729m;
import p768rq.C20153b;

/* renamed from: kotlinx.coroutines.android.c */
public final class C19470c extends C19471d {
    private volatile C19470c _immediate;

    /* renamed from: c */
    public final Handler f43404c;

    /* renamed from: d */
    public final String f43405d;

    /* renamed from: e */
    public final boolean f43406e;

    /* renamed from: f */
    public final C19470c f43407f;

    public C19470c() {
        throw null;
    }

    public C19470c(Handler handler, String str, boolean z) {
        this.f43404c = handler;
        this.f43405d = str;
        this.f43406e = z;
        this._immediate = z ? this : null;
        C19470c cVar = this._immediate;
        if (cVar == null) {
            cVar = new C19470c(handler, str, true);
            this._immediate = cVar;
        }
        this.f43407f = cVar;
    }

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f43404c.post(runnable)) {
            mo72112F0(coroutineContext, runnable);
        }
    }

    /* renamed from: C0 */
    public final boolean mo10805C0(CoroutineContext coroutineContext) {
        return !this.f43406e || !C19383o.m32792b(Looper.myLooper(), this.f43404c.getLooper());
    }

    /* renamed from: E0 */
    public final C19764o1 mo72111E0() {
        return this.f43407f;
    }

    /* renamed from: F0 */
    public final void mo72112F0(CoroutineContext coroutineContext, Runnable runnable) {
        C1993m.m4372r(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C19760n0.f43720b.mo7108A0(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19470c) && ((C19470c) obj).f43404c == this.f43404c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f43404c);
    }

    /* renamed from: i */
    public final C19766p0 mo72115i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Handler handler = this.f43404c;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new C19468a(this, runnable);
        }
        mo72112F0(coroutineContext, runnable);
        return C19770q1.f43725b;
    }

    /* renamed from: t */
    public final void mo72116t(long j, C19753l lVar) {
        C19469b bVar = new C19469b(lVar, this);
        Handler handler = this.f43404c;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(bVar, j)) {
            lVar.mo72497O(new HandlerContext$scheduleResumeAfterDelay$1(this, bVar));
        } else {
            mo72112F0(lVar.f43710f, bVar);
        }
    }

    public final String toString() {
        String str;
        C19764o1 o1Var;
        C20153b bVar = C19760n0.f43719a;
        C19764o1 o1Var2 = C19729m.f43681a;
        if (this == o1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                o1Var = o1Var2.mo72111E0();
            } catch (UnsupportedOperationException unused) {
                o1Var = null;
            }
            str = this == o1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f43405d;
        if (str2 == null) {
            str2 = this.f43404c.toString();
        }
        return this.f43406e ? C19383o.m32802l(".immediate", str2) : str2;
    }

    public C19470c(Handler handler) {
        this(handler, (String) null, false);
    }
}
