package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsFragment;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.h */
public final /* synthetic */ class C9180h implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20211b = 1;

    /* renamed from: c */
    public final /* synthetic */ String f20212c;

    /* renamed from: d */
    public final /* synthetic */ Object f20213d;

    /* renamed from: e */
    public final /* synthetic */ Object f20214e;

    public /* synthetic */ C9180h(LegacyConversationDetailsFragment legacyConversationDetailsFragment, Alert alert, String str) {
        this.f20213d = legacyConversationDetailsFragment;
        this.f20214e = alert;
        this.f20212c = str;
    }

    public /* synthetic */ C9180h(String str, C9183i iVar, ServerDrivenAction serverDrivenAction) {
        this.f20212c = str;
        this.f20213d = iVar;
        this.f20214e = serverDrivenAction;
    }

    public final void onClick(View view) {
        switch (this.f20211b) {
            case 0:
                String str = this.f20212c;
                C9183i iVar = (C9183i) this.f20213d;
                ServerDrivenAction serverDrivenAction = (ServerDrivenAction) this.f20214e;
                C19383o.m32797g(iVar, "this$0");
                C19383o.m32797g(serverDrivenAction, "$action");
                if (str != null) {
                    C8703p pVar = iVar.f20220d;
                    pVar.mo21333d(str + '_' + serverDrivenAction.getType() + "_clicked", (Map<? extends AnalyticsProperty, Object>) null);
                }
                C9282g gVar = iVar.f20219c;
                if (gVar != null) {
                    View view2 = iVar.itemView;
                    C19383o.m32796f(view2, "rootView");
                    gVar.mo45936d(view2, serverDrivenAction);
                    return;
                }
                return;
            default:
                LegacyConversationDetailsFragment.m34953showPersistentAlert$lambda10$lambda9$lambda8((LegacyConversationDetailsFragment) this.f20213d, (Alert) this.f20214e, this.f20212c, view);
                return;
        }
    }
}
