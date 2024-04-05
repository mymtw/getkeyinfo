package com.etsy.android.p327ui.user.purchases.module;

import android.view.View;
import com.etsy.android.p327ui.user.purchases.module.C11656a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p338df.C12654e;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$bind$2 */
public final class ModuleViewHolder$bind$2 extends Lambda implements C19857l<View, Boolean> {
    public final /* synthetic */ C11666g $listing;
    public final /* synthetic */ ModuleViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$bind$2(ModuleViewHolder moduleViewHolder, C11666g gVar) {
        super(1);
        this.this$0 = moduleViewHolder;
        this.$listing = gVar;
    }

    public final Boolean invoke(View view) {
        ModuleViewHolder moduleViewHolder = this.this$0;
        C11666g gVar = this.$listing;
        C11661b bVar = moduleViewHolder.f25783b;
        C19383o.m32797g(gVar, "<this>");
        bVar.f25808a.invoke(new C11656a.C11657a(new C12654e(gVar.f25822a, gVar.f25823b, gVar.f25829h, gVar.f25825d, gVar.f25826e, gVar.f25827f)));
        return Boolean.TRUE;
    }
}
