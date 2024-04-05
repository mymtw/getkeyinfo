package com.etsy.android.p327ui.user.inappnotifications;

import androidx.compose.animation.C0472h;
import com.etsy.android.p327ui.user.inappnotifications.C11544b0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANViewModel$refreshData$1 */
final class IANViewModel$refreshData$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C11562o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IANViewModel$refreshData$1(C11562o oVar) {
        super(1);
        this.this$0 = oVar;
    }

    public final void invoke(Throwable th) {
        C0472h.m1248k(th, "it", th);
        this.this$0.f25614h.postValue(C11544b0.C11545a.f25542a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
