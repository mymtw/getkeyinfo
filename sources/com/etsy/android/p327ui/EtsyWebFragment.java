package com.etsy.android.p327ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.R;
import com.etsy.android.checkout.C6335b;
import com.etsy.android.checkout.C6336c;
import com.etsy.android.checkout.C6337d;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.network.oauth2.XAuthAccessToken;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C9718d0;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.cart.googlepay.C9303a;
import com.etsy.android.p327ui.cart.googlepay.C9308f;
import com.etsy.android.p327ui.checkout.PayPalCheckoutViewModel;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.webview.C12026f;
import com.etsy.android.uikit.webview.C12027g;
import com.etsy.android.uikit.webview.C12028h;
import com.etsy.android.uikit.webview.EtsyChromeClient;
import com.etsy.android.uikit.webview.EtsyWebViewClient;
import com.etsy.android.util.C12059p;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.wallet.PaymentData;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import org.json.JSONException;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p251u1.C8115a;
import p260v0.C8184a;
import p340ea.C12673n;
import p346fa.C12703a;
import p356ge.C12788a;
import p440s9.C13366a;
import p456ua.C13461f;
import p480xb.C13869b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.EtsyWebFragment */
public class EtsyWebFragment extends EtsyFragment implements C13366a, C9731e0.C9732a, C11324t.C11329b, C9718d0.C9719a {
    public static final String ACTION_RESULT_CANCELED = "com.etsy.android.ui.EtsyWebFragment.ACTION_RESULT_CANCELED";
    public static final String ARG_LISTING_ID = "listing_id";
    public static final String ARG_TITLE = "title";
    public static final String ARG_TRACKING_ID = "tracking_id";
    public static final String ARG_URL = "url";
    /* access modifiers changed from: private */
    public static final String ELK_TAG = "EtsyWebFragment";
    public static final String KEY_REQUEST_CODE = "REQUEST_CODE";
    public static final String KEY_RESULT_CODE = "RESULT_CODE";
    public static final String OAUTH2_COOKIE_APEX_KEY = "session-key-apex";
    public static final String OAUTH2_COOKIE_WWW_KEY = "session-key-www";
    public static final String PARAM_REF = "ref";
    public static final int REDIRECT_ID_BILL = 15;
    public static final int REDIRECT_ID_CART = 1;
    public static final int REDIRECT_ID_GOOGLE_SHOPPING = 26;
    public static final int REDIRECT_ID_GOOGLE_SHOPPING_ONBOARDING = 27;
    public static final int REDIRECT_ID_HELP = 4;
    public static final int REDIRECT_ID_HELP_CENTER = 28;
    public static final int REDIRECT_ID_MULTISHOP_CART = 13;
    public static final int REDIRECT_ID_NOTIFICATION_SETTINGS = 2;
    public static final int REDIRECT_ID_OFFSITE_ADS = 30;
    public static final int REDIRECT_ID_ORDER_TRACKING = 9;
    public static final int REDIRECT_ID_PAYMENT_ACCOUNT = 16;
    public static final int REDIRECT_ID_PAYMENT_SETTINGS = 17;
    public static final int REDIRECT_ID_SHIPPING_HOME = 25;
    public static final int REDIRECT_ID_SIGN_UP_WITH_SQUARE = 18;
    public static final int REDIRECT_ID_SINGLE_LISTING_CHECKOUT = 12;
    public static final int REDIRECT_ID_TEAMS = 10;
    public static final int REDIRECT_ID_YOUR_SUBSCRIPTION = 22;
    public static final int TYPE_ABOUT = 0;
    public static final int TYPE_CART = 2;
    public static final int TYPE_DONATE_THE_CHANGE = 16;
    public static final int TYPE_EDITORIAL = 19;
    public static final int TYPE_ELECTRONIC_COMMUNICATIONS_POLICY = 7;
    public static final int TYPE_ETSY_HELP_CENTER = 14;
    public static final int TYPE_ETSY_LOCAL_HELP = 4;
    public static final int TYPE_GENERIC = 18;
    public static final int TYPE_GENERIC_ETSY_HELP = 11;
    public static final int TYPE_LEGAL = 10;
    public static final int TYPE_LEGAL_COOKIES_AND_TECH = 15;
    public static final int TYPE_NOTIFICATIONS = 1;
    public static final int TYPE_ORDER_TRACKING = 3;
    public static final int TYPE_PRIVACY_POLICY = 6;
    public static final int TYPE_QUALTRICS_SURVEY = 12;
    public static final int TYPE_REPORT_LISTING = 17;
    public static final int TYPE_TERMS_OF_USE = 5;
    public static final int TYPE_TESTING = -1;
    public CartBadgeCountRepo cartBadgeCountRepo;
    public C9323l cartRefreshEventManager;
    public C6337d checkoutRepository;
    public EtsyChromeClient chromeClient;
    public C8591a config;
    private C12027g contextConfigurationDelegate;
    public CrashUtil crashUtil;
    public C7091a disposable = new C7091a();
    public C12673n elkLogger;
    public C9303a googlePayHelper;
    private BroadcastReceiver googlePayUpdatesReceiver = new C9086a();
    public C9308f googlePayWebHelper;
    public C12703a grafana;
    public boolean isCheckoutInitialized = false;
    public C8694h logcat;
    /* access modifiers changed from: private */
    public String mCartId;
    /* access modifiers changed from: private */
    public View mErrorView;
    private GooglePayDataContract mGoogleDataContract;
    private PaymentData mGooglePaymentData;
    /* access modifiers changed from: private */
    public boolean mIsPayPalCheckout;
    /* access modifiers changed from: private */
    public int mRedirectId;
    /* access modifiers changed from: private */
    public WebView mWebView;
    private View mWebViewCover;
    public C8809t oAuth2TokenStore;
    public PayPalCheckoutViewModel payPalCheckoutViewModel;
    private HashMap<String, String> queryParameters;
    public C12026f redirectCookiesRepository;
    public C13461f schedulers;
    /* access modifiers changed from: private */
    public int type;
    public UpiIntentHelper upiIntentHelper;
    public C12028h webViewUtil;

    /* renamed from: com.etsy.android.ui.EtsyWebFragment$CartOverrideWebViewClient */
    public class CartOverrideWebViewClient extends EtsyWebViewClient {
        public CartOverrideWebViewClient(C8623e eVar, ProgressBar progressBar, C12026f fVar, C13461f fVar2) {
            super(eVar, progressBar, fVar, fVar2);
        }

        /* renamed from: c */
        public static boolean m17487c(Uri uri) {
            return (m17488d(uri) && uri.getPathSegments().size() == 2 && "cancel".equals(uri.getPathSegments().get(1))) || (uri.getPathSegments().size() == 1 && "cancel".equals(uri.getPathSegments().get(0)));
        }

        /* renamed from: d */
        public static boolean m17488d(Uri uri) {
            String scheme = uri.getScheme();
            List<String> list = C8915n.f19672a;
            return "etsy".equalsIgnoreCase(scheme) && "cart".equals(uri.getHost());
        }

        /* renamed from: e */
        public static boolean m17489e(Uri uri) {
            return uri != null && m17488d(uri) && uri.getPathSegments().size() >= 1 && "thanks".equals(uri.getPathSegments().get(0));
        }

        /* renamed from: f */
        public final void mo31273f(String str) {
            StringBuilder sb = new StringBuilder("Attempt to load invalid URL: ");
            sb.append(str);
            WebBackForwardList copyBackForwardList = EtsyWebFragment.this.mWebView.copyBackForwardList();
            if (copyBackForwardList != null && copyBackForwardList.getSize() > 0) {
                sb.append(" from previous page: ");
                sb.append(copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getOriginalUrl());
            }
            C18263b.f40052P.mo45451c(EtsyWebFragment.ELK_TAG, sb.toString());
        }

