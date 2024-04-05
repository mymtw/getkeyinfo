package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopicFirstFeatured;
import com.etsy.android.p327ui.cardview.clickhandlers.C9145z;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.FeaturableTopicViewHolder$bindTopic$1 */
final class FeaturableTopicViewHolder$bindTopic$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ FormattedTopicFirstFeatured $data;
    public final /* synthetic */ C9202o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeaturableTopicViewHolder$bindTopic$1(C9202o oVar, FormattedTopicFirstFeatured formattedTopicFirstFeatured) {
        super(1);
        this.this$0 = oVar;
        this.$data = formattedTopicFirstFeatured;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9145z zVar = this.this$0.f20312b;
        if (zVar != null) {
            zVar.mo31328c(this.$data);
        }
    }
}
