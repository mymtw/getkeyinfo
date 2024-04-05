package com.etsy.android.p327ui.home.editorspicks.viewholder;

import com.etsy.android.lib.models.cardviewelement.FindsHeroBanner;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.EditorsPicksHeroBannerViewHolder$bind$1 */
final class EditorsPicksHeroBannerViewHolder$bind$1 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ FindsHeroBanner $data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorsPicksHeroBannerViewHolder$bind$1(FindsHeroBanner findsHeroBanner) {
        super(0);
        this.$data = findsHeroBanner;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(C18263b.m30839d0(this.$data.getSubtitle()));
    }
}
