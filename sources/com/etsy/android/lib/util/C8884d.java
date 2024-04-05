package com.etsy.android.lib.util;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.cart.viewholders.C9405s;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import com.jakewharton.rxbinding2.widget.C17029p;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.lib.util.d */
public final /* synthetic */ class C8884d implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f19635b;

    public /* synthetic */ C8884d(int i) {
        this.f19635b = i;
    }

    public final void accept(Object obj) {
        switch (this.f19635b) {
            case 0:
                Throwable th = (Throwable) obj;
                C8694h.f19097a.mo21306a("Error getting bitmap from File");
                return;
            case 1:
                BOEActivity.lambda$onCreate$3((Throwable) obj);
                return;
            case 2:
                C17029p pVar = (C17029p) obj;
                int i = C9405s.f20842n;
                if (pVar.actionId() != 0) {
                    pVar.view().clearFocus();
                    C15588c1.m25340p0(pVar.view());
                    return;
                }
                return;
            default:
                ShopHomeFragment.lambda$getMemberData$5((Throwable) obj);
                return;
        }
    }
}
