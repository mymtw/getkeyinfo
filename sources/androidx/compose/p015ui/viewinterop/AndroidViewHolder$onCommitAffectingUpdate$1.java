package androidx.compose.p015ui.viewinterop;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onCommitAffectingUpdate$1 */
public final class AndroidViewHolder$onCommitAffectingUpdate$1 extends Lambda implements C19857l<AndroidViewHolder, C19394m> {
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onCommitAffectingUpdate$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidViewHolder) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AndroidViewHolder androidViewHolder) {
        C19383o.m32797g(androidViewHolder, "it");
        this.this$0.getHandler().post(new C2073a(this.this$0.runUpdate));
    }
}
