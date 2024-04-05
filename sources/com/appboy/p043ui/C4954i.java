package com.appboy.p043ui;

import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;
import com.etsy.android.p327ui.favorites.add.NameAListFragment;
import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: com.appboy.ui.i */
public final /* synthetic */ class C4954i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f11152b;

    /* renamed from: c */
    public final /* synthetic */ Object f11153c;

    /* renamed from: d */
    public final /* synthetic */ Object f11154d;

    /* renamed from: e */
    public final /* synthetic */ Object f11155e;

    public /* synthetic */ C4954i(Object obj, int i, Object obj2, Object obj3) {
        this.f11152b = i;
        this.f11153c = obj;
        this.f11154d = obj2;
        this.f11155e = obj3;
    }

    public final void run() {
        switch (this.f11152b) {
            case 0:
                FeedUpdatedEvent feedUpdatedEvent = (FeedUpdatedEvent) this.f11154d;
                ((AppboyXamarinFormsFeedFragment) this.f11153c).lambda$onActivityCreated$2(feedUpdatedEvent, (ListView) this.f11155e);
                return;
            default:
                NameAListFragment.m34973back$lambda10((NameAListFragment) this.f11153c, (Ref$ObjectRef) this.f11154d, (Ref$ObjectRef) this.f11155e);
                return;
        }
    }
}
