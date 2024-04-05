package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.t */
public final /* synthetic */ class C11024t implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ int f24442b = 6;

    /* renamed from: c */
    public final /* synthetic */ C19846a f24443c;

    public /* synthetic */ C11024t(C19846a aVar) {
        this.f24443c = aVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.f24442b;
        C19846a aVar = this.f24443c;
        C19383o.m32797g(aVar, "$performAction");
        if (i != i2) {
            return false;
        }
        aVar.invoke();
        return true;
    }
}
