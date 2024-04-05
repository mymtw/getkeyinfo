package com.etsy.android.p327ui.listing;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.etsy.android.lib.logger.elk.uploading.C8681b;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.i */
public final class C10189i implements C2870k0.C2872b {

    /* renamed from: a */
    public final C19011a<ListingViewModel> f22349a;

    public C10189i(C8681b bVar) {
        C19383o.m32797g(bVar, "provider");
        this.f22349a = bVar;
    }

    public final <T extends C2866i0> T create(Class<T> cls) {
        T t = this.f22349a.get();
        C19383o.m32795e(t, "null cannot be cast to non-null type T of com.etsy.android.ui.listing.ListingViewModelFactory.create");
        return (C2866i0) t;
    }
}
