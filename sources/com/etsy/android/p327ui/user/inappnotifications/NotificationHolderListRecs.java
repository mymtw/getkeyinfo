package com.etsy.android.p327ui.user.inappnotifications;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CollectionContainerKey;
import com.etsy.android.p327ui.navigation.specs.CollectionWithRecsSpec;
import com.github.rubensousa.gravitysnaphelper.C12600a;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p483xe.C13880a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs */
public final class NotificationHolderListRecs extends RecyclerView.C3084b0 implements C13880a {

    /* renamed from: f */
    public static int f25471f;

    /* renamed from: g */
    public static int f25472g;

    /* renamed from: b */
    public final C8672b f25473b;

    /* renamed from: c */
    public final C19857l<C11564q, C19394m> f25474c;

    /* renamed from: d */
    public final C19285c f25475d = C19350d.m32677b(new NotificationHolderListRecs$recyclerView$2(this));

    /* renamed from: e */
    public final C19285c f25476e = C19350d.m32677b(new NotificationHolderListRecs$viewAllButton$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderListRecs(View view, C8672b bVar, C19857l<? super C11564q, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25473b = bVar;
        this.f25474c = lVar;
        Resources resources = view.getContext().getResources();
        f25471f = resources.getDimensionPixelSize(R.dimen.clg_icon_size_larger);
        f25472g = resources.getDimensionPixelSize(R.dimen.clg_space_12);
        C12600a aVar = new C12600a(8388611);
        aVar.f27811k = true;
        aVar.mo11867a(mo37503f());
        RecyclerView.C3094l itemAnimator = mo37503f().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7067f = 0;
        }
        mo37503f().addItemDecoration(new C11576s(f25472g));
    }

    /* renamed from: e */
    public static final void m19316e(NotificationHolderListRecs notificationHolderListRecs, InAppNotificationListRec inAppNotificationListRec) {
        NotificationHolderListRecs notificationHolderListRecs2 = notificationHolderListRecs;
        Context context = notificationHolderListRecs2.itemView.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        C12788a.m20424c(fragmentActivity, new CollectionContainerKey(C19421p.m32935c0(fragmentActivity), (UserCollection) null, new CollectionWithRecsSpec(inAppNotificationListRec.getCollectionKey(), inAppNotificationListRec.getUserId(), inAppNotificationListRec.getCollectionSlug(), -1, inAppNotificationListRec.getCollectionId(), true), Boolean.TRUE, (String) null, (String) null, (Bundle) null, 114, (DefaultConstructorMarker) null));
        C1993m.m4359T(notificationHolderListRecs2.f25473b, new C11540a("notification_listrecs_tapped", inAppNotificationListRec.getFeedIndex(), inAppNotificationListRec.getFeedId(), (Long) null, (Long) null, (Boolean) null, (String) null, "list_suggestions", 120));
    }

    /* renamed from: c */
    public final void mo37492c(IANListingCard iANListingCard) {
        RecyclerView.Adapter adapter = mo37503f().getAdapter();
        C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANListingAdapter");
        List<IANListingCard> list = ((C11548c) adapter).f25544b;
        Integer valueOf = list != null ? Integer.valueOf(list.indexOf(iANListingCard)) : null;
        if (valueOf != null) {
            valueOf.intValue();
            RecyclerView.Adapter adapter2 = mo37503f().getAdapter();
            C19383o.m32795e(adapter2, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANListingAdapter");
            ((C11548c) adapter2).notifyItemChanged(valueOf.intValue());
        }
    }

    /* renamed from: f */
    public final RecyclerView mo37503f() {
        Object value = this.f25475d.getValue();
        C19383o.m32796f(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: g */
    public final Button mo37504g() {
        Object value = this.f25476e.getValue();
        C19383o.m32796f(value, "<get-viewAllButton>(...)");
        return (Button) value;
    }
}
