package kotlinx.coroutines.channels;

import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.Result;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p383ke.C12995a;

/* renamed from: kotlinx.coroutines.channels.v */
public class C19521v<E> extends C19518t {

    /* renamed from: e */
    public final E f43455e;

    /* renamed from: f */
    public final C19747k<C19394m> f43456f;

    public C19521v(Object obj, C19753l lVar) {
        this.f43455e = obj;
        this.f43456f = lVar;
    }

    /* renamed from: F */
    public final void mo72203F() {
        this.f43456f.mo72501m();
    }

    /* renamed from: G */
    public final E mo72204G() {
        return this.f43455e;
    }

    /* renamed from: H */
    public final void mo72205H(C19509k<?> kVar) {
        C19747k<C19394m> kVar2 = this.f43456f;
        Throwable th = kVar.f43452e;
        if (th == null) {
            th = new ClosedSendChannelException("Channel was closed");
        }
        kVar2.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
    }

    /* renamed from: I */
    public final C19736t mo72206I(LockFreeLinkedListNode.C19714c cVar) {
        if (this.f43456f.mo72499i(C19394m.f43287a, cVar == null ? null : cVar.f43645c) == null) {
            return null;
        }
        if (cVar != null) {
            cVar.mo72437d();
        }
        return C12995a.f28606b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C19543e0.m33300R(this));
        sb.append('(');
        return C0073e.m209i(sb, this.f43455e, ')');
    }
}
