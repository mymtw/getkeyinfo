package com.appboy.p043ui.widget;

import android.view.View;
import com.appboy.models.cards.CaptionedImageCard;
import com.etsy.android.lib.models.StyledBannerModel;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.vespa.viewholders.C12083c0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p468ve.C13786c;
import p753kq.C19846a;

/* renamed from: com.appboy.ui.widget.b */
public final /* synthetic */ class C4956b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f11159b;

    /* renamed from: c */
    public final /* synthetic */ Object f11160c;

    /* renamed from: d */
    public final /* synthetic */ Object f11161d;

    public /* synthetic */ C4956b(int i, Object obj, Object obj2) {
        this.f11159b = i;
        this.f11160c = obj;
        this.f11161d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f11159b) {
            case 0:
                ((CaptionedImageCardView) this.f11160c).lambda$onSetCard$0((CaptionedImageCard) this.f11161d, view);
                return;
            case 1:
                C13786c cVar = (C13786c) this.f11160c;
                StyledBannerModel styledBannerModel = (StyledBannerModel) this.f11161d;
                int i = C13786c.f30322y;
                C19383o.m32797g(cVar, "this$0");
                C19383o.m32797g(styledBannerModel, "$model");
                cVar.f30325e.mo31328c(styledBannerModel);
                return;
            default:
                C12083c0 c0Var = (C12083c0) this.f11160c;
                UserAction userAction = (UserAction) this.f11161d;
                int i2 = C12083c0.f26954e;
                C19383o.m32797g(c0Var, "this$0");
                C19846a<C19394m> aVar = c0Var.f26955c.f29086f;
                if (aVar != null) {
                    aVar.invoke();
                }
                c0Var.f26955c.mo31328c(userAction);
                return;
        }
    }
}
