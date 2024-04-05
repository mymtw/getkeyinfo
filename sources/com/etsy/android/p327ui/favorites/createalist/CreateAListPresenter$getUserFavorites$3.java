package com.etsy.android.p327ui.favorites.createalist;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.favorites.createalist.C9803e;
import com.etsy.android.p327ui.favorites.createalist.C9810f;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListPresenter$getUserFavorites$3 */
public final class CreateAListPresenter$getUserFavorites$3 extends Lambda implements C19857l<C9810f, C19394m> {
    public final /* synthetic */ CreateAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAListPresenter$getUserFavorites$3(CreateAListPresenter createAListPresenter) {
        super(1);
        this.this$0 = createAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9810f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9810f fVar) {
        if (fVar instanceof C9810f.C9814d) {
            ViewExtensions.m12869m((LoadingIndicatorView) this.this$0.f21666b._$_findCachedViewById(R.id.favorites_create_list_loading));
        } else if (fVar instanceof C9810f.C9813c) {
            this.this$0.mo32807a(((C9810f.C9813c) fVar).f21702a);
        } else if (fVar instanceof C9810f.C9811a) {
            C9799a aVar = this.this$0.f21671g;
            if (aVar != null) {
                aVar.mo32853a(new C9803e.C9809f(false));
            }
        } else if (fVar instanceof C9810f.C9812b) {
            CreateAListPresenter createAListPresenter = this.this$0;
            RecyclerView.Adapter adapter = ((RecyclerView) createAListPresenter.f21666b._$_findCachedViewById(R.id.favorites_create_list_recyclerview)).getAdapter();
            ViewExtensions.m12860d((LoadingIndicatorView) createAListPresenter.f21666b._$_findCachedViewById(R.id.favorites_create_list_loading));
            if (adapter == null || adapter.getItemCount() == 0) {
                ViewExtensions.m12860d((LinearLayout) createAListPresenter.f21666b._$_findCachedViewById(R.id.favorites_create_a_list_title_container));
                ViewExtensions.m12860d((Button) createAListPresenter.f21666b._$_findCachedViewById(R.id.favorites_create_list_skip));
                ViewExtensions.m12863g((RecyclerView) createAListPresenter.f21666b._$_findCachedViewById(R.id.favorites_create_list_recyclerview));
                ViewExtensions.m12869m((TextView) createAListPresenter.f21666b._$_findCachedViewById(R.id.favorites_create_list_error));
            }
        }
    }
}
