package androidx.compose.material;

import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7282b;
import p174m0.C7287g;
import p753kq.C19857l;

public final class SwitchKt$SwitchImpl$3$1 extends Lambda implements C19857l<C7282b, C7287g> {
    public final /* synthetic */ C1342k1<Float> $thumbValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$3$1(C1342k1<Float> k1Var) {
        super(1);
        this.$thumbValue = k1Var;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7287g(m34760invokeBjo55l4((C7282b) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m34760invokeBjo55l4(C7282b bVar) {
        C19383o.m32797g(bVar, "$this$offset");
        return C19421p.m32949o(C7279a.m13954l(this.$thumbValue.getValue().floatValue()), 0);
    }
}
