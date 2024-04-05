package com.etsy.android.p327ui.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenActionParcelable;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenActionParcelableKt;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.ListingSelectQuantityDialogFragment */
public final class ListingSelectQuantityDialogFragment extends TrackingBottomSheetDialogFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ServerDrivenAction action;
    /* access modifiers changed from: private */
    public ServerDrivenActionParcelable actionParcelable;
    /* access modifiers changed from: private */
    public int parentPosition = -1;
    private int selectedQuantity = -1;
    private int totalQuantity = -1;

    /* renamed from: com.etsy.android.ui.cart.ListingSelectQuantityDialogFragment$a */
    public static final class C9233a extends RecyclerView.Adapter<C9234b> {

        /* renamed from: b */
        public final int f20401b;

        /* renamed from: c */
        public final int f20402c;

        /* renamed from: d */
        public final C19857l<Integer, C19394m> f20403d;

        public C9233a(int i, int i2, C19857l<? super Integer, C19394m> lVar) {
            this.f20401b = i;
            this.f20402c = i2;
            this.f20403d = lVar;
            setHasStableIds(true);
        }

        public final int getItemCount() {
            return this.f20402c;
        }

        public final long getItemId(int i) {
            return ((long) i) + 1;
        }

        public final int getItemViewType(int i) {
            return super.getItemViewType(i);
        }

        public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C9234b bVar = (C9234b) b0Var;
            C19383o.m32797g(bVar, "holder");
            boolean z = true;
            int i2 = i + 1;
            if (i2 != this.f20401b) {
                z = false;
            }
            bVar.f20405c.setText(String.valueOf(i2));
            if (z) {
                ViewExtensions.m12869m(bVar.f20406d);
            } else {
                ViewExtensions.m12860d(bVar.f20406d);
            }
            View view = bVar.itemView;
            C19383o.m32796f(view, "itemView");
            ViewExtensions.m12866j(view, new ListingSelectQuantityDialogFragment$QuantityViewHolder$bind$1(bVar, i2));
        }

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            return new C9234b(viewGroup, this.f20403d);
        }
    }

    /* renamed from: com.etsy.android.ui.cart.ListingSelectQuantityDialogFragment$b */
    public static final class C9234b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final C19857l<Integer, C19394m> f20404b;

        /* renamed from: c */
        public final TextView f20405c;

        /* renamed from: d */
        public final ImageView f20406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9234b(ViewGroup viewGroup, C19857l<? super Integer, C19394m> lVar) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_cart_bottomsheet_quantity, viewGroup, false));
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            C19383o.m32797g(lVar, "onClick");
            this.f20404b = lVar;
            View findViewById = this.itemView.findViewById(R.id.text);
            C19383o.m32795e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f20405c = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.image);
            C19383o.m32795e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f20406d = (ImageView) findViewById2;
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.listing_select_quantity_fragment, viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        View view = getView();
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.recycler_view) : null;
        C19383o.m32795e(recyclerView, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        recyclerView.scrollToPosition(this.selectedQuantity - 1);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        int i2 = -1;
        this.parentPosition = arguments != null ? arguments.getInt("cart_action_position", -1) : -1;
        Bundle arguments2 = getArguments();
        Object obj = arguments2 != null ? arguments2.get("cart_action") : null;
        C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction");
        ServerDrivenAction serverDrivenAction = (ServerDrivenAction) obj;
        this.action = serverDrivenAction;
        this.actionParcelable = ServerDrivenActionParcelableKt.toServerDrivenActionParcelable(serverDrivenAction);
        Bundle arguments3 = getArguments();
        this.selectedQuantity = arguments3 != null ? arguments3.getInt("cart_update_quantity_selected_quantity", -1) : -1;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            i2 = arguments4.getInt("cart_update_quantity_total_quantity", -1);
        }
        this.totalQuantity = i2;
        if (i2 <= 0 || (i = this.selectedQuantity) <= 0 || i > i2) {
            throw new IllegalArgumentException("selectedQuantity and totalQuantity are required to be positive");
        }
        C9233a aVar = new C9233a(i, i2, new ListingSelectQuantityDialogFragment$onViewCreated$adapter$1(this));
        View findViewById = view.findViewById(R.id.recycler_view);
        C19383o.m32795e(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(aVar);
    }
}
