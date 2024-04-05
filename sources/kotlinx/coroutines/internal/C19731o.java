package kotlinx.coroutines.internal;

import android.support.p013v4.media.C0072d;

/* renamed from: kotlinx.coroutines.internal.o */
public final class C19731o {

    /* renamed from: a */
    public final LockFreeLinkedListNode f43682a;

    public C19731o(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f43682a = lockFreeLinkedListNode;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Removed[");
        h.append(this.f43682a);
        h.append(']');
        return h.toString();
    }
}
