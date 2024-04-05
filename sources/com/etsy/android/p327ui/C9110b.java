package com.etsy.android.p327ui;

import androidx.activity.result.C0118a;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.etsylens.EtsyLensPresenter;
import com.etsy.android.p327ui.user.review.C11750u;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.b */
public final /* synthetic */ class C9110b implements C0118a {

    /* renamed from: b */
    public final /* synthetic */ int f20028b;

    /* renamed from: c */
    public final /* synthetic */ Object f20029c;

    public /* synthetic */ C9110b(Object obj, int i) {
        this.f20028b = i;
        this.f20029c = obj;
    }

    /* renamed from: a */
    public final void mo413a(Object obj) {
        switch (this.f20028b) {
            case 0:
                ((BOEActivity) this.f20029c).lambda$new$0((Boolean) obj);
                return;
            case 1:
                EtsyLensPresenter etsyLensPresenter = (EtsyLensPresenter) this.f20029c;
                Map map = (Map) obj;
                C19383o.m32797g(etsyLensPresenter, "this$0");
                C9974e eVar = etsyLensPresenter.f21944c;
                C19383o.m32796f(map, "permissions");
                ((C11750u) etsyLensPresenter.f21950i.getValue()).getClass();
                eVar.mo33165c(C11750u.m19448a(map));
                return;
            default:
                CreateReviewActivity.m35081requestCameraPermissions$lambda6((CreateReviewActivity) this.f20029c, (Map) obj);
                return;
        }
    }
}
