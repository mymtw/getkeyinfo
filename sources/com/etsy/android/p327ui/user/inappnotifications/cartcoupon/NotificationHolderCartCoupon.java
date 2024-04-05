package com.etsy.android.p327ui.user.inappnotifications.cartcoupon;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.p327ui.user.inappnotifications.C11540a;
import com.etsy.android.p327ui.user.inappnotifications.C11548c;
import com.etsy.android.p327ui.user.inappnotifications.C11558k;
import com.etsy.android.p327ui.user.inappnotifications.C11560m;
import com.etsy.android.p327ui.user.inappnotifications.C11561n;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import com.etsy.android.p327ui.user.inappnotifications.C11576s;
import com.github.rubensousa.gravitysnaphelper.C12600a;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p483xe.C13880a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon */
public final class NotificationHolderCartCoupon extends RecyclerView.C3084b0 implements C13880a {

    /* renamed from: j */
    public static int f25547j;

    /* renamed from: k */
    public static int f25548k;

    /* renamed from: b */
    public final C8672b f25549b;

    /* renamed from: c */
    public final C19857l<C11564q, C19394m> f25550c;

    /* renamed from: d */
    public final C19285c f25551d = C19350d.m32677b(new NotificationHolderCartCoupon$recyclerView$2(this));

    /* renamed from: e */
    public final C19285c f25552e = C19350d.m32677b(new NotificationHolderCartCoupon$applyCouponButton$2(this));

    /* renamed from: f */
    public final C19285c f25553f = C19350d.m32677b(new NotificationHolderCartCoupon$couponCode$2(this));

    /* renamed from: g */
    public final C19285c f25554g = C19350d.m32677b(new NotificationHolderCartCoupon$expiredText$2(this));

    /* renamed from: h */
    public final C19285c f25555h = C19350d.m32677b(new NotificationHolderCartCoupon$notificationText$2(this));

    /* renamed from: i */
    public final C19285c f25556i = C19350d.m32677b(new NotificationHolderCartCoupon$shopAvatar$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderCartCoupon(View view, C8672b bVar, C19857l<? super C11564q, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25549b = bVar;
        this.f25550c = lVar;
        Resources resources = view.getContext().getResources();
        f25547j = resources.getDimensionPixelSize(R.dimen.clg_icon_size_larger);
        f25548k = resources.getDimensionPixelSize(R.dimen.clg_space_12);
        C12600a aVar = new C12600a(8388611);
        aVar.f27811k = true;
        aVar.mo11867a(mo37554h());
        RecyclerView.C3094l itemAnimator = mo37554h().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7067f = 0;
        }
        mo37554h().addItemDecoration(new C11576s(f25548k));
    }

    /* renamed from: e */
    public static final void m19336e(NotificationHolderCartCoupon notificationHolderCartCoupon, String str, long j, String str2, Long l) {
        NotificationHolderCartCoupon notificationHolderCartCoupon2 = notificationHolderCartCoupon;
        notificationHolderCartCoupon.getClass();
        C1993m.m4359T(notificationHolderCartCoupon2.f25549b, new C11540a("notification_tapped_shop", l, str2, (Long) null, Long.valueOf(j), (Boolean) null, str, (String) null, 168));
        long j2 = j;
        notificationHolderCartCoupon2.f25550c.invoke(new C11564q.C11572h(j, (String) null));
    }

    /* renamed from: c */
    public final void mo37492c(IANListingCard iANListingCard) {
        RecyclerView.Adapter adapter = mo37554h().getAdapter();
        C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANListingAdapter");
        List<IANListingCard> list = ((C11548c) adapter).f25544b;
        Integer valueOf = list != null ? Integer.valueOf(list.indexOf(iANListingCard)) : null;
        if (valueOf != null) {
            valueOf.intValue();
            RecyclerView.Adapter adapter2 = mo37554h().getAdapter();
            C19383o.m32795e(adapter2, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANListingAdapter");
            ((C11548c) adapter2).notifyItemChanged(valueOf.intValue());
        }
    }

    /* renamed from: f */
    public final void mo37552f(C11549a aVar, int i) {
        C11558k kVar = new C11558k(f25547j, i, aVar.f25563g, aVar.f25560d, aVar.f25561e, aVar.f25566j, aVar.f25565i);
        C11561n nVar = new C11561n(this.f25549b, new NotificationHolderCartCoupon$bind$dependencies$1(this, aVar));
        View view = this.itemView;
        C19383o.m32796f(view, "itemView");
        C11560m.m19346a(view, kVar, nVar);
        Object value = this.f25553f.getValue();
        C19383o.m32796f(value, "<get-couponCode>(...)");
        ((TextView) value).setText(aVar.f25570n);
        if (aVar.f25569m) {
            mo37553g().setText(aVar.f25567k);
            mo37553g().setContentDescription(aVar.f25567k);
            Object value2 = this.f25554g.getValue();
            C19383o.m32796f(value2, "<get-expiredText>(...)");
            ViewExtensions.m12860d((TextView) value2);
            ViewExtensions.m12869m(mo37553g());
        } else {
            Object value3 = this.f25554g.getValue();
            C19383o.m32796f(value3, "<get-expiredText>(...)");
            ((TextView) value3).setText(aVar.f25571o);
            ViewExtensions.m12860d(mo37553g());
            Object value4 = this.f25554g.getValue();
            C19383o.m32796f(value4, "<get-expiredText>(...)");
            ViewExtensions.m12869m((TextView) value4);
        }
        Object value5 = this.f25556i.getValue();
        C19383o.m32796f(value5, "<get-shopAvatar>(...)");
        ViewExtensions.m12866j((ImageView) value5, new NotificationHolderCartCoupon$bind$1$1(this, aVar));
        Object value6 = this.f25555h.getValue();
        C19383o.m32796f(value6, "<get-notificationText>(...)");
        ViewExtensions.m12866j((TextView) value6, new NotificationHolderCartCoupon$bind$1$2(this, aVar));
        ViewExtensions.m12866j(mo37553g(), new NotificationHolderCartCoupon$bind$1$3(aVar, this));
    }

    /* renamed from: g */
    public final Button mo37553g() {
        Object value = this.f25552e.getValue();
        C19383o.m32796f(value, "<get-applyCouponButton>(...)");
        return (Button) value;
    }

    /* renamed from: h */
    public final RecyclerView mo37554h() {
        Object value = this.f25551d.getValue();
        C19383o.m32796f(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }
}
