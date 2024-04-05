package com.etsy.android.p327ui.adapters;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.FavoritesTabKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.adapters.c */
public final class C9107c extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ UserProfileV3 f20025b;

    /* renamed from: c */
    public final /* synthetic */ UserProfileAdapter f20026c;

    public C9107c(UserProfileAdapter userProfileAdapter, UserProfileV3 userProfileV3) {
        this.f20026c = userProfileAdapter;
        this.f20025b = userProfileV3;
    }

    public final void onViewClick(View view) {
        boolean z = !this.f20026c.f20007h.mo45958c().equals(this.f20025b.getUserId());
        UserProfileAdapter userProfileAdapter = this.f20026c;
        C12788a.m20424c(userProfileAdapter.mContext, new FavoritesTabKey(C19421p.m32935c0(userProfileAdapter.mContext), this.f20025b.getUserId().getId(), this.f20025b.getLoginName(), 1, z, (Bundle) null));
    }
}
