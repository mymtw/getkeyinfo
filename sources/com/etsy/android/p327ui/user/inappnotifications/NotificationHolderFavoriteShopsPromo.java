package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8672b;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo */
public final class NotificationHolderFavoriteShopsPromo extends RecyclerView.C3084b0 {

    /* renamed from: e */
    public static final /* synthetic */ int f25462e = 0;

    /* renamed from: b */
    public final C8672b f25463b;

    /* renamed from: c */
    public final C19857l<C11564q, C19394m> f25464c;

    /* renamed from: d */
    public final C19285c f25465d = C19350d.m32677b(new NotificationHolderFavoriteShopsPromo$dismissButton$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderFavoriteShopsPromo(View view, C8672b bVar, C19857l<? super C11564q, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25463b = bVar;
        this.f25464c = lVar;
    }
}
