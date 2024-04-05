package com.etsy.android.p327ui.adapters;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.FavoritesTabKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.adapters.b */
public final class C9106b extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ UserProfileV3 f20023b;

    /* renamed from: c */
    public final /* synthetic */ UserProfileAdapter f20024c;

    public C9106b(UserProfileAdapter userProfileAdapter, UserProfileV3 userProfileV3) {
        this.f20024c = userProfileAdapter;
        this.f20023b = userProfileV3;
    }

    public final void onViewClick(View view) {
        boolean z = !this.f20024c.f20007h.mo45958c().equals(this.f20023b.getUserId());
        UserProfileAdapter userProfileAdapter = this.f20024c;
        C12788a.m20424c(userProfileAdapter.mContext, new FavoritesTabKey(C19421p.m32935c0(userProfileAdapter.mContext), this.f20023b.getUserId().getId(), this.f20023b.getLoginName(), 0, z, (Bundle) null));
    }
}
