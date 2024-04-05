package com.etsy.android.p327ui.user.purchases.module;

import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$linkTitle$2 */
public final class ModuleViewHolder$linkTitle$2 extends Lambda implements C19846a<CollageButton> {
    public final /* synthetic */ ModuleViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$linkTitle$2(ModuleViewHolder moduleViewHolder) {
        super(0);
        this.this$0 = moduleViewHolder;
    }

    public final CollageButton invoke() {
        return (CollageButton) this.this$0.itemView.findViewById(R.id.module_link_title);
    }
}
