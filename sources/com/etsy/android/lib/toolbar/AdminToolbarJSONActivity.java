package com.etsy.android.lib.toolbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.p013v4.media.C0073e;
import android.text.Html;
import android.text.Spanned;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.etsy.android.C6331b;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.C8919r;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.single.C19206h;
import p269vp.C8221a;
import p402n9.C13089i;
import p479xa.C13863b;
import p479xa.C13864c;
import p479xa.C13865d;
import p479xa.C13866e;
import p479xa.C13867f;
import p738dq.C18990a;

public final class AdminToolbarJSONActivity extends Activity {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C7091a disposable = new C7091a();

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-3  reason: not valid java name */
    public static final void m34871onCreate$lambda3(AdminToolbarJSONActivity adminToolbarJSONActivity, String str, String str2, View view) {
        C19383o.m32797g(adminToolbarJSONActivity, "this$0");
        C19383o.m32797g(str, "$prettyJson");
        C19383o.m32797g(str2, "$urlText");
        ViewExtensions.m12869m((LoadingIndicatorView) adminToolbarJSONActivity._$_findCachedViewById(R.id.loading));
        ViewExtensions.m12860d((LinearLayout) adminToolbarJSONActivity._$_findCachedViewById(R.id.content));
        adminToolbarJSONActivity.disposable.mo19403b(new C19206h(new C13863b(view, str, str2)).mo20660i(C18990a.f42333b).mo20657f(C8221a.m16513a()).mo20658g(new C13089i(adminToolbarJSONActivity, 2), Functions.f28541e));
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-3$lambda-0  reason: not valid java name */
    public static final Uri m34872onCreate$lambda3$lambda0(View view, String str, String str2) {
        C19383o.m32797g(str, "$prettyJson");
        C19383o.m32797g(str2, "$urlText");
        File b = C8919r.m17357b(view.getContext(), "network_response.json");
        if (C8919r.m17362g(b, str)) {
            C8694h hVar = C8694h.f19097a;
            StringBuilder k = C0073e.m211k(str2, " saved to ");
            k.append(b.getAbsolutePath());
            hVar.mo21312f(k.toString());
        }
        return C8919r.m17360e(view.getContext(), b);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-3$lambda-2  reason: not valid java name */
    public static final void m34873onCreate$lambda3$lambda2(AdminToolbarJSONActivity adminToolbarJSONActivity, Uri uri) {
        C19383o.m32797g(adminToolbarJSONActivity, "this$0");
        ViewExtensions.m12860d((LoadingIndicatorView) adminToolbarJSONActivity._$_findCachedViewById(R.id.loading));
        ViewExtensions.m12869m((LinearLayout) adminToolbarJSONActivity._$_findCachedViewById(R.id.content));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("text/plain");
        adminToolbarJSONActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-7  reason: not valid java name */
    public static final void m34874onCreate$lambda7(AdminToolbarJSONActivity adminToolbarJSONActivity, String str, String str2, View view) {
        C19383o.m32797g(adminToolbarJSONActivity, "this$0");
        C19383o.m32797g(str, "$prettyJson");
        C19383o.m32797g(str2, "$urlText");
        ViewExtensions.m12869m((LoadingIndicatorView) adminToolbarJSONActivity._$_findCachedViewById(R.id.loading));
        ViewExtensions.m12860d((LinearLayout) adminToolbarJSONActivity._$_findCachedViewById(R.id.content));
        adminToolbarJSONActivity.disposable.mo19403b(new C19206h(new C13864c(view, str, str2)).mo20660i(C18990a.f42333b).mo20657f(C8221a.m16513a()).mo20658g(new C13865d(adminToolbarJSONActivity, view), new C6331b(adminToolbarJSONActivity, 1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-7$lambda-4  reason: not valid java name */
    public static final String m34875onCreate$lambda7$lambda4(View view, String str, String str2) {
        C19383o.m32797g(str, "$prettyJson");
        C19383o.m32797g(str2, "$urlText");
        File file = new File(view.getContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "network_response.json");
        if (C8919r.m17362g(file, str)) {
            C8694h hVar = C8694h.f19097a;
            StringBuilder k = C0073e.m211k(str2, " saved to ");
            k.append(file.getAbsolutePath());
            hVar.mo21312f(k.toString());
        }
        return file.getPath();
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-7$lambda-5  reason: not valid java name */
    public static final void m34876onCreate$lambda7$lambda5(AdminToolbarJSONActivity adminToolbarJSONActivity, View view, String str) {
        C19383o.m32797g(adminToolbarJSONActivity, "this$0");
        ViewExtensions.m12860d((LoadingIndicatorView) adminToolbarJSONActivity._$_findCachedViewById(R.id.loading));
        ViewExtensions.m12869m((LinearLayout) adminToolbarJSONActivity._$_findCachedViewById(R.id.content));
        Toast.makeText(view.getContext(), str, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-7$lambda-6  reason: not valid java name */
    public static final void m34877onCreate$lambda7$lambda6(AdminToolbarJSONActivity adminToolbarJSONActivity, Throwable th) {
        C19383o.m32797g(adminToolbarJSONActivity, "this$0");
        ViewExtensions.m12860d((LoadingIndicatorView) adminToolbarJSONActivity._$_findCachedViewById(R.id.loading));
        ViewExtensions.m12869m((LinearLayout) adminToolbarJSONActivity._$_findCachedViewById(R.id.content));
        C8694h.f19097a.error(th);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C7091a getDisposable() {
        return this.disposable;
    }

    @SuppressLint({"SetTextI18n"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_admin_toolbar_json);
        Intent intent = getIntent();
        C19383o.m32796f(intent, "intent");
        int intExtra = intent.getIntExtra("transaction-data", -1);
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        AdminToolbarNetworkResponse adminToolbarNetworkResponse = (AdminToolbarNetworkResponse) TransactionDataRepository.C11867a.m19552a().mo38342a(intExtra);
        String str = null;
        String url = adminToolbarNetworkResponse != null ? adminToolbarNetworkResponse.getUrl() : null;
        if (url == null) {
            url = "N/A";
        }
        ((TextView) _$_findCachedViewById(R.id.url)).setText("URL: " + url);
        Linkify.addLinks((TextView) _$_findCachedViewById(R.id.url), 15);
        String headersString = adminToolbarNetworkResponse != null ? adminToolbarNetworkResponse.getHeadersString() : null;
        if (headersString == null) {
            headersString = "";
        }
        int i = 0;
        Spanned fromHtml = Html.fromHtml(headersString, 0);
        C19383o.m32796f(fromHtml, "fromHtml(headersHtml, Html.FROM_HTML_MODE_LEGACY)");
        ((TextView) _$_findCachedViewById(R.id.headers)).setText(fromHtml);
        if (adminToolbarNetworkResponse != null) {
            str = adminToolbarNetworkResponse.getPrettyJsonString();
        }
        if (str == null) {
            str = "{}";
        }
        if (adminToolbarNetworkResponse != null) {
            i = adminToolbarNetworkResponse.getStatusCode();
        }
        ((TextView) _$_findCachedViewById(R.id.status_code)).setText("Status code: " + i);
        ((TextView) _$_findCachedViewById(R.id.json)).setText("Body:\n" + str);
        Objects.toString(((TextView) _$_findCachedViewById(R.id.headers)).getText());
        Objects.toString(((TextView) _$_findCachedViewById(R.id.json)).getText());
        ((Button) _$_findCachedViewById(R.id.send)).setOnClickListener(new C13866e(this, str, url));
        ((Button) _$_findCachedViewById(R.id.save)).setOnClickListener(new C13867f(this, str, url));
    }

    public void onDestroy() {
        super.onDestroy();
        this.disposable.dispose();
    }
}
