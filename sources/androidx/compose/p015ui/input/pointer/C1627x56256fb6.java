package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2 */
public final class C1627x56256fb6 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C19861p $block$inlined;
    public final /* synthetic */ Object $key1$inlined;
    public final /* synthetic */ Object $key2$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1627x56256fb6(Object obj, Object obj2, C19861p pVar) {
        super(1);
        this.$key1$inlined = obj;
        this.$key2$inlined = obj2;
        this.$block$inlined = pVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$key1$inlined, "key1");
        o0Var.f4114b.mo7222b(this.$key2$inlined, "key2");
        o0Var.f4114b.mo7222b(this.$block$inlined, "block");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
