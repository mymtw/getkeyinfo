package kotlin.jvm.internal;

import androidx.appcompat.widget.C0326j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19390u;
import kotlin.reflect.C19418n;
import kotlin.reflect.C19419o;
import p753kq.C19857l;

final class TypeReference$asString$args$1 extends Lambda implements C19857l<C19419o, CharSequence> {
    public final /* synthetic */ C19390u this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeReference$asString$args$1(C19390u uVar) {
        super(1);
        this.this$0 = uVar;
    }

    public final CharSequence invoke(C19419o oVar) {
        C19383o.m32797g(oVar, "it");
        this.this$0.getClass();
        if (oVar.f43296a == null) {
            return "*";
        }
        C19418n nVar = oVar.f43297b;
        if ((nVar instanceof C19390u ? (C19390u) nVar : null) == null) {
            String valueOf = String.valueOf(nVar);
            int i = C19390u.C19391a.f43283a[oVar.f43296a.ordinal()];
            if (i == 1) {
                return valueOf;
            }
            if (i == 2) {
                return C0326j.m864i("in ", valueOf);
            }
            if (i == 3) {
                return C0326j.m864i("out ", valueOf);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw null;
    }
}
