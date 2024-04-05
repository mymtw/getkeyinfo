package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.lib.models.TranslatedConversationMessage;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.m */
public final /* synthetic */ class C9508m implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ C9510o f21082b;

    /* renamed from: c */
    public final /* synthetic */ long f21083c;

    public /* synthetic */ C9508m(C9510o oVar, long j) {
        this.f21082b = oVar;
        this.f21083c = j;
    }

    public final void accept(Object obj) {
        C9510o oVar = this.f21082b;
        long j = this.f21083c;
        C19383o.m32797g(oVar, "this$0");
        oVar.f21087b.mo31973e(j, ((TranslatedConversationMessage) obj).getText(), false);
    }
}
