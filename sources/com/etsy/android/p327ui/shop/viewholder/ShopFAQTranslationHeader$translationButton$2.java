package com.etsy.android.p327ui.shop.viewholder;

import com.etsy.android.R;
import com.etsy.android.uikit.view.MachineTranslationButton;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopFAQTranslationHeader$translationButton$2 */
public final class ShopFAQTranslationHeader$translationButton$2 extends Lambda implements C19846a<MachineTranslationButton> {
    public final /* synthetic */ ShopFAQTranslationHeader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopFAQTranslationHeader$translationButton$2(ShopFAQTranslationHeader shopFAQTranslationHeader) {
        super(0);
        this.this$0 = shopFAQTranslationHeader;
    }

    public final MachineTranslationButton invoke() {
        return (MachineTranslationButton) this.this$0.itemView.findViewById(R.id.translate);
    }
}
