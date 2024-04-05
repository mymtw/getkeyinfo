package com.etsy.android.p327ui.navigation.bottom;

import android.content.Context;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.p327ui.user.inappnotifications.C11541a0;
import com.etsy.android.push.C8938a;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4698s;
import p425q9.C13265p;
import p434ra.C13341h;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.navigation.bottom.i */
public final class C10692i implements C17555d<BottomNavStateRepo> {

    /* renamed from: a */
    public final C19011a<C13265p> f23577a;

    /* renamed from: b */
    public final C19011a<UserBadgeCountManager> f23578b;

    /* renamed from: c */
    public final C19011a<CartBadgeCountRepo> f23579c;

    /* renamed from: d */
    public final C19011a<C8938a> f23580d;

    /* renamed from: e */
    public final C19011a<Context> f23581e;

    /* renamed from: f */
    public final C19011a<C11541a0> f23582f;

    /* renamed from: g */
    public final C19011a<C13341h> f23583g;

    public C10692i(C17553b bVar, C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C4698s sVar) {
        this.f23577a = bVar;
        this.f23578b = aVar;
        this.f23579c = aVar2;
        this.f23580d = aVar3;
        this.f23581e = aVar4;
        this.f23582f = aVar5;
        this.f23583g = sVar;
    }

    public final Object get() {
        return new BottomNavStateRepo(this.f23577a.get(), this.f23578b.get(), this.f23579c.get(), this.f23580d.get(), this.f23581e.get(), this.f23582f.get(), this.f23583g.get());
    }
}
