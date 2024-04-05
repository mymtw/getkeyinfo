package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11047d;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11064o;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder */
public final class MultipleListingSuggestionViewHolder extends C11100x {

    /* renamed from: b */
    public final C19846a<C19394m> f24468b;

    /* renamed from: c */
    public final ListingAdapter f24469c;

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$ListingAdapter */
    public static final class ListingAdapter extends C3200w<C11064o.C11068d, MyAdapterViewHolder> {

        /* renamed from: c */
        public final C11047d.C11049b f24470c;

        /* renamed from: com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$ListingAdapter$MyAdapterViewHolder */
        public final class MyAdapterViewHolder extends RecyclerView.C3084b0 implements View.OnClickListener {
            private final ImageView imgView;
            public final /* synthetic */ ListingAdapter this$0;
            private final View view;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public MyAdapterViewHolder(ListingAdapter listingAdapter, View view2) {
                super(view2);
                C19383o.m32797g(view2, "view");
                this.this$0 = listingAdapter;
                this.view = view2;
                this.imgView = (ImageView) view2.findViewById(R.id.listing_image);
                view2.setOnClickListener(this);
            }

            public final void bind(C11064o.C11068d dVar) {
                C19383o.m32797g(dVar, "item");
                C0114h.m272C0(this.view).load(dVar.f24527c).mo16816M(this.imgView);
                this.imgView.setContentDescription(dVar.f24525a);
            }

            public final View getView() {
                return this.view;
            }

            public void onClick(View view2) {
                this.this$0.f24470c.onListingClicked(((C11064o.C11068d) this.this$0.getItem(getAdapterPosition())).f24526b);
            }
        }

        /* renamed from: com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$ListingAdapter$a */
        public static final class C11032a extends C3167n.C3172e<C11064o.C11068d> {

            /* renamed from: a */
            public static final C11032a f24471a = new C11032a();

            /* renamed from: a */
            public final boolean mo11900a(Object obj, Object obj2) {
                return C19383o.m32792b((C11064o.C11068d) obj, (C11064o.C11068d) obj2);
            }

            /* renamed from: b */
            public final boolean mo11901b(Object obj, Object obj2) {
                return C19383o.m32792b((C11064o.C11068d) obj, (C11064o.C11068d) obj2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ListingAdapter(C11047d.C11049b bVar) {
            super(C11032a.f24471a);
            C19383o.m32797g(bVar, "callback");
            this.f24470c = bVar;
        }

        public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            MyAdapterViewHolder myAdapterViewHolder = (MyAdapterViewHolder) b0Var;
            C19383o.m32797g(myAdapterViewHolder, "holder");
            Object item = getItem(i);
            C19383o.m32796f(item, "getItem(position)");
            myAdapterViewHolder.bind((C11064o.C11068d) item);
        }

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.search_list_item_card_view, viewGroup, false);
            C19383o.m32796f(h, "view");
            return new MyAdapterViewHolder(this, h);
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$a */
    public static final class C11033a extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ MultipleListingSuggestionViewHolder f24472b;

        public C11033a(MultipleListingSuggestionViewHolder multipleListingSuggestionViewHolder) {
            this.f24472b = multipleListingSuggestionViewHolder;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (!recyclerView.canScrollHorizontally(1)) {
                this.f24472b.f24468b.invoke();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultipleListingSuggestionViewHolder(android.view.ViewGroup r4, com.etsy.android.p327ui.search.p330v2.suggestions.C11047d.C11049b r5, p753kq.C19846a<kotlin.C19394m> r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "onListingSelect"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            java.lang.String r0 = "onScrollEnd"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624687(0x7f0e02ef, float:1.887656E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            java.lang.String r1 = "from(parent.context)\n   …LAYOUT_ID, parent, false)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            r3.<init>(r0)
            r3.f24468b = r6
            android.view.View r6 = r3.itemView
            r0 = 2131429534(0x7f0b089e, float:1.8480743E38)
            android.view.View r6 = r6.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.rv_recently_viewed)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$ListingAdapter r0 = new com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$ListingAdapter
            r0.<init>(r5)
            r3.f24469c = r0
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.getContext()
            r5.<init>(r2, r2)
            r6.setLayoutManager(r5)
            r6.setAdapter(r0)
            com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$a r4 = new com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$a
            r4.<init>(r3)
            r6.addOnScrollListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.suggestions.MultipleListingSuggestionViewHolder.<init>(android.view.ViewGroup, com.etsy.android.ui.search.v2.suggestions.d$b, kq.a):void");
    }
}
