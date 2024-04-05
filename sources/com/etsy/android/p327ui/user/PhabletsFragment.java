package com.etsy.android.p327ui.user;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.IFullImage;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cart.viewholders.C9403q;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.view.FullImageView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p003a2.C0023f;
import p356ge.C12788a;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.user.PhabletsFragment */
public final class PhabletsFragment extends BaseRecyclerViewListFragment<C11335a> implements C13366a, C9731e0.C9733b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8694h log;
    private final C19285c phabletsList$delegate = C19350d.m32677b(PhabletsFragment$phabletsList$2.INSTANCE);

    /* renamed from: com.etsy.android.ui.user.PhabletsFragment$a */
    public static final class C11335a implements ITrackedObject {

        /* renamed from: b */
        public final String f24998b;

        /* renamed from: c */
        public final String f24999c;

        /* renamed from: d */
        public final String f25000d;

        /* renamed from: e */
        public final C11336a f25001e = new C11336a(this);

        /* renamed from: com.etsy.android.ui.user.PhabletsFragment$a$a */
        public static final class C11336a implements IFullImage {

            /* renamed from: b */
            public final /* synthetic */ C11335a f25002b;

            public C11336a(C11335a aVar) {
                this.f25002b = aVar;
            }

            public final String get4to3ImageUrlForPixelWidth(int i) {
                return this.f25002b.f25000d;
            }

            public final int getFullHeight() {
                return 100;
            }

            public final String getFullHeightImageUrlForPixelWidth(int i) {
                return this.f25002b.f25000d;
            }

            public final int getFullWidth() {
                return 100;
            }

            public final int getImageColor() {
                return -1842209;
            }

            public final void setFullHeight(int i) {
            }

            public final void setFullWidth(int i) {
            }
        }

        public C11335a(String str, String str2, String str3) {
            this.f24998b = str;
            this.f24999c = str2;
            this.f25000d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11335a)) {
                return false;
            }
            C11335a aVar = (C11335a) obj;
            return C19383o.m32792b(this.f24998b, aVar.f24998b) && C19383o.m32792b(this.f24999c, aVar.f24999c) && C19383o.m32792b(this.f25000d, aVar.f25000d);
        }

        @JsonIgnore
        public final List<C8696j> getOnSeenTrackingEvents() {
            return new ArrayList();
        }

        @JsonIgnore
        public final int getTrackedPosition() {
            return 0;
        }

        @JsonIgnore
        public final String getTrackingName() {
            return "";
        }

        public final Map<AnalyticsProperty, Object> getTrackingParameters() {
            return C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.TARGET_USERNAME, this.f24999c));
        }

        public final int hashCode() {
            return this.f25000d.hashCode() + C0023f.m105e(this.f24999c, this.f24998b.hashCode() * 31, 31);
        }

        @JsonIgnore
        public final void setOnSeenTrackingEvents(List<C8696j> list) {
            C19383o.m32797g(list, "onSeenTrackingEvents");
        }

        @JsonIgnore
        public final void setTrackedPosition(int i) {
        }

        @JsonIgnore
        public final void setTrackingName(String str) {
        }

        public final void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Phablet(name=");
            h.append(this.f24998b);
            h.append(", username=");
            h.append(this.f24999c);
            h.append(", imageUrl=");
            return C0391c.m1057c(h, this.f25000d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.PhabletsFragment$b */
    public static final class C11337b extends C11829a<C11335a> {

        /* renamed from: b */
        public final C11338a f25003b;

        /* renamed from: com.etsy.android.ui.user.PhabletsFragment$b$a */
        public interface C11338a {
            /* renamed from: a */
            void mo37100a(C11335a aVar);
        }

        /* renamed from: com.etsy.android.ui.user.PhabletsFragment$b$b */
        public static final class C11339b extends RecyclerView.C3084b0 {

            /* renamed from: e */
            public static final /* synthetic */ int f25004e = 0;

            /* renamed from: b */
            public final FullImageView f25005b;

            /* renamed from: c */
            public final TextView f25006c;

            /* renamed from: d */
            public final TextView f25007d;

            public C11339b(View view) {
                super(view);
                View findViewById = view.findViewById(R.id.phablet_avatar);
                C19383o.m32796f(findViewById, "root.findViewById(R.id.phablet_avatar)");
                this.f25005b = (FullImageView) findViewById;
                View findViewById2 = view.findViewById(R.id.phablet_name);
                C19383o.m32796f(findViewById2, "root.findViewById(R.id.phablet_name)");
                this.f25006c = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.phablet_etsy_username);
                C19383o.m32796f(findViewById3, "root.findViewById(R.id.phablet_etsy_username)");
                this.f25007d = (TextView) findViewById3;
            }
        }

        public C11337b(FragmentActivity fragmentActivity, C11340c cVar) {
            super(fragmentActivity);
            this.f25003b = cVar;
        }

        public final int getListItemViewType(int i) {
            return 0;
        }

        public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C19383o.m32797g(b0Var, "holder");
            C11339b bVar = (C11339b) b0Var;
            Object item = getItem(i);
            C19383o.m32796f(item, "getItem(position)");
            C11335a aVar = (C11335a) item;
            C11338a aVar2 = this.f25003b;
            C19383o.m32797g(aVar2, "clickListener");
            bVar.f25006c.setText(aVar.f24998b);
            bVar.f25007d.setText(aVar.f24999c);
            bVar.f25005b.setImageInfo(aVar.f25001e, 1);
            bVar.itemView.setOnClickListener(new C9403q(2, aVar2, aVar));
        }

        public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            View inflate = this.mInflater.inflate(R.layout.list_item_phablet, viewGroup, false);
            C19383o.m32796f(inflate, "mInflater.inflate(R.layo…m_phablet, parent, false)");
            return new C11339b(inflate);
        }
    }

    /* renamed from: com.etsy.android.ui.user.PhabletsFragment$c */
    public static final class C11340c implements C11337b.C11338a {

        /* renamed from: a */
        public final /* synthetic */ PhabletsFragment f25008a;

        public C11340c(PhabletsFragment phabletsFragment) {
            this.f25008a = phabletsFragment;
        }

        /* renamed from: a */
        public final void mo37100a(C11335a aVar) {
            C12788a.m20424c(this.f25008a.getActivity(), new UserProfileKey(C19421p.m32935c0(this.f25008a.getActivity()), new EtsyId(aVar.f24999c), (Bundle) null, 4, (DefaultConstructorMarker) null));
        }
    }

    private final List<C11335a> getPhabletsList() {
        return (List) this.phabletsList$delegate.getValue();
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

    public RecyclerView.C3100o createLayoutManager() {
        getContext();
        return new GridLayoutManager(requireContext().getResources().getInteger(R.integer.phablet_cards_grid_columns));
    }

    public int getFragmentTitle() {
        return R.string.phablets;
    }

    public final C8694h getLog() {
        C8694h hVar = this.log;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o(AnalyticsLogDatabaseHelper.LOG);
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        this.adapter = new C11337b(requireActivity, new C11340c(this));
    }

    public void onLoadContent() {
        onLoadSuccess(getPhabletsList(), 0);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getLog().mo21310e("onViewCreated Called");
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "recyclerView");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.clg_space_8);
        recyclerView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        loadContent();
    }

    public final void setLog(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.log = hVar;
    }
}
