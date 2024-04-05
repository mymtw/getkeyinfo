package com.etsy.android.p327ui.user.purchases.module;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$moduleTitle$2 */
public final class ModuleViewHolder$moduleTitle$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ ModuleViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$moduleTitle$2(ModuleViewHolder moduleViewHolder) {
        super(0);
        this.this$0 = moduleViewHolder;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.itemView.findViewById(R.id.module_title);
    }
}
