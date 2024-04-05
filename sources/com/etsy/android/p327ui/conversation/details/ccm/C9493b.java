package com.etsy.android.p327ui.conversation.details.ccm;

import android.view.View;
import com.etsy.android.lib.models.apiv3.Alert;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.b */
public final /* synthetic */ class C9493b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ConversationDetailsFragment f21053b;

    /* renamed from: c */
    public final /* synthetic */ Alert f21054c;

    /* renamed from: d */
    public final /* synthetic */ String f21055d;

    public /* synthetic */ C9493b(ConversationDetailsFragment conversationDetailsFragment, Alert alert, String str) {
        this.f21053b = conversationDetailsFragment;
        this.f21054c = alert;
        this.f21055d = str;
    }

    public final void onClick(View view) {
        ConversationDetailsFragment.m34942setNudgeBanner$lambda21$lambda20$lambda19(this.f21053b, this.f21054c, this.f21055d, view);
    }
}
