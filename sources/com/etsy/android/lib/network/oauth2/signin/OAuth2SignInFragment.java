package com.etsy.android.lib.network.oauth2.signin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.C0112f;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.feedback.C6457b;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.network.oauth2.AccessTokens;
import com.etsy.android.lib.network.oauth2.OAuth2SignInWebViewClient;
import com.etsy.android.lib.network.oauth2.SignInError;
import com.etsy.android.lib.network.oauth2.signin.C8790q;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.webview.C12027g;
import com.etsy.android.uikit.webview.C12028h;
import com.etsy.android.uikit.webview.EtsyChromeClient;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p260v0.C8184a;
import p440s9.C13366a;

public final class OAuth2SignInFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public EtsyChromeClient chromeClient;
    private C12027g contextConfigurationDelegate;
    private String email;
    private TextView errorSubtext;
    private View errorView;
    private String magicLink;
    private final C19285c viewModel$delegate = C19350d.m32677b(new OAuth2SignInFragment$viewModel$2(this));
    public C8656o viewModelFactory;
    /* access modifiers changed from: private */
    public WebView webView;
    public C12028h webViewUtil;

    /* renamed from: com.etsy.android.lib.network.oauth2.signin.OAuth2SignInFragment$a */
    public static final class C8770a extends C0112f {

        /* renamed from: c */
        public final /* synthetic */ OAuth2SignInFragment f19299c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8770a(OAuth2SignInFragment oAuth2SignInFragment) {
            super(true);
            this.f19299c = oAuth2SignInFragment;
        }

        /* renamed from: a */
        public final void mo1121a() {
            WebView access$getWebView$p = this.f19299c.webView;
            if (access$getWebView$p == null) {
                C19383o.m32805o("webView");
                throw null;
            } else if (access$getWebView$p.canGoBack()) {
                WebView access$getWebView$p2 = this.f19299c.webView;
                if (access$getWebView$p2 != null) {
                    access$getWebView$p2.goBack();
                } else {
                    C19383o.m32805o("webView");
                    throw null;
                }
            } else {
                FragmentActivity activity = this.f19299c.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    private final OAuth2SignInViewModel getViewModel() {
        return (OAuth2SignInViewModel) this.viewModel$delegate.getValue();
    }

    private final void initArgs() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        String string = arguments.getString("oauth2_sign_in_email", "");
        C19383o.m32796f(string, "args.getString(NavBase.SIGN_IN_OAUTH2_EMAIL, \"\")");
        this.email = string;
        String string2 = arguments.getString(SignInActivity.EXTRA_MAGIC_LINK, "");
        C19383o.m32796f(string2, "args.getString(NavBase.SIGN_IN_MAGIC_LINK, \"\")");
        this.magicLink = string2;
        arguments.putString("TRACKING_NAME", "sign_in_webview");
        setArguments(arguments);
    }

    /* access modifiers changed from: private */
    public final void loadWebView() {
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setVisibility(0);
            View view = this.errorView;
            if (view != null) {
                view.setVisibility(8);
                TextView textView = this.errorSubtext;
                if (textView != null) {
                    textView.setVisibility(8);
                    WebView webView3 = this.webView;
                    if (webView3 != null) {
                        OAuth2SignInViewModel viewModel = getViewModel();
                        String str = this.email;
                        if (str != null) {
                            String str2 = this.magicLink;
                            if (str2 != null) {
                                boolean d = C8914m.m17346d(getActivity());
                                viewModel.getClass();
                                String a = viewModel.f19303e.mo30074a(str, d);
                                if (!C19457k.m33020X0(str2)) {
                                    viewModel.f19302d.getClass();
                                    C19383o.m32797g(a, "oauthRequestUrl");
                                    a = Uri.parse(str2).buildUpon().appendQueryParameter("is_from_etsyapp", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).appendQueryParameter("from_page", a).build().toString();
                                    C19383o.m32796f(a, "parse(uri)\n            .…)\n            .toString()");
                                }
                                webView3.loadUrl(a);
                                return;
                            }
                            C19383o.m32805o("magicLink");
                            throw null;
                        }
                        C19383o.m32805o("email");
                        throw null;
                    }
                    C19383o.m32805o("webView");
                    throw null;
                }
                C19383o.m32805o("errorSubtext");
                throw null;
            }
            C19383o.m32805o("errorView");
            throw null;
        }
        C19383o.m32805o("webView");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m34868onCreateView$lambda1(OAuth2SignInFragment oAuth2SignInFragment, C8790q qVar) {
        C19383o.m32797g(oAuth2SignInFragment, "this$0");
        if (qVar instanceof C8790q.C8792b) {
            oAuth2SignInFragment.successfulSignIn(((C8790q.C8792b) qVar).f19345a);
        } else if (qVar instanceof C8790q.C8791a) {
            Throwable th = ((C8790q.C8791a) qVar).f19344a;
            Integer num = null;
            if (th instanceof SignInError) {
                SignInError.C8742a errorAction = ((SignInError) th).getErrorAction();
                if (errorAction != null) {
                    num = Integer.valueOf(errorAction.f19214a);
                }
                oAuth2SignInFragment.showError(num);
                return;
            }
            showError$default(oAuth2SignInFragment, (Integer) null, 1, (Object) null);
        }
    }

    private final void showError(Integer num) {
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setVisibility(8);
            View view = this.errorView;
            if (view != null) {
                view.setVisibility(0);
                if (num != null && num.intValue() > 0) {
                    TextView textView = this.errorSubtext;
                    if (textView != null) {
                        textView.setText(num.intValue());
                        TextView textView2 = this.errorSubtext;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        } else {
                            C19383o.m32805o("errorSubtext");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("errorSubtext");
                        throw null;
                    }
                }
            } else {
                C19383o.m32805o("errorView");
                throw null;
            }
        } else {
            C19383o.m32805o("webView");
            throw null;
        }
    }

    public static /* synthetic */ void showError$default(OAuth2SignInFragment oAuth2SignInFragment, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        oAuth2SignInFragment.showError(num);
    }

    private final void successfulSignIn(AccessTokens accessTokens) {
        Intent intent = new Intent();
        intent.putExtra("token_result", accessTokens);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
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

    public final EtsyChromeClient getChromeClient() {
        EtsyChromeClient etsyChromeClient = this.chromeClient;
        if (etsyChromeClient != null) {
            return etsyChromeClient;
        }
        C19383o.m32805o("chromeClient");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public final C12028h getWebViewUtil() {
        C12028h hVar = this.webViewUtil;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("webViewUtil");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        this.contextConfigurationDelegate = new C12027g(requireActivity);
        initArgs();
        if (C0326j.m869n(BuildTarget.Companion)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        requireActivity().getOnBackPressedDispatcher().mo1104a(this, new C8770a(this));
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_webview_simple, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…simple, container, false)");
        C12027g gVar = this.contextConfigurationDelegate;
        if (gVar != null) {
            gVar.mo38911a();
            View findViewById = inflate.findViewById(R.id.webview);
            Context context = inflate.getContext();
            Object obj = C8184a.f17966a;
            ((WebView) findViewById).setBackgroundColor(C8184a.C8188d.m16468a(context, R.color.transparent));
            C19383o.m32796f(findViewById, "view.findViewById<WebVie…r.transparent))\n        }");
            this.webView = (WebView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.no_internet);
            C19383o.m32796f(findViewById2, "view.findViewById(R.id.no_internet)");
            this.errorView = findViewById2;
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress_bar);
            C19383o.m32796f(progressBar, "progressBar");
            View view = this.errorView;
            if (view != null) {
                OAuth2SignInWebViewClient oAuth2SignInWebViewClient = new OAuth2SignInWebViewClient(progressBar, view, getViewModel().f19303e, getViewModel());
                getLifecycle().mo10733a(getChromeClient());
                getChromeClient().attachProgressBar(progressBar);
                C12028h webViewUtil2 = getWebViewUtil();
                WebView webView2 = this.webView;
                if (webView2 != null) {
                    webViewUtil2.mo38912a(webView2, oAuth2SignInWebViewClient, getChromeClient());
                    View view2 = this.errorView;
                    if (view2 != null) {
                        View findViewById3 = view2.findViewById(R.id.btn_retry_internet);
                        if (findViewById3 != null) {
                            findViewById3.setOnClickListener(new OAuth2SignInFragment$onCreateView$2(this));
                        }
                        View view3 = this.errorView;
                        if (view3 != null) {
                            View findViewById4 = view3.findViewById(R.id.no_internet_subtext);
                            C19383o.m32796f(findViewById4, "errorView.findViewById(R.id.no_internet_subtext)");
                            this.errorSubtext = (TextView) findViewById4;
                            getViewModel().f19306h.observe(getViewLifecycleOwner(), new C6457b(this, 1));
                            setHasOptionsMenu(true);
                            return inflate;
                        }
                        C19383o.m32805o("errorView");
                        throw null;
                    }
                    C19383o.m32805o("errorView");
                    throw null;
                }
                C19383o.m32805o("webView");
                throw null;
            }
            C19383o.m32805o("errorView");
            throw null;
        }
        C19383o.m32805o("contextConfigurationDelegate");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        loadWebView();
    }

    public final void setChromeClient(EtsyChromeClient etsyChromeClient) {
        C19383o.m32797g(etsyChromeClient, "<set-?>");
        this.chromeClient = etsyChromeClient;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public final void setWebViewUtil(C12028h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.webViewUtil = hVar;
    }
}
