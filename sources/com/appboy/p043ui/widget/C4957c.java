package com.appboy.p043ui.widget;

import android.view.View;
import com.appboy.models.cards.ShortNewsCard;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.DismissAction;
import com.etsy.android.lib.models.StyledBannerModel;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cardview.clickhandlers.C9144y;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p468ve.C13786c;

/* renamed from: com.appboy.ui.widget.c */
public final /* synthetic */ class C4957c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f11162b;

    /* renamed from: c */
    public final /* synthetic */ Object f11163c;

    /* renamed from: d */
    public final /* synthetic */ Object f11164d;

    public /* synthetic */ C4957c(int i, Object obj, Object obj2) {
        this.f11162b = i;
        this.f11163c = obj;
        this.f11164d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f11162b) {
            case 0:
                ((ShortNewsCardView) this.f11163c).lambda$onSetCard$0((ShortNewsCard) this.f11164d, view);
                return;
            default:
                C13786c cVar = (C13786c) this.f11163c;
                StyledBannerModel styledBannerModel = (StyledBannerModel) this.f11164d;
                int i = C13786c.f30322y;
                C19383o.m32797g(cVar, "this$0");
                C19383o.m32797g(styledBannerModel, "$model");
                C8703p pVar = cVar.f30328h;
                DismissAction dismissAction = styledBannerModel.getDismissAction();
                C19383o.m32794d(dismissAction);
                ServerDrivenAction serverDrivenAction = null;
                pVar.mo21333d(dismissAction.getAnalyticsName(), (Map<? extends AnalyticsProperty, Object>) null);
                C9144y yVar = cVar.f30325e;
                View view2 = cVar.itemView;
                C19383o.m32796f(view2, "rootView");
                DismissAction dismissAction2 = styledBannerModel.getDismissAction();
                if (dismissAction2 != null) {
                    serverDrivenAction = dismissAction2.getAction();
                }
                C19383o.m32794d(serverDrivenAction);
                yVar.f20088e.mo45936d(view2, serverDrivenAction);
                return;
        }
    }
}
