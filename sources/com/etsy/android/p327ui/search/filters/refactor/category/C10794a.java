package com.etsy.android.p327ui.search.filters.refactor.category;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10789b;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p441sb.C13367a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.category.a */
public final class C10794a extends C3200w<C10789b, C10796b> {

    /* renamed from: c */
    public final C19857l<C10813l, C19394m> f23914c;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.category.a$a */
    public static final class C10795a extends C3167n.C3172e<C10789b> {

        /* renamed from: a */
        public static final C10795a f23915a = new C10795a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((C10789b) obj, (C10789b) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(((C10789b) obj).f23890a, ((C10789b) obj2).f23890a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10794a(C19857l<? super C10813l, C19394m> lVar) {
        super(C10795a.f23915a);
        C19383o.m32797g(lVar, "onItemChange");
        this.f23914c = lVar;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10796b bVar = (C10796b) b0Var;
        C19383o.m32797g(bVar, "holder");
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        C10789b bVar2 = (C10789b) item;
        bVar.f23917c.setText(bVar2.f23891b);
        ViewExtensions.m12870n(bVar.f23918d, new CategoryViewHolder$bind$1(bVar2));
        C19388s.m32810A0(bVar.f23917c, bVar2.f23892c ? new C13367a.C13368a() : new C13367a.C13370c());
        TextView textView = bVar.f23917c;
        int i2 = bVar2.f23894e;
        C19383o.m32798h(textView, "$this$setPaddingStart");
        textView.setPaddingRelative(bVar.itemView.getResources().getDimensionPixelOffset(R.dimen.clg_space_16) * i2, textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
        View view = bVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new CategoryViewHolder$bind$2(bVar, bVar2));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C10796b(viewGroup, this.f23914c);
    }
}
