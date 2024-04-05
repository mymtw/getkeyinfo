package com.etsy.android.uikit.view;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import java.util.Map;
import p462ug.C13530f;

/* renamed from: com.etsy.android.uikit.view.f */
public final class C11951f implements C13530f {

    /* renamed from: a */
    public final C8703p f26550a;

    /* renamed from: b */
    public float f26551b = 1.0f;

    public C11951f(C8703p pVar) {
        this.f26550a = pVar;
    }

    /* renamed from: a */
    public final void mo38721a(float f) {
        float f2 = this.f26551b;
        if ((f2 == 1.0f) && f > f2) {
            this.f26550a.mo21333d("listing_gallery_image_zoom", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.f26551b = f;
    }
}
