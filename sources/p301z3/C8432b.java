package p301z3;

import kotlin.jvm.internal.C19383o;
import p030bo.app.C4235u4;

/* renamed from: z3.b */
public final class C8432b {

    /* renamed from: a */
    public final C4235u4 f18446a;

    public C8432b(C4235u4 u4Var) {
        C19383o.m32797g(u4Var, "sdkAuthError");
        this.f18446a = u4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8432b) && C19383o.m32792b(this.f18446a, ((C8432b) obj).f18446a);
    }

    public final int hashCode() {
        return this.f18446a.hashCode();
    }

    public final String toString() {
        return this.f18446a.toString();
    }
}
