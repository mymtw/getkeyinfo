package com.paypal.authcore.authentication;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.AuthorizationManagementActivity;
import com.paypal.openid.C17150c;
import com.paypal.openid.C17153d;
import com.paypal.openid.C17154e;
import com.paypal.openid.C17156f;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001a0.C0005b;
import p156k.C7159a;
import p156k.C7167d;
import p156k.C7168e;
import p156k.C7171g;
import p251u1.C8115a;
import p568fn.C17782b;
import p651po.C18420a;
import p659qo.C18468a;
import p659qo.C18470c;
import p668ro.C18504c;
import p684to.C18569b;
import p684to.C18570c;
import p684to.C18572e;
import p692uo.C18635d;
import p708wo.C18755a;
import p708wo.C18756b;

/* renamed from: com.paypal.authcore.authentication.f */
public final class C17136f {

    /* renamed from: a */
    public C17150c f37480a;

    /* renamed from: b */
    public final AtomicReference<C18569b> f37481b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<C7168e> f37482c = new AtomicReference<>();

    /* renamed from: d */
    public C17140i f37483d;

    /* renamed from: e */
    public C18420a f37484e;

    /* renamed from: f */
    public C17133c f37485f;

    /* renamed from: g */
    public C17131a f37486g;

    /* renamed from: h */
    public Context f37487h;

    /* renamed from: i */
    public String f37488i = "asymmetricKeyAlias";

    /* renamed from: j */
    public String f37489j = "response_type";

    /* renamed from: k */
    public String f37490k = UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN;

    /* renamed from: l */
    public String f37491l = "code_challenge_method";

    /* renamed from: m */
    public String f37492m = "code_challenge";

    /* renamed from: n */
    public String f37493n = "visitor_id";

    /* renamed from: o */
    public String f37494o = "risk_data";

    /* renamed from: p */
    public String f37495p = "";

    /* renamed from: q */
    public C17156f f37496q = null;

    /* renamed from: r */
    public String f37497r = ConstantsKt.CHALLENGE_METHOD_ES256;

    /* renamed from: s */
    public String f37498s;

    /* renamed from: t */
    public String f37499t = null;

    /* renamed from: u */
    public String f37500u = null;

    /* renamed from: v */
    public String f37501v = null;

    /* renamed from: w */
    public String f37502w = "RefreshTokenExchangeFailure";

    /* renamed from: x */
    public String f37503x = "RefreshTokenExchangeSuccess";

    /* renamed from: y */
    public String f37504y = ConstantsKt.PAYPAL_ENTRY_POINT;

    /* renamed from: z */
    public String f37505z = ConstantsKt.PAYPAL_ENTRY_POINT_VALUE;

    public C17136f(Context context, C18420a aVar, C17140i iVar) {
        this.f37487h = context;
        this.f37484e = aVar;
        this.f37480a = new C17150c(context);
        this.f37483d = iVar;
        C8115a.m16322a(this.f37487h).mo20708b(new C17134d(this), new IntentFilter("com.paypal.authcore.authentication"));
    }

