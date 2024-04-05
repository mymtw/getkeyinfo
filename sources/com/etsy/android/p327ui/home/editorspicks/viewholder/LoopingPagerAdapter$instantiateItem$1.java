package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.view.View;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p442sc.C13371a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.LoopingPagerAdapter$instantiateItem$1 */
public final class LoopingPagerAdapter$instantiateItem$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ int $adjustedPosition;
    public final /* synthetic */ LoopingPagerAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoopingPagerAdapter$instantiateItem$1(LoopingPagerAdapter loopingPagerAdapter, int i) {
        super(1);
        this.this$0 = loopingPagerAdapter;
        this.$adjustedPosition = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        LoopingPagerAdapter loopingPagerAdapter = this.this$0;
        C13371a aVar = loopingPagerAdapter.f21911e;
        EtsyId listingId = loopingPagerAdapter.f21910d.get(this.$adjustedPosition).getListingId();
        C19383o.m32796f(listingId, "listings[adjustedPosition].listingId");
        aVar.mo31328c(listingId);
    }
}
