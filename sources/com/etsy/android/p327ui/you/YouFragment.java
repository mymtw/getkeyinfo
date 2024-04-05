package com.etsy.android.p327ui.you;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.animation.C0472h;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationListNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CreateGiftCardKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HelpKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.PurchasesKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SettingsKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import com.etsy.android.p327ui.you.C11806c;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.util.C12067x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12945e;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.you.YouFragment */
public final class YouFragment extends TrackingBaseFragment implements C11816d, C13366a, C9731e0.C9733b, C9090a.C9096b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8855a customerCentricMessagingEligibility;
    private final C7091a disposable = new C7091a();
    public EtsyApplication etsyApplication;
    public C8694h logCat;
    private final C19285c menuAdapter$delegate = C19350d.m32677b(new YouFragment$menuAdapter$2(this));
    private RecyclerView menuOptionsRecycler;
    public C13461f rxSchedulers;
    private NestedScrollView scrollView;
    private final C19285c secondaryMenuAdapter$delegate = C19350d.m32677b(new YouFragment$secondaryMenuAdapter$2(this));
    private RecyclerView secondaryMenuOptionsRecycler;
    public C13265p session;
    private Button signInButton;
    private Group signedOutGroup;
    public C12067x soeIntentRepository;
    public YouViewModel youViewModel;

    /* access modifiers changed from: private */
    public final C11805b getMenuAdapter() {
        return (C11805b) this.menuAdapter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final C11805b getSecondaryMenuAdapter() {
        return (C11805b) this.secondaryMenuAdapter$delegate.getValue();
    }

    private final void handleSOEClick() {
        C12067x soeIntentRepository2 = getSoeIntentRepository();
        Intent a = soeIntentRepository2.f26911a.mo30499a();
        if (a == null) {
            soeIntentRepository2.f26911a.getClass();
            a = new Intent("android.intent.action.VIEW");
            List<String> list = C8591a.f18700r;
            a.setData(Uri.parse(C18263b.f40056T.f18706f.mo21136f(C8592b.f18728D0)));
        }
        startActivity(a);
    }

    private final void onHelpClicked() {
        if (getSession().mo45960e()) {
            C12790b.m20430b(this, new HelpKey(C12790b.m20432d(this)));
            return;
        }
        String c = C8915n.m17351c(DeepLinkEntity.HELP.name(), "");
        String d = C12790b.m20432d(this);
        C19383o.m32796f(c, "helpCenterUrl");
        C12788a.m20423b(getActivity(), new GenericHelpKey(d, c));
    }

    /* access modifiers changed from: private */
    public final void onSignInChanged(boolean z) {
        if (z) {
            showYouMenuOptions();
            getYouViewModel().mo38142b();
        }
    }

    private final void showYouMenuOptions() {
        Group group = this.signedOutGroup;
        if (group != null) {
            group.setVisibility(8);
        }
        RecyclerView recyclerView = this.menuOptionsRecycler;
        if (recyclerView != null) {
            recyclerView.setAdapter(getMenuAdapter());
        }
        RecyclerView recyclerView2 = this.menuOptionsRecycler;
        if (recyclerView2 != null) {
            requireActivity();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
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

    public final C8855a getCustomerCentricMessagingEligibility() {
        C8855a aVar = this.customerCentricMessagingEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("customerCentricMessagingEligibility");
        throw null;
    }

    public final EtsyApplication getEtsyApplication() {
        EtsyApplication etsyApplication2 = this.etsyApplication;
        if (etsyApplication2 != null) {
            return etsyApplication2;
        }
        C19383o.m32805o("etsyApplication");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.nav_you;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public final C12067x getSoeIntentRepository() {
        C12067x xVar = this.soeIntentRepository;
        if (xVar != null) {
            return xVar;
        }
        C19383o.m32805o("soeIntentRepository");
        throw null;
    }

    public int getTab() {
        return R.id.menu_bottom_nav_you;
    }

    public String getTrackingName() {
        return "you_screen";
    }

    public final YouViewModel getYouViewModel() {
        YouViewModel youViewModel2 = this.youViewModel;
        if (youViewModel2 != null) {
            return youViewModel2;
        }
        C19383o.m32805o("youViewModel");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_you, viewGroup, false);
    }

    public void onDestroyView() {
        this.disposable.mo19405d();
        RecyclerView recyclerView = this.menuOptionsRecycler;
        if (recyclerView != null) {
            recyclerView.setAdapter((RecyclerView.Adapter) null);
        }
        RecyclerView recyclerView2 = this.secondaryMenuOptionsRecycler;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((RecyclerView.Adapter) null);
        }
        this.scrollView = null;
        this.signedOutGroup = null;
        this.signInButton = null;
        this.menuOptionsRecycler = null;
        this.secondaryMenuOptionsRecycler = null;
        super.onDestroyView();
    }

    public void onOptionClick(C11806c cVar) {
        C19383o.m32797g(cVar, "menuOption");
        if (cVar instanceof C11806c.C11814h) {
            String d = C12790b.m20432d(this);
            EtsyId c = getSession().mo45958c();
            C19383o.m32796f(c, "session.userId");
            C12790b.m20430b(this, new UserProfileKey(d, c, (Bundle) null, 4, (DefaultConstructorMarker) null));
        } else if (cVar instanceof C11806c.C11808b) {
            getAnalyticsContext().mo21333d("messages_clicked", (Map<? extends AnalyticsProperty, Object>) null);
            C12790b.m20430b(this, new ConversationListNavigationKey(C12790b.m20432d(this), (Bundle) null, getCustomerCentricMessagingEligibility().mo30407a(), 2, (DefaultConstructorMarker) null));
        } else if (cVar instanceof C11806c.C11809c) {
            C12790b.m20430b(this, new PurchasesKey(C12790b.m20432d(this), (Bundle) null, false, 6, (DefaultConstructorMarker) null));
        } else if (cVar instanceof C11806c.C11813g) {
            onHelpClicked();
        } else if (cVar instanceof C11806c.C11815i) {
            C12790b.m20430b(this, new SettingsKey(C12790b.m20432d(this)));
        } else if (cVar instanceof C11806c.C11807a) {
            C12790b.m20430b(this, new C12945e(C12790b.m20432d(this)));
        } else if (cVar instanceof C11806c.C11810d) {
            handleSOEClick();
        } else if (cVar instanceof C11806c.C11811e) {
            getAnalyticsContext().mo21333d("buy_gift_card_tapped", (Map<? extends AnalyticsProperty, Object>) null);
            C12788a.m20424c(getActivity(), new CreateGiftCardKey(C12790b.m20432d(this), (Bundle) null, 2, (DefaultConstructorMarker) null));
        } else {
            boolean z = cVar instanceof C11806c.C11812f;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_bottom_nav_you) {
            return super.onOptionsItemSelected(menuItem);
        }
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView == null) {
            return true;
        }
        nestedScrollView.smoothScrollTo(0, 0);
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        this.scrollView = (NestedScrollView) view.findViewById(R.id.you_menu_scoll_view);
        this.signedOutGroup = (Group) view.findViewById(R.id.you_menu_signed_out_group);
        this.signInButton = (Button) view.findViewById(R.id.you_menu_sign_in_button);
        this.menuOptionsRecycler = (RecyclerView) view.findViewById(R.id.you_menu_options);
        this.secondaryMenuOptionsRecycler = (RecyclerView) view.findViewById(R.id.you_menu_secondary_options);
        if (getSession().mo45960e()) {
            showYouMenuOptions();
        } else {
            Group group = this.signedOutGroup;
            if (group != null) {
                group.setVisibility(0);
            }
            Button button = this.signInButton;
            if (button != null) {
                ViewExtensions.m12866j(button, new YouFragment$onViewCreated$1(this));
            }
        }
        RecyclerView recyclerView = this.secondaryMenuOptionsRecycler;
        if (recyclerView != null) {
            recyclerView.setAdapter(getSecondaryMenuAdapter());
        }
        RecyclerView recyclerView2 = this.secondaryMenuOptionsRecycler;
        if (recyclerView2 != null) {
            requireActivity();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        C19172m b = getSession().mo45957b();
        getRxSchedulers().getClass();
        LambdaObserver f = SubscribersKt.m32501f(b.mo20635e(C13461f.m21236c()), YouFragment$onViewCreated$2.INSTANCE, new YouFragment$onViewCreated$3(this), 2);
        C7091a aVar = this.disposable;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
        C19254a<List<C11806c>> aVar2 = getYouViewModel().f26270e;
        C19172m b2 = C0472h.m1241b(aVar2, aVar2);
        getRxSchedulers().getClass();
        ObservableSubscribeOn i = b2.mo20639i(C13461f.m21235b());
        getRxSchedulers().getClass();
        LambdaObserver f2 = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), YouFragment$onViewCreated$4.INSTANCE, new YouFragment$onViewCreated$5(this), 2);
        C7091a aVar3 = this.disposable;
        C19383o.m32798h(aVar3, "compositeDisposable");
        aVar3.mo19403b(f2);
        C19254a<List<C11806c>> aVar4 = getYouViewModel().f26271f;
        C19172m b3 = C0472h.m1241b(aVar4, aVar4);
        getRxSchedulers().getClass();
        ObservableSubscribeOn i2 = b3.mo20639i(C13461f.m21235b());
        getRxSchedulers().getClass();
        LambdaObserver f3 = SubscribersKt.m32501f(i2.mo20635e(C13461f.m21236c()), YouFragment$onViewCreated$6.INSTANCE, new YouFragment$onViewCreated$7(this), 2);
        C7091a aVar5 = this.disposable;
        C19383o.m32798h(aVar5, "compositeDisposable");
        aVar5.mo19403b(f3);
        getYouViewModel().mo38142b();
    }

    public final void setCustomerCentricMessagingEligibility(C8855a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.customerCentricMessagingEligibility = aVar;
    }

    public final void setEtsyApplication(EtsyApplication etsyApplication2) {
        C19383o.m32797g(etsyApplication2, "<set-?>");
        this.etsyApplication = etsyApplication2;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setSoeIntentRepository(C12067x xVar) {
        C19383o.m32797g(xVar, "<set-?>");
        this.soeIntentRepository = xVar;
    }

    public final void setYouViewModel(YouViewModel youViewModel2) {
        C19383o.m32797g(youViewModel2, "<set-?>");
        this.youViewModel = youViewModel2;
    }

    public C9090a.C9091a.C9093b getActionBarOverrides() {
        return C9090a.C9091a.C9093b.f19991c;
    }
}
