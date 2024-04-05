package androidx.compose.p015ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1 */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements C19857l<C19846a<? extends C19394m>, C19394m> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C19846a<C19394m>) (C19846a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "command");
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new C1861p(aVar));
        }
    }
}
