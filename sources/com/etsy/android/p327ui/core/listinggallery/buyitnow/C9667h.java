package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.view.KeyEvent;
import android.widget.TextView;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.h */
public final /* synthetic */ class C9667h implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ C9671l f21421b;

    /* renamed from: c */
    public final /* synthetic */ CollageTextInput f21422c;

    /* renamed from: d */
    public final /* synthetic */ boolean f21423d;

    /* renamed from: e */
    public final /* synthetic */ int f21424e;

    /* renamed from: f */
    public final /* synthetic */ C19857l f21425f;

    public /* synthetic */ C9667h(C9671l lVar, CollageTextInput collageTextInput, boolean z, int i, C19857l lVar2) {
        this.f21421b = lVar;
        this.f21422c = collageTextInput;
        this.f21423d = z;
        this.f21424e = i;
        this.f21425f = lVar2;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C9671l lVar = this.f21421b;
        CollageTextInput collageTextInput = this.f21422c;
        boolean z = this.f21423d;
        int i2 = this.f21424e;
        C19857l lVar2 = this.f21425f;
        C19383o.m32797g(lVar, "this$0");
        C19383o.m32797g(collageTextInput, "$textInputPersonalization");
        C19383o.m32797g(lVar2, "$onPersonalizationEntered");
        if (i != 6) {
            return false;
        }
        lVar.mo32391b(collageTextInput, z, i2, lVar2);
        return true;
    }
}
