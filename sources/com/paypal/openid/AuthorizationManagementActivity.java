package com.paypal.openid;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.paypal.openid.AuthorizationException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p251u1.C8115a;
import p568fn.C17782b;
import p684to.C18569b;
import p684to.C18572e;
import p708wo.C18755a;

public class AuthorizationManagementActivity extends Activity {

    /* renamed from: a */
    private boolean f37533a = false;

    /* renamed from: b */
    private Intent f37534b;

    /* renamed from: c */
    private C18569b f37535c;

    /* renamed from: d */
    private PendingIntent f37536d;

    /* renamed from: e */
    private PendingIntent f37537e;

    /* renamed from: a */
    private static Intent m28596a(Context context) {
        return new Intent(context, AuthorizationManagementActivity.class);
    }

    /* renamed from: a */
    private Intent m28597a(Uri uri) {
        AuthorizationException authorizationException;
        Long l;
        String str;
        String[] split;
        if (uri.getQueryParameterNames().contains("error")) {
            authorizationException = AuthorizationException.fromOAuthRedirect(uri);
        } else {
            C18569b bVar = this.f37535c;
            if (bVar != null) {
                new LinkedHashMap();
                String queryParameter = uri.getQueryParameter("state");
                C17782b.m29842H("state must not be empty", queryParameter);
                String queryParameter2 = uri.getQueryParameter("token_type");
                C17782b.m29842H("tokenType must not be empty", queryParameter2);
                String queryParameter3 = uri.getQueryParameter(ResponseConstants.CODE);
                C17782b.m29842H("authorizationCode must not be empty", queryParameter3);
                String queryParameter4 = uri.getQueryParameter(AccessToken.ACCESS_TOKEN_KEY);
                C17782b.m29842H("accessToken must not be empty", queryParameter4);
                String queryParameter5 = uri.getQueryParameter(AccessToken.EXPIRES_IN_KEY);
                Long valueOf = queryParameter5 != null ? Long.valueOf(Long.parseLong(queryParameter5)) : null;
                if (valueOf == null) {
                    l = null;
                } else {
                    l = Long.valueOf(TimeUnit.SECONDS.toMillis(valueOf.longValue()) + System.currentTimeMillis());
                }
                String queryParameter6 = uri.getQueryParameter(AuthenticationToken.AUTHENTICATION_TOKEN_KEY);
                C17782b.m29842H("idToken cannot be empty", queryParameter6);
                String queryParameter7 = uri.getQueryParameter("scope");
                if (!TextUtils.isEmpty(queryParameter7) && (split = queryParameter7.split(" +")) != null) {
                    str = C0761x.m1741r0(Arrays.asList(split));
                } else {
                    str = null;
                }
                Set<String> set = C17149b.f37563j;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String next : uri.getQueryParameterNames()) {
                    if (!set.contains(next)) {
                        linkedHashMap.put(next, uri.getQueryParameter(next));
                    }
                }
                C17149b bVar2 = new C17149b(bVar, queryParameter, queryParameter2, queryParameter3, queryParameter4, l, queryParameter6, str, Collections.unmodifiableMap(C18572e.m31324a(linkedHashMap, C17149b.f37563j)));
                String str2 = this.f37535c.f40884j;
                if ((str2 != null || bVar2.f37565b == null) && (str2 == null || str2.equals(bVar2.f37565b))) {
                    Intent intent = new Intent();
                    intent.putExtra("AuthorizationResponse", bVar2.mo62551b().toString());
                    return intent;
                }
                C18755a.m31631b().mo70245c(5, (Exception) null, "State returned in authorization response (%s) does not match state from request (%s) - discarding response", bVar2.f37565b, this.f37535c.f40884j);
                authorizationException = AuthorizationException.C17145a.f37525b;
            } else {
                throw new NullPointerException("authorization request cannot be null");
            }
        }
        return authorizationException.toIntent();
    }

    /* renamed from: b */
    private void m28600b() {
        Uri data = getIntent().getData();
        Intent a = m28597a(data);
        if (a == null) {
            C18755a.m31631b().mo70245c(6, (Exception) null, "Failed to extract OAuth2 response from redirect", new Object[0]);
            return;
        }
        a.setData(data);
        if (this.f37536d != null) {
            C18755a.m31630a("Authorization complete - invoking completion intent", new Object[0]);
            try {
                this.f37536d.send(this, 0, a);
            } catch (PendingIntent.CanceledException e) {
                C18755a.m31631b().mo70245c(6, (Exception) null, "Failed to send completion intent", e);
            }
        } else {
            setResult(-1, a);
        }
    }

    public static Intent createCancellationIntent(Context context) {
        Intent a = m28596a(context);
        a.putExtra("authCancelled", true);
        a.addFlags(603979776);
        return a;
    }

    public static Intent createResponseHandlingIntent(Context context, Uri uri) {
        Intent a = m28596a(context);
        a.setData(uri);
        a.addFlags(603979776);
        return a;
    }

    public static Intent createStartForResultIntent(Context context, C18569b bVar, Intent intent) {
        return createStartIntent(context, bVar, intent, (PendingIntent) null, (PendingIntent) null);
    }

    public static Intent createStartIntent(Context context, C18569b bVar, Intent intent, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Intent a = m28596a(context);
        a.putExtra("authIntent", intent);
        a.putExtra("authRequest", bVar.mo70073b().toString());
        a.putExtra("completeIntent", pendingIntent);
        a.putExtra("cancelIntent", pendingIntent2);
        a.setFlags(268435456);
        return a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        m28599a(bundle);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        super.onResume();
        if (getIntent().getExtras() != null && getIntent().getExtras().containsKey("authCancelled") && getIntent().getExtras().getBoolean("authCancelled")) {
            Intent intent = new Intent();
            intent.putExtra("authCancelled", true);
            intent.setAction("com.paypal.authcore.authentication");
            C8115a.m16322a(this).mo20709c(intent);
            finish();
        } else if (!this.f37533a) {
            startActivity(this.f37534b);
            this.f37533a = true;
        } else {
            if (getIntent().getData() != null) {
                m28600b();
            } else {
                m28598a();
            }
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f37533a);
        bundle.putParcelable("authIntent", this.f37534b);
        bundle.putString("authRequest", this.f37535c.mo70073b().toString());
        bundle.putParcelable("completeIntent", this.f37536d);
        bundle.putParcelable("cancelIntent", this.f37537e);
    }

    /* renamed from: a */
    private void m28598a() {
        C18755a.m31630a("Authorization flow canceled by user", new Object[0]);
        Intent intent = AuthorizationException.fromTemplate(AuthorizationException.C17146b.f37527a, (Throwable) null).toIntent();
        PendingIntent pendingIntent = this.f37537e;
        if (pendingIntent != null) {
            try {
                pendingIntent.send(this, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                C18755a.m31631b().mo70245c(6, (Exception) null, "Failed to send cancel intent", e);
            }
        } else {
            setResult(0, intent);
            C18755a.m31630a("No cancel intent set - will return to previous activity", new Object[0]);
        }
    }

    /* renamed from: a */
    private void m28599a(Bundle bundle) {
        C18569b bVar = null;
        if (bundle == null) {
            C18755a.m31631b().mo70245c(5, (Exception) null, "No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f37534b = (Intent) bundle.getParcelable("authIntent");
        this.f37533a = bundle.getBoolean("authStarted", false);
        try {
            String string = bundle.getString("authRequest", (String) null);
            if (string != null) {
                Set<String> set = C18569b.f40874p;
                bVar = C18569b.m31320a(new JSONObject(string));
            }
            this.f37535c = bVar;
            this.f37536d = (PendingIntent) bundle.getParcelable("completeIntent");
            this.f37537e = (PendingIntent) bundle.getParcelable("cancelIntent");
        } catch (JSONException e) {
            throw new IllegalStateException("Unable to deserialize authorization request", e);
        }
    }
}
