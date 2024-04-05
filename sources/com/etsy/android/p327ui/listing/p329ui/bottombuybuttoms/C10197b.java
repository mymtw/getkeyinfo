package com.etsy.android.p327ui.listing.p329ui.bottombuybuttoms;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.etsy.android.p327ui.core.C9613a;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.bottombuybuttoms.b */
public final /* synthetic */ class C10197b implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ Button f22406b;

    /* renamed from: c */
    public final /* synthetic */ HorizontalBuyButtonsViewHolder f22407c;

    /* renamed from: d */
    public final /* synthetic */ C10225a f22408d;

    public /* synthetic */ C10197b(Button button, HorizontalBuyButtonsViewHolder horizontalBuyButtonsViewHolder, C10225a aVar) {
        this.f22406b = button;
        this.f22407c = horizontalBuyButtonsViewHolder;
        this.f22408d = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Button button = this.f22406b;
        HorizontalBuyButtonsViewHolder horizontalBuyButtonsViewHolder = this.f22407c;
        C10225a aVar = this.f22408d;
        C19383o.m32797g(button, "$button");
        C19383o.m32797g(horizontalBuyButtonsViewHolder, "this$0");
        C19383o.m32797g(aVar, "$cartButton");
        if (motionEvent.getAction() == 1) {
            int[] iArr = new int[2];
            button.getLocationOnScreen(iArr);
            horizontalBuyButtonsViewHolder.f22397b.mo38043a(new C13597g.C13682m(aVar, new C9613a(((int) motionEvent.getX()) + iArr[0], ((int) motionEvent.getY()) + iArr[1])));
        }
        return false;
    }
}
