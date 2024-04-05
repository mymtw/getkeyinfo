package com.etsy.android.p327ui.user.purchases.module;

import com.etsy.android.p327ui.user.purchases.module.ModuleViewHolder;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$listingCards$2 */
public final class ModuleViewHolder$listingCards$2 extends Lambda implements C19846a<List<? extends ModuleViewHolder.ListingCard>> {
    public final /* synthetic */ ModuleViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$listingCards$2(ModuleViewHolder moduleViewHolder) {
        super(0);
        this.this$0 = moduleViewHolder;
    }

    public final List<ModuleViewHolder.ListingCard> invoke() {
        Object value = this.this$0.f25788g.getValue();
        C19383o.m32796f(value, "<get-moduleListing0>(...)");
        Object value2 = this.this$0.f25789h.getValue();
        C19383o.m32796f(value2, "<get-moduleListing1>(...)");
        Object value3 = this.this$0.f25790i.getValue();
        C19383o.m32796f(value3, "<get-moduleListing2>(...)");
        Object value4 = this.this$0.f25791j.getValue();
        C19383o.m32796f(value4, "<get-moduleListing3>(...)");
        Object value5 = this.this$0.f25792k.getValue();
        C19383o.m32796f(value5, "<get-moduleListing4>(...)");
        Object value6 = this.this$0.f25793l.getValue();
        C19383o.m32796f(value6, "<get-moduleListing5>(...)");
        return C17782b.m29865e0(new ModuleViewHolder.ListingCard((MaterialCardView) value), new ModuleViewHolder.ListingCard((MaterialCardView) value2), new ModuleViewHolder.ListingCard((MaterialCardView) value3), new ModuleViewHolder.ListingCard((MaterialCardView) value4), new ModuleViewHolder.ListingCard((MaterialCardView) value5), new ModuleViewHolder.ListingCard((MaterialCardView) value6));
    }
}
