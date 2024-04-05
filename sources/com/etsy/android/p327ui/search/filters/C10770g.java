package com.etsy.android.p327ui.search.filters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p396mb.C13037c;
import p396mb.C13042h;
import p404nb.C13100a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.g */
public final class C10770g extends C3200w<FacetCount, C10772b> {

    /* renamed from: c */
    public final C19857l<FacetCount, C19394m> f23775c;

    /* renamed from: d */
    public final C19857l<FacetCount, C19394m> f23776d;

    /* renamed from: com.etsy.android.ui.search.filters.g$a */
    public static final class C10771a extends C3167n.C3172e<FacetCount> {

        /* renamed from: a */
        public static final C10771a f23777a = new C10771a();

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

    /* renamed from: com.etsy.android.ui.search.filters.g$b */
    public final class C10772b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public TextView f23778b;

        /* renamed from: c */
        public final C13037c f23779c = new C13037c(new C10773a(this));

        /* renamed from: com.etsy.android.ui.search.filters.g$b$a */
        public static final class C10773a implements C13042h.C13043a {

            /* renamed from: a */
            public final /* synthetic */ C10772b f23781a;

            public C10773a(C10772b bVar) {
                this.f23781a = bVar;
            }

            /* renamed from: a */
            public final boolean mo30839a(Bundle bundle) {
                TextView textView = this.f23781a.f23778b;
                if (textView != null) {
                    return textView.performClick();
                }
                return false;
            }
        }

        public C10772b(View view) {
            super(view);
            View view2 = this.itemView;
            C19383o.m32795e(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f23778b = (TextView) ((LinearLayout) view2).findViewById(R.id.text_category);
            TextView textView = this.f23778b;
            if (textView != null) {
                ViewsExtensionsKt.m17423b(textView, AccessibilityClassNames.BUTTON);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10770g(C19857l<? super FacetCount, C19394m> lVar, C19857l<? super FacetCount, C19394m> lVar2) {
        super(C10771a.f23777a);
        C19383o.m32797g(lVar, "updateTopLevelCategories");
        this.f23775c = lVar;
        this.f23776d = lVar2;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10772b bVar = (C10772b) b0Var;
        C19383o.m32797g(bVar, "holder");
        FacetCount facetCount = (FacetCount) C10770g.this.getItem(i);
        TextView textView = bVar.f23778b;
        if (textView != null) {
            if (facetCount.getChildren().size() > 0) {
                C13100a.m20770a(textView, bVar.f23779c);
            }
            textView.setText(facetCount.getName());
        }
        View view = bVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new SubCategoryOptionsAdapter$ViewHolder$bind$2(facetCount, C10770g.this));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_filter_category, viewGroup, false);
        C19383o.m32796f(inflate, "from(parent.context).inf…      false\n            )");
        return new C10772b(inflate);
    }
}
