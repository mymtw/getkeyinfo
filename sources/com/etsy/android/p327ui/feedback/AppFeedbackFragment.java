package com.etsy.android.p327ui.feedback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p269vp.C8221a;
import p314ba.C8542a;
import p314ba.C8543b;
import p425q9.C13261l;
import p440s9.C13366a;
import p456ua.C13461f;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.feedback.AppFeedbackFragment */
public final class AppFeedbackFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Bundle bundle;
    public C9903a presenter;

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

    public final Bundle getBundle() {
        return this.bundle;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C9903a getPresenter() {
        C9903a aVar = this.presenter;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public void onCreate(Bundle bundle2) {
        super.onCreate(bundle2);
        this.bundle = bundle2;
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        menuInflater.inflate(R.menu.feedback_send_menu, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_app_feedback, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        getPresenter().f21851f.mo19405d();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_send) {
            return super.onOptionsItemSelected(menuItem);
        }
        C9903a presenter2 = getPresenter();
        AppFeedbackView appFeedbackView = presenter2.f21848c;
        if (appFeedbackView == null) {
            return true;
        }
        String obj = C19459m.m33035H1(appFeedbackView.getFeedback()).toString();
        if (obj.length() > 0) {
            C7091a aVar = presenter2.f21851f;
            C8543b bVar = presenter2.f21846a;
            bVar.getClass();
            C8071s<C20145v<C19928a0>> a = bVar.f18611a.mo21070a(obj);
            C8542a aVar2 = new C8542a(bVar, 0);
            a.getClass();
            C19211l lVar = new C19211l(new C19208j(a, aVar2), new C13261l(bVar, 1));
            if (presenter2.f21847b != null) {
                SingleSubscribeOn i = lVar.mo20660i(C13461f.m21235b());
                if (presenter2.f21847b != null) {
                    aVar.mo19403b(SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), AppFeedbackPresenter$sendFeedback$1$1.INSTANCE, new AppFeedbackPresenter$sendFeedback$1$2(presenter2)));
                    return true;
                }
                C19383o.m32805o("rxSchedulers");
                throw null;
            }
            C19383o.m32805o("rxSchedulers");
            throw null;
        }
        appFeedbackView.showError(R.string.error_feedback_empty);
        return true;
    }

    public void onResume() {
        AppFeedbackView appFeedbackView;
        super.onResume();
        requireActivity().setTitle(R.string.feedback);
        C9903a presenter2 = getPresenter();
        View findViewById = requireActivity().findViewById(R.id.screen_feedback);
        C19383o.m32796f(findViewById, "requireActivity().findVi…yId(R.id.screen_feedback)");
        AppFeedbackView appFeedbackView2 = (AppFeedbackView) findViewById;
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        Bundle bundle2 = this.bundle;
        C8221a.m16513a();
        presenter2.getClass();
        presenter2.f21848c = appFeedbackView2;
        presenter2.f21849d = requireActivity;
        presenter2.f21850e = bundle2;
        appFeedbackView2.focus();
        if (bundle2 != null) {
            String string = bundle2.getString("feedback_text", "");
            C19383o.m32796f(string, "previousText");
            if ((C19459m.m33035H1(string).toString().length() > 0) && (appFeedbackView = presenter2.f21848c) != null) {
                appFeedbackView.setFeedback(string);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle2) {
        C19383o.m32797g(bundle2, "outState");
        bundle2.putAll(this.bundle);
        super.onSaveInstanceState(bundle2);
    }

    public void onStop() {
        super.onStop();
        C9903a presenter2 = getPresenter();
        AppFeedbackView appFeedbackView = presenter2.f21848c;
        if (appFeedbackView != null) {
            String obj = C19459m.m33035H1(appFeedbackView.getFeedback()).toString();
            Bundle bundle2 = presenter2.f21850e;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            presenter2.f21850e = bundle2;
            bundle2.putString("feedback_text", obj);
        }
        presenter2.f21848c = null;
        this.bundle = presenter2.f21850e;
    }

    public final void setBundle(Bundle bundle2) {
        this.bundle = bundle2;
    }

    public final void setPresenter(C9903a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.presenter = aVar;
    }
}
