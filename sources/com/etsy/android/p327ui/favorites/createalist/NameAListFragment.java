package com.etsy.android.p327ui.favorites.createalist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.stylekit.views.C9052c;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p030bo.app.C3673f7;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p260v0.C8184a;
import p377jf.C12979a;
import p440s9.C13366a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListFragment */
public final class NameAListFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public NameAListPresenter presenter;
    public C13461f rxSchedulers;
    private boolean showBackButton = true;

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

    public final NameAListPresenter getPresenter() {
        NameAListPresenter nameAListPresenter = this.presenter;
        if (nameAListPresenter != null) {
            return nameAListPresenter;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_name_a_list_create, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…create, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        NameAListPresenter presenter2 = getPresenter();
        presenter2.f21680e = null;
        presenter2.f21681f.mo19405d();
        presenter2.f21682g.mo19405d();
        ((CollageTextInput) presenter2.f21676a._$_findCachedViewById(R.id.name_input)).setTextChangeListener(presenter2.f21685j);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        CollageSwitch collageSwitch;
        Button button;
        ImageButton imageButton;
        Button button2;
        CollageSwitch collageSwitch2;
        CollageSwitch collageSwitch3;
        CollageTextInput collageTextInput;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        Fragment parentFragment = getParentFragment();
        C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.favorites.createalist.HasEventDispatcher");
        C9799a eventDispatcher = ((C9825n) parentFragment).eventDispatcher();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.showBackButton = arguments.getBoolean("ENABLE_BACK_BUTTON");
        }
        NameAListPresenter presenter2 = getPresenter();
        boolean z = this.showBackButton;
        presenter2.f21680e = eventDispatcher;
        View view2 = presenter2.f21676a.getView();
        if (!(view2 == null || (collageTextInput = (CollageTextInput) view2.findViewById(R.id.name_input)) == null)) {
            collageTextInput.setLabelText(presenter2.f21676a.getString(R.string.create_collection_name_hint_v2));
        }
        View view3 = presenter2.f21676a.getView();
        if (!(view3 == null || (collageSwitch3 = (CollageSwitch) view3.findViewById(R.id.privacy_switch)) == null)) {
            collageSwitch3.setTitle(presenter2.f21676a.getString(R.string.create_collection_privacy_switch_title_v2));
        }
        View view4 = presenter2.f21676a.getView();
        if (!(view4 == null || (collageSwitch2 = (CollageSwitch) view4.findViewById(R.id.privacy_switch)) == null)) {
            collageSwitch2.setDescription(presenter2.f21676a.getString(R.string.create_collection_privacy_switch_description_v2));
        }
        View view5 = presenter2.f21676a.getView();
        if (!(view5 == null || (button2 = (Button) view5.findViewById(R.id.favorites_create_list)) == null)) {
            button2.setText(R.string.create_collection);
        }
        presenter2.f21681f.mo19405d();
        presenter2.f21681f = new C7091a();
        presenter2.f21679d.getClass();
        C19254a<Set<ListingCard>> aVar = C9816h.f21713c;
        C19172m b = C0472h.m1241b(aVar, aVar);
        presenter2.f21678c.getClass();
        LambdaObserver f = SubscribersKt.m32501f(new C19179q(b.mo20635e(C13461f.m21236c()), new C3673f7(presenter2, 1)), new NameAListPresenter$listenForSelectedListChanges$2(LogCatKt.m17045a()), new NameAListPresenter$listenForSelectedListChanges$3(presenter2), 2);
        C7091a aVar2 = presenter2.f21681f;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(f);
        View view6 = presenter2.f21676a.getView();
        if (!(view6 == null || (imageButton = (ImageButton) view6.findViewById(R.id.favorites_name_list_back)) == null)) {
            ViewExtensions.m12866j(imageButton, new NameAListPresenter$setListeners$1(presenter2));
        }
        View view7 = presenter2.f21676a.getView();
        if (!(view7 == null || (button = (Button) view7.findViewById(R.id.favorites_create_list)) == null)) {
            ViewExtensions.m12866j(button, new NameAListPresenter$setListeners$2(presenter2));
        }
        View view8 = presenter2.f21676a.getView();
        if (!(view8 == null || (collageSwitch = (CollageSwitch) view8.findViewById(R.id.privacy_switch)) == null)) {
            collageSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) presenter2.f21684i);
        }
        View view9 = presenter2.f21676a.getView();
        TextView textView2 = view9 != null ? (TextView) view9.findViewById(R.id.privacy_policy_link) : null;
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View view10 = presenter2.f21676a.getView();
        if (!(view10 == null || (textView = (TextView) view10.findViewById(R.id.privacy_policy_link)) == null)) {
            textView.setOnClickListener(new C9052c(presenter2, 1));
        }
        View view11 = presenter2.f21676a.getView();
        if (view11 == null) {
            return;
        }
        if (z) {
            ViewExtensions.m12869m((ImageButton) view11.findViewById(R.id.favorites_name_list_back));
        } else {
            ViewExtensions.m12860d((ImageButton) view11.findViewById(R.id.favorites_name_list_back));
        }
    }

    public final void setPresenter(NameAListPresenter nameAListPresenter) {
        C19383o.m32797g(nameAListPresenter, "<set-?>");
        this.presenter = nameAListPresenter;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void showAlert(AlertData alertData) {
        C19383o.m32797g(alertData, "data");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45783c(alertData.getIcon());
        a.mo45785e(alertData.getTitle());
        if (alertData.getBodyIcon() != null) {
            String body = alertData.getBody();
            Context requireContext = requireContext();
            int intValue = alertData.getBodyIcon().intValue();
            Object obj = C8184a.f17966a;
            a.mo45782b(body, C8184a.C8187c.m16466b(requireContext, intValue));
        } else {
            a.f28588b.setBodyText(alertData.getBody(), (Drawable) null);
        }
        a.mo45781a(alertData.getAlertType());
        a.f28591e = alertData.getDuration();
        a.mo45784d(alertData.getOnClickListener());
        a.mo45786f();
    }
}
