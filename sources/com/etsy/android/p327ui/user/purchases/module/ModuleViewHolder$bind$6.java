package com.etsy.android.p327ui.user.purchases.module;

import android.view.View;
import com.etsy.android.p327ui.user.purchases.module.C11656a;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$bind$6 */
public final class ModuleViewHolder$bind$6 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11666g $listing;
    public final /* synthetic */ ModuleViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$bind$6(ModuleViewHolder moduleViewHolder, C11666g gVar) {
        super(1);
        this.this$0 = moduleViewHolder;
        this.$listing = gVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        ModuleViewHolder moduleViewHolder = this.this$0;
        C11666g gVar = this.$listing;
        C11661b bVar = moduleViewHolder.f25783b;
        bVar.f25808a.invoke(new C11656a.C11658b(gVar.f25822a, gVar.f25829h, gVar.f25826e, gVar.f25827f));
    }
}
