package com.appboy.p043ui;

import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;
import p301z3.C8434d;

/* renamed from: com.appboy.ui.d */
public final /* synthetic */ class C4949d implements C8434d {

    /* renamed from: a */
    public final /* synthetic */ AppboyFeedFragment f11143a;

    /* renamed from: b */
    public final /* synthetic */ ListView f11144b;

    public /* synthetic */ C4949d(AppboyFeedFragment appboyFeedFragment, ListView listView) {
        this.f11143a = appboyFeedFragment;
        this.f11144b = listView;
    }

    /* renamed from: a */
    public final void mo13107a(Object obj) {
        this.f11143a.lambda$onViewCreated$3(this.f11144b, (FeedUpdatedEvent) obj);
    }
}
