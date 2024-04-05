package androidx.compose.p015ui.viewinterop;

import android.os.Looper;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$snapshotObserver$1 */
public final class AndroidViewHolder$snapshotObserver$1 extends Lambda implements C19857l<C19846a<? extends C19394m>, C19394m> {
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$snapshotObserver$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C19846a<C19394m>) (C19846a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "command");
        if (this.this$0.getHandler().getLooper() == Looper.myLooper()) {
            aVar.invoke();
        } else {
            this.this$0.getHandler().post(new C2074b(aVar));
        }
    }
}
