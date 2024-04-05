package com.etsy.android.p327ui.navigation.bottom;

import androidx.room.C3218a0;
import androidx.room.C3260z;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.navigation.bottom.e */
public final class C10683e {

    /* renamed from: a */
    public final BottomNavStateRepo f23557a;

    /* renamed from: b */
    public final WeakReference<TrackingBaseActivity> f23558b;

    /* renamed from: c */
    public final C3260z f23559c = new C3260z(this);

    /* renamed from: d */
    public final C3218a0 f23560d = new C3218a0(this, 4);

    public C10683e(BOEActivity bOEActivity, BottomNavStateRepo bottomNavStateRepo) {
        C19383o.m32797g(bottomNavStateRepo, "bottomNavStateRepo");
        this.f23557a = bottomNavStateRepo;
        this.f23558b = new WeakReference<>(bOEActivity);
    }
}
