package p040c9;

import com.etsy.android.lib.dagger.C8641a;
import com.etsy.android.lib.dagger.C8647f;
import com.etsy.android.lib.dagger.C8653l;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.oauth2.C8746b;
import com.etsy.android.lib.network.oauth2.C8757g0;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.core.C9615c;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.shop.tabs.C11218e;
import com.etsy.android.p327ui.shop.tabs.ShopFragment;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import dagger.internal.C17556e;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.internal.C19729m;
import p277w8.C8269g;
import p277w8.C8275m;
import p334da.C12640i;
import p568fn.C17782b;
import p768rq.C20153b;

/* renamed from: c9.za */
public final class C4800za implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10796b;

    /* renamed from: c */
    public C12640i f10797c;

    /* renamed from: d */
    public C8275m f10798d;

    public C4800za(C4579j1 j1Var, C4690r4 r4Var, C19388s sVar, C15588c1 c1Var, ShopFragment shopFragment) {
        this.f10796b = j1Var;
        C8653l lVar = new C8653l(sVar, C17556e.m29429a(shopFragment), 6);
        C8757g0 g0Var = new C8757g0(new C8269g(c1Var, j1Var.f10091D0, 8), j1Var.f10146O0, 4);
        C9615c cVar = new C9615c(r4Var.f10568Y1, 8);
        C8647f fVar = j1Var.f10154P3;
        this.f10797c = new C12640i(fVar, new C11218e(new C8746b(fVar, lVar, g0Var, cVar, 2), new C8641a(j1Var.f10172T1, 6)), 7);
        this.f10798d = new C8275m(sVar, r4Var.f10564W1, 6);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ShopFragment shopFragment = (ShopFragment) obj;
        C4579j1 j1Var = this.f10796b;
        shopFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, ShopViewModel.class, this.f10797c));
        shopFragment.appBarHelperProvider = this.f10798d;
        this.f10796b.f10259j.getClass();
        C20153b bVar = C19760n0.f43719a;
        C19764o1 o1Var = C19729m.f43681a;
        C17782b.m29841G(o1Var);
        shopFragment.mainDispatcher = o1Var;
    }
}
