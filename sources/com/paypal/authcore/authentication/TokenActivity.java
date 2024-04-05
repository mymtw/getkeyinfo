package com.paypal.authcore.authentication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17149b;
import com.paypal.openid.C17150c;
import com.paypal.openid.C17154e;
import com.paypal.openid.ClientAuthentication;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p568fn.C17782b;
import p684to.C18569b;
import p684to.C18570c;
import p684to.C18572e;

public class TokenActivity extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        C17149b bVar;
        String str;
        super.onCreate(bundle);
        C17142k kVar = new C17142k();
        Intent intent = getIntent();
        C17141j jVar = new C17141j(kVar, this);
        kVar.f37513a = C17131a.m28574b(this);
        Set<String> set = C17149b.f37563j;
        C17782b.m29840F(intent, "dataIntent must not be null");
        if (!intent.hasExtra("AuthorizationResponse")) {
            bVar = null;
        } else {
            try {
                bVar = C17149b.m28607a(new JSONObject(intent.getStringExtra("AuthorizationResponse")));
            } catch (JSONException e) {
                throw new IllegalArgumentException("Intent contains malformed auth response", e);
            }
        }
        AuthorizationException fromIntent = AuthorizationException.fromIntent(intent);
        if (!(bVar == null && fromIntent == null)) {
            kVar.f37513a.mo61651d(bVar, fromIntent);
        }
        if (bVar == null || bVar.f37567d == null) {
            if (fromIntent != null) {
                StringBuilder h = C0072d.m201h("Authorization flow failed: ");
                h.append(fromIntent.getMessage());
                str = h.toString();
            } else {
                str = "No authorization state retained - reauthorization required";
            }
            Log.d("TokenService", str);
            C17142k.m28584a(this, false);
        } else {
            kVar.f37513a.mo61651d(bVar, fromIntent);
            HashMap hashMap = new HashMap();
            hashMap.put(ConstantsKt.PAYPAL_ENTRY_POINT, ConstantsKt.PAYPAL_ENTRY_POINT_VALUE);
            if (bVar.f37567d != null) {
                C18569b bVar2 = bVar.f37564a;
                C17154e.C17155a aVar = new C17154e.C17155a(bVar2.f40875a, bVar2.f40877c);
                C17782b.m29834C("authorization_code", "grantType cannot be null or empty");
                aVar.f37601c = "authorization_code";
                Uri uri = bVar.f37564a.f40882h;
                if (uri != null) {
                    C17782b.m29840F(uri.getScheme(), "redirectUri must have a scheme");
                }
                aVar.f37602d = uri;
                String str2 = bVar.f37564a.f40883i;
                if (TextUtils.isEmpty(str2)) {
                    aVar.f37603e = null;
                } else {
                    String[] split = str2.split(" +");
                    if (split == null) {
                        split = new String[0];
                    }
                    aVar.f37603e = C0761x.m1741r0(Arrays.asList(split));
                }
                String str3 = bVar.f37564a.f40885k;
                if (str3 != null) {
                    C18570c.m31323a(str3);
                }
                aVar.f37606h = str3;
                C18569b bVar3 = bVar.f37564a;
                String str4 = bVar3.f40886l;
                if (str4 != null) {
                    aVar.f37607i = str4;
                }
                String str5 = bVar3.f40887m;
                if (str5 != null) {
                    aVar.f37608j = str5;
                }
                String str6 = bVar3.f40876b;
                if (str6 != null) {
                    aVar.f37610l = str6;
                }
                String str7 = bVar.f37567d;
                C17782b.m29842H("authorization code must not be empty", str7);
                aVar.f37604f = str7;
                aVar.f37609k = C18572e.m31324a(hashMap, C17154e.f37586m);
                C17154e a = aVar.mo62557a();
                C17131a aVar2 = kVar.f37513a;
                C17150c cVar = aVar2.f37474c;
                try {
                    aVar2.mo61649a().mo62549a();
                    Log.d("Authenticator", a.f37591e + " is the authcode that is being sent ");
                    cVar.mo62552a(a, jVar);
                } catch (ClientAuthentication.UnsupportedAuthenticationMethod e2) {
                    Log.d("TokenService", "Token request cannot be made, client authentication for the token endpoint could not be constructed (%s)", e2);
                }
            } else {
                throw new IllegalStateException("authorizationCode not available for exchange request");
            }
        }
        finish();
    }
}
