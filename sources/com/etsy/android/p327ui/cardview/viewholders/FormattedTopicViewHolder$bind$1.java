package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopic;
import com.etsy.android.p327ui.cardview.clickhandlers.C9145z;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.FormattedTopicViewHolder$bind$1 */
final class FormattedTopicViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ FormattedTopic $formattedTopic;
    public final /* synthetic */ C9228z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormattedTopicViewHolder$bind$1(C9228z zVar, FormattedTopic formattedTopic) {
        super(1);
        this.this$0 = zVar;
        this.$formattedTopic = formattedTopic;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9145z zVar = this.this$0.f20372c;
        if (zVar != null) {
            zVar.mo31328c(this.$formattedTopic);
        }
    }
}
