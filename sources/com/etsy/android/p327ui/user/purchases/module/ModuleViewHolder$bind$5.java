package com.etsy.android.p327ui.user.purchases.module;

import android.widget.ImageView;
import androidx.activity.C0114h;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$bind$5 */
public final class ModuleViewHolder$bind$5 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ ImageView $imageView;
    public final /* synthetic */ C11666g $listing;
    public final /* synthetic */ ModuleViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$bind$5(ModuleViewHolder moduleViewHolder, ImageView imageView, C11666g gVar) {
        super(0);
        this.this$0 = moduleViewHolder;
        this.$imageView = imageView;
        this.$listing = gVar;
    }

    public final void invoke() {
        this.this$0.f25784c = this.$imageView.getMeasuredWidth();
        ModuleViewHolder moduleViewHolder = this.this$0;
        ImageView imageView = this.$imageView;
        String a = this.$listing.f25828g.mo37768a(moduleViewHolder.f25784c);
        if (a != null) {
            C0114h.m270B0(moduleViewHolder.itemView.getContext()).load(a).mo16816M(imageView);
        }
    }
}
