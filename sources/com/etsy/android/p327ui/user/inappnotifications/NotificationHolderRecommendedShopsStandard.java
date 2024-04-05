package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard;
import com.github.rubensousa.gravitysnaphelper.C12600a;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p483xe.C13881b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard */
public final class NotificationHolderRecommendedShopsStandard extends RecyclerView.C3084b0 implements C13881b {

    /* renamed from: h */
    public static final /* synthetic */ int f25503h = 0;

    /* renamed from: b */
    public final C8672b f25504b;

    /* renamed from: c */
    public final C19857l<C11564q, C19394m> f25505c;

    /* renamed from: d */
    public final C19285c f25506d = C19350d.m32677b(new NotificationHolderRecommendedShopsStandard$recyclerView$2(this));

    /* renamed from: e */
    public final C19285c f25507e = C19350d.m32677b(new NotificationHolderRecommendedShopsStandard$heading$2(this));

    /* renamed from: f */
    public final C19285c f25508f = C19350d.m32677b(new NotificationHolderRecommendedShopsStandard$title$2(this));

    /* renamed from: g */
    public final C19285c f25509g = C19350d.m32677b(new NotificationHolderRecommendedShopsStandard$subTitle$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsStandard(View view, C8672b bVar, C19857l<? super C11564q, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25504b = bVar;
        this.f25505c = lVar;
        C12600a aVar = new C12600a(8388611);
        aVar.f27811k = true;
        aVar.mo11867a(mo37519e());
        RecyclerView.C3094l itemAnimator = mo37519e().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7067f = 0;
        }
    }

    /* renamed from: d */
    public final void mo37518d(IANShopCard iANShopCard) {
        RecyclerView.Adapter adapter = mo37519e().getAdapter();
        C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANShopAdapter");
        int indexOf = ((C11556i) adapter).f25592b.indexOf(iANShopCard);
        RecyclerView.Adapter adapter2 = mo37519e().getAdapter();
        C19383o.m32795e(adapter2, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANShopAdapter");
        ((C11556i) adapter2).notifyItemChanged(indexOf);
    }

    /* renamed from: e */
    public final RecyclerView mo37519e() {
        Object value = this.f25506d.getValue();
        C19383o.m32796f(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }
}
