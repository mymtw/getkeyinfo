package com.etsy.android.vespa.viewholders;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ReviewCarouselCard;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.uikit.view.CustomScrollingLayoutManager;
import com.github.rubensousa.gravitysnaphelper.C12600a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19388s;
import p357gf.C12796e;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13182k;
import p415of.C13183l;
import p415of.C13186o;
import p435rb.C13350a;
import p439rf.C13362a;
import p487ya.C13895a;

/* renamed from: com.etsy.android.vespa.viewholders.o */
public class C12100o extends C12086e<C13183l> {

    /* renamed from: k */
    public static final /* synthetic */ int f26986k = 0;

    /* renamed from: c */
    public RecyclerView f26987c;

    /* renamed from: d */
    public View f26988d;

    /* renamed from: e */
    public ImageView f26989e = ((ImageView) this.f26988d.findViewById(R.id.horizontal_image_view));

    /* renamed from: f */
    public C13173c f26990f;

    /* renamed from: g */
    public SwipeRefreshLayout f26991g;

    /* renamed from: h */
    public boolean f26992h;

    /* renamed from: i */
    public C8703p f26993i;

    /* renamed from: j */
    public C13183l f26994j;

    /* renamed from: com.etsy.android.vespa.viewholders.o$a */
    public class C12101a extends C13173c {
        public C12101a(Fragment fragment, C8703p pVar) {
            super(fragment, pVar, (C13182k) null, (C13895a) null, (C8923u) null, (C12796e) null);
        }

        /* renamed from: l */
        public final C13172b mo33108l(C13895a aVar, C8923u uVar, Fragment fragment, C12796e eVar) {
            return this.f28991c;
        }
    }

    public C12100o(Fragment fragment, ViewGroup viewGroup, C8703p pVar, boolean z, C13172b bVar, RecyclerView.C3100o oVar, ArrayList arrayList, boolean z2) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_horiz_scroll_section, viewGroup, false));
        View view = this.itemView;
        this.f26988d = view;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.horizontal_recycler_view);
        this.f26987c = recyclerView;
        recyclerView.addOnAttachStateChangeListener(new C12098m(this));
        this.f26993i = pVar;
        this.f26992h = z2;
        if (oVar != null) {
            this.f26987c.setLayoutManager(oVar);
        } else {
            RecyclerView recyclerView2 = this.f26987c;
            this.itemView.getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f26987c.addItemDecoration((RecyclerView.C3099n) it.next());
            }
        }
        this.f26987c.setHorizontalScrollBarEnabled(false);
        this.f26990f = mo31381h(fragment, pVar, bVar);
        this.f26987c.setRecycledViewPool(bVar.f28989h);
        new C12600a(8388611).mo11867a(this.f26987c);
        if (z2) {
            this.f26987c.addOnScrollListener(new C13362a(new C8778g(this)));
        }
        this.f26987c.setAdapter(this.f26990f);
        if (!z) {
            this.f26987c.setItemAnimator((RecyclerView.C3094l) null);
        }
        this.f26990f.f28993e = true;
        Activity activity = (Activity) this.f26987c.getContext();
        if (activity != null) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) activity.findViewById(R.id.swipe_refresh_layout);
            this.f26991g = swipeRefreshLayout;
            if (swipeRefreshLayout != null) {
                this.f26987c.addOnScrollListener(new C12099n(this));
            }
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        RecyclerView recyclerView;
        C13183l lVar = this.f26994j;
        if (!(lVar == null || this.f26990f == null || (recyclerView = this.f26987c) == null)) {
            lVar.setLayoutState(recyclerView.getLayoutManager().mo11306k0());
        }
        this.f26994j = null;
    }

    /* renamed from: g */
    public void mo19450a(C13183l lVar) {
        if (lVar.getItems() != null && lVar.getItems().size() > 0) {
            this.f26988d.getLayoutParams().height = this.f26990f.f28991c.mo45893e(lVar.getItems().get(0).getViewType());
            if (lVar.getItems().size() < 4 && (this.f26987c.getLayoutManager() instanceof GridLayoutManager)) {
                ((GridLayoutManager) this.f26987c.getLayoutManager()).mo11259w1(1);
            }
            if (lVar.getViewType() == R.id.view_type_review_carousel) {
                ArrayList arrayList = new ArrayList();
                for (C13186o next : lVar.getItems()) {
                    if (next instanceof ReviewCarouselCard) {
                        ReviewCarouselCard reviewCarouselCard = (ReviewCarouselCard) next;
                        arrayList.add(Long.valueOf(reviewCarouselCard.getTransactionId()));
                        reviewCarouselCard.setTransactionIds(arrayList);
                    }
                }
            }
        }
        this.f26990f.clear();
        ((LinearLayoutManager) this.f26987c.getLayoutManager()).f7015C = lVar.getItems().size();
        this.f26990f.mo45895j(lVar);
        Image backgroundImage = lVar.getBackgroundImage();
        if (backgroundImage != null) {
            Resources resources = this.f26988d.getContext().getResources();
            this.f26989e.setVisibility(0);
            this.f26989e.getViewTreeObserver().addOnPreDrawListener(new C12102p(this, resources, backgroundImage));
            this.f26989e.setColorFilter((ColorFilter) null);
            String backgroundImageColorLight = lVar.getBackgroundImageColorLight();
            if (C19382n.m32762o0(resources.getConfiguration()) && !lVar.getBackgroundImageColorDark().isEmpty()) {
                backgroundImageColorLight = lVar.getBackgroundImageColorDark();
            }
            int d = C13350a.m21013d(this.f26989e.getContext(), R.attr.clg_color_bg_primary);
            if (!backgroundImageColorLight.equals("")) {
                d = Color.parseColor(backgroundImageColorLight);
            }
            this.f26989e.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_ATOP));
        } else {
            this.f26989e.setVisibility(8);
        }
        if (lVar.getHasMatchingItemViewHeights()) {
            this.f26987c.setVisibility(4);
            Context context = this.f26988d.getContext();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if (C8914m.f19669c == 0.0f) {
                C8914m.m17348f(context);
            }
            this.f26987c.setLayoutManager(new CustomScrollingLayoutManager(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) * Math.min(this.f26990f.getItemCount() - 1, 5), context));
            this.f26987c.setVisibility(0);
        }
        if (this.f26992h && this.f26990f.getItemCount() > 0 && (this.f26990f.getItem(0) instanceof BaseModel)) {
            BaseModel baseModel = (BaseModel) this.f26990f.getItem(0);
            if (!baseModel.getTrackingName().isEmpty()) {
                this.f26993i.mo21333d(baseModel.getTrackingName() + "_viewed", C19388s.m32882r0(baseModel));
            }
        }
        Parcelable layoutState = lVar.getLayoutState();
        if (layoutState != null) {
            this.f26987c.getLayoutManager().mo11303j0(layoutState);
        }
        this.f26994j = lVar;
    }

    /* renamed from: h */
    public C13173c mo31381h(Fragment fragment, C8703p pVar, C13172b bVar) {
        return new C12101a(fragment, pVar);
    }
}
