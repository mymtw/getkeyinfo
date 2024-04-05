package com.appboy.p043ui;

import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;
import p301z3.C8434d;

/* renamed from: com.appboy.ui.h */
public final /* synthetic */ class C4953h implements C8434d {

    /* renamed from: a */
    public final /* synthetic */ AppboyXamarinFormsFeedFragment f11150a;

    /* renamed from: b */
    public final /* synthetic */ ListView f11151b;

    public /* synthetic */ C4953h(AppboyXamarinFormsFeedFragment appboyXamarinFormsFeedFragment, ListView listView) {
        this.f11150a = appboyXamarinFormsFeedFragment;
        this.f11151b = listView;
    }

    /* renamed from: a */
    public final void mo13107a(Object obj) {
        this.f11150a.lambda$onActivityCreated$3(this.f11151b, (FeedUpdatedEvent) obj);
    }
}
