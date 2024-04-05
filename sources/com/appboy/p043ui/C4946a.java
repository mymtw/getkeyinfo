package com.appboy.p043ui;

import android.content.Context;
import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;

/* renamed from: com.appboy.ui.a */
public final /* synthetic */ class C4946a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f11138b;

    /* renamed from: c */
    public final /* synthetic */ Object f11139c;

    /* renamed from: d */
    public final /* synthetic */ Object f11140d;

    /* renamed from: e */
    public final /* synthetic */ Object f11141e;

    public /* synthetic */ C4946a(Object obj, int i, Object obj2, Object obj3) {
        this.f11138b = i;
        this.f11139c = obj;
        this.f11140d = obj2;
        this.f11141e = obj3;
    }

    public final void run() {
        switch (this.f11138b) {
            case 0:
                FeedUpdatedEvent feedUpdatedEvent = (FeedUpdatedEvent) this.f11140d;
                ((AppboyFeedFragment) this.f11139c).lambda$onViewCreated$2(feedUpdatedEvent, (ListView) this.f11141e);
                return;
            default:
                ((SessionManager) this.f11139c).lambda$setApplicationContext$0((Context) this.f11140d, (PerfSession) this.f11141e);
                return;
        }
    }
}
