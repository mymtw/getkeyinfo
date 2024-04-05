package com.etsy.android.lib.util;

import android.app.Activity;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.p327ui.shop.BaseShopHomeFragment;
import com.etsy.android.search.savedsearch.C8984h;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p452te.C13394c;

/* renamed from: com.etsy.android.lib.util.c */
public final /* synthetic */ class C8882c implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f19632b;

    /* renamed from: c */
    public final /* synthetic */ Object f19633c;

    /* renamed from: d */
    public final /* synthetic */ Object f19634d;

    public /* synthetic */ C8882c(int i, Object obj, Object obj2) {
        this.f19632b = i;
        this.f19633c = obj;
        this.f19634d = obj2;
    }

    public final void accept(Object obj) {
        switch (this.f19632b) {
            case 0:
                ((C8886e) this.f19633c).mo30482i(this.f19634d, (C8886e.C8889c) obj);
                return;
            case 1:
                Activity activity = (Activity) this.f19634d;
                Throwable th = (Throwable) obj;
                C19383o.m32797g((C8984h) this.f19633c, "this$0");
                C19383o.m32797g(activity, "$activity");
                C8984h.m17389c(activity);
                return;
            default:
                ((BaseShopHomeFragment) this.f19633c).lambda$translateReviewMessage$6((C13394c) this.f19634d, (Throwable) obj);
                return;
        }
    }
}
