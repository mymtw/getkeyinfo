package com.appboy.p043ui.widget;

import android.view.View;
import com.appboy.models.cards.TextAnnouncementCard;

/* renamed from: com.appboy.ui.widget.d */
public final /* synthetic */ class C4958d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ TextAnnouncementCardView f11165b;

    /* renamed from: c */
    public final /* synthetic */ TextAnnouncementCard f11166c;

    public /* synthetic */ C4958d(TextAnnouncementCardView textAnnouncementCardView, TextAnnouncementCard textAnnouncementCard) {
        this.f11165b = textAnnouncementCardView;
        this.f11166c = textAnnouncementCard;
    }

    public final void onClick(View view) {
        this.f11165b.lambda$onSetCard$0(this.f11166c, view);
    }
}
