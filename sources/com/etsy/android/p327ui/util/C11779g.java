package com.etsy.android.p327ui.util;

import com.etsy.android.lib.models.ShopFollowResponse;
import com.etsy.android.lib.models.apiv3.Alert;
import p145io.reactivex.functions.Consumer;
import p465vb.C13557a;

/* renamed from: com.etsy.android.ui.util.g */
public final /* synthetic */ class C11779g implements Consumer {
    public final void accept(Object obj) {
        Alert alert = ((ShopFollowResponse) obj).getAlert();
        if (alert != null) {
            C13557a.f29643a.onNext(alert);
        }
    }
}
