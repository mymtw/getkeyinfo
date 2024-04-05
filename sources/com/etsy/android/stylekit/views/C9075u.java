package com.etsy.android.stylekit.views;

import android.view.View;
import com.etsy.android.p327ui.conversation.list.ccm.ConversationListFragment;

/* renamed from: com.etsy.android.stylekit.views.u */
public final /* synthetic */ class C9075u implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f19960b;

    /* renamed from: c */
    public final /* synthetic */ Object f19961c;

    public /* synthetic */ C9075u(Object obj, int i) {
        this.f19960b = i;
        this.f19961c = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.f19960b) {
            case 0:
                CollageTypeAhead.m34905setValidator$lambda4((CollageTypeAhead) this.f19961c, view, z);
                return;
            default:
                ConversationListFragment.m34955initializeSearchBar$lambda2((ConversationListFragment) this.f19961c, view, z);
                return;
        }
    }
}
