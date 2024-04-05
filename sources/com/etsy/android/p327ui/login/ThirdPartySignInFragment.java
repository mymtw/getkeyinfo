package com.etsy.android.p327ui.login;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.C0326j;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.material.ripple.C1242h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import androidx.room.C3257w;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.feedback.view.C6486a;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.network.oauth2.C8799y;
import com.etsy.android.lib.network.oauth2.SignInError;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.C9054e;
import com.etsy.android.stylekit.views.C9055f;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.C9058i;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.stylekit.views.CollageTextView;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.util.C11912n;
import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p392lf.C13021b;
import p402n9.C13089i;
import p402n9.C13090j;
import p435rb.C13350a;
import p440s9.C13366a;
import p496za.C13943a;
import p499zd.C13950a;
import p499zd.C13954b;
import p499zd.C13955c;
import p499zd.C13956d;
import p499zd.C13957e;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.login.ThirdPartySignInFragment */
public final class ThirdPartySignInFragment extends TrackingBaseFragment implements C11324t.C11329b, C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8618c configMap;
    public C11912n dialogHelper;
    public CollageTextInput emailTextInput;
    public CollageAlert errorView;
    public CollageButton fbLoginButton;
    private final ViewTreeObserver.OnGlobalLayoutListener listener = new C13956d(this);
    private final Runnable requestFocusRunnable = new C1242h(this, 1);
    public C13943a sharedPrefsProvider;
    public Button signInButton;
    public CollageAlert stickyAlert;
    public C13957e viewModel;
    public C8656o viewModelFactory;

    /* access modifiers changed from: private */
    /* renamed from: listener$lambda-1  reason: not valid java name */
    public static final void m35015listener$lambda1(ThirdPartySignInFragment thirdPartySignInFragment) {
        C19383o.m32797g(thirdPartySignInFragment, "this$0");
        if (C15588c1.m25346s0(thirdPartySignInFragment.getContext())) {
            Button signInButton2 = thirdPartySignInFragment.getSignInButton();
            C19383o.m32797g(signInButton2, "<this>");
            signInButton2.postDelayed(new C3257w(signInButton2, 1), 200);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m35016onCreateView$lambda2(ThirdPartySignInFragment thirdPartySignInFragment, C13950a aVar) {
        C19383o.m32797g(thirdPartySignInFragment, "this$0");
        C19383o.m32796f(aVar, "it");
        thirdPartySignInFragment.update(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-10  reason: not valid java name */
    public static final boolean m35017onViewCreated$lambda10(ThirdPartySignInFragment thirdPartySignInFragment, TextView textView, int i, KeyEvent keyEvent) {
        C19383o.m32797g(thirdPartySignInFragment, "this$0");
        if (i != 6) {
            return false;
        }
        thirdPartySignInFragment.getSignInButton().performClick();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
    public static final void m35018onViewCreated$lambda5(ThirdPartySignInFragment thirdPartySignInFragment, View view) {
        C19383o.m32797g(thirdPartySignInFragment, "this$0");
        C13957e viewModel2 = thirdPartySignInFragment.getViewModel();
        String text = thirdPartySignInFragment.getEmailTextInput().getText();
        viewModel2.getClass();
        C19383o.m32797g(text, "email");
        viewModel2.mo46779d(new C8799y.C8800a(text));
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-6  reason: not valid java name */
    public static final void m35019onViewCreated$lambda6(ThirdPartySignInFragment thirdPartySignInFragment, View view) {
        C19383o.m32797g(thirdPartySignInFragment, "this$0");
        C13957e viewModel2 = thirdPartySignInFragment.getViewModel();
        viewModel2.getClass();
        viewModel2.mo46779d(C8799y.C8802c.f19351a);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-7  reason: not valid java name */
    public static final void m35020onViewCreated$lambda7(ThirdPartySignInFragment thirdPartySignInFragment, View view) {
        C19383o.m32797g(thirdPartySignInFragment, "this$0");
        C13957e viewModel2 = thirdPartySignInFragment.getViewModel();
        viewModel2.getClass();
        viewModel2.mo46779d(C8799y.C8801b.f19350a);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-8  reason: not valid java name */
    public static final void m35021onViewCreated$lambda8(EtsyDialogFragment etsyDialogFragment, View view) {
        if (etsyDialogFragment != null) {
            etsyDialogFragment.dismiss();
        }
    }

    private final void openURL(String str) {
        try {
            Uri parse = Uri.parse(str);
            C19383o.m32796f(parse, "parse(url)");
            startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (Exception e) {
            C8694h a = LogCatKt.m17045a();
            a.mo21309d("No application found to open url: " + str, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: requestFocusRunnable$lambda-0  reason: not valid java name */
    public static final void m35022requestFocusRunnable$lambda0(ThirdPartySignInFragment thirdPartySignInFragment) {
        C19383o.m32797g(thirdPartySignInFragment, "this$0");
        CollageTextInput emailTextInput2 = thirdPartySignInFragment.getEmailTextInput();
        C19383o.m32797g(emailTextInput2, "<this>");
        Object systemService = emailTextInput2.getContext().getSystemService("input_method");
        C19383o.m32795e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).toggleSoftInput(1, 0);
        thirdPartySignInFragment.getEmailTextInput().requestFocus();
    }

    private final void setupToolbar(View view) {
        View findViewById = view.findViewById(R.id.toolbar);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.toolbar)");
        Toolbar toolbar = (Toolbar) findViewById;
        toolbar.setNavigationIcon((int) R.drawable.ic_android_back_arrow);
        toolbar.setNavigationContentDescription((int) R.string.close_button_content_description);
        toolbar.setNavigationOnClickListener(new C9058i((EtsyDialogFragment) getParentFragment(), 1));
        toolbar.setTitle((int) R.string.back);
    }

    /* access modifiers changed from: private */
    /* renamed from: setupToolbar$lambda-12  reason: not valid java name */
    public static final void m35023setupToolbar$lambda12(EtsyDialogFragment etsyDialogFragment, View view) {
        if (etsyDialogFragment != null) {
            etsyDialogFragment.dismiss();
        }
    }

    private final void showAtoDialog(SignInError.C8742a aVar) {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        gVar.mo70029r(aVar.f19215b);
        gVar.mo70023l(aVar.f19214a);
        gVar.setPositiveButton(aVar.f19216c, new C13954b(this, aVar)).mo1240k();
    }

    /* access modifiers changed from: private */
    /* renamed from: showAtoDialog$lambda-15  reason: not valid java name */
    public static final void m35024showAtoDialog$lambda15(ThirdPartySignInFragment thirdPartySignInFragment, SignInError.C8742a aVar, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(thirdPartySignInFragment, "this$0");
        C19383o.m32797g(aVar, "$errorAction");
        thirdPartySignInFragment.openURL(aVar.f19217d);
    }

    private final void showError(String str) {
        if (C18263b.m30837c0(str)) {
            getErrorView().setTitleText(str);
            getErrorView().setVisibility(0);
            CollageAlert errorView2 = getErrorView();
            C19383o.m32797g(errorView2, "<this>");
            errorView2.postDelayed(new C3257w(errorView2, 1), 200);
        }
    }

    private final void update(C13950a aVar) {
        if (aVar instanceof C13950a.C13952b) {
            if (C15588c1.m25346s0(getContext())) {
                ViewExtensions.m12861e(getEmailTextInput());
            }
            getErrorView().setVisibility(8);
            C11912n dialogHelper2 = getDialogHelper();
            AlertDialog alertDialog = dialogHelper2.f26472b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                Context context = dialogHelper2.f26471a;
                AlertDialog create = new C13021b(context, context.getString(R.string.signing_in)).create();
                dialogHelper2.f26472b = create;
                if (create.isShowing()) {
                    dialogHelper2.f26472b.dismiss();
                }
                dialogHelper2.f26472b.show();
            }
            Iterator<C11912n.C11913a> it = dialogHelper2.f26473c.iterator();
            while (it.hasNext()) {
                it.next().mo38474a();
            }
        } else if (aVar instanceof C13950a.C13953c) {
            getDialogHelper().mo38473a();
        } else if (aVar instanceof C13950a.C13951a) {
            getDialogHelper().mo38473a();
            C13950a.C13951a aVar2 = (C13950a.C13951a) aVar;
            Throwable th = aVar2.f30669a;
            if (th instanceof SignInError.AtoError) {
                SignInError.C8742a errorAction = ((SignInError.AtoError) th).getErrorAction();
                if (errorAction != null) {
                    showAtoDialog(errorAction);
                }
            } else if (th instanceof SignInError) {
                SignInError.C8742a errorAction2 = ((SignInError) th).getErrorAction();
                showError(errorAction2 != null ? getString(errorAction2.f19214a) : null);
            } else if (C0326j.m869n(BuildTarget.Companion)) {
                showError(aVar2.f30669a.getMessage());
            } else {
                CrashUtil.m17307a().mo30457b(aVar2.f30669a);
                showError(getString(R.string.sign_in_error_generic));
            }
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

    public C11324t.C11325a getBottomTabsOverrides() {
        return C11324t.C11325a.C11326a.f24988c;
    }

    public final C8618c getConfigMap() {
        C8618c cVar = this.configMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("configMap");
        throw null;
    }

    public final C11912n getDialogHelper() {
        C11912n nVar = this.dialogHelper;
        if (nVar != null) {
            return nVar;
        }
        C19383o.m32805o("dialogHelper");
        throw null;
    }

    public final CollageTextInput getEmailTextInput() {
        CollageTextInput collageTextInput = this.emailTextInput;
        if (collageTextInput != null) {
            return collageTextInput;
        }
        C19383o.m32805o("emailTextInput");
        throw null;
    }

    public final CollageAlert getErrorView() {
        CollageAlert collageAlert = this.errorView;
        if (collageAlert != null) {
            return collageAlert;
        }
        C19383o.m32805o("errorView");
        throw null;
    }

    public final CollageButton getFbLoginButton() {
        CollageButton collageButton = this.fbLoginButton;
        if (collageButton != null) {
            return collageButton;
        }
        C19383o.m32805o("fbLoginButton");
        throw null;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener getListener() {
        return this.listener;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13943a getSharedPrefsProvider() {
        C13943a aVar = this.sharedPrefsProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("sharedPrefsProvider");
        throw null;
    }

    public final Button getSignInButton() {
        Button button = this.signInButton;
        if (button != null) {
            return button;
        }
        C19383o.m32805o("signInButton");
        throw null;
    }

    public final CollageAlert getStickyAlert() {
        CollageAlert collageAlert = this.stickyAlert;
        if (collageAlert != null) {
            return collageAlert;
        }
        C19383o.m32805o("stickyAlert");
        throw null;
    }

    public final C13957e getViewModel() {
        C13957e eVar = this.viewModel;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        setViewModel((C13957e) new C2870k0((C2880m0) this, (C2870k0.C2872b) getViewModelFactory()).mo10829a(C13957e.class));
        getViewModel().f30690o.observe(getViewLifecycleOwner(), new C6456a(this, 4));
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.ui.user.auth.SignInActivity");
        C11912n dialogHelper2 = ((SignInActivity) activity).getDialogHelper();
        C19383o.m32796f(dialogHelper2, "activity as SignInActivity).dialogHelper");
        setDialogHelper(dialogHelper2);
        return layoutInflater.inflate(R.layout.sign_in, viewGroup, false);
    }

    public void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        getEmailTextInput().removeCallbacks(this.requestFocusRunnable);
        View view = getView();
        if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.listener);
        }
        SharedPreferences.Editor edit = getSharedPrefsProvider().mo46761a().edit();
        C19383o.m32796f(edit, "editor");
        edit.putBoolean(HomePagerFragment.SIGN_IN_SCREEN_HIDDEN, true);
        edit.apply();
    }

    public void onStart() {
        super.onStart();
        Bundle arguments = getArguments();
        String str = null;
        String string = arguments != null ? arguments.getString(SignInActivity.EXTRA_SIGN_IN_AS_TOKEN) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString(SignInActivity.EXTRA_MAGIC_LINK);
        }
        if (C18263b.m30837c0(string) && C0326j.m869n(BuildTarget.Companion)) {
            C13957e viewModel2 = getViewModel();
            viewModel2.getClass();
            C19383o.m32797g(string, "signInAsToken");
            viewModel2.f30688m = C0072d.m199f(viewModel2.f30680e, viewModel2.f30678c.mo46656a(string)).mo20658g(new C13089i(viewModel2, 6), new C13090j(viewModel2, 5));
        } else if (C18263b.m30837c0(str)) {
            C13957e viewModel3 = getViewModel();
            viewModel3.getClass();
            C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
            viewModel3.mo46779d(new C8799y.C8803d(str));
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.remove(SignInActivity.EXTRA_MAGIC_LINK);
            }
        }
    }

    public void onStop() {
        super.onStop();
        if (C15588c1.m25346s0(getContext())) {
            ViewExtensions.m12861e(getEmailTextInput());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        AlertData alertData;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        EtsyDialogFragment etsyDialogFragment = (EtsyDialogFragment) getParentFragment();
        SharedPreferences a = getSharedPrefsProvider().mo46761a();
        boolean b = getConfigMap().mo21132b(C8592b.f18808l1);
        View findViewById = view.findViewById(R.id.sign_in_email);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.sign_in_email)");
        setEmailTextInput((CollageTextInput) findViewById);
        View findViewById2 = view.findViewById(R.id.sign_in_button_email);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.sign_in_button_email)");
        setSignInButton((Button) findViewById2);
        View findViewById3 = view.findViewById(R.id.txt_error);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.txt_error)");
        setErrorView((CollageAlert) findViewById3);
        View findViewById4 = view.findViewById(R.id.sticky_alert);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.sticky_alert)");
        setStickyAlert((CollageAlert) findViewById4);
        View findViewById5 = view.findViewById(R.id.btn_sign_in_facebook);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.btn_sign_in_facebook)");
        setFbLoginButton((CollageButton) findViewById5);
        boolean z = false;
        getFbLoginButton().setVisibility(b ? 8 : 0);
        Bundle arguments = getArguments();
        String str = null;
        if (!(arguments == null || (alertData = (AlertData) arguments.getParcelable(SignInActivity.EXTRA_STICKY_ALERT_DATA)) == null)) {
            CollageAlert stickyAlert2 = getStickyAlert();
            stickyAlert2.setAlertType(alertData.getAlertType());
            stickyAlert2.setIconDrawableRes(alertData.getIcon());
            stickyAlert2.setTitleText(alertData.getTitle());
            CollageAlert.setBodyText$default(stickyAlert2, alertData.getBody(), (Drawable) null, 2, (Object) null);
            ViewExtensions.m12869m(stickyAlert2);
        }
        getSignInButton().setOnClickListener(new C6486a(this, 2));
        ((Button) view.findViewById(R.id.btn_sign_in_google)).setOnClickListener(new C9053d(this, 3));
        if (!b) {
            getFbLoginButton().setOnClickListener(new C9054e(this, 3));
        }
        ((TextView) view.findViewById(R.id.cancelText)).setOnClickListener(new C9055f(etsyDialogFragment, 4));
        ((TextView) view.findViewById(R.id.new_text_terms_of_use)).setMovementMethod(LinkMovementMethod.getInstance());
        if (etsyDialogFragment != null) {
            etsyDialogFragment.hideHeader();
        }
        if (etsyDialogFragment != null) {
            etsyDialogFragment.removeParentMargins();
        }
        if (etsyDialogFragment != null) {
            Context context = view.getContext();
            C19383o.m32796f(context, "view.context");
            etsyDialogFragment.setStatusBarColor(C13350a.m21013d(context, 16843857));
        }
        if (a.getBoolean(HomePagerFragment.ONBOARDING_SIGN_IN_MODE_ENABLED, true)) {
            ((CollageTextView) view.findViewById(R.id.sign_in_title)).setVisibility(0);
            ((ImageView) view.findViewById(R.id.sign_in_logo)).setVisibility(0);
            ((Button) view.findViewById(R.id.cancelText)).setVisibility(0);
            ((CollageTextView) view.findViewById(R.id.sign_in_title_guest)).setVisibility(8);
            view.findViewById(R.id.divider).setVisibility(8);
            ((Toolbar) view.findViewById(R.id.toolbar)).setVisibility(8);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.listener);
            }
            SharedPreferences.Editor edit = a.edit();
            C19383o.m32796f(edit, "editor");
            edit.putBoolean(HomePagerFragment.ONBOARDING_SIGN_IN_MODE_ENABLED, false);
            edit.apply();
        } else {
            setupToolbar(view);
        }
        getEmailTextInput().setTextChangeListener(new ThirdPartySignInFragment$onViewCreated$7(this));
        getEmailTextInput().setOnEditorActionListener(new C13955c(this, 0));
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString(SignInActivity.EXTRA_SIGN_IN_AS_TOKEN) : null;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString(SignInActivity.EXTRA_MAGIC_LINK);
        }
        if (string == null || string.length() == 0) {
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (z) {
                getEmailTextInput().postDelayed(this.requestFocusRunnable, 400);
            }
        }
    }

    public final void setConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.configMap = cVar;
    }

    public final void setDialogHelper(C11912n nVar) {
        C19383o.m32797g(nVar, "<set-?>");
        this.dialogHelper = nVar;
    }

    public final void setEmailTextInput(CollageTextInput collageTextInput) {
        C19383o.m32797g(collageTextInput, "<set-?>");
        this.emailTextInput = collageTextInput;
    }

    public final void setErrorView(CollageAlert collageAlert) {
        C19383o.m32797g(collageAlert, "<set-?>");
        this.errorView = collageAlert;
    }

    public final void setFbLoginButton(CollageButton collageButton) {
        C19383o.m32797g(collageButton, "<set-?>");
        this.fbLoginButton = collageButton;
    }

    public final void setSharedPrefsProvider(C13943a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.sharedPrefsProvider = aVar;
    }

    public final void setSignInButton(Button button) {
        C19383o.m32797g(button, "<set-?>");
        this.signInButton = button;
    }

    public final void setStickyAlert(CollageAlert collageAlert) {
        C19383o.m32797g(collageAlert, "<set-?>");
        this.stickyAlert = collageAlert;
    }

    public final void setViewModel(C13957e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.viewModel = eVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