    /* renamed from: a */
    public final void mo61661a(C17153d dVar, Intent intent, Intent intent2) {
        C7171g gVar;
        String str = null;
        try {
            C18470c cVar = new C18470c();
            String str2 = this.f37488i;
            this.f37487h.getApplicationContext();
            this.f37500u = C18468a.m31168b(cVar.mo69984c(str2).getEncoded());
            if (!mo61662b()) {
                Log.d("Authenticator", "Exception in generating Nonce and signature");
                this.f37485f.completeWithFailure((AuthorizationException) null);
            }
        } catch (RuntimeException e) {
            Log.d("Authenticator", "Exception in generating Nonce and signature " + e);
            this.f37485f.completeWithFailure(AuthorizationException.fromTemplate(AuthorizationException.C17146b.f37530d, e.getCause()));
        }
        C18420a aVar = this.f37484e;
        String str3 = aVar.f40511a;
        Uri parse = Uri.parse(aVar.f40512b);
        String str4 = this.f37498s;
        HashMap hashMap = new HashMap();
        if (dVar != null) {
            C17782b.m29834C(str3, "client ID cannot be null or empty");
            C17782b.m29834C(ResponseConstants.CODE, "expected response type cannot be null or empty");
            if (parse != null) {
                Set<String> set = C18569b.f40874p;
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                String encodeToString = Base64.encodeToString(bArr, 11);
                if (encodeToString != null) {
                    C17782b.m29834C(encodeToString, "state cannot be empty if defined");
                }
                String str5 = this.f37484e.f40515e;
                boolean z = false;
                if (!TextUtils.isEmpty(str5)) {
                    String[] split = str5.split(" +");
                    if (split == null) {
                        split = new String[0];
                    }
                    str = C0761x.m1741r0(Arrays.asList(split));
                }
                String str6 = str;
                String str7 = this.f37500u;
                String str8 = this.f37499t;
                String str9 = this.f37501v;
                if (str7 != null) {
                    C18570c.m31323a(str7);
                    C17782b.m29834C(str8, "code verifier challenge cannot be null or empty if verifier is set");
                    C17782b.m29834C(str9, "code verifier challenge method cannot be null or empty if verifier is set");
                } else {
                    if (str8 == null) {
                        z = true;
                    }
                    C17782b.m29832B(z, "code verifier challenge must be null if verifier is null");
                    C17782b.m29832B(str9 == null, "code verifier challenge method must be null if verifier is null");
                }
                AtomicReference<C18569b> atomicReference = this.f37481b;
                C18569b bVar = r5;
                C18569b bVar2 = new C18569b(dVar, str3, ResponseConstants.CODE, parse, str4, (String) null, (String) null, (String) null, str6, encodeToString, str7, str8, str9, (String) null, C0072d.m202i(hashMap));
                atomicReference.set(bVar);
                Uri.Builder buildUpon = this.f37481b.get().mo70074c().buildUpon();
                Map<String, String> map = this.f37484e.f40516f;
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        if (next != null) {
                            C18756b.m31633a(buildUpon, (String) next.getKey(), next.getValue());
                        }
                    }
                }
                C17150c cVar2 = this.f37480a;
                Uri[] uriArr = {buildUpon.build()};
                C18635d dVar2 = cVar2.f37575c;
                dVar2.getClass();
                try {
                    dVar2.f41152c.await(1, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                    C18755a.m31631b().mo70245c(4, (Exception) null, "Interrupted while waiting for browser connection", new Object[0]);
                    dVar2.f41152c.countDown();
                }
                C7167d dVar3 = dVar2.f41151b.get();
                if (dVar3 == null) {
                    gVar = null;
                } else {
                    gVar = dVar3.mo19457b();
                    gVar.mo19460a(uriArr[0], Collections.emptyList());
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                C7159a aVar2 = new C7159a();
                if (gVar != null) {
                    intent3.setPackage(gVar.f15945c.getPackageName());
                    IBinder asBinder = gVar.f15944b.asBinder();
                    PendingIntent pendingIntent = gVar.f15946d;
                    Bundle bundle = new Bundle();
                    bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
                    if (pendingIntent != null) {
                        bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                    }
                    intent3.putExtras(bundle);
                }
                AtomicReference<C7168e> atomicReference2 = this.f37482c;
                if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
                    intent3.putExtras(bundle2);
                }
                intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                Integer num = aVar2.f15925a;
                Bundle bundle3 = new Bundle();
                if (num != null) {
                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
                }
                intent3.putExtras(bundle3);
                intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                atomicReference2.set(new C7168e(intent3));
                int i = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
                C17150c cVar3 = this.f37480a;
                C18569b bVar3 = this.f37481b.get();
                PendingIntent activity = PendingIntent.getActivity(this.f37487h, 0, intent, i);
                PendingIntent activity2 = PendingIntent.getActivity(this.f37487h, 0, intent2, i);
                C7168e eVar = this.f37482c.get();
                cVar3.getClass();
                Log.d("Authenticator", "In performAuthorizationRequest of Authorization Service");
                bVar3.getClass();
                activity.getClass();
                eVar.getClass();
                if (cVar3.f37576d != null) {
                    Uri c = bVar3.mo70074c();
                    Intent intent4 = cVar3.f37576d.f41147d.booleanValue() ? eVar.f15936a : new Intent("android.intent.action.VIEW");
                    intent4.setPackage(cVar3.f37576d.f41144a);
                    intent4.setData(c);
                    C18755a.m31630a("Using %s as browser for auth, custom tab = %s", intent4.getPackage(), cVar3.f37576d.f41147d.toString());
                    intent4.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
                    C18755a.m31630a("Initiating authorization request to %s", bVar3.f40875a.f37582a);
                    Context context = cVar3.f37573a;
                    context.startActivity(AuthorizationManagementActivity.createStartIntent(context, bVar3, intent4, activity, activity2));
                    return;
                }
                throw new ActivityNotFoundException();
            }
            throw new NullPointerException("redirect URI cannot be null or empty");
        }
        throw new NullPointerException("configuration cannot be null");
    }

    /* renamed from: b */
    public final boolean mo61662b() {
        Signature signature;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        String encodeToString = Base64.encodeToString(String.valueOf(new Random(16).nextInt()).getBytes(), 9);
        String replace = (format + encodeToString).replace("\n", "");
        if (replace == null) {
            return false;
        }
        String str = this.f37488i;
        try {
            signature = C18468a.m31167a(str, (String) null);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InvalidKeyException) {
                signature = C18468a.m31167a(str, "AndroidKeyStoreBCWorkaround");
            } else {
                throw e;
            }
        }
        try {
            signature.update(replace.getBytes());
            String b = C18468a.m31168b(signature.sign());
            C0070b.m187j("encoded Signature String: ", b, "BaseSecureKeyWrapper");
            this.f37498s = replace;
            this.f37499t = b;
            return true;
        } catch (SignatureException e2) {
            e2.printStackTrace();
            Log.d("BaseSecureKeyWrapper", "signDataUsingSignatureObject : Exception in signDataUsingSignatureObject", e2);
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public final void mo61663c(C17133c cVar, Context context) {
        C17140i iVar;
        String str;
        Class<TokenActivity> cls = TokenActivity.class;
        this.f37485f = cVar;
        C0005b.f11i = context.getApplicationContext();
        C17153d dVar = new C17153d(Uri.parse(this.f37484e.f40514d), Uri.parse(this.f37484e.f40513c), (Uri) null);
        this.f37501v = this.f37497r;
        Intent intent = new Intent(this.f37487h, cls);
        Intent intent2 = new Intent(this.f37487h, cls);
        String str2 = this.f37484e.f40513c;
        C18504c cVar2 = C18504c.f40748e;
        if (!str2.equals(cVar2.mo70009b("authUrl")) || cVar2.mo70009b("refreshToken") == null) {
            cVar2.mo70011d();
            cVar2.mo70010c("authUrl", str2);
            mo61661a(dVar, intent, intent2);
            return;
        }
        try {
            if (!mo61662b()) {
                Log.d("Authenticator", "Exception in generating Nonce and signature");
                this.f37485f.completeWithFailure((AuthorizationException) null);
            }
        } catch (RuntimeException e) {
            Log.d("Authenticator", "Exception in generating Nonce and signature ");
            this.f37485f.completeWithFailure(AuthorizationException.fromTemplate(AuthorizationException.C17146b.f37530d, e.getCause()));
        }
        if (this.f37485f.getTrackingID() == null || this.f37485f.getTrackingID().length() <= 0) {
            iVar = this.f37483d;
            str = "noEcToken";
        } else {
            iVar = this.f37483d;
            str = this.f37485f.getTrackingID();
        }
        iVar.generatePairingIdAndNotifyDyson(str);
        String riskPayload = this.f37483d.getRiskPayload();
        HashMap hashMap = new HashMap();
        hashMap.put(this.f37494o, riskPayload);
        hashMap.put(this.f37489j, this.f37490k);
        if (C18504c.f40748e.mo70009b("riskVisitorId") != null) {
            hashMap.put(this.f37493n, this.f37490k);
        }
        hashMap.put(this.f37491l, this.f37501v);
        hashMap.put(this.f37492m, this.f37499t);
        hashMap.put(this.f37504y, this.f37505z);
        try {
            hashMap.put("user-agent", WebSettings.getDefaultUserAgent(this.f37487h).concat(" PayPal3PSDK/PayPal"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        C17154e.C17155a aVar = new C17154e.C17155a(dVar, this.f37484e.f40511a);
        Uri parse = Uri.parse(this.f37484e.f40512b);
        if (parse != null) {
            C17782b.m29840F(parse.getScheme(), "redirectUri must have a scheme");
        }
        aVar.f37602d = parse;
        C17782b.m29834C("refresh_token", "grantType cannot be null or empty");
        aVar.f37601c = "refresh_token";
        String b = C18504c.f40748e.mo70009b("refreshToken");
        if (b != null) {
            C17782b.m29834C(b, "refresh token cannot be empty if defined");
        }
        aVar.f37605g = b;
        aVar.f37609k = C18572e.m31324a(hashMap, C17154e.f37586m);
        aVar.f37606h = null;
        String str3 = this.f37498s;
        if (str3 != null) {
            aVar.f37610l = str3;
        }
        C17154e a = aVar.mo62557a();
        Log.d("Token Request: ", a.toString());
        this.f37480a.mo62552a(a, new C17135e(this, dVar));
    }
}
