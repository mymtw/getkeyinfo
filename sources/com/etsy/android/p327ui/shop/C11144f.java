package com.etsy.android.p327ui.shop;

import com.etsy.android.lib.models.apiv3.FAQs;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import java.util.List;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.shop.f */
public final /* synthetic */ class C11144f implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ BaseShopHomeFragment f24639b;

    /* renamed from: c */
    public final /* synthetic */ MachineTranslationViewState f24640c;

    /* renamed from: d */
    public final /* synthetic */ FAQs f24641d;

    public /* synthetic */ C11144f(BaseShopHomeFragment baseShopHomeFragment, MachineTranslationViewState machineTranslationViewState, FAQs fAQs) {
        this.f24639b = baseShopHomeFragment;
        this.f24640c = machineTranslationViewState;
        this.f24641d = fAQs;
    }

    public final void accept(Object obj) {
        this.f24639b.lambda$translateFAQs$9(this.f24640c, this.f24641d, (List) obj);
    }
}
