package com.etsy.android.p327ui.user.inappnotifications;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p456ua.C13461f;
import p464va.C13552e;

/* renamed from: com.etsy.android.ui.user.inappnotifications.g */
public final class C11553g {

    /* renamed from: a */
    public final C11559l f25580a;

    /* renamed from: b */
    public final C11562o f25581b;

    /* renamed from: c */
    public final C8672b f25582c;

    /* renamed from: d */
    public final C13461f f25583d;

    /* renamed from: e */
    public final UserBadgeCountManager f25584e;

    /* renamed from: f */
    public final C13552e f25585f;

    /* renamed from: g */
    public final C7091a f25586g = new C7091a();

    /* renamed from: h */
    public int f25587h;

    /* renamed from: i */
    public InAppNotification f25588i;

    public C11553g(InAppNotificationsFragment inAppNotificationsFragment, C11562o oVar, C8672b bVar, C13461f fVar, UserBadgeCountManager userBadgeCountManager, C13552e eVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(userBadgeCountManager, "userBadgeCountManager");
        this.f25580a = inAppNotificationsFragment;
        this.f25581b = oVar;
        this.f25582c = bVar;
        this.f25583d = fVar;
        this.f25584e = userBadgeCountManager;
        this.f25585f = eVar;
    }

    /* renamed from: a */
    public static final void m19344a(C11553g gVar, long j, boolean z, String str, Long l) {
        gVar.f25582c.mo21333d(z ? "favorite_item" : "remove_favorite_item", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(j)), new Pair(PredefinedAnalyticsProperty.NOTIFICATION_FEED_INDEX, l), new Pair(PredefinedAnalyticsProperty.NOTIFICATION_FEED_ID, str)));
    }

    /* renamed from: b */
    public final void mo37562b(RecyclerView recyclerView) {
        C19383o.m32797g(recyclerView, "recyclerView");
        RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
        C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int U0 = ((LinearLayoutManager) layoutManager).mo11284U0();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z = false;
        if (U0 < (adapter != null ? adapter.getItemCount() : 0) && U0 != -1) {
            z = true;
        }
        if (z && U0 > this.f25587h) {
            this.f25587h = U0;
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            C19383o.m32795e(adapter2, "null cannot be cast to non-null type com.etsy.android.ui.user.inappnotifications.IANAdapter");
            this.f25588i = (InAppNotification) ((C11542b) adapter2).getItem(this.f25587h);
        }
    }
}
