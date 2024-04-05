package com.etsy.android.vespa.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.vespa.LargeImageDeeplinkCard;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LargeImageDeeplinkCardViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ LargeImageDeeplinkCard $data;
    public final /* synthetic */ C12107s this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LargeImageDeeplinkCardViewHolder$bind$1$1(C12107s sVar, LargeImageDeeplinkCard largeImageDeeplinkCard) {
        super(1);
        this.this$0 = sVar;
        this.$data = largeImageDeeplinkCard;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f27004d.mo31328c(this.$data.getLink());
        C8672b bVar = this.this$0.f27003c;
        LargeImageDeeplinkCard largeImageDeeplinkCard = this.$data;
        C19383o.m32797g(largeImageDeeplinkCard, "<this>");
        bVar.mo21333d("list_section_tapped_deep_link_row", C19388s.m32882r0(largeImageDeeplinkCard));
    }
}
