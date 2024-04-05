package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import kotlin.C19394m;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: kotlinx.coroutines.t1 */
public final class C19822t1 extends C19524d {

    /* renamed from: b */
    public final LockFreeLinkedListNode f43825b;

    public C19822t1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f43825b = lockFreeLinkedListNode;
    }

    /* renamed from: a */
    public final void mo72155a(Throwable th) {
        this.f43825b.mo72219A();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72155a((Throwable) obj);
        return C19394m.f43287a;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("RemoveOnCancel[");
        h.append(this.f43825b);
        h.append(']');
        return h.toString();
    }
}
