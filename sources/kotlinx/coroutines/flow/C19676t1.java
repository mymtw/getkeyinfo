package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.flow.internal.C19624a;
import kotlinx.coroutines.flow.internal.C19625b;

/* renamed from: kotlinx.coroutines.flow.t1 */
public final class C19676t1 extends C19625b<C19671s1<?>> {

    /* renamed from: a */
    public long f43625a = -1;

    /* renamed from: b */
    public C19753l f43626b;

    /* renamed from: a */
    public final boolean mo72372a(C19624a aVar) {
        C19671s1 s1Var = (C19671s1) aVar;
        if (this.f43625a >= 0) {
            return false;
        }
        long j = s1Var.f43616j;
        if (j < s1Var.f43617k) {
            s1Var.f43617k = j;
        }
        this.f43625a = j;
        return true;
    }

    /* renamed from: b */
    public final C19340c[] mo72373b(C19624a aVar) {
        long j = this.f43625a;
        this.f43625a = -1;
        this.f43626b = null;
        return ((C19671s1) aVar).mo72387u(j);
    }
}
