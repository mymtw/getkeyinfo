package com.etsy.android.p327ui.favorites.createalist;

import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.createalist.C9803e;
import com.etsy.android.p327ui.favorites.createalist.C9827p;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListPresenter$createList$2 */
final class NameAListPresenter$createList$2 extends Lambda implements C19857l<C9827p, C19394m> {
    public final /* synthetic */ NameAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListPresenter$createList$2(NameAListPresenter nameAListPresenter) {
        super(1);
        this.this$0 = nameAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9827p) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9827p pVar) {
        this.this$0.mo32836a(true);
        if (pVar instanceof C9827p.C9829b) {
            NameAListPresenter nameAListPresenter = this.this$0;
            Collection collection = ((C9827p.C9829b) pVar).f21725a;
            ViewExtensions.m12860d((LoadingIndicatorView) nameAListPresenter.f21676a._$_findCachedViewById(R.id.favorites_name_list_loading));
            C9799a aVar = nameAListPresenter.f21680e;
            if (aVar != null) {
                nameAListPresenter.f21679d.getClass();
                aVar.mo32853a(new C9803e.C9805b(collection, C9816h.m18087a()));
            }
        } else if (pVar instanceof C9827p.C9828a) {
            ViewExtensions.m12860d((LoadingIndicatorView) this.this$0.f21676a._$_findCachedViewById(R.id.favorites_name_list_loading));
            String str = ((C9827p.C9828a) pVar).f21724a;
            if (str == null) {
                str = this.this$0.f21676a.getResources().getString(R.string.create_list_generic_error_msg);
                C19383o.m32796f(str, "fragment.resources.getSt…e_list_generic_error_msg)");
            }
            this.this$0.mo32837b(str);
        } else if (pVar instanceof C9827p.C9830c) {
            ViewExtensions.m12869m((LoadingIndicatorView) this.this$0.f21676a._$_findCachedViewById(R.id.favorites_name_list_loading));
        }
    }
}
