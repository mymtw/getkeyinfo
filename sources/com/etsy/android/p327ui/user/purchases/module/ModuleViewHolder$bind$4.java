package com.etsy.android.p327ui.user.purchases.module;

import android.view.View;
import com.etsy.android.p327ui.user.purchases.module.C11656a;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$bind$4 */
public final class ModuleViewHolder$bind$4 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11667h $moduleUiModel;
    public final /* synthetic */ ModuleViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$bind$4(ModuleViewHolder moduleViewHolder, C11667h hVar) {
        super(1);
        this.this$0 = moduleViewHolder;
        this.$moduleUiModel = hVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        ModuleViewHolder moduleViewHolder = this.this$0;
        C11664e eVar = this.$moduleUiModel.f25831b;
        C11661b bVar = moduleViewHolder.f25783b;
        bVar.f25808a.invoke(new C11656a.C11659c(eVar.f25816c, eVar.f25815b, eVar.f25817d));
    }
}