        /* renamed from: g */
        public final void mo31274g(Uri uri) {
            BaseActivity baseActivity = EtsyWebFragment.this.mActivity;
            if (baseActivity != null && baseActivity.getLifecycle().mo10734b().isAtLeast(Lifecycle.State.CREATED)) {
                EtsyId etsyId = new EtsyId(uri.getPathSegments().get(1));
                EtsyWebFragment.this.cartRefreshEventManager.f20595a.onNext(C9315k.C9319d.f20591a);
                if (EtsyWebFragment.this.getArguments() == null || !EtsyWebFragment.this.getArguments().getBoolean("checked_out_single_listing", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable(CartWithSavedFragment.LAST_ORDER_ID, etsyId);
                    try {
                        EtsyWebFragment.this.getParentFragmentManager().mo10373Z(bundle, "to_cart_after_purchase");
                        EtsyWebFragment.this.goBack();
                    } catch (IllegalStateException e) {
                        EtsyWebFragment.this.crashUtil.mo30457b(e);
                    }
                } else {
                    C9323l lVar = EtsyWebFragment.this.cartRefreshEventManager;
                    lVar.getClass();
                    lVar.f20595a.onNext(new C9315k.C9318c(etsyId));
                    EtsyWebFragment.this.goBack();
                    C12788a.m20424c(EtsyWebFragment.this.getActivity(), new CartWithSavedKey(C19421p.m32935c0(EtsyWebFragment.this.getActivity()), (String) null, (Bundle) null));
                }
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            EtsyWebFragment.this.mWebView.setVisibility(8);
            EtsyWebFragment.this.mErrorView.setVisibility(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:118:0x02b8  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x02bc  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x020d  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x023b A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView r10, java.lang.String r11) {
            /*
                r9 = this;
                android.net.Uri r0 = android.net.Uri.parse(r11)
                com.etsy.android.ui.EtsyWebFragment r1 = com.etsy.android.p327ui.EtsyWebFragment.this
                com.etsy.android.lib.config.e r1 = r1.getConfigMap()
                com.etsy.android.lib.config.EtsyConfigKey r2 = com.etsy.android.lib.config.C8592b.C8604l.f18905a
                boolean r1 = r1.mo21132b(r2)
                com.etsy.android.ui.EtsyWebFragment r2 = com.etsy.android.p327ui.EtsyWebFragment.this
                com.etsy.android.lib.config.e r2 = r2.getConfigMap()
                com.etsy.android.lib.config.EtsyConfigKey r3 = com.etsy.android.lib.config.C8592b.C8604l.f18906b
                boolean r2 = r2.mo21132b(r3)
                java.lang.String r3 = "tel:"
                boolean r3 = r11.startsWith(r3)
                r4 = 1
                if (r3 == 0) goto L_0x0036
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                android.content.Intent r0 = new android.content.Intent
                android.net.Uri r11 = android.net.Uri.parse(r11)
                java.lang.String r1 = "android.intent.action.DIAL"
                r0.<init>(r1, r11)
                r10.startActivity(r0)
                return r4
            L_0x0036:
                java.lang.String r3 = "sms:"
                boolean r3 = r11.startsWith(r3)
                if (r3 == 0) goto L_0x004f
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                android.content.Intent r0 = new android.content.Intent
                android.net.Uri r11 = android.net.Uri.parse(r11)
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1, r11)
                r10.startActivity(r0)
                return r4
            L_0x004f:
                boolean r3 = android.net.MailTo.isMailTo(r11)
                r5 = 0
                if (r3 == 0) goto L_0x00b6
                android.net.MailTo r10 = android.net.MailTo.parse(r11)     // Catch:{ ParseException -> 0x00b2 }
                android.content.Intent r11 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.SENDTO"
                r11.<init>(r0)
                java.lang.String r0 = "mailto:"
                android.net.Uri r0 = android.net.Uri.parse(r0)
                r11.setData(r0)
                java.lang.String[] r0 = new java.lang.String[r4]
                java.lang.String r1 = r10.getTo()
                r0[r5] = r1
                java.lang.String r1 = "android.intent.extra.EMAIL"
                r11.putExtra(r1, r0)
                java.lang.String r0 = r10.getSubject()
                java.lang.String r1 = "android.intent.extra.SUBJECT"
                r11.putExtra(r1, r0)
                java.lang.String r0 = r10.getBody()
                java.lang.String r1 = "android.intent.extra.TEXT"
                r11.putExtra(r1, r0)
                java.lang.String r10 = r10.getCc()
                java.lang.String r0 = "android.intent.extra.CC"
                r11.putExtra(r0, r10)
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                com.etsy.android.uikit.BaseActivity r10 = r10.mActivity
                android.content.pm.PackageManager r10 = r10.getPackageManager()
                android.content.ComponentName r10 = r11.resolveActivity(r10)
                if (r10 == 0) goto L_0x00a6
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                r10.startActivity(r11)
                goto L_0x00b5
            L_0x00a6:
                ea.n r10 = p628nj.C18263b.f40052P
                java.lang.String r11 = com.etsy.android.p327ui.EtsyWebFragment.ELK_TAG
                java.lang.String r0 = "Unable to find application to handle email Intent"
                r10.mo45451c(r11, r0)
                goto L_0x00b5
            L_0x00b2:
                r9.mo31273f(r11)
            L_0x00b5:
                return r4
            L_0x00b6:
                java.lang.String r3 = "data:"
                boolean r3 = r11.startsWith(r3)
                if (r3 == 0) goto L_0x00c2
                r9.mo31273f(r11)
                return r4
            L_0x00c2:
                com.etsy.android.ui.EtsyWebFragment r3 = com.etsy.android.p327ui.EtsyWebFragment.this
                int r3 = r3.mRedirectId
                r6 = 13
                r7 = 2
                if (r3 == r6) goto L_0x00d7
                com.etsy.android.ui.EtsyWebFragment r3 = com.etsy.android.p327ui.EtsyWebFragment.this
                int r3 = r3.mRedirectId
                r6 = 12
                if (r3 != r6) goto L_0x0120
            L_0x00d7:
                java.lang.String r3 = r0.getScheme()
                boolean r3 = com.etsy.android.lib.util.C8915n.m17355g(r3)
                if (r3 == 0) goto L_0x010e
                java.util.List r3 = r0.getPathSegments()
                int r3 = r3.size()
                r6 = 3
                if (r3 != r6) goto L_0x010e
                java.util.List r3 = r0.getPathSegments()
                java.lang.Object r3 = r3.get(r5)
                java.lang.String r6 = "cart"
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L_0x010e
                java.util.List r3 = r0.getPathSegments()
                java.lang.Object r3 = r3.get(r7)
                java.lang.String r6 = "review"
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L_0x010e
                r3 = r4
                goto L_0x010f
            L_0x010e:
                r3 = r5
            L_0x010f:
                if (r3 == 0) goto L_0x0120
                com.etsy.android.ui.EtsyWebFragment r3 = com.etsy.android.p327ui.EtsyWebFragment.this
                java.util.List r6 = r0.getPathSegments()
                java.lang.Object r6 = r6.get(r4)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String unused = r3.mCartId = r6
            L_0x0120:
                com.etsy.android.ui.EtsyWebFragment r3 = com.etsy.android.p327ui.EtsyWebFragment.this
                boolean r3 = r3.isGooglePayCart()
                if (r3 == 0) goto L_0x0144
                if (r1 != 0) goto L_0x012c
                if (r2 == 0) goto L_0x0144
            L_0x012c:
                java.lang.String r1 = "supports_google_pay"
                boolean r2 = r11.contains(r1)
                if (r2 != 0) goto L_0x0144
                android.net.Uri$Builder r0 = r0.buildUpon()
                java.lang.String r2 = java.lang.String.valueOf(r4)
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
                android.net.Uri r0 = r0.build()
            L_0x0144:
                java.lang.String r1 = r0.getScheme()
                boolean r1 = com.etsy.android.lib.util.C8915n.m17355g(r1)
                if (r1 == 0) goto L_0x015c
                java.lang.String r1 = r0.getHost()
                java.lang.String r2 = "paypal.com"
                boolean r1 = r1.endsWith(r2)
                if (r1 == 0) goto L_0x015c
                r1 = r4
                goto L_0x015d
            L_0x015c:
                r1 = r5
            L_0x015d:
                r2 = 32
                r3 = 0
                if (r1 == 0) goto L_0x01d5
                com.etsy.android.ui.EtsyWebFragment r1 = com.etsy.android.p327ui.EtsyWebFragment.this
                boolean unused = r1.mIsPayPalCheckout = r4
                com.etsy.android.lib.config.c r1 = r9.configMap
                com.etsy.android.lib.config.EtsyConfigKey r6 = com.etsy.android.lib.config.C8592b.C8603k.f18903b
                java.lang.String r1 = r1.mo21136f(r6)
                boolean r1 = r11.startsWith(r1)
                if (r1 == 0) goto L_0x01d5
                com.paypal.checkout.PayPalCheckout r1 = com.paypal.checkout.PayPalCheckout.INSTANCE
                boolean r1 = r1.isConfigSet()
                if (r1 == 0) goto L_0x01d5
                java.lang.String r1 = "token"
                java.lang.String r1 = r0.getQueryParameter(r1)
                boolean r6 = com.etsy.android.lib.util.C8885d0.m17322f(r1)
                if (r6 != 0) goto L_0x01d5
                com.etsy.android.ui.EtsyWebFragment r6 = com.etsy.android.p327ui.EtsyWebFragment.this
                java.lang.String r6 = r6.mCartId
                boolean r6 = com.etsy.android.lib.util.C8885d0.m17322f(r6)
                if (r6 != 0) goto L_0x01d5
                com.etsy.android.lib.config.c r6 = r9.configMap
                com.etsy.android.lib.config.EtsyConfigKey r8 = com.etsy.android.lib.config.C8592b.C8603k.f18902a
                boolean r6 = r6.mo21132b(r8)
                if (r6 == 0) goto L_0x01d5
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                com.etsy.android.lib.logger.p r10 = r10.getAnalyticsContext()
                java.lang.String r11 = "paypal_native_checkout_start"
                r10.mo21333d(r11, r3)
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                fa.a r10 = r10.grafana
                java.lang.String r11 = "paypalNativeCheckout.start"
                r10.mo45474a(r11)
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                r10.showLoading()
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                android.content.res.Resources r10 = r10.getResources()
                android.content.res.Configuration r10 = r10.getConfiguration()
                int r10 = r10.uiMode
                r10 = r10 & 48
                if (r10 != r2) goto L_0x01c9
                r5 = r4
            L_0x01c9:
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                com.etsy.android.ui.checkout.PayPalCheckoutViewModel r11 = r10.payPalCheckoutViewModel
                java.lang.String r10 = r10.mCartId
                r11.mo31858b(r10, r1, r5)
                return r4
            L_0x01d5:
                com.etsy.android.ui.EtsyWebFragment r1 = com.etsy.android.p327ui.EtsyWebFragment.this
                boolean r1 = r1.isGooglePayCart()
                if (r1 == 0) goto L_0x0204
                boolean r1 = m17488d(r0)
                if (r1 == 0) goto L_0x01ff
                java.util.List r1 = r0.getPathSegments()
                int r1 = r1.size()
                if (r1 != r7) goto L_0x01ff
                java.util.List r1 = r0.getPathSegments()
                java.lang.Object r1 = r1.get(r4)
                java.lang.String r6 = "payment"
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L_0x01ff
                r1 = r4
                goto L_0x0200
            L_0x01ff:
                r1 = r5
            L_0x0200:
                if (r1 == 0) goto L_0x0204
                r1 = r4
                goto L_0x0205
            L_0x0204:
                r1 = r5
            L_0x0205:
                com.etsy.android.ui.EtsyWebFragment r6 = com.etsy.android.p327ui.EtsyWebFragment.this
                boolean r6 = r6.isGooglePayCart()
                if (r6 == 0) goto L_0x0234
                boolean r6 = m17488d(r0)
                if (r6 == 0) goto L_0x022f
                java.util.List r6 = r0.getPathSegments()
                int r6 = r6.size()
                if (r6 != r7) goto L_0x022f
                java.util.List r6 = r0.getPathSegments()
                java.lang.Object r6 = r6.get(r4)
                java.lang.String r8 = "purchase"
                boolean r6 = r8.equals(r6)
                if (r6 == 0) goto L_0x022f
                r6 = r4
                goto L_0x0230
            L_0x022f:
                r6 = r5
            L_0x0230:
                if (r6 == 0) goto L_0x0234
                r6 = r4
                goto L_0x0235
            L_0x0234:
                r6 = r5
            L_0x0235:
                boolean r8 = m17487c(r0)
                if (r8 == 0) goto L_0x02b2
                if (r1 != 0) goto L_0x02b2
                if (r6 != 0) goto L_0x02b2
                boolean r10 = m17487c(r0)
                if (r10 == 0) goto L_0x025f
                java.util.List r10 = r0.getPathSegments()
                int r10 = r10.size()
                if (r10 != r7) goto L_0x025f
                com.etsy.android.lib.models.datatypes.EtsyId r10 = new com.etsy.android.lib.models.datatypes.EtsyId
                java.util.List r11 = r0.getPathSegments()
                java.lang.Object r11 = r11.get(r5)
                java.lang.String r11 = (java.lang.String) r11
                r10.<init>((java.lang.String) r11)
                goto L_0x0264
            L_0x025f:
                com.etsy.android.lib.models.datatypes.EtsyId r10 = new com.etsy.android.lib.models.datatypes.EtsyId
                r10.<init>()
            L_0x0264:
                java.lang.String r11 = "msg"
                java.lang.String r11 = r0.getQueryParameter(r11)
                boolean r0 = android.text.TextUtils.isEmpty(r11)
                if (r0 == 0) goto L_0x0271
                goto L_0x0275
            L_0x0271:
                android.net.Uri r3 = android.net.Uri.parse(r11)
            L_0x0275:
                boolean r0 = m17489e(r3)
                if (r0 == 0) goto L_0x027f
                r9.mo31274g(r3)
                goto L_0x02b1
            L_0x027f:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.String r1 = r10.getId()
                r0[r5] = r1
                boolean r1 = android.text.TextUtils.isEmpty(r11)
                if (r1 == 0) goto L_0x028f
                java.lang.String r11 = ""
            L_0x028f:
                r0[r4] = r11
                java.lang.String r11 = "Processed cancel URI for cart %s with message: %s"
                java.lang.String r11 = java.lang.String.format(r11, r0)
                ea.n r0 = p628nj.C18263b.f40052P
                java.lang.String r1 = "cart_checkout"
                r0.mo45451c(r1, r11)
                com.etsy.android.ui.EtsyWebFragment r11 = com.etsy.android.p327ui.EtsyWebFragment.this
                java.lang.String r10 = r10.getId()
                java.lang.String unused = r11.mCartId = r10
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                r10.setActivityResultCheckoutCanceled()
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                r10.goBack()
            L_0x02b1:
                return r4
            L_0x02b2:
                boolean r1 = m17489e(r0)
                if (r1 == 0) goto L_0x02bc
                r9.mo31274g(r0)
                return r4
            L_0x02bc:
                boolean r1 = m17488d(r0)
                if (r1 == 0) goto L_0x02c8
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                r10.goBack()
                return r4
            L_0x02c8:
                com.etsy.android.ui.EtsyWebFragment r1 = com.etsy.android.p327ui.EtsyWebFragment.this
                int r1 = r1.type
                r6 = 17
                if (r1 != r6) goto L_0x02e0
                java.lang.String r1 = r0.getPath()
                java.lang.String r6 = "/listing/"
                boolean r1 = r1.contains(r6)
                if (r1 == 0) goto L_0x02e0
                r1 = r4
                goto L_0x02e1
            L_0x02e0:
                r1 = r5
            L_0x02e1:
                if (r1 == 0) goto L_0x0333
                com.etsy.android.ui.EtsyWebFragment r1 = com.etsy.android.p327ui.EtsyWebFragment.this
                com.etsy.android.lib.logger.p r1 = r1.getAnalyticsContext()
                com.etsy.android.ui.EtsyWebFragment$CartOverrideWebViewClient$1 r6 = new com.etsy.android.ui.EtsyWebFragment$CartOverrideWebViewClient$1
                r6.<init>()
                java.lang.String r7 = "report_listing_webview_submitted"
                r1.mo21333d(r7, r6)
                com.etsy.android.ui.EtsyWebFragment r1 = com.etsy.android.p327ui.EtsyWebFragment.this
                androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                jf.a r1 = p377jf.C12979a.C12980a.m20683a(r1)
                com.etsy.android.ui.EtsyWebFragment r6 = com.etsy.android.p327ui.EtsyWebFragment.this
                r7 = 2131953329(0x7f1306b1, float:1.9543126E38)
                java.lang.String r6 = r6.getString(r7)
                com.etsy.android.stylekit.views.CollageAlert r7 = r1.f28588b
                r7.setTitleText(r6)
                com.etsy.android.ui.EtsyWebFragment r6 = com.etsy.android.p327ui.EtsyWebFragment.this
                r7 = 2131953328(0x7f1306b0, float:1.9543124E38)
                java.lang.String r6 = r6.getString(r7)
                com.etsy.android.stylekit.views.CollageAlert r7 = r1.f28588b
                r7.setBodyText(r6, r3)
                com.etsy.android.stylekit.views.CollageAlert$AlertType r3 = com.etsy.android.stylekit.views.CollageAlert.AlertType.SUCCESS
                r1.mo45781a(r3)
                r3 = 2131231349(0x7f080275, float:1.8078777E38)
                com.etsy.android.stylekit.views.CollageAlert r6 = r1.f28588b
                r6.setIconDrawableRes(r3)
                r6 = 6000(0x1770, double:2.9644E-320)
                r1.f28591e = r6
                r1.mo45786f()
                com.etsy.android.ui.EtsyWebFragment r1 = com.etsy.android.p327ui.EtsyWebFragment.this
                r1.goBack()
                goto L_0x0372
            L_0x0333:
                com.etsy.android.ui.EtsyWebFragment r1 = com.etsy.android.p327ui.EtsyWebFragment.this
                com.etsy.android.ui.UpiIntentHelper r1 = r1.upiIntentHelper
                r1.getClass()
                com.etsy.android.ui.UpiIntentHelper$UpiApp[] r1 = com.etsy.android.p327ui.UpiIntentHelper.UpiApp.values()
                int r3 = r1.length
                r6 = r5
            L_0x0340:
                if (r6 >= r3) goto L_0x035e
                r7 = r1[r6]
                java.lang.String r8 = r0.getScheme()
                if (r8 == 0) goto L_0x0356
                java.lang.String r7 = r7.getUriScheme()
                boolean r7 = r8.equals(r7)
                if (r7 != r4) goto L_0x0356
                r7 = r4
                goto L_0x0357
            L_0x0356:
                r7 = r5
            L_0x0357:
                if (r7 == 0) goto L_0x035b
                r1 = r4
                goto L_0x035f
            L_0x035b:
                int r6 = r6 + 1
                goto L_0x0340
            L_0x035e:
                r1 = r5
            L_0x035f:
                if (r1 == 0) goto L_0x0372
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                com.etsy.android.ui.UpiIntentHelper r11 = r10.upiIntentHelper
                android.content.Context r10 = r10.requireContext()
                com.etsy.android.ui.x r1 = new com.etsy.android.ui.x
                r1.<init>(r9)
                r11.mo31279a(r10, r0, r1)
                return r4
            L_0x0372:
                java.lang.String r1 = r0.getScheme()
                java.lang.String r3 = "etsy"
                boolean r1 = r3.equalsIgnoreCase(r1)
                if (r1 != 0) goto L_0x0387
                boolean r10 = super.shouldOverrideUrlLoading(r10, r11)
                if (r10 == 0) goto L_0x0385
                goto L_0x0387
            L_0x0385:
                r10 = r5
                goto L_0x0388
            L_0x0387:
                r10 = r4
            L_0x0388:
                if (r10 == 0) goto L_0x038b
                return r4
            L_0x038b:
                com.etsy.android.ui.EtsyWebFragment r10 = com.etsy.android.p327ui.EtsyWebFragment.this
                android.content.Context r10 = r10.getContext()
                if (r10 == 0) goto L_0x03c1
                android.content.res.Resources r10 = r10.getResources()
                android.content.res.Configuration r10 = r10.getConfiguration()
                int r10 = r10.uiMode
                r10 = r10 & 48
                if (r10 != r2) goto L_0x03c1
                android.net.Uri$Builder r10 = r0.buildUpon()
                java.lang.String r11 = java.lang.String.valueOf(r4)
                java.lang.String r0 = "dark_mode"
                android.net.Uri$Builder r10 = r10.appendQueryParameter(r0, r11)
                android.net.Uri r10 = r10.build()
                com.etsy.android.ui.EtsyWebFragment r11 = com.etsy.android.p327ui.EtsyWebFragment.this
                android.webkit.WebView r11 = r11.mWebView
                java.lang.String r10 = r10.toString()
                r11.loadUrl(r10)
                return r4
            L_0x03c1:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.EtsyWebFragment.CartOverrideWebViewClient.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* renamed from: com.etsy.android.ui.EtsyWebFragment$a */
    public class C9086a extends BroadcastReceiver {
        public C9086a() {
        }

        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra(EtsyWebFragment.KEY_REQUEST_CODE, -1);
            int intExtra2 = intent.getIntExtra(EtsyWebFragment.KEY_RESULT_CODE, Integer.MIN_VALUE);
            if (!EtsyWebFragment.this.isDetached() && EtsyWebFragment.this.getContext() != null && EtsyWebFragment.this.googlePayWebHelper != null) {
                if (intExtra == 45056) {
                    EtsyWebFragment etsyWebFragment = EtsyWebFragment.this;
                    etsyWebFragment.googlePayWebHelper.mo31656a(intExtra, intExtra2, etsyWebFragment.getContext(), intent);
                }
            }
        }
    }

    /* renamed from: com.etsy.android.ui.EtsyWebFragment$b */
    public class C9087b extends TrackingOnClickListener {
        public C9087b() {
        }

        public final void onViewClick(View view) {
            EtsyWebFragment.this.loadWebView();
        }
    }

    static {
        Class<EtsyWebFragment> cls = EtsyWebFragment.class;
    }

    private boolean addOAuth2CookiesToCookieManager(Set<String> set) {
        String f = this.config.f18706f.mo21136f(C8592b.f18819p0);
        CookieManager instance = CookieManager.getInstance();
        if (instance == null) {
            return false;
        }
        instance.setAcceptCookie(true);
        for (String cookie : set) {
            instance.setCookie(f, cookie);
        }
        return true;
    }

    private boolean addOauth2Cookies(Set<String> set) {
        if (set.isEmpty()) {
            return false;
        }
        String cookie = CookieManager.getInstance().getCookie(this.config.f18706f.mo21136f(C8592b.f18819p0));
        if (!cookie.contains(OAUTH2_COOKIE_WWW_KEY) || !cookie.contains(OAUTH2_COOKIE_APEX_KEY)) {
            return addOAuth2CookiesToCookieManager(set);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void configureForCheckoutFlow() {
        /*
            r11 = this;
            com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract r0 = r11.mGoogleDataContract
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            com.etsy.android.lib.config.e r3 = r11.getConfigMap()
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.C8604l.f18905a
            boolean r3 = r3.mo21132b(r4)
            com.etsy.android.lib.config.e r4 = r11.getConfigMap()
            com.etsy.android.lib.config.EtsyConfigKey r5 = com.etsy.android.lib.config.C8592b.C8604l.f18906b
            boolean r4 = r4.mo21132b(r5)
            boolean r5 = r11.isGooglePayCart()
            if (r5 == 0) goto L_0x002d
            com.google.android.gms.wallet.PaymentData r5 = r11.mGooglePaymentData
            if (r5 == 0) goto L_0x002d
            if (r3 != 0) goto L_0x002b
            if (r4 == 0) goto L_0x002d
        L_0x002b:
            r3 = r1
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            int r4 = r11.mRedirectId
            if (r4 == r1) goto L_0x003d
            r5 = 13
            if (r4 == r5) goto L_0x003d
            r5 = 12
            if (r4 != r5) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r4 = r2
            goto L_0x003e
        L_0x003d:
            r4 = r1
        L_0x003e:
            if (r0 != 0) goto L_0x0047
            if (r3 != 0) goto L_0x0047
            if (r4 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r0 = r2
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            com.etsy.android.lib.config.BuildTarget r5 = com.etsy.android.lib.config.BuildTarget.getAudience()
            boolean r5 = r5.isInternal()
            if (r5 != 0) goto L_0x0061
            if (r0 == 0) goto L_0x0061
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            android.view.Window r0 = r0.getWindow()
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.setFlags(r5, r5)
        L_0x0061:
            if (r3 == 0) goto L_0x0080
            android.view.View r0 = r11.mWebViewCover
            r0.setVisibility(r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r11.queryParameters
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "supports_google_pay"
            r0.put(r5, r3)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r11.queryParameters
            com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract r3 = r11.mGoogleDataContract
            java.lang.String r3 = r3.getMessageToSeller()
            java.lang.String r5 = "message_to_seller"
            r0.put(r5, r3)
        L_0x0080:
            com.etsy.android.ui.UpiIntentHelper r0 = r11.upiIntentHelper
            android.content.Context r3 = r11.requireContext()
            r0.getClass()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r3, r5)
            y9.d r5 = r0.f19983a
            java.util.Locale r5 = r5.mo46719c()
            java.lang.String r5 = r5.getCountry()
            java.lang.String r6 = "IN"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00b0
            com.etsy.android.lib.currency.h r0 = r0.f19984b
            java.lang.String r0 = r0.mo21246a()
            java.lang.String r5 = "INR"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r5)
            if (r0 == 0) goto L_0x00b0
            r0 = r1
            goto L_0x00b1
        L_0x00b0:
            r0 = r2
        L_0x00b1:
            if (r0 == 0) goto L_0x00f8
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.etsy.android.ui.UpiIntentHelper$UpiApp[] r0 = com.etsy.android.p327ui.UpiIntentHelper.UpiApp.values()
            int r6 = r0.length
        L_0x00bd:
            if (r2 >= r6) goto L_0x00e0
            r7 = r0[r2]
            android.content.Intent r8 = new android.content.Intent
            android.net.Uri r9 = r7.getIntentUri()
            java.lang.String r10 = "android.intent.action.VIEW"
            r8.<init>(r10, r9)
            android.content.pm.PackageManager r9 = r3.getPackageManager()
            android.content.ComponentName r8 = r8.resolveActivity(r9)
            if (r8 == 0) goto L_0x00dd
            java.lang.String r7 = r7.getId()
            r5.add(r7)
        L_0x00dd:
            int r2 = r2 + 1
            goto L_0x00bd
        L_0x00e0:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x00f8
            com.etsy.android.ui.UpiIntentHelper$a r0 = new com.etsy.android.ui.UpiIntentHelper$a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            java.lang.String r6 = ","
            java.lang.String r1 = kotlin.collections.C19327t.m32644Z0(r5, r6, r7, r8, r9, r10)
            r0.<init>(r1)
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            if (r0 == 0) goto L_0x0104
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r11.queryParameters
            java.lang.String r2 = r0.f19987b
            java.lang.String r0 = r0.f19986a
            r1.put(r2, r0)
        L_0x0104:
            if (r4 == 0) goto L_0x0124
            android.content.Context r0 = r11.getContext()
            com.usebutton.merchant.k r1 = com.usebutton.merchant.C17496l.f38264b
            com.usebutton.merchant.q r0 = com.usebutton.merchant.C17496l.m29340a(r0)
            r1.getClass()
            java.lang.String r0 = r0.mo68677b()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0124
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r11.queryParameters
            java.lang.String r2 = "btn_ref"
            r1.put(r2, r0)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.EtsyWebFragment.configureForCheckoutFlow():void");
    }

    private boolean dontSendXAuthToken() {
        return this.config.f18706f.mo21132b(C8592b.f18814n1) && this.config.f18706f.mo21132b(C8592b.f18817o1);
    }

    private Set<String> getStoredOAuth2Cookies() {
        return this.oAuth2TokenStore.mo30124a() != null ? this.oAuth2TokenStore.mo30124a().getCookies() : new HashSet();
    }

    /* access modifiers changed from: private */
    public void goBack() {
        if (getActivity() != null && !isStateSaved()) {
            C12788a.m20426e(getActivity());
        }
    }

    private boolean hasCookies() {
        if (this.config.f18706f.mo21132b(C8592b.f18811m1)) {
            return addOauth2Cookies(getStoredOAuth2Cookies());
        }
        return false;
    }

    private void hideLoading() {
        this.mWebViewCover.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0120, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0121, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0129, code lost:
        r8 = r4;
        r4 = r10;
        r5 = r8;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012e, code lost:
        if (r4 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0130, code lost:
        r0.put("url", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0133, code lost:
        if (r10 == -1) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0135, code lost:
        r1.putInt("redirect_id", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013a, code lost:
        if (r5 == null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013c, code lost:
        r1.putString("TRACKING_NAME", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0141, code lost:
        r1.putSerializable("parameters", r0);
        setArguments(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0149, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initializeArgumentsForSA(int r10) {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            o9.q r1 = p409o9.C13138q.m20808a()
            java.lang.String r1 = r1.f28896b
            java.lang.String r2 = "version"
            r0.put(r2, r1)
            android.os.Bundle r1 = r9.getArguments()
            if (r1 != 0) goto L_0x001c
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            goto L_0x0020
        L_0x001c:
            android.os.Bundle r1 = r9.getArguments()
        L_0x0020:
            r2 = -1
            java.lang.String r3 = "url"
            r4 = 0
            switch(r10) {
                case -1: goto L_0x0127;
                case 0: goto L_0x0123;
                case 1: goto L_0x0120;
                case 2: goto L_0x010d;
                case 3: goto L_0x00cd;
                case 4: goto L_0x00c4;
                case 5: goto L_0x0087;
                case 6: goto L_0x0077;
                case 7: goto L_0x0069;
                case 8: goto L_0x0027;
                case 9: goto L_0x0027;
                case 10: goto L_0x005b;
                case 11: goto L_0x00c4;
                case 12: goto L_0x00c4;
                case 13: goto L_0x0027;
                case 14: goto L_0x0055;
                case 15: goto L_0x0047;
                case 16: goto L_0x003b;
                default: goto L_0x0027;
            }
        L_0x0027:
            android.os.Bundle r10 = r9.getArguments()
            java.lang.String r10 = r10.getString(r3, r4)
            android.os.Bundle r5 = r9.getArguments()
            java.lang.String r6 = "tracking_id"
            java.lang.String r4 = r5.getString(r6, r4)
            goto L_0x0129
        L_0x003b:
            android.os.Bundle r10 = r9.getArguments()
            java.lang.String r10 = r10.getString(r3, r4)
            java.lang.String r4 = "view_donate_the_change_terms"
            goto L_0x0129
        L_0x0047:
            com.etsy.android.lib.config.e r10 = r9.getConfigMap()
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.f18830t
            java.lang.String r10 = r10.mo21136f(r4)
            java.lang.String r4 = "cookies_and_similar_tech"
            goto L_0x0129
        L_0x0055:
            r10 = 28
            java.lang.String r5 = "help_page"
            goto L_0x012e
        L_0x005b:
            com.etsy.android.lib.config.e r10 = r9.getConfigMap()
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.f18824r
            java.lang.String r10 = r10.mo21136f(r4)
            java.lang.String r4 = "settings_legal"
            goto L_0x0129
        L_0x0069:
            com.etsy.android.lib.config.e r10 = r9.getConfigMap()
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.f18815o
            java.lang.String r10 = r10.mo21136f(r4)
            java.lang.String r4 = "electronic_communications_policy"
            goto L_0x0129
        L_0x0077:
            com.etsy.android.lib.logger.p r10 = r9.getAnalyticsContext()
            com.etsy.android.lib.config.e r10 = r10.f19116n
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.f18818p
            java.lang.String r10 = r10.mo21136f(r4)
            java.lang.String r4 = "privacy_policy"
            goto L_0x0129
        L_0x0087:
            android.os.Bundle r10 = r9.getArguments()
            boolean r10 = r10.containsKey(r3)
            if (r10 == 0) goto L_0x009a
            android.os.Bundle r10 = r9.getArguments()
            java.lang.String r10 = r10.getString(r3, r4)
            goto L_0x00c1
        L_0x009a:
            com.etsy.android.lib.logger.p r10 = r9.getAnalyticsContext()
            com.etsy.android.lib.config.e r10 = r10.f19116n
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.f18821q
            boolean r10 = r10.mo21132b(r4)
            if (r10 == 0) goto L_0x00b5
            com.etsy.android.lib.logger.p r10 = r9.getAnalyticsContext()
            com.etsy.android.lib.config.e r10 = r10.f19116n
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.f18827s
            java.lang.String r10 = r10.mo21136f(r4)
            goto L_0x00c1
        L_0x00b5:
            com.etsy.android.lib.logger.p r10 = r9.getAnalyticsContext()
            com.etsy.android.lib.config.e r10 = r10.f19116n
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.f18812n
            java.lang.String r10 = r10.mo21136f(r4)
        L_0x00c1:
            java.lang.String r4 = "terms_of_use"
            goto L_0x0129
        L_0x00c4:
            android.os.Bundle r10 = r9.getArguments()
            java.lang.String r10 = r10.getString(r3, r4)
            goto L_0x0129
        L_0x00cd:
            android.os.Bundle r10 = r9.getArguments()
            boolean r10 = r10.containsKey(r3)
            if (r10 == 0) goto L_0x00e0
            android.os.Bundle r10 = r9.getArguments()
            java.lang.String r10 = r10.getString(r3, r4)
            goto L_0x0129
        L_0x00e0:
            android.os.Bundle r10 = r9.getArguments()
            java.lang.String r5 = "receipt_id"
            java.io.Serializable r10 = r10.getSerializable(r5)
            com.etsy.android.lib.models.datatypes.EtsyId r10 = (com.etsy.android.lib.models.datatypes.EtsyId) r10
            android.os.Bundle r6 = r9.getArguments()
            java.lang.String r7 = "receipt_shipping_id"
            java.io.Serializable r6 = r6.getSerializable(r7)
            com.etsy.android.lib.models.datatypes.EtsyId r6 = (com.etsy.android.lib.models.datatypes.EtsyId) r6
            if (r10 == 0) goto L_0x0101
            java.lang.String r10 = r10.getId()
            r0.put(r5, r10)
        L_0x0101:
            if (r6 == 0) goto L_0x010a
            java.lang.String r10 = r6.getId()
            r0.put(r7, r10)
        L_0x010a:
            r10 = 9
            goto L_0x0121
        L_0x010d:
            android.os.Bundle r10 = r9.getArguments()
            java.lang.String r5 = "checked_out_single_listing"
            boolean r10 = r10.getBoolean(r5)
            if (r10 == 0) goto L_0x011d
            r9.initializeForSingleListingCheckout(r0, r1)
            goto L_0x0120
        L_0x011d:
            r9.initializeForCheckout(r0, r1)
        L_0x0120:
            r10 = r2
        L_0x0121:
            r5 = r4
            goto L_0x012e
        L_0x0123:
            r10 = 4
            java.lang.String r5 = "help"
            goto L_0x012e
        L_0x0127:
            java.lang.String r10 = "about:blank"
        L_0x0129:
            r8 = r4
            r4 = r10
            r10 = r8
            r5 = r10
            r10 = r2
        L_0x012e:
            if (r4 == 0) goto L_0x0133
            r0.put(r3, r4)
        L_0x0133:
            if (r10 == r2) goto L_0x013a
            java.lang.String r2 = "redirect_id"
            r1.putInt(r2, r10)
        L_0x013a:
            if (r5 == 0) goto L_0x0141
            java.lang.String r10 = "TRACKING_NAME"
            r1.putString(r10, r5)
        L_0x0141:
            java.lang.String r10 = "parameters"
            r1.putSerializable(r10, r0)
            r9.setArguments(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.EtsyWebFragment.initializeArgumentsForSA(int):void");
    }

    /* access modifiers changed from: private */
    public boolean isGooglePayCart() {
        return this.mGoogleDataContract != null;
    }

    /* access modifiers changed from: private */
    public void loadWebView() {
        int i = 0;
        this.mWebView.setVisibility(0);
        this.mErrorView.setVisibility(8);
        this.mWebView.clearView();
        HashMap<String, String> hashMap = this.queryParameters;
        if (hashMap == null || !hashMap.containsKey("url")) {
            configureForCheckoutFlow();
            WebView webView = this.mWebView;
            C12028h hVar = this.webViewUtil;
            String str = hVar.f26806a.mo21136f(C8592b.f18819p0) + "/externalredirect";
            C12028h hVar2 = this.webViewUtil;
            HashMap<String, String> hashMap2 = this.queryParameters;
            int i2 = this.mRedirectId;
            boolean includeExternalRedirectToken = includeExternalRedirectToken();
            hVar2.getClass();
            C19383o.m32797g(hashMap2, "parameters");
            hashMap2.put("redirect_id", String.valueOf(i2));
            if (includeExternalRedirectToken && hVar2.f26809d.mo45960e()) {
                XAuthAccessToken xAuthAccessToken = hVar2.f26809d.f29137c.f29107a;
                C19383o.m32794d(xAuthAccessToken);
                hashMap2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, xAuthAccessToken.getXAuthToken());
            }
            hashMap2.put("api_key", hVar2.f26806a.mo21136f(C8592b.f18744L0));
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : hashMap2.entrySet()) {
                String str2 = (String) next.getKey();
                String str3 = (String) next.getValue();
                if (i != 0) {
                    sb.append("&");
                }
                sb.append(str2);
                sb.append("=");
                try {
                    sb.append(URLEncoder.encode(str3, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                    sb.append(str3);
                }
                i++;
            }
            String sb2 = sb.toString();
            C19383o.m32796f(sb2, "postDataBuilder.toString()");
            Charset forName = Charset.forName("UTF-8");
            C19383o.m32796f(forName, "forName(\"UTF-8\")");
            byte[] bytes = sb2.getBytes(forName);
            C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
            webView.postUrl(str, bytes);
            return;
        }
        this.mWebView.loadUrl(this.queryParameters.get("url"));
    }

    /* access modifiers changed from: private */
    /* renamed from: processPayPalEvent */
    public void lambda$onViewCreated$0(C12059p<PayPalCheckoutViewModel.C9427b> pVar) {
        PayPalCheckoutViewModel.C9427b a = pVar.mo38935a();
        if (a instanceof PayPalCheckoutViewModel.C9427b.C9428a) {
            getAnalyticsContext().mo21333d("paypal_native_checkout_approve", (Map<? extends AnalyticsProperty, Object>) null);
            this.grafana.mo45474a("paypalNativeCheckout.approve");
        } else if (a instanceof PayPalCheckoutViewModel.C9427b.C9429b) {
            getAnalyticsContext().mo21333d("paypal_native_checkout_cancel", (Map<? extends AnalyticsProperty, Object>) null);
            this.grafana.mo45474a("paypalNativeCheckout.cancel");
        } else if (a instanceof PayPalCheckoutViewModel.C9427b.C9432e) {
            PayPalCheckoutViewModel.C9427b.C9432e eVar = (PayPalCheckoutViewModel.C9427b.C9432e) a;
            String str = eVar.f20922a.f20917b;
            if (str == null || !URLUtil.isValidUrl(str)) {
                Toast.makeText(getContext(), getString(R.string.paypal_checkout_error_message), 1).show();
            } else {
                this.mWebView.loadUrl(eVar.f20922a.f20917b);
            }
            hideLoading();
        } else if (a instanceof PayPalCheckoutViewModel.C9427b.C9431d) {
            hideLoading();
        } else if (a instanceof PayPalCheckoutViewModel.C9427b.C9430c) {
            hideLoading();
            Toast.makeText(getContext(), getString(R.string.paypal_checkout_error_message), 1).show();
            getAnalyticsContext().mo21333d("paypal_native_checkout_error", new HashMap<AnalyticsProperty, Object>((PayPalCheckoutViewModel.C9427b.C9430c) a) {
                public final /* synthetic */ PayPalCheckoutViewModel.C9427b.C9430c val$error;

                {
                    this.val$error = r2;
                    put(PredefinedAnalyticsProperty.NATIVE_PAYPAL_ERROR_MSG, r2.f20920a);
                }
            });
            this.grafana.mo45474a("paypalNativeCheckout.error");
        }
    }

    /* access modifiers changed from: private */
    public void setActivityResultCheckoutCanceled() {
        Intent intent = new Intent();
        if (this.type == 2) {
            intent.putExtra(ResponseConstants.CART_ID, this.mCartId);
            intent.putExtra("is_paypal", this.mIsPayPalCheckout);
        }
        intent.setAction(ACTION_RESULT_CANCELED);
        C8115a.m16322a(getActivity()).mo20709c(intent);
        C6337d dVar = this.checkoutRepository;
        String str = this.mCartId;
        if (str != null) {
            C7091a aVar = dVar.f14126e;
            SingleSubscribeOn f = C0072d.m199f(dVar.f14123b, dVar.f14122a.mo18076a(str));
            dVar.f14123b.getClass();
            aVar.mo19403b(f.mo20657f(C13461f.m21235b()).mo20658g(new C6335b(0), new C6336c(dVar, 0)));
            return;
        }
        dVar.getClass();
    }

    private boolean shouldUseNavStyleModal() {
        int i = this.type;
        return i == 2 || i == 11 || i == 14 || i == 17 || i == 18 || i == 19;
    }

    /* access modifiers changed from: private */
    public void showLoading() {
        this.mWebViewCover.setVisibility(0);
    }

    public void createGooglePayWebViewHelper(PaymentData paymentData, GooglePayDataContract googlePayDataContract) {
        try {
            this.googlePayWebHelper = new C9308f(getActivity(), this.googlePayHelper, C13869b.C13870a.m21399a(paymentData), googlePayDataContract);
        } catch (JSONException unused) {
        }
    }

    public C11324t.C11325a getBottomTabsOverrides() {
        return shouldUseNavStyleModal() ? C11324t.C11325a.C11327b.f24989c : C11324t.C11325a.C11326a.f24988c;
    }

    public String getCartId() {
        return this.mCartId;
    }

    public String getFragmentTitleString() {
        switch (this.type) {
            case 0:
                return getResources().getString(R.string.about_app);
            case 1:
                return getResources().getString(R.string.notifications);
            case 2:
                return getResources().getString(R.string.checkout);
            case 3:
                return getResources().getString(R.string.track_package);
            case 4:
                return getResources().getString(R.string.local_help_page_title);
            case 5:
                return getResources().getString(R.string.etsy_terms_of_use);
            case 6:
                return getResources().getString(R.string.privacy_policy);
            case 7:
                return getResources().getString(R.string.comms_policy);
            case 10:
                return getResources().getString(R.string.legal);
            case 11:
                return getResources().getString(R.string.help);
            case 12:
                return getResources().getString(R.string.qualtrics_survey_page_title);
            case 14:
                return getResources().getString(R.string.helpdesk_button_helpcenter);
            case 15:
                return getResources().getString(R.string.privacy_legal_page_title);
            case 16:
                return getResources().getString(R.string.donate_the_change_web_title);
            case 17:
                return getResources().getString(R.string.report_listing);
            default:
                return getArguments().getString("title", "");
        }
    }

    public int getNavDrawableRes() {
        return shouldUseNavStyleModal() ? R.drawable.clg_icon_core_close_v1 : R.drawable.sk_ic_back_tinted;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public boolean handleBackPressed() {
        if (this.mWebView.canGoBack()) {
            this.mWebView.goBack();
            return true;
        } else if (super.handleBackPressed()) {
            return true;
        } else {
            setActivityResultCheckoutCanceled();
            return false;
        }
    }

    public boolean includeExternalRedirectToken() {
        if (hasCookies()) {
            return !dontSendXAuthToken();
        }
        return true;
    }

    public void initializeForCheckout(HashMap<String, String> hashMap, Bundle bundle) {
        HashMap<String, String> hashMap2 = hashMap;
        Bundle bundle2 = bundle;
        Serializable serializable = bundle2.getSerializable(CartWithSavedFragment.CHECKED_OUT_CART);
        PaymentData paymentData = null;
        GooglePayDataContract googlePayDataContract = serializable instanceof GooglePayDataContract ? (GooglePayDataContract) serializable : null;
        boolean z = bundle2.getBoolean(CartWithSavedFragment.CHECKED_OUT_IS_MSCO);
        boolean z2 = !z && getConfigMap().mo21132b(C8592b.C8604l.f18905a);
        boolean z3 = z && getConfigMap().mo21132b(C8592b.C8604l.f18906b);
        if (googlePayDataContract == null || (!z2 && !z3)) {
            hashMap2.put("force_flex_pay", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } else {
            paymentData = (PaymentData) bundle2.getParcelable("google_pay_payment_data");
            if (paymentData != null) {
                createGooglePayWebViewHelper(paymentData, googlePayDataContract);
            }
        }
        if (z) {
            String string = bundle2.getString(CartWithSavedFragment.CHECKED_OUT_CART_GROUP_ID);
            String string2 = bundle2.getString(CartWithSavedFragment.CHECKED_OUT_PAYMENT_METHOD);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                C18263b.f40052P.mo45451c("cart_checkout", "MultishopCart EtsyWebFragment requested with no cart_group_id or payment_method");
            } else {
                hashMap2.put(CartWithSavedFragment.CART_IDS, string);
                hashMap2.put("payment_method", string2);
                bundle2.putInt("redirect_id", 13);
                bundle2.putString("TRACKING_NAME", "cart_checkout");
                if (z3) {
                    bundle2.putSerializable(CartWithSavedFragment.CHECKED_OUT_CART, googlePayDataContract);
                    bundle2.putParcelable("google_pay_payment_data", paymentData);
                }
                this.isCheckoutInitialized = true;
                return;
            }
        }
        if (googlePayDataContract != null) {
            hashMap2.put(ResponseConstants.CART_ID, String.valueOf(googlePayDataContract.getCartId()));
            hashMap2.put("payment_method", "google_pay");
            if (googlePayDataContract.isGiftCardApplied()) {
                hashMap2.put("apply_gift_card_balance", String.valueOf(1));
            }
            bundle2.putSerializable("parameters", hashMap2);
            bundle2.putSerializable(CartWithSavedFragment.CHECKED_OUT_CART, googlePayDataContract);
            bundle2.putBoolean(CartWithSavedFragment.CHECKED_OUT_IS_MSCO, false);
            bundle2.putInt("redirect_id", 1);
            bundle2.putString("TRACKING_NAME", "cart_checkout");
            bundle2.putParcelable("google_pay_payment_data", paymentData);
        } else {
            C18263b.f40052P.mo45451c("cart_checkout", "Cart EtsyWebFragment request with no Cart");
        }
        this.isCheckoutInitialized = true;
    }

    public void initializeForSingleListingCheckout(HashMap<String, String> hashMap, Bundle bundle) {
        HashMap<String, String> hashMap2 = hashMap;
        Bundle bundle2 = bundle;
        String string = bundle2.getString("listing_id");
        String string2 = bundle2.getString(ResponseConstants.QUANTITY);
        String string3 = bundle2.getString(ResponseConstants.OFFERING_ID);
        String string4 = bundle2.getString("listing_variation");
        String string5 = bundle2.getString(ResponseConstants.PERSONALIZATION);
        GooglePayDataContract googlePayDataContract = (GooglePayDataContract) bundle2.getSerializable(CartWithSavedFragment.CHECKED_OUT_CART);
        PaymentData paymentData = (PaymentData) bundle2.getParcelable("google_pay_payment_data");
        Object obj = ResponseConstants.PERSONALIZATION;
        String str = string5;
        PaymentOption paymentOption = (PaymentOption) bundle2.get("payment_option");
        String str2 = "google_pay_payment_data";
        String str3 = CartWithSavedFragment.CHECKED_OUT_CART;
        if (googlePayDataContract == null || paymentData == null) {
            hashMap2.put("payment_method", paymentOption.getPaymentMethod());
            hashMap2.put("listing_id", string);
            hashMap2.put(ResponseConstants.QUANTITY, string2);
            hashMap2.put("force_flex_pay", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            if (!TextUtils.isEmpty(string3)) {
                hashMap2.put("listing_inventory_id", string3);
            } else {
                hashMap2.put("listing_variation", string4);
            }
            if (str != null && !TextUtils.isEmpty(str)) {
                hashMap2.put(obj, str);
            }
            bundle2.putSerializable("parameters", hashMap2);
            bundle2.putInt("redirect_id", 12);
            bundle2.putString("TRACKING_NAME", ResponseConstants.SINGLE_LISTING_CHECKOUT);
            return;
        }
        String str4 = ResponseConstants.SINGLE_LISTING_CHECKOUT;
        createGooglePayWebViewHelper(paymentData, googlePayDataContract);
        hashMap2.put("payment_method", "google_pay");
        hashMap2.put("listing_id", string);
        hashMap2.put(ResponseConstants.QUANTITY, string2);
        if (!TextUtils.isEmpty(string3)) {
            hashMap2.put("listing_inventory_id", string3);
        } else {
            hashMap2.put("listing_variation", string4);
        }
        bundle2.putInt("redirect_id", 12);
        bundle2.putString("TRACKING_NAME", str4);
        bundle2.putSerializable(str3, googlePayDataContract);
        bundle2.putParcelable(str2, paymentData);
    }

    public boolean isPayPalCheckout() {
        return this.mIsPayPalCheckout;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.chromeClient.onActivityResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onChangePaymentData(PaymentData paymentData) {
        this.mGooglePaymentData = paymentData;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.contextConfigurationDelegate = new C12027g(requireActivity());
        int i = getArguments().getInt("type", -2);
        this.type = i;
        initializeArgumentsForSA(i);
        this.mRedirectId = getArguments().getInt("redirect_id");
        this.queryParameters = (HashMap) getArguments().getSerializable("parameters");
        Serializable serializable = getArguments().getSerializable(CartWithSavedFragment.CHECKED_OUT_CART);
        if (serializable != null) {
            this.mGoogleDataContract = serializable instanceof GooglePayDataContract ? (GooglePayDataContract) serializable : null;
        }
        if (getArguments().containsKey("google_pay_payment_data")) {
            this.mGooglePaymentData = (PaymentData) getArguments().getParcelable("google_pay_payment_data");
        }
        getActivity().getWindow().setSoftInputMode(16);
        setHasOptionsMenu(true);
        if (this.type == 17) {
            getAnalyticsContext().mo21333d("report_listing_webview_displayed", new HashMap<AnalyticsProperty, Object>() {
                {
                    put(PredefinedAnalyticsProperty.LISTING_ID, EtsyWebFragment.this.getArguments().getString("listing_id"));
                }
            });
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_webview, viewGroup, false);
        this.contextConfigurationDelegate.mo38911a();
        WebView webView = (WebView) inflate.findViewById(R.id.webview);
        this.mWebView = webView;
        Context context = inflate.getContext();
        Object obj = C8184a.f17966a;
        webView.setBackgroundColor(C8184a.C8188d.m16468a(context, R.color.transparent));
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        CartOverrideWebViewClient cartOverrideWebViewClient = new CartOverrideWebViewClient(getConfigMap(), progressBar, this.redirectCookiesRepository, this.schedulers);
        getViewLifecycleOwner().getLifecycle().mo10733a(cartOverrideWebViewClient);
        getViewLifecycleOwner().getLifecycle().mo10733a(this.chromeClient);
        this.chromeClient.attachProgressBar(progressBar);
        this.chromeClient.attachFragment(this);
        this.webViewUtil.mo38912a(this.mWebView, cartOverrideWebViewClient, this.chromeClient);
        this.mErrorView = inflate.findViewById(R.id.no_internet);
        this.mWebViewCover = inflate.findViewById(R.id.webview_cover);
        this.mErrorView.findViewById(R.id.btn_retry_internet).setOnClickListener(new C9087b());
        return inflate;
    }

    public void onDestroy() {
        getActivity().getWindow().clearFlags(8192);
        super.onDestroy();
        this.googlePayWebHelper = null;
        this.disposable.dispose();
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (getContext() != null) {
            C8115a.m16322a(getContext()).mo20710d(this.googlePayUpdatesReceiver);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.type != 2 || 16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        setActivityResultCheckoutCanceled();
        goBack();
        return true;
    }

    public void onStop() {
        super.onStop();
        int i = this.mRedirectId;
        if (i == 1 || i == 13) {
            this.cartBadgeCountRepo.mo31436a();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C9308f fVar = this.googlePayWebHelper;
        if (fVar != null) {
            WebView webView = this.mWebView;
            View view2 = this.mWebViewCover;
            C19383o.m32797g(webView, "webView");
            C19383o.m32797g(view2, "webViewCover");
            C9308f.C9309a aVar = fVar.f20546d;
            aVar.getClass();
            aVar.f20548a = webView;
            webView.addJavascriptInterface(aVar, "AppGooglePay");
            aVar.f20549b = view2;
        }
        C8115a.m16322a(getContext()).mo20708b(this.googlePayUpdatesReceiver, new IntentFilter(EtsyAction.GOOGLE_PAY_RESULT.getIntentAction()));
        this.payPalCheckoutViewModel.f20913e.observe(getViewLifecycleOwner(), new C9904g(this, 1));
        loadWebView();
    }
}
