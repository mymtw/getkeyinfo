package com.etsy.android.p327ui.shop;

import com.etsy.android.vespa.PositionList;
import com.etsy.android.vespa.VespaBaseFragment;
import p145io.reactivex.functions.Consumer;
import p460ue.C13497g;
import p464va.C13548c;

/* renamed from: com.etsy.android.ui.shop.h */
public final /* synthetic */ class C11148h implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f24648b;

    /* renamed from: c */
    public final /* synthetic */ VespaBaseFragment f24649c;

    /* renamed from: d */
    public final /* synthetic */ Object f24650d;

    public /* synthetic */ C11148h(VespaBaseFragment vespaBaseFragment, Object obj, int i) {
        this.f24648b = i;
        this.f24649c = vespaBaseFragment;
        this.f24650d = obj;
    }

    public final void accept(Object obj) {
        switch (this.f24648b) {
            case 0:
                ((BaseShopHomeFragment) this.f24649c).lambda$translatePrivacyOther$8((C13497g) this.f24650d, (Throwable) obj);
                return;
            default:
                this.f24649c.lambda$performAction$4((PositionList) this.f24650d, (C13548c) obj);
                return;
        }
    }
}
