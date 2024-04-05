package kotlinx.coroutines.channels;

import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: kotlinx.coroutines.channels.b */
public final class C19496b extends LockFreeLinkedListNode.C19713b {

    /* renamed from: d */
    public final /* synthetic */ C19494a f43438d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19496b(C19521v vVar, C19494a aVar) {
        super(vVar);
        this.f43438d = aVar;
    }

    /* renamed from: i */
    public final Object mo72160i(Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
        if (this.f43438d.mo72196i()) {
            return null;
        }
        return C19388s.f43281l;
    }
}
