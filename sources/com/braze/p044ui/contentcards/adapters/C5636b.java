package com.braze.p044ui.contentcards.adapters;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.contentcards.adapters.b */
public final /* synthetic */ class C5636b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f12047b;

    /* renamed from: c */
    public final /* synthetic */ int f12048c;

    /* renamed from: d */
    public final /* synthetic */ ContentCardAdapter f12049d;

    public /* synthetic */ C5636b(int i, int i2, ContentCardAdapter contentCardAdapter) {
        this.f12047b = i;
        this.f12048c = i2;
        this.f12049d = contentCardAdapter;
    }

    public final void run() {
        int i = this.f12047b;
        int i2 = this.f12048c;
        ContentCardAdapter contentCardAdapter = this.f12049d;
        C19383o.m32797g(contentCardAdapter, "this$0");
        contentCardAdapter.notifyItemRangeChanged(i2, (i - i2) + 1);
    }
}
