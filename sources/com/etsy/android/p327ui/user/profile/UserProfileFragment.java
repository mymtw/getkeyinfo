package com.etsy.android.p327ui.user.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C3144f0;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.C5380a;
import com.etsy.android.C6487g;
import com.etsy.android.R;
import com.etsy.android.checkout.C6336c;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.UserProfilePage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.lib.util.SharedPreferencesUtility;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.adapters.C9108d;
import com.etsy.android.p327ui.adapters.C9109e;
import com.etsy.android.p327ui.adapters.UserProfileAdapter;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.p327ui.listing.p329ui.pushoptin.ConversationPushOptInBottomSheetKey;
import com.etsy.android.p327ui.user.profile.C11623a;
import com.etsy.android.shophome.C8998i;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.google.android.gms.common.Scopes;
import kotlin.Pair;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p277w8.C8267e;
import p314ba.C8542a;
import p336dc.C12646d;
import p356ge.C12790b;
import p357gf.C12796e;
import p400mf.C13074b;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p500ze.C13960a;
import p500ze.C13961b;
import p568fn.C17782b;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.profile.UserProfileFragment */
public class UserProfileFragment extends BaseRecyclerViewListFragment<Pair<?, Integer>> implements C13366a, C9731e0.C9733b {
    private static final String PROFILE_PAGE_DATA = "profile_page_data";
    public C8267e adImpressionRepository;
    private final C7091a disposables = new C7091a();
    private boolean isSignedIn;
    public C12796e listingImagesRepository;
    public C12646d optInEligibility;
    public C13461f rxSchedulers;
    public C13265p session;
    private TransactionViewModel<C11869a> transactionViewModel;
    public EtsyId userId;
    public C13961b userProfileRepository;

    private void fetchPageInfo() {
        boolean c = C8914m.m17345c(requireActivity());
        EtsyId etsyId = this.userId;
        boolean e = this.session.mo45960e();
        C13961b bVar = this.userProfileRepository;
        C8071s<C20145v<C19928a0>> a = bVar.f30703a.mo46780a(C0388a.m1049e(new Object[]{etsyId}, 1, e ? "/etsyapps/v3/bespoke/member/users/%s/profile-page" : "/etsyapps/v3/bespoke/public/users/%s/profile-page", "format(format, *args)"), String.valueOf(c));
        C8998i iVar = new C8998i(bVar, 4);
        a.getClass();
        this.disposables.mo19403b(C0391c.m1056b(this.rxSchedulers, C0472h.m1243e(this.rxSchedulers, new C19211l(new C19208j(a, iVar), new C8542a(bVar, 3)))).mo20658g(new C6336c(this, 5), new C6487g(this, 9)));
    }

    /* access modifiers changed from: private */
    public void lambda$fetchPageInfo$2(C11623a aVar) throws Exception {
        this.adapter.clear();
        stopLoad();
        if (aVar instanceof C11623a.C11625b) {
            ((UserProfileAdapter) this.adapter).mo31302k(((C11623a.C11625b) aVar).f25733a);
            showListView();
            return;
        }
        showErrorView();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchPageInfo$3(Throwable th) throws Exception {
        this.adapter.clear();
        stopLoad();
        showErrorView();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$0(C13074b bVar) {
        C11829a<T> aVar = this.adapter;
        if (aVar != null && aVar.getItemCount() != 0) {
            ((UserProfileAdapter) this.adapter).mo31301j(C17782b.m29847M(bVar));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$1(String str, Bundle bundle) {
        if (this.optInEligibility.mo45425a()) {
            this.optInEligibility.mo45426b();
            C12790b.m20430b(this, new ConversationPushOptInBottomSheetKey(C12790b.m20432d(this), Scopes.PROFILE));
        }
    }

    public int getFragmentTitle() {
        return R.string.user_profile;
    }

    public int getLayoutId() {
        return R.layout.fragment_recyclerview_list;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return isYou() ? "your_account" : "people_account";
    }

    public boolean isYou() {
        this.userId = new EtsyId(requireArguments().getString("user_id", ""));
        FragmentActivity activity = getActivity();
        EtsyId etsyId = this.userId;
        if (etsyId == null || !etsyId.hasId()) {
            return false;
        }
        return !etsyId.hasId() || SharedPreferencesUtility.m17314a(activity).equals(etsyId);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.adapter = new UserProfileAdapter(this, getAnalyticsContext(), isYou(), this.session, this.adImpressionRepository, this.listingImagesRepository);
        setHasOptionsMenu(true);
        this.transactionViewModel = C18263b.m30828W(this, new C11869a());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity().setTitle(R.string.user_profile);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.userId = new EtsyId(requireArguments().getString("user_id"));
        UserProfileAdapter userProfileAdapter = (UserProfileAdapter) this.adapter;
        getActivity();
        C9109e eVar = new C9109e(userProfileAdapter.f20006g.f20016a);
        C9108d dVar = new C9108d(userProfileAdapter);
        dVar.f7012c = true;
        eVar.f7008K = dVar;
        this.swipeRefreshLayout.setColorSchemeResources(R.color.clg_color_black);
        this.recyclerView.setLayoutManager(eVar);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setAdapter(this.adapter);
        RecyclerView.C3094l itemAnimator = this.recyclerView.getItemAnimator();
        if (itemAnimator instanceof C3144f0) {
            ((C3144f0) itemAnimator).f7228g = false;
        }
        this.recyclerView.addItemDecoration(userProfileAdapter.f20011l);
        return onCreateView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.disposables.mo19405d();
    }

    public void onLoadContent() {
        fetchPageInfo();
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.menu_share);
        if (findItem != null) {
            findItem.setVisible(false);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.isSignedIn != C18263b.f40057V.mo45960e()) {
            this.isSignedIn = !this.isSignedIn;
            this.adapter.clear();
            loadContent();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C11869a aVar = (C11869a) this.transactionViewModel.f26405b;
        UserProfilePage userProfilePage = ((UserProfileAdapter) this.adapter).f20004e;
        if (userProfilePage != null) {
            aVar.mo38349f(PROFILE_PAGE_DATA, userProfilePage);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.isSignedIn = C18263b.f40057V.mo45960e();
        C11869a aVar = (C11869a) this.transactionViewModel.f26405b;
        if (this.adapter.getItemCount() == 0) {
            if (!aVar.mo38344a(PROFILE_PAGE_DATA)) {
                loadContent();
            } else {
                UserProfilePage userProfilePage = (UserProfilePage) aVar.mo38345b(PROFILE_PAGE_DATA);
                if (userProfilePage != null) {
                    ((UserProfileAdapter) this.adapter).mo31302k(userProfilePage);
                }
            }
        }
        new HeartMonitor(getLifecycle(), new C13960a(this));
        getParentFragmentManager().mo10375a0(ConversationComposeFragment.LISTING_CONVO_SENT, this, new C5380a(this));
    }

    public void stopLoad() {
        this.swipeRefreshLayout.setRefreshing(false);
        setLoading(false);
        setRefreshing(false);
    }
}
