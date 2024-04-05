package com.etsy.android.p327ui.conversation.list.ccm;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.c */
public final /* synthetic */ class C9579c implements SwipeRefreshLayout.C3293j {

    /* renamed from: b */
    public final /* synthetic */ ConversationListFragment f21246b;

    public /* synthetic */ C9579c(ConversationListFragment conversationListFragment) {
        this.f21246b = conversationListFragment;
    }

    public final void onRefresh() {
        ConversationListFragment.m34957onViewCreated$lambda0(this.f21246b);
    }
}
