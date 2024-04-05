package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.p327ui.favorites.C9876s;
import com.etsy.android.p327ui.user.inappnotifications.C11544b0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANViewModel$monitorFavoritesTabState$2 */
final class IANViewModel$monitorFavoritesTabState$2 extends Lambda implements C19857l<C9876s, C19394m> {
    public final /* synthetic */ C11562o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IANViewModel$monitorFavoritesTabState$2(C11562o oVar) {
        super(1);
        this.this$0 = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9876s) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9876s sVar) {
        if (C19383o.m32792b(sVar, C9876s.C9880d.f21805a)) {
            this.this$0.f25614h.postValue(new C11544b0.C11547c());
        }
    }
}
