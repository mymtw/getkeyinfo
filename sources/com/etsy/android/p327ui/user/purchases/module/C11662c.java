package com.etsy.android.p327ui.user.purchases.module;

import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import p400mf.C13073a;

/* renamed from: com.etsy.android.ui.user.purchases.module.c */
public final class C11662c implements C13073a {

    /* renamed from: a */
    public final /* synthetic */ C11663d f25809a;

    /* renamed from: b */
    public final /* synthetic */ long f25810b;

    /* renamed from: c */
    public final /* synthetic */ String f25811c;

    public C11662c(C11663d dVar, long j, String str) {
        this.f25809a = dVar;
        this.f25810b = j;
        this.f25811c = str;
    }

    /* renamed from: a */
    public final void mo31346a() {
        this.f25809a.f25812a.mo21333d("favorite_item", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(this.f25810b)), new Pair(PredefinedAnalyticsProperty.CONTENT_SOURCE, this.f25811c)));
    }

    /* renamed from: b */
    public final void mo31347b() {
        this.f25809a.f25812a.mo21333d("remove_favorite_item", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(this.f25810b)), new Pair(PredefinedAnalyticsProperty.CONTENT_SOURCE, this.f25811c)));
    }
}
