package com.etsy.android.p327ui.favorites.createalist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.search.p330v2.C10969a;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListFragment */
public final class CreateAListFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public CreateAListPresenter presenter;

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

    public final CreateAListPresenter getPresenter() {
        CreateAListPresenter createAListPresenter = this.presenter;
        if (createAListPresenter != null) {
            return createAListPresenter;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_create_a_list, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…a_list, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        CreateAListPresenter presenter2 = getPresenter();
        C7091a aVar = presenter2.f21672h;
        if (aVar != null) {
            aVar.mo19405d();
        }
        presenter2.f21672h = null;
        presenter2.f21671g = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        Fragment parentFragment = getParentFragment();
        C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.favorites.createalist.HasEventDispatcher");
        C9799a eventDispatcher = ((C9825n) parentFragment).eventDispatcher();
        CreateAListPresenter presenter2 = getPresenter();
        presenter2.f21671g = eventDispatcher;
        presenter2.f21666b.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        Context context = presenter2.f21666b.getContext();
        RecyclerView recyclerView = (RecyclerView) presenter2.f21666b._$_findCachedViewById(R.id.favorites_create_list_recyclerview);
        View view2 = presenter2.f21666b.getView();
        if (!(view2 == null || (textView = (TextView) view2.findViewById(R.id.favorites_create_list_title)) == null)) {
            textView.setText(R.string.create_collection_choose_items);
        }
        if (context != null) {
            ((LinearLayout) presenter2.f21666b._$_findCachedViewById(R.id.create_a_list_layout)).getLayoutParams().height = C1948d.m4272d(context);
        }
        gridLayoutManager.f7008K.f7012c = true;
        recyclerView.setItemViewCacheSize(6);
        recyclerView.setLayoutManager(gridLayoutManager);
        int i = CreateAListPresenter.f21665i;
        ((RecyclerView) presenter2.f21666b._$_findCachedViewById(R.id.favorites_create_list_recyclerview)).addItemDecoration(new C10969a(i, i, false));
        Button button = (Button) presenter2.f21666b._$_findCachedViewById(R.id.favorites_create_list_skip);
        C19383o.m32796f(button, "fragment.favorites_create_list_skip");
        ViewExtensions.m12866j(button, new CreateAListPresenter$initClickListeners$1(presenter2));
        Button button2 = (Button) presenter2.f21666b._$_findCachedViewById(R.id.favorites_create_list_next);
        C19383o.m32796f(button2, "fragment.favorites_create_list_next");
        ViewExtensions.m12866j(button2, new CreateAListPresenter$initClickListeners$2(presenter2));
        ImageButton imageButton = (ImageButton) presenter2.f21666b._$_findCachedViewById(R.id.favorites_create_list_exit);
        C19383o.m32796f(imageButton, "fragment.favorites_create_list_exit");
        ViewExtensions.m12866j(imageButton, new CreateAListPresenter$initClickListeners$3(presenter2));
        List p1 = C19327t.m32660p1(presenter2.f21667c.f21708f);
        if (!p1.isEmpty()) {
            presenter2.mo32807a(p1);
        } else {
            presenter2.mo32808b();
        }
    }

    public final void setPresenter(CreateAListPresenter createAListPresenter) {
        C19383o.m32797g(createAListPresenter, "<set-?>");
        this.presenter = createAListPresenter;
    }
}
