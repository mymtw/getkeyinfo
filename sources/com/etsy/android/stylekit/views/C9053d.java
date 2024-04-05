package com.etsy.android.stylekit.views;

import android.view.View;
import com.etsy.android.p327ui.conversation.list.ccm.ConversationListFragment;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.etsy.android.p327ui.user.inappnotifications.tooltips.IANTooltipDismissType;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginFragment;
import com.paypal.pyplcheckout.home.view.customviews.LinkTextView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p491ye.C13915a;
import p491ye.C13916b;
import p726zi.C18917l;
import p753kq.C19857l;

/* renamed from: com.etsy.android.stylekit.views.d */
public final /* synthetic */ class C9053d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19925b;

    /* renamed from: c */
    public final /* synthetic */ Object f19926c;

    public /* synthetic */ C9053d(Object obj, int i) {
        this.f19925b = i;
        this.f19926c = obj;
    }

    public final void onClick(View view) {
        switch (this.f19925b) {
            case 0:
                CollageContentToggle.m34884setPopOut$lambda1((CollageContentToggle) this.f19926c, view);
                return;
            case 1:
                ConversationListFragment.m34959showErrorView$lambda6$lambda5((ConversationListFragment) this.f19926c, view);
                return;
            case 2:
                HomePagerFragment.m35001initializeSearchBar$lambda13((HomePagerFragment) this.f19926c, view);
                return;
            case 3:
                ThirdPartySignInFragment.m35019onViewCreated$lambda6((ThirdPartySignInFragment) this.f19926c, view);
                return;
            case 4:
                C13915a aVar = (C13915a) this.f19926c;
                C19383o.m32797g(aVar, "this$0");
                C19857l<? super C13916b, C19394m> lVar = aVar.f30577c;
                if (lVar != null) {
                    lVar.invoke(new C13916b.C13917a(aVar.f30578d, IANTooltipDismissType.EXPLICIT_DISMISS));
                    return;
                }
                return;
            case 5:
                C18917l.m32011a((C18917l) this.f19926c, view);
                return;
            case 6:
                SplitLoginFragment.m35141setUpViewsAction$lambda5((SplitLoginFragment) this.f19926c, view);
                return;
            default:
                LinkTextView.m35286checkForMissingLinks$lambda7((LinkTextView) this.f19926c, view);
                return;
        }
    }
}
