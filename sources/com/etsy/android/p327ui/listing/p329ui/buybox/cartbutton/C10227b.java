package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton;

import android.view.MotionEvent;
import android.view.View;
import com.etsy.android.p327ui.core.C9613a;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.b */
public final /* synthetic */ class C10227b implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ CartButtonViewHolder f22493b;

    /* renamed from: c */
    public final /* synthetic */ C10423j f22494c;

    public /* synthetic */ C10227b(CartButtonViewHolder cartButtonViewHolder, C10423j jVar) {
        this.f22493b = cartButtonViewHolder;
        this.f22494c = jVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        CartButtonViewHolder cartButtonViewHolder = this.f22493b;
        C10423j jVar = this.f22494c;
        C19383o.m32797g(cartButtonViewHolder, "this$0");
        C19383o.m32797g(jVar, "$uiModel");
        if (motionEvent.getAction() == 1) {
            int[] iArr = new int[2];
            cartButtonViewHolder.f22487c.getLocationOnScreen(iArr);
            cartButtonViewHolder.f22486b.mo38043a(new C13597g.C13682m((C10225a) jVar, new C9613a(((int) motionEvent.getX()) + iArr[0], ((int) motionEvent.getY()) + iArr[1])));
        }
        return false;
    }
}
