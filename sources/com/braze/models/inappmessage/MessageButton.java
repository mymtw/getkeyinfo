package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import com.appboy.Constants;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.C0035b;
import p030bo.app.C3927l3;
import p030bo.app.C4230u0;
import p753kq.C19846a;

public final class MessageButton implements C0035b<JSONObject>, C5486d {

    /* renamed from: l */
    public static final String f11828l = BrazeLogger.m11287i(MessageButton.class);

    /* renamed from: b */
    public JSONObject f11829b;

    /* renamed from: c */
    public C3927l3 f11830c;

    /* renamed from: d */
    public int f11831d;

    /* renamed from: e */
    public ClickAction f11832e;

    /* renamed from: f */
    public Uri f11833f;

    /* renamed from: g */
    public String f11834g;

    /* renamed from: h */
    public boolean f11835h;

    /* renamed from: i */
    public int f11836i;

    /* renamed from: j */
    public int f11837j;

    /* renamed from: k */
    public int f11838k;

    /* renamed from: com.braze.models.inappmessage.MessageButton$b */
    public static final class C5480b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5480b f11839b = new C5480b();

        public C5480b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    /* renamed from: com.braze.models.inappmessage.MessageButton$c */
    final class C5481c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5481c f11840b = new C5481c();

        public C5481c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "A non-null URI is required in order to set the button ClickAction to URI.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.MessageButton$d */
    final class C5482d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5482d f11841b = new C5482d();

        public C5482d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "ClickAction of URI is required in order to set a non-null URI";
        }
    }

    public MessageButton() {
        this.f11831d = -1;
        this.f11832e = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.f11836i = parseColor;
        this.f11837j = -1;
        this.f11838k = parseColor;
    }

    /* renamed from: e */
    public final void mo15972e() {
        C3927l3 l3Var = this.f11830c;
        if (l3Var == null) {
            BrazeLogger.m11283e(f11828l, (BrazeLogger.Priority) null, (Throwable) null, C5480b.f11839b, 14);
            return;
        }
        if (l3Var.mo13661a() != null) {
            this.f11836i = l3Var.mo13661a().intValue();
        }
        if (l3Var.mo13663c() != null) {
            this.f11837j = l3Var.mo13663c().intValue();
        }
        if (l3Var.mo13662b() != null) {
            this.f11838k = l3Var.mo13662b().intValue();
        }
    }

    /* renamed from: v */
    public final JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f11831d);
            jSONObject.put("click_action", this.f11832e.toString());
            Uri uri = this.f11833f;
            if (uri != null) {
                jSONObject.put(Constants.APPBOY_PUSH_DEEP_LINK_KEY, String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.f11834g);
            jSONObject.put("bg_color", this.f11836i);
            jSONObject.put(ResponseConstants.TEXT_COLOR, this.f11837j);
            jSONObject.put("use_webview", this.f11835h);
            jSONObject.put("border_color", this.f11838k);
            return jSONObject;
        } catch (JSONException unused) {
            return this.f11829b;
        }
    }

    public MessageButton(JSONObject jSONObject, JSONObject jSONObject2) {
        C3927l3 l3Var;
        C19383o.m32797g(jSONObject, "jsonObject");
        int optInt = jSONObject.optInt("id", -1);
        ClickAction clickAction = ClickAction.NEWS_FEED;
        boolean z = false;
        try {
            C4230u0 u0Var = C4230u0.f9378a;
            String string = jSONObject.getString("click_action");
            C19383o.m32796f(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
            String upperCase = string.toUpperCase(locale);
            C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            ClickAction[] values = ClickAction.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                ClickAction clickAction2 = values[i];
                i++;
                if (C19383o.m32792b(clickAction2.name(), upperCase)) {
                    clickAction = clickAction2;
                    String optString = jSONObject.optString(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                    String optString2 = jSONObject.optString("text");
                    C19383o.m32796f(optString2, "jsonObject.optString(TEXT)");
                    int optInt2 = jSONObject.optInt("bg_color");
                    int optInt3 = jSONObject.optInt(ResponseConstants.TEXT_COLOR);
                    boolean optBoolean = jSONObject.optBoolean("use_webview", false);
                    int optInt4 = jSONObject.optInt("border_color");
                    this.f11831d = -1;
                    this.f11832e = ClickAction.NONE;
                    int parseColor = Color.parseColor("#1B78CF");
                    this.f11836i = parseColor;
                    this.f11837j = -1;
                    this.f11838k = parseColor;
                    this.f11829b = jSONObject;
                    this.f11831d = optInt;
                    this.f11832e = clickAction;
                    if (clickAction == ClickAction.URI) {
                        if (!((optString == null || C19457k.m33020X0(optString)) ? true : z)) {
                            this.f11833f = Uri.parse(optString);
                        }
                    }
                    this.f11834g = optString2;
                    this.f11836i = optInt2;
                    this.f11837j = optInt3;
                    this.f11835h = optBoolean;
                    this.f11838k = optInt4;
                    if (jSONObject2 == null) {
                        l3Var = null;
                    } else {
                        l3Var = new C3927l3(jSONObject2);
                    }
                    this.f11830c = l3Var;
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }
}
