package com.etsy.android.p327ui.user.inappnotifications.thankyoucoupon;

import android.support.p013v4.media.session.C0087d;
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
import com.etsy.android.p327ui.user.inappnotifications.C11558k;
import com.etsy.android.p327ui.user.inappnotifications.C11560m;
import com.etsy.android.p327ui.user.inappnotifications.C11561n;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.thankyoucoupon.NotificationHolderThankYouCoupon */
public final class NotificationHolderThankYouCoupon extends RecyclerView.C3084b0 {

    /* renamed from: j */
    public static int f25642j;

    /* renamed from: b */
    public final C8672b f25643b;

    /* renamed from: c */
    public final C19857l<C11564q, C19394m> f25644c;

    /* renamed from: d */
    public final C19285c f25645d = C19350d.m32677b(new NotificationHolderThankYouCoupon$shopAvatar$2(this));

    /* renamed from: e */
    public final C19285c f25646e = C19350d.m32677b(new NotificationHolderThankYouCoupon$notificationText$2(this));

    /* renamed from: f */
    public final C19285c f25647f = C19350d.m32677b(new NotificationHolderThankYouCoupon$expiredCouponText$2(this));

    /* renamed from: g */
    public final C19285c f25648g = C19350d.m32677b(new NotificationHolderThankYouCoupon$disclaimerText$2(this));

    /* renamed from: h */
    public final C19285c f25649h = C19350d.m32677b(new NotificationHolderThankYouCoupon$couponCode$2(this));

    /* renamed from: i */
    public final C19285c f25650i = C19350d.m32677b(new NotificationHolderThankYouCoupon$applyCouponButton$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderThankYouCoupon(View view, C8672b bVar, C19857l<? super C11564q, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25643b = bVar;
        this.f25644c = lVar;
        f25642j = C0087d.m233b(view, R.dimen.clg_icon_size_larger);
    }

    /* renamed from: e */
    public static final void m19347e(NotificationHolderThankYouCoupon notificationHolderThankYouCoupon, String str, long j, String str2, String str3, Long l) {
        NotificationHolderThankYouCoupon notificationHolderThankYouCoupon2 = notificationHolderThankYouCoupon;
        notificationHolderThankYouCoupon.getClass();
        C1993m.m4359T(notificationHolderThankYouCoupon2.f25643b, new C11540a("notification_tapped_shop", l, str3, (Long) null, Long.valueOf(j), (Boolean) null, str, (String) null, 168));
        long j2 = j;
        notificationHolderThankYouCoupon2.f25644c.invoke(new C11564q.C11572h(j, str2));
    }

    /* renamed from: f */
    public final void mo37594f(C11578a aVar) {
        C11558k kVar = new C11558k(f25642j, 0, aVar.f25657g, aVar.f25654d, aVar.f25655e, aVar.f25659i, (List<IANListingCard>) null);
        View view = this.itemView;
        C19383o.m32796f(view, "itemView");
        C11560m.m19346a(view, kVar, (C11561n) null);
        Object value = this.f25649h.getValue();
        C19383o.m32796f(value, "<get-couponCode>(...)");
        ((TextView) value).setText(aVar.f25663m);
        if (aVar.f25662l) {
            mo37595g().setText(aVar.f25660j);
            mo37595g().setContentDescription(aVar.f25660j);
            Object value2 = this.f25647f.getValue();
            C19383o.m32796f(value2, "<get-expiredCouponText>(...)");
            ViewExtensions.m12860d((TextView) value2);
            ViewExtensions.m12869m(mo37595g());
            Object value3 = this.f25648g.getValue();
            C19383o.m32796f(value3, "<get-disclaimerText>(...)");
            ((TextView) value3).setText(aVar.f25666p);
            Object value4 = this.f25648g.getValue();
            C19383o.m32796f(value4, "<get-disclaimerText>(...)");
            ViewExtensions.m12869m((TextView) value4);
        } else {
            Object value5 = this.f25647f.getValue();
            C19383o.m32796f(value5, "<get-expiredCouponText>(...)");
            ((TextView) value5).setText(aVar.f25664n);
            ViewExtensions.m12860d(mo37595g());
            Object value6 = this.f25648g.getValue();
            C19383o.m32796f(value6, "<get-disclaimerText>(...)");
            ViewExtensions.m12860d((TextView) value6);
            Object value7 = this.f25647f.getValue();
            C19383o.m32796f(value7, "<get-expiredCouponText>(...)");
            ViewExtensions.m12869m((TextView) value7);
        }
        Object value8 = this.f25645d.getValue();
        C19383o.m32796f(value8, "<get-shopAvatar>(...)");
        ViewExtensions.m12866j((ImageView) value8, new NotificationHolderThankYouCoupon$bind$1(this, aVar));
        Object value9 = this.f25646e.getValue();
        C19383o.m32796f(value9, "<get-notificationText>(...)");
        ViewExtensions.m12866j((TextView) value9, new NotificationHolderThankYouCoupon$bind$2(this, aVar));
        ViewExtensions.m12866j(mo37595g(), new NotificationHolderThankYouCoupon$bind$3(this, aVar));
    }

    /* renamed from: g */
    public final Button mo37595g() {
        Object value = this.f25650i.getValue();
        C19383o.m32796f(value, "<get-applyCouponButton>(...)");
        return (Button) value;
    }
}
