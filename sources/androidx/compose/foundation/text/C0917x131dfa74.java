package androidx.compose.foundation.text;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3 */
public final class C0917x131dfa74 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C0958l $observer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0917x131dfa74(C0958l lVar) {
        super(0);
        this.$observer = lVar;
    }

    public final void invoke() {
        this.$observer.onStop();
    }
}
