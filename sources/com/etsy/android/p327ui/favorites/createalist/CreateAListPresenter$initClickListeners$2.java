package com.etsy.android.p327ui.favorites.createalist;

import android.view.View;
import com.etsy.android.p327ui.favorites.createalist.C9803e;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListPresenter$initClickListeners$2 */
final class CreateAListPresenter$initClickListeners$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CreateAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAListPresenter$initClickListeners$2(CreateAListPresenter createAListPresenter) {
        super(1);
        this.this$0 = createAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        CreateAListPresenter createAListPresenter = this.this$0;
        C9799a aVar = createAListPresenter.f21671g;
        if (aVar != null) {
            createAListPresenter.f21669e.getClass();
            aVar.mo32853a(new C9803e.C9807d(C9816h.m18087a()));
        }
    }
}
