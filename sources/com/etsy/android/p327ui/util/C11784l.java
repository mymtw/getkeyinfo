package com.etsy.android.p327ui.util;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.util.l */
public final class C11784l extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ User f26254b;

    /* renamed from: c */
    public final /* synthetic */ C11785m f26255c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11784l(C11785m mVar, C8698l[] lVarArr, User user) {
        super(lVarArr);
        this.f26255c = mVar;
        this.f26254b = user;
    }

    public final void onViewClick(View view) {
        String c0 = C19421p.m32935c0(this.f26255c.f26256a.get());
        EtsyId userId = this.f26254b.getUserId();
        C19383o.m32797g(userId, "userId");
        C12788a.m20424c(this.f26255c.f26256a.get(), new UserProfileKey(c0, userId, (Bundle) null));
    }
}
