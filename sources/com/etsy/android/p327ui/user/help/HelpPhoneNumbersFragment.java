package com.etsy.android.p327ui.user.help;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.feedback.C6468m;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.network.oauth2.C8765o;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p356ge.C12790b;
import p370ie.C12944d;
import p440s9.C13366a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.help.HelpPhoneNumbersFragment */
public final class HelpPhoneNumbersFragment extends BaseRecyclerViewListFragment<PhoneRegion> implements C13366a, C9731e0.C9733b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C11530c viewModel;

    /* renamed from: com.etsy.android.ui.user.help.HelpPhoneNumbersFragment$a */
    public interface C11526a {
        /* renamed from: a */
        void mo37414a(PhoneRegion phoneRegion);
    }

    /* renamed from: com.etsy.android.ui.user.help.HelpPhoneNumbersFragment$b */
    public static final class C11527b implements C11526a {

        /* renamed from: a */
        public final /* synthetic */ HelpPhoneNumbersFragment f25423a;

        public C11527b(HelpPhoneNumbersFragment helpPhoneNumbersFragment) {
            this.f25423a = helpPhoneNumbersFragment;
        }

        /* renamed from: a */
        public final void mo37414a(PhoneRegion phoneRegion) {
            C19383o.m32797g(phoneRegion, "region");
            if (C18263b.m30839d0(phoneRegion.f25425b)) {
                try {
                    C12790b.m20431c(this.f25423a, new C12944d(phoneRegion.f25425b));
                } catch (UnsupportedNavigationException unused) {
                    C8901g0.m17337c(this.f25423a.getContext(), R.string.device_no_dialer_error);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m35061onViewCreated$lambda0(HelpPhoneNumbersFragment helpPhoneNumbersFragment, List list) {
        C19383o.m32797g(helpPhoneNumbersFragment, "this$0");
        helpPhoneNumbersFragment.onLoadSuccess(list, list.size());
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m35062onViewCreated$lambda1(HelpPhoneNumbersFragment helpPhoneNumbersFragment, C19394m mVar) {
        C19383o.m32797g(helpPhoneNumbersFragment, "this$0");
        helpPhoneNumbersFragment.onLoadFailure();
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

    public int getFragmentTitle() {
        return R.string.helpdesk_callus;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C11530c getViewModel() {
        C11530c cVar = this.viewModel;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        this.adapter = new C11532e(requireActivity, new C11527b(this));
    }

    public void onLoadContent() {
        C8071s sVar;
        C11530c viewModel2 = getViewModel();
        C11529b bVar = viewModel2.f25433b;
        List<PhoneRegion> list = bVar.f25432b;
        if (list == null || list.isEmpty()) {
            C8071s<List<PhoneRegion>> a = bVar.f25431a.mo37426a();
            C8765o oVar = new C8765o(bVar, 3);
            a.getClass();
            sVar = new C19208j(a, oVar);
        } else {
            sVar = C8071s.m16251e(bVar.f25432b);
        }
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0072d.m199f(viewModel2.f25434c, sVar), new HelpPhoneNumbersViewModel$loadPhoneNumbers$1(viewModel2), new HelpPhoneNumbersViewModel$loadPhoneNumbers$2(viewModel2));
        C7091a aVar = viewModel2.f25437f;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().f25436e.observe(getViewLifecycleOwner(), new C6468m(this, 2));
        getViewModel().f25435d.observe(getViewLifecycleOwner(), new C6469n(this, 3));
        loadContent();
    }

    public final void setViewModel(C11530c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.viewModel = cVar;
    }
}
