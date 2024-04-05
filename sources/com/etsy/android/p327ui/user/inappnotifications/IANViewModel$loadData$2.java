package com.etsy.android.p327ui.user.inappnotifications;

import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.p327ui.user.inappnotifications.C11544b0;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANViewModel$loadData$2 */
final class IANViewModel$loadData$2 extends Lambda implements C19857l<List<InAppNotification>, C19394m> {
    public final /* synthetic */ C11562o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IANViewModel$loadData$2(C11562o oVar) {
        super(1);
        this.this$0 = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<InAppNotification>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<InAppNotification> list) {
        C2895z<C11544b0> zVar = this.this$0.f25614h;
        C19383o.m32796f(list, "it");
        zVar.postValue(new C11544b0.C11546b(list));
    }
}
