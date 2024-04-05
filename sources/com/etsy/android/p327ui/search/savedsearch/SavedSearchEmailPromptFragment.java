package com.etsy.android.p327ui.search.savedsearch;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.MessageModel;
import com.etsy.android.lib.push.registration.C8834g;
import com.etsy.android.search.savedsearch.C8982f;
import com.etsy.android.search.savedsearch.SignUpEmailRequestBody;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.ratings.C9072a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p114g4.C6865e;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p377jf.C12979a;
import p440s9.C13366a;
import p456ua.C13458c;
import p456ua.C13461f;
import p568fn.C17782b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.search.savedsearch.SavedSearchEmailPromptFragment */
public final class SavedSearchEmailPromptFragment extends DialogFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C8672b analyticsTracker = new C8672b("search");
    public C8982f savedSearchRepository;
    public C13461f schedulers;

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m35047onCreateView$lambda1(SavedSearchEmailPromptFragment savedSearchEmailPromptFragment, View view) {
        C19383o.m32797g(savedSearchEmailPromptFragment, "this$0");
        savedSearchEmailPromptFragment.analyticsTracker.mo21333d("saved_search_email_prompt_tapped_sign_up", (Map<? extends AnalyticsProperty, Object>) null);
        C8982f savedSearchRepository2 = savedSearchEmailPromptFragment.getSavedSearchRepository();
        savedSearchRepository2.getClass();
        C8071s<C20145v<C19928a0>> a = savedSearchRepository2.f19822a.mo30624a(new SignUpEmailRequestBody(C17782b.m29864d0("coupons"), true));
        C8834g gVar = new C8834g(savedSearchRepository2, 3);
        a.getClass();
        C19211l lVar = new C19211l(new C19208j(a, gVar), new C13458c(savedSearchRepository2, 1));
        savedSearchEmailPromptFragment.getSchedulers().getClass();
        SingleSubscribeOn i = lVar.mo20660i(C13461f.m21235b());
        savedSearchEmailPromptFragment.getSchedulers().getClass();
        SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), new SavedSearchEmailPromptFragment$onCreateView$1$1(savedSearchEmailPromptFragment), new SavedSearchEmailPromptFragment$onCreateView$1$2(savedSearchEmailPromptFragment));
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m35048onCreateView$lambda2(SavedSearchEmailPromptFragment savedSearchEmailPromptFragment, View view) {
        C19383o.m32797g(savedSearchEmailPromptFragment, "this$0");
        savedSearchEmailPromptFragment.dismiss();
    }

    /* access modifiers changed from: private */
    public final void showErrorMessage() {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45785e(requireActivity().getString(R.string.save_search_error));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.mo45786f();
    }

    /* access modifiers changed from: private */
    public final void showSuccessMessage(List<MessageModel> list) {
        if (!list.isEmpty()) {
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            C12979a a = C12979a.C12980a.m20683a(requireActivity);
            a.mo45781a(CollageAlert.AlertType.SUCCESS);
            a.mo45785e(list.get(0).getMessage());
            if (list.size() > 1) {
                a.mo45782b(list.get(1).getMessage(), (Drawable) null);
            }
            a.mo45783c(R.drawable.clg_icon_core_check_v1);
            a.mo45786f();
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

    public final C8672b getAnalyticsTracker() {
        return this.analyticsTracker;
    }

    public final C8982f getSavedSearchRepository() {
        C8982f fVar = this.savedSearchRepository;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("savedSearchRepository");
        throw null;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C19383o.m32797g(dialogInterface, "dialog");
        this.analyticsTracker.mo21333d("saved_search_email_prompt_tapped_dismissed", (Map<? extends AnalyticsProperty, Object>) null);
        super.onCancel(dialogInterface);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C19383o.m32796f(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_saved_search_email_prompt, viewGroup);
        View findViewById = inflate.findViewById(R.id.callToAction);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.callToAction)");
        View findViewById2 = inflate.findViewById(R.id.dismiss);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.dismiss)");
        ((Button) findViewById).setOnClickListener(new C6865e(this, 5));
        ((Button) findViewById2).setOnClickListener(new C9072a(this, 2));
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C19383o.m32797g(dialogInterface, "dialog");
        this.analyticsTracker.mo21333d("saved_search_email_prompt_tapped_dismissed", (Map<? extends AnalyticsProperty, Object>) null);
        super.onDismiss(dialogInterface);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(getResources().getDisplayMetrics().widthPixels - getResources().getDimensionPixelOffset(R.dimen.clg_space_32), -2);
        }
    }

    public final void setSavedSearchRepository(C8982f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.savedSearchRepository = fVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }
}
