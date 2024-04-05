package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.TestTagKt$testTag$1 */
public final class TestTagKt$testTag$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ String $tag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestTagKt$testTag$1(String str) {
        super(1);
        this.$tag = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        String str = this.$tag;
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        C19383o.m32797g(str, "<set-?>");
        C1908o.f4261i.mo7356a(qVar, C1908o.f4253a[8], str);
    }
}
