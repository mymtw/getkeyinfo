package com.etsy.android.p327ui.search.filters.adapter;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C2273a;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.filters.C10770g;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p088e1.C6689b;
import p280x0.C8292f;
import p396mb.C13036b;
import p396mb.C13042h;
import p404nb.C13100a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.filters.adapter.b */
public final class C10759b extends C3200w<FacetCount, C10761b> {

    /* renamed from: c */
    public final C19861p<FacetCount, List<FacetCount>, Boolean> f23708c;

    /* renamed from: d */
    public final C19857l<FacetCount, C19394m> f23709d;

    /* renamed from: com.etsy.android.ui.search.filters.adapter.b$a */
    public static final class C10760a extends C3167n.C3172e<FacetCount> {

        /* renamed from: a */
        public static final C10760a f23710a = new C10760a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            FacetCount facetCount = (FacetCount) obj;
            FacetCount facetCount2 = (FacetCount) obj2;
            return false;
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b((FacetCount) obj, (FacetCount) obj2);
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.adapter.b$b */
    public final class C10761b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final LinearLayout f23711b;

        /* renamed from: c */
        public TextView f23712c;

        /* renamed from: d */
        public final LinearLayout f23713d;

        /* renamed from: e */
        public int f23714e = ((int) this.itemView.getResources().getDimension(R.dimen.clg_space_16));

        /* renamed from: f */
        public boolean f23715f;

        /* renamed from: g */
        public final C13036b f23716g = new C13036b(new C10763b(this));

        /* renamed from: com.etsy.android.ui.search.filters.adapter.b$b$a */
        public static final class C10762a extends C2273a {

            /* renamed from: a */
            public final /* synthetic */ C10761b f23718a;

            public C10762a(C10761b bVar) {
                this.f23718a = bVar;
            }

            public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
                if (bVar != null) {
                    bVar.mo18865o(this.f23718a.f23715f);
                    if (bVar.f14759a.isCheckable()) {
                        bVar.mo18866p(bVar.f14759a.isCheckable());
                    }
                }
            }
        }

        /* renamed from: com.etsy.android.ui.search.filters.adapter.b$b$b */
        public static final class C10763b implements C13042h.C13043a {

            /* renamed from: a */
            public final /* synthetic */ C10761b f23719a;

            public C10763b(C10761b bVar) {
                this.f23719a = bVar;
            }

            /* renamed from: a */
            public final boolean mo30839a(Bundle bundle) {
                TextView textView = this.f23719a.f23712c;
                if (textView != null) {
                    return textView.performClick();
                }
                return false;
            }
        }

        public C10761b(View view) {
            super(view);
            View view2 = this.itemView;
            C19383o.m32795e(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) view2;
            this.f23711b = linearLayout;
            this.f23712c = (TextView) linearLayout.findViewById(R.id.text_category);
            this.f23713d = (LinearLayout) linearLayout.findViewById(R.id.layout_sub_categories);
            TextView textView = this.f23712c;
            if (textView != null) {
                C2364y.m5201p(textView, new C10762a(this));
                ViewsExtensionsKt.m17423b(textView, AccessibilityClassNames.BUTTON);
            }
        }

        /* renamed from: e */
        public static final void m18643e(C10761b bVar, FacetCount facetCount) {
            bVar.getClass();
            ArrayList arrayList = new ArrayList();
            C10759b.this.f23708c.invoke(facetCount, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FacetCount facetCount2 = (FacetCount) it.next();
                facetCount2.setOpen(C19383o.m32792b(facetCount2, facetCount));
            }
            C10759b.this.mo11950j(arrayList);
        }
    }

    public C10759b(C19861p<? super FacetCount, ? super List<FacetCount>, Boolean> pVar, C19857l<? super FacetCount, C19394m> lVar) {
        super(C10760a.f23710a);
        this.f23708c = pVar;
        this.f23709d = lVar;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10761b bVar = (C10761b) b0Var;
        C19383o.m32797g(bVar, "holder");
        FacetCount facetCount = (FacetCount) C10759b.this.getItem(i);
        TextView textView = bVar.f23712c;
        if (textView != null) {
            if (facetCount.getChildren().size() > 0) {
                C13100a.m20770a(textView, bVar.f23716g);
            }
            textView.setText(facetCount.getName());
            int dimension = (int) bVar.itemView.getResources().getDimension(R.dimen.clg_space_16);
            bVar.f23714e = i * dimension;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(bVar.f23714e, dimension, dimension, dimension);
            textView.setLayoutParams(layoutParams);
        }
        if (facetCount.isOpen()) {
            TextView textView2 = bVar.f23712c;
            if (textView2 != null) {
                textView2.setTypeface(C8292f.m16582a(textView2.getContext(), R.font.clg_typeface_bold));
            }
            if (textView2 != null) {
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.clg_icon_core_check_v1, 0);
            }
            bVar.f23715f = true;
            int i2 = bVar.f23714e;
            TextView textView3 = bVar.f23712c;
            if (textView3 != null) {
                textView3.setTypeface(C8292f.m16582a(textView3.getContext(), R.font.clg_typeface_bold));
            }
            if (textView3 != null) {
                textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.clg_icon_core_check_v1, 0);
            }
            bVar.f23715f = true;
            Collections.sort(facetCount.getChildren(), FacetCount.byDecreasingCount);
            LinearLayout linearLayout = bVar.f23713d;
            if (linearLayout != null && linearLayout.getChildCount() > 1) {
                bVar.f23713d.removeViewAt(1);
            }
            C10770g gVar = new C10770g(C10759b.this.f23709d, new C10756x75916742(bVar));
            gVar.mo11950j(facetCount.getChildren());
            RecyclerView recyclerView = new RecyclerView(bVar.itemView.getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(((int) bVar.itemView.getResources().getDimension(R.dimen.clg_space_16)) + i2, 0, 0, 0);
            recyclerView.setLayoutParams(layoutParams2);
            recyclerView.setItemAnimator((RecyclerView.C3094l) null);
            bVar.itemView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.setAdapter(gVar);
            LinearLayout linearLayout2 = bVar.f23713d;
            if (linearLayout2 != null) {
                linearLayout2.addView(recyclerView);
            }
        } else {
            TextView textView4 = bVar.f23712c;
            if (textView4 != null) {
                textView4.setTypeface(C8292f.m16582a(textView4.getContext(), R.font.clg_typeface_normal));
            }
            if (textView4 != null) {
                textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            bVar.f23715f = false;
            bVar.f23711b.removeView(bVar.f23713d);
            LinearLayout linearLayout3 = bVar.f23713d;
            if (linearLayout3 != null) {
                linearLayout3.removeAllViews();
            }
            LinearLayout linearLayout4 = bVar.f23713d;
            if (linearLayout4 != null) {
                linearLayout4.addView(bVar.f23712c);
            }
        }
        View view = bVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new FiltersCategoriesAdapter$ViewHolder$bind$2(facetCount, bVar, C10759b.this));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_filter_category, viewGroup, false);
        C19383o.m32796f(inflate, "from(parent.context).inf…      false\n            )");
        return new C10761b(inflate);
    }
}
