package com.etsy.android.p327ui.cart.bottomsheets;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.OfferingOption;
import com.etsy.android.stylekit.views.CollageListItem;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.subjects.PublishSubject;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.a */
public final class C9254a extends RecyclerView.Adapter<C9255a> {

    /* renamed from: b */
    public final C19857l<OfferingOption, C19394m> f20439b;

    /* renamed from: c */
    public final ArrayList f20440c = new ArrayList();

    /* renamed from: com.etsy.android.ui.cart.bottomsheets.a$a */
    public static final class C9255a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final C19857l<OfferingOption, C19394m> f20441b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9255a(ViewGroup viewGroup, C19857l<? super OfferingOption, C19394m> lVar) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_cart_bottomsheet_variation, viewGroup, false));
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            C19383o.m32797g(lVar, "onItemClick");
            this.f20441b = lVar;
        }
    }

    public C9254a(C19857l<? super OfferingOption, C19394m> lVar) {
        this.f20439b = lVar;
        new PublishSubject();
    }

    public final int getItemCount() {
        return this.f20440c.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C9255a aVar = (C9255a) b0Var;
        C19383o.m32797g(aVar, "holder");
        OfferingOption offeringOption = (OfferingOption) this.f20440c.get(i);
        C19383o.m32797g(offeringOption, "option");
        View view = aVar.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
        ((CollageListItem) view).setText(offeringOption.getFormattedDisplayValue());
        if (offeringOption.isEnabled()) {
            aVar.itemView.setEnabled(true);
        } else {
            aVar.itemView.setEnabled(false);
        }
        View view2 = aVar.itemView;
        C19383o.m32796f(view2, "itemView");
        ViewExtensions.m12866j(view2, new SelectVariationAdapter$VariationViewHolder$bind$1(aVar, offeringOption));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C9255a(viewGroup, this.f20439b);
    }
}
