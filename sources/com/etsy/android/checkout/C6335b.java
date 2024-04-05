package com.etsy.android.checkout;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.user.TransactionAdapter;
import p145io.reactivex.functions.Consumer;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.checkout.b */
public final /* synthetic */ class C6335b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f14119b;

    public /* synthetic */ C6335b(int i) {
        this.f14119b = i;
    }

    public final void accept(Object obj) {
        switch (this.f14119b) {
            case 0:
                C20145v vVar = (C20145v) obj;
                return;
            case 1:
                Throwable th = (Throwable) obj;
                if (C0326j.m869n(BuildTarget.Companion)) {
                    if (th == null) {
                        th = new RuntimeException("throwable was null");
                    }
                    throw th;
                }
                return;
            case 2:
                CrashUtil.m17307a().mo30457b((Throwable) obj);
                return;
            default:
                TransactionAdapter.lambda$queryListingForAnalyticsEvent$1((Throwable) obj);
                return;
        }
    }
}
