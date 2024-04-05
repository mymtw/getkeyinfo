package kotlinx.coroutines;

import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: kotlinx.coroutines.l1 */
public final class C19755l1 extends LockFreeLinkedListNode.C19713b {

    /* renamed from: d */
    public final /* synthetic */ C19749k1 f43713d;

    /* renamed from: e */
    public final /* synthetic */ Object f43714e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19755l1(LockFreeLinkedListNode lockFreeLinkedListNode, C19749k1 k1Var, Object obj) {
        super(lockFreeLinkedListNode);
        this.f43713d = k1Var;
        this.f43714e = obj;
    }

    /* renamed from: i */
    public final Object mo72160i(Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
        if (this.f43713d.mo72521h0() == this.f43714e) {
            return null;
        }
        return C19388s.f43281l;
    }
}
