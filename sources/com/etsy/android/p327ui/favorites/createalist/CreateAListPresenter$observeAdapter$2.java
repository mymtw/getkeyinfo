package com.etsy.android.p327ui.favorites.createalist;

import android.widget.Button;
import android.widget.TextView;
import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.favorites.createalist.C9803e;
import com.etsy.android.p327ui.favorites.createalist.C9819k;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListPresenter$observeAdapter$2 */
final class CreateAListPresenter$observeAdapter$2 extends Lambda implements C19857l<C9819k, C19394m> {
    public final /* synthetic */ CreateAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAListPresenter$observeAdapter$2(CreateAListPresenter createAListPresenter) {
        super(1);
        this.this$0 = createAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9819k) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9819k kVar) {
        boolean z = true;
        if (kVar instanceof C9819k.C9821b) {
            ViewExtensions.m12860d((TextView) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_title_error));
            this.this$0.f21669e.getClass();
            if (!C9816h.m18087a().isEmpty()) {
                C9799a aVar = this.this$0.f21671g;
                if (aVar != null) {
                    aVar.mo32853a(new C9803e.C9808e(true));
                }
                ViewExtensions.m12860d((Button) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_skip));
                ViewExtensions.m12869m((Button) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_next));
            }
        } else if (kVar instanceof C9819k.C9820a) {
            ViewExtensions.m12860d((TextView) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_title_error));
            this.this$0.f21669e.getClass();
            if (C9816h.m18087a().isEmpty()) {
                C9799a aVar2 = this.this$0.f21671g;
                if (aVar2 != null) {
                    aVar2.mo32853a(new C9803e.C9808e(false));
                }
                ViewExtensions.m12860d((Button) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_next));
                ViewExtensions.m12869m((Button) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_skip));
            }
        } else if (kVar instanceof C9819k.C9822c) {
            TextView textView = (TextView) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_title_error);
            if (!(textView == null || textView.getVisibility() == 8 || textView.getVisibility() == 4)) {
                if (!(textView.getAlpha() == 0.0f)) {
                    z = false;
                }
            }
            if (z) {
                ViewExtensions.m12859c((TextView) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_title_error), 250);
                C1948d.m4270b(this.this$0.f21670f.f19673a, 100);
            }
        }
    }
}
