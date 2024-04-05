package com.etsy.android.p327ui.util;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.util.m */
public final class C11785m {

    /* renamed from: a */
    public WeakReference<FragmentActivity> f26256a = null;

    /* renamed from: a */
    public static void m19481a(C11785m mVar, EtsyId etsyId, EtsyId etsyId2) {
        C11785m mVar2 = mVar;
        C12788a.m20424c(mVar2.f26256a.get(), new ShopHomeKey(C19421p.m32935c0(mVar2.f26256a.get()), etsyId, (ShopHomeConfig) null, (Map) null, (String) null, (String) null, etsyId2, false, (String) null, (Bundle) null, 256, (DefaultConstructorMarker) null));
    }
}
