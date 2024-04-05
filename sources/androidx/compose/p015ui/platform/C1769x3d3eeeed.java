package androidx.compose.p015ui.platform;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", mo70541f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", mo70542l = {1637, 1666}, mo70543m = "boundsUpdatesEventLoop")
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 */
public final class C1769x3d3eeeed extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1769x3d3eeeed(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C19340c<? super C1769x3d3eeeed> cVar) {
        super(cVar);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7067a(this);
    }
}
