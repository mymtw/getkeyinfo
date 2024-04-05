package com.etsy.android.p327ui.search.shopresults;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.uikit.adapter.C11832c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.shopresults.b */
public final class C10936b extends C11832c<ShopCard> {

    /* renamed from: c */
    public final C19857l<Long, C19394m> f24281c;

    /* renamed from: d */
    public C10937c f24282d;

    public C10936b(FragmentActivity fragmentActivity, C19857l<? super Long, C19394m> lVar) {
        super(fragmentActivity);
        this.f24281c = lVar;
    }

    public final int getListItemViewType(int i) {
        return 0;
    }

    public final void onBindHeaderViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10938d dVar = b0Var instanceof C10938d ? (C10938d) b0Var : null;
        if (dVar != null) {
            C10937c cVar = this.f24282d;
            if (cVar != null) {
                ViewExtensions.m12869m(dVar.itemView);
                dVar.f24284c.setText(cVar.f24283a);
                return;
            }
            ViewExtensions.m12860d(dVar.itemView);
        }
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32797g(b0Var, "holder");
        C10935a aVar = b0Var instanceof C10935a ? (C10935a) b0Var : null;
        if (aVar != null) {
            ShopCard shopCard = (ShopCard) this.mItems.get(i - getHeaderCount());
            C19383o.m32796f(shopCard, "item");
            aVar.mo19450a(shopCard);
        }
    }

    public final RecyclerView.C3084b0 onCreateHeaderViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (i == 1) {
            return new C10938d(viewGroup);
        }
        throw new IllegalStateException(C0015b.m88g("Unexpected header viewtype ", i));
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C10935a(viewGroup, this.f24281c);
    }
}
