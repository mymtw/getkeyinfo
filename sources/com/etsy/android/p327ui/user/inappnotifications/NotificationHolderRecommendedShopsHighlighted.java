package com.etsy.android.p327ui.user.inappnotifications;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted */
public final class NotificationHolderRecommendedShopsHighlighted extends RecyclerView.C3084b0 {

    /* renamed from: m */
    public static final /* synthetic */ int f25491m = 0;

    /* renamed from: b */
    public final C8672b f25492b;

    /* renamed from: c */
    public final C19857l<C11564q, C19394m> f25493c;

    /* renamed from: d */
    public final C19285c f25494d = C19350d.m32677b(new C11539x8dbe97f4(this));

    /* renamed from: e */
    public final C19285c f25495e = C19350d.m32677b(new NotificationHolderRecommendedShopsHighlighted$title$2(this));

    /* renamed from: f */
    public final C19285c f25496f = C19350d.m32677b(new NotificationHolderRecommendedShopsHighlighted$subTitle$2(this));

    /* renamed from: g */
    public final C19285c f25497g = C19350d.m32677b(new NotificationHolderRecommendedShopsHighlighted$shopChipPanel$2(this));

    /* renamed from: h */
    public final C19285c f25498h = C19350d.m32677b(new NotificationHolderRecommendedShopsHighlighted$chip1$2(this));

    /* renamed from: i */
    public final C19285c f25499i = C19350d.m32677b(new NotificationHolderRecommendedShopsHighlighted$chip2$2(this));

    /* renamed from: j */
    public final C19285c f25500j = C19350d.m32677b(new NotificationHolderRecommendedShopsHighlighted$chip3$2(this));

    /* renamed from: k */
    public final C19285c f25501k = C19350d.m32677b(new NotificationHolderRecommendedShopsHighlighted$chip4$2(this));

    /* renamed from: l */
    public final C19285c f25502l = C19350d.m32677b(new NotificationHolderRecommendedShopsHighlighted$shopChipCards$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsHighlighted(View view, C8672b bVar, C19857l<? super C11564q, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25492b = bVar;
        this.f25493c = lVar;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.numeric_rating_star);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        layoutParams.width = C19543e0.m33295K(12, context);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Context context2 = this.itemView.getContext();
        C19383o.m32796f(context2, "itemView.context");
        layoutParams2.height = C19543e0.m33295K(12, context2);
    }

    /* renamed from: e */
    public static final ConstraintLayout m19326e(NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted) {
        Object value = notificationHolderRecommendedShopsHighlighted.f25497g.getValue();
        C19383o.m32796f(value, "<get-shopChipPanel>(...)");
        return (ConstraintLayout) value;
    }
}
