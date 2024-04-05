package com.etsy.android.lib.util;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.lib.util.a */
public final /* synthetic */ class C8878a implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f19624b;

    public /* synthetic */ C8878a(int i) {
        this.f19624b = i;
    }

    public final void accept(Object obj) {
        switch (this.f19624b) {
            case 0:
                Throwable th = (Throwable) obj;
                C8694h.f19097a.mo21306a("Error getting bitmap from MediaUri");
                return;
            default:
                LogCatKt.m17045a().mo21314h((Throwable) obj);
                return;
        }
    }
}
