package com.braze.p044ui.contentcards.adapters;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.contentcards.adapters.a */
public final /* synthetic */ class C5635a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ContentCardAdapter f12045b;

    /* renamed from: c */
    public final /* synthetic */ int f12046c;

    public /* synthetic */ C5635a(int i, ContentCardAdapter contentCardAdapter) {
        this.f12045b = contentCardAdapter;
        this.f12046c = i;
    }

    public final void run() {
        ContentCardAdapter contentCardAdapter = this.f12045b;
        int i = this.f12046c;
        C19383o.m32797g(contentCardAdapter, "this$0");
        contentCardAdapter.notifyItemChanged(i);
    }
}
