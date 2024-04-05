package com.etsy.android.vespa.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.uikit.util.C11895a;
import p415of.C13186o;

/* renamed from: com.etsy.android.vespa.viewholders.e */
public class C12086e<T> extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public C8672b f26962b;

    public C12086e(View view) {
        super(view);
        C8672b b = view != null ? C11895a.m19621b(view) : null;
        this.f26962b = b == null ? EtsyApplication.get().getAnalyticsTracker() : b;
    }

    /* renamed from: a */
    public void mo19450a(T t) {
    }

    /* renamed from: b */
    public void mo31374b() {
    }

    /* renamed from: e */
    public void mo31843e(C13186o oVar) {
    }

    /* renamed from: f */
    public final View mo38986f(int i) {
        return this.itemView.findViewById(i);
    }
}
