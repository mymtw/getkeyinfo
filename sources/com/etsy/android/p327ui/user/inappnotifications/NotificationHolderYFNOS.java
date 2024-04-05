package com.etsy.android.p327ui.user.inappnotifications;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.github.rubensousa.gravitysnaphelper.C12600a;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p483xe.C13880a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS */
public final class NotificationHolderYFNOS extends RecyclerView.C3084b0 implements C13880a {

    /* renamed from: g */
    public static int f25517g;

    /* renamed from: h */
    public static int f25518h;

    /* renamed from: b */
    public final C8672b f25519b;

    /* renamed from: c */
    public final C19857l<C11564q, C19394m> f25520c;

    /* renamed from: d */
    public final C19285c f25521d = C19350d.m32677b(new NotificationHolderYFNOS$recyclerView$2(this));

    /* renamed from: e */
    public final C19285c f25522e = C19350d.m32677b(new NotificationHolderYFNOS$notificationText$2(this));

    /* renamed from: f */
    public final C19285c f25523f = C19350d.m32677b(new NotificationHolderYFNOS$shopAvatar$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderYFNOS(View view, C8672b bVar, C19857l<? super C11564q, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25519b = bVar;
        this.f25520c = lVar;
        Resources resources = view.getContext().getResources();
        f25517g = resources.getDimensionPixelSize(R.dimen.clg_icon_size_larger);
        f25518h = resources.getDimensionPixelSize(R.dimen.clg_space_12);
        C12600a aVar = new C12600a(8388611);
        aVar.f27811k = true;
        aVar.mo11867a(mo37526e());
        RecyclerView.C3094l itemAnimator = mo37526e().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7067f = 0;
        }
        mo37526e().addItemDecoration(new C11576s(f25518h));
    }

    /* renamed from: c */
    public final void mo37492c(IANListingCard iANListingCard) {
        RecyclerView.Adapter adapter = mo37526e().getAdapter();
        C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANListingAdapter");
        List<IANListingCard> list = ((C11548c) adapter).f25544b;
        Integer valueOf = list != null ? Integer.valueOf(list.indexOf(iANListingCard)) : null;
        if (valueOf != null) {
            valueOf.intValue();
            RecyclerView.Adapter adapter2 = mo37526e().getAdapter();
            C19383o.m32795e(adapter2, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANListingAdapter");
            ((C11548c) adapter2).notifyItemChanged(valueOf.intValue());
        }
    }

    /* renamed from: e */
    public final RecyclerView mo37526e() {
        Object value = this.f25521d.getValue();
        C19383o.m32796f(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: f */
    public final void mo37527f(long j, String str, Long l) {
        C1993m.m4359T(this.f25519b, new C11540a("notification_tapped_listing", l, str, Long.valueOf(j), (Long) null, (Boolean) null, (String) null, (String) null, 240));
    }
}
