package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C19294b0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C3549a3;
import p030bo.app.C3582b3;
import p030bo.app.C3621d3;
import p030bo.app.C3787j;
import p030bo.app.C4173s2;
import p030bo.app.C4208t1;
import p030bo.app.C4230u0;
import p030bo.app.C4274x1;
import p753kq.C19846a;

public abstract class InAppMessageBase implements C5483a, C5486d {

    /* renamed from: b */
    public ClickAction f11751b;

    /* renamed from: c */
    public Uri f11752c;

    /* renamed from: d */
    public String f11753d;

    /* renamed from: e */
    public String f11754e;

    /* renamed from: f */
    public boolean f11755f;

    /* renamed from: g */
    public Map<String, String> f11756g;

    /* renamed from: h */
    public boolean f11757h;

    /* renamed from: i */
    public boolean f11758i;

    /* renamed from: j */
    public DismissType f11759j;

    /* renamed from: k */
    public int f11760k;

    /* renamed from: l */
    public Orientation f11761l;

    /* renamed from: m */
    public CropType f11762m;

    /* renamed from: n */
    public TextAlign f11763n;

    /* renamed from: o */
    public long f11764o;

    /* renamed from: p */
    public int f11765p;

    /* renamed from: q */
    public int f11766q;

    /* renamed from: r */
    public int f11767r;

    /* renamed from: s */
    public int f11768s;

    /* renamed from: t */
    public final AtomicBoolean f11769t;

    /* renamed from: u */
    public final AtomicBoolean f11770u;

    /* renamed from: v */
    public final AtomicBoolean f11771v;

    /* renamed from: w */
    public JSONObject f11772w;

    /* renamed from: x */
    public C4274x1 f11773x;

    /* renamed from: y */
    public C3621d3 f11774y;

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$b */
    final class C5443b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11775b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5443b(int i) {
            super(0);
            this.f11775b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0071c.m191c(C0072d.m201h("Requested in-app message duration "), this.f11775b, " is lower than the minimum of 999. Defaulting to 5000 milliseconds.");
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$c */
    final class C5444c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11776b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5444c(int i) {
            super(0);
            this.f11776b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0071c.m191c(C0072d.m201h("Set in-app message duration to "), this.f11776b, " milliseconds.");
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$d */
    public static final class C5445d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5445d f11777b = new C5445d();

        public C5445d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$e */
    public static final class C5446e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5446e f11778b = new C5446e();

        public C5446e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to construct json for in-app message";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$f */
    public static final class C5447f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5447f f11779b = new C5447f();

        public C5447f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$g */
    public static final class C5448g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5448g f11780b = new C5448g();

        public C5448g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message click because the BrazeManager is null.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$h */
    public static final class C5449h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5449h f11781b = new C5449h();

        public C5449h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$i */
    public static final class C5450i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5450i f11782b = new C5450i();

        public C5450i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$j */
    public static final class C5451j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5451j f11783b = new C5451j();

        public C5451j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Logging click on in-app message";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$k */
    public static final class C5452k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5452k f11784b = new C5452k();

        public C5452k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message display failure.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$l */
    public static final class C5453l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5453l f11785b = new C5453l();

        public C5453l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message display failure because the BrazeManager is null.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$m */
    public static final class C5454m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5454m f11786b = new C5454m();

        public C5454m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$n */
    public static final class C5455n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5455n f11787b = new C5455n();

        public C5455n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$o */
    public static final class C5456o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5456o f11788b = new C5456o();

        public C5456o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$p */
    public static final class C5457p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5457p f11789b = new C5457p();

        public C5457p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$q */
    public static final class C5458q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5458q f11790b = new C5458q();

        public C5458q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message impression because the BrazeManager is null.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$r */
    public static final class C5459r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5459r f11791b = new C5459r();

        public C5459r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$s */
    public static final class C5460s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5460s f11792b = new C5460s();

        public C5460s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$t */
    final class C5461t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5461t f11793b = new C5461t();

        public C5461t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "A non-null URI is required in order to set the message ClickAction to URI.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageBase$u */
    final class C5462u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5462u f11794b = new C5462u();

        public C5462u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "A non-null URI is required in order to set the message ClickAction to URI.";
        }
    }

    public InAppMessageBase(JSONObject jSONObject, C4274x1 x1Var) {
        JSONObject jSONObject2 = jSONObject;
        C4274x1 x1Var2 = x1Var;
        C19383o.m32797g(jSONObject2, "json");
        C19383o.m32797g(x1Var2, "brazeManager");
        this.f11751b = ClickAction.NONE;
        this.f11756g = C19294b0.m32559p0();
        this.f11757h = true;
        this.f11758i = true;
        this.f11759j = DismissType.AUTO_DISMISS;
        this.f11760k = 5000;
        Orientation orientation = Orientation.ANY;
        this.f11761l = orientation;
        this.f11762m = CropType.FIT_CENTER;
        this.f11763n = TextAlign.CENTER;
        this.f11764o = -1;
        this.f11765p = Color.parseColor("#ff0073d5");
        this.f11766q = Color.parseColor("#555555");
        this.f11767r = -1;
        this.f11768s = -1;
        int i = 0;
        this.f11769t = new AtomicBoolean(false);
        this.f11770u = new AtomicBoolean(false);
        this.f11771v = new AtomicBoolean(false);
        this.f11772w = jSONObject2;
        this.f11773x = x1Var2;
        this.f11753d = jSONObject2.optString("message");
        this.f11757h = jSONObject2.optBoolean("animate_in", true);
        this.f11758i = jSONObject2.optBoolean("animate_out", true);
        int optInt = jSONObject2.optInt("duration");
        if (optInt < 999) {
            this.f11760k = 5000;
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5443b(optInt), 7);
        } else {
            this.f11760k = optInt;
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5444c(optInt), 7);
        }
        this.f11754e = jSONObject2.optString(ResponseConstants.ICON);
        try {
            C4230u0 u0Var = C4230u0.f9378a;
            String string = jSONObject2.getString("orientation");
            C19383o.m32796f(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
            String upperCase = string.toUpperCase(locale);
            C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            Orientation[] values = Orientation.values();
            int length = values.length;
            int i2 = 0;
            while (i2 < length) {
                Orientation orientation2 = values[i2];
                i2++;
                if (C19383o.m32792b(orientation2.name(), upperCase)) {
                    orientation = orientation2;
                    C19383o.m32797g(orientation, "<set-?>");
                    this.f11761l = orientation;
                    this.f11755f = jSONObject2.optBoolean("use_webview", false);
                    this.f11765p = jSONObject2.optInt("icon_bg_color");
                    this.f11766q = jSONObject2.optInt(ResponseConstants.TEXT_COLOR);
                    this.f11767r = jSONObject2.optInt("bg_color");
                    this.f11768s = jSONObject2.optInt("icon_color");
                    this.f11769t.set(false);
                    this.f11770u.set(false);
                    this.f11756g = JsonUtils.m11311b(jSONObject2.optJSONObject("extras"));
                    String optString = jSONObject2.optString(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                    ClickAction clickAction = ClickAction.NONE;
                    try {
                        C4230u0 u0Var2 = C4230u0.f9378a;
                        String string2 = jSONObject2.getString("click_action");
                        C19383o.m32796f(string2, "jsonObject.getString(key)");
                        Locale locale2 = Locale.US;
                        C19383o.m32796f(locale2, UserStateKt.US_COUNTRY);
                        String upperCase2 = string2.toUpperCase(locale2);
                        C19383o.m32796f(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                        ClickAction[] values2 = ClickAction.values();
                        int length2 = values2.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            ClickAction clickAction2 = values2[i3];
                            i3++;
                            if (C19383o.m32792b(clickAction2.name(), upperCase2)) {
                                clickAction = clickAction2;
                                if (clickAction == ClickAction.URI) {
                                    if (!(optString == null || C19457k.m33020X0(optString))) {
                                        this.f11752c = Uri.parse(optString);
                                    }
                                }
                                this.f11751b = clickAction;
                                DismissType dismissType = DismissType.AUTO_DISMISS;
                                try {
                                    C4230u0 u0Var3 = C4230u0.f9378a;
                                    String string3 = jSONObject2.getString("message_close");
                                    C19383o.m32796f(string3, "jsonObject.getString(key)");
                                    Locale locale3 = Locale.US;
                                    C19383o.m32796f(locale3, UserStateKt.US_COUNTRY);
                                    String upperCase3 = string3.toUpperCase(locale3);
                                    C19383o.m32796f(upperCase3, "this as java.lang.String).toUpperCase(locale)");
                                    DismissType[] values3 = DismissType.values();
                                    int length3 = values3.length;
                                    while (i < length3) {
                                        DismissType dismissType2 = values3[i];
                                        i++;
                                        if (C19383o.m32792b(dismissType2.name(), upperCase3)) {
                                            dismissType = dismissType2;
                                            dismissType = dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType;
                                            C19383o.m32797g(dismissType, "<set-?>");
                                            this.f11759j = dismissType;
                                            this.f11774y = C3582b3.m8480a(jSONObject);
                                            return;
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                } catch (Exception unused) {
                                }
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } catch (Exception unused2) {
                    }
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused3) {
        }
    }

    /* renamed from: E */
    public final DismissType mo15952E() {
        return this.f11759j;
    }

    /* renamed from: F */
    public final boolean mo15953F(InAppMessageFailureType inAppMessageFailureType) {
        C19383o.m32797g(inAppMessageFailureType, "failureType");
        String c0 = mo15971c0();
        if (c0 == null || C19457k.m33020X0(c0)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5452k.f11784b, 7);
            return false;
        }
        C4274x1 x1Var = this.f11773x;
        if (x1Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5453l.f11785b, 6);
            return false;
        } else if (this.f11771v.get()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5454m.f11786b, 6);
            return false;
        } else if (this.f11770u.get()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5455n.f11787b, 6);
            return false;
        } else if (this.f11769t.get()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5456o.f11788b, 6);
            return false;
        } else {
            C4208t1 a = C3787j.f8608h.mo13466a(c0, inAppMessageFailureType);
            if (a != null) {
                x1Var.mo13838a(a);
            }
            this.f11771v.set(true);
            return true;
        }
    }

    /* renamed from: G */
    public void mo15954G(Map<String, String> map) {
        C19383o.m32797g(map, "remotePathToLocalAssetMap");
    }

    /* renamed from: I */
    public final Orientation mo15955I() {
        return this.f11761l;
    }

    /* renamed from: K */
    public final boolean mo15956K() {
        return this.f11757h;
    }

    /* renamed from: L */
    public final int mo15957L() {
        return this.f11760k;
    }

    /* renamed from: M */
    public List<String> mo15958M() {
        return EmptyList.INSTANCE;
    }

    /* renamed from: N */
    public final void mo15959N() {
        this.f11757h = false;
    }

    /* renamed from: O */
    public final int mo15960O() {
        return this.f11766q;
    }

    /* renamed from: P */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("message", this.f11753d);
                jSONObject.put("duration", this.f11760k);
                jSONObject.putOpt("trigger_id", mo15971c0());
                jSONObject.putOpt("click_action", this.f11751b.toString());
                jSONObject.putOpt("message_close", this.f11759j.toString());
                Uri uri = this.f11752c;
                if (uri != null) {
                    jSONObject.put(Constants.APPBOY_PUSH_DEEP_LINK_KEY, String.valueOf(uri));
                }
                jSONObject.put("use_webview", this.f11755f);
                jSONObject.put("animate_in", this.f11757h);
                jSONObject.put("animate_out", this.f11758i);
                jSONObject.put("bg_color", this.f11767r);
                jSONObject.put(ResponseConstants.TEXT_COLOR, this.f11766q);
                jSONObject.put("icon_color", this.f11768s);
                jSONObject.put("icon_bg_color", this.f11765p);
                jSONObject.putOpt(ResponseConstants.ICON, this.f11754e);
                jSONObject.putOpt("crop_type", this.f11762m.toString());
                jSONObject.putOpt("orientation", this.f11761l.toString());
                jSONObject.putOpt("text_align_message", this.f11763n.toString());
                jSONObject.putOpt("is_control", Boolean.valueOf(isControl()));
                if (!this.f11756g.isEmpty()) {
                    jSONObject.put("extras", this.f11756g);
                }
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5446e.f11778b, 4);
            }
        }
        return jSONObject;
    }

    /* renamed from: Q */
    public final int mo15962Q() {
        return this.f11768s;
    }

    /* renamed from: S */
    public final void mo15963S(boolean z) {
        this.f11758i = z;
    }

    /* renamed from: T */
    public final void mo15964T(long j) {
        this.f11764o = j;
    }

    /* renamed from: U */
    public final boolean mo15965U() {
        return this.f11758i;
    }

    /* renamed from: W */
    public final long mo15966W() {
        return this.f11764o;
    }

    /* renamed from: Y */
    public final int mo15967Y() {
        return this.f11765p;
    }

    /* renamed from: Z */
    public void mo15968Z() {
        C4274x1 x1Var;
        String c0 = mo15971c0();
        if (this.f11770u.get()) {
            if (!(c0 == null || c0.length() == 0) && (x1Var = this.f11773x) != null) {
                x1Var.mo13829a((C4173s2) new C3549a3(c0));
            }
        }
    }

    /* renamed from: a0 */
    public final CropType mo15969a0() {
        return this.f11762m;
    }

    /* renamed from: b0 */
    public final ClickAction mo15970b0() {
        return this.f11751b;
    }

    /* renamed from: c0 */
    public final String mo15971c0() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("trigger_id");
    }

    /* renamed from: e */
    public void mo15972e() {
        C3621d3 d3Var = this.f11774y;
        if (d3Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5445d.f11777b, 7);
            return;
        }
        if (d3Var.mo13197a() != null) {
            this.f11767r = d3Var.mo13197a().intValue();
        }
        if (d3Var.mo13203f() != null) {
            this.f11768s = d3Var.mo13203f().intValue();
        }
        if (d3Var.mo13201e() != null) {
            this.f11765p = d3Var.mo13201e().intValue();
        }
        if (d3Var.mo13204g() != null) {
            this.f11766q = d3Var.mo13204g().intValue();
        }
    }

    public final int getBackgroundColor() {
        return this.f11767r;
    }

    public final Map<String, String> getExtras() {
        return this.f11756g;
    }

    public final String getIcon() {
        return this.f11754e;
    }

    public final String getMessage() {
        return this.f11753d;
    }

    public final boolean getOpenUriInWebView() {
        return this.f11755f;
    }

    public final Uri getUri() {
        return this.f11752c;
    }

    public final boolean isControl() {
        JSONObject jSONObject = this.f11772w;
        return jSONObject != null && jSONObject.optBoolean("is_control");
    }

    public final boolean logClick() {
        String c0 = mo15971c0();
        if (c0 == null || C19457k.m33020X0(c0)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5447f.f11779b, 7);
            return false;
        }
        C4274x1 x1Var = this.f11773x;
        if (x1Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5448g.f11780b, 6);
            return false;
        } else if (this.f11770u.get() && mo16002R() != MessageType.HTML) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5449h.f11781b, 6);
            return false;
        } else if (this.f11771v.get()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5450i.f11782b, 6);
            return false;
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C5451j.f11783b, 6);
            C4208t1 g = C3787j.f8608h.mo13485g(c0);
            if (g != null) {
                x1Var.mo13838a(g);
            }
            this.f11770u.set(true);
            return true;
        }
    }

    public boolean logImpression() {
        String c0 = mo15971c0();
        if (c0 == null || C19457k.m33020X0(c0)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.D, (Throwable) null, C5457p.f11789b, 6);
            return false;
        }
        C4274x1 x1Var = this.f11773x;
        if (x1Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5458q.f11790b, 6);
            return false;
        } else if (this.f11769t.get()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5459r.f11791b, 6);
            return false;
        } else if (this.f11771v.get()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5460s.f11792b, 6);
            return false;
        } else {
            C4208t1 i = C3787j.f8608h.mo13488i(c0);
            if (i != null) {
                x1Var.mo13838a(i);
            }
            this.f11769t.set(true);
            return true;
        }
    }

    public InAppMessageBase() {
        this.f11751b = ClickAction.NONE;
        this.f11756g = C19294b0.m32559p0();
        this.f11757h = true;
        this.f11758i = true;
        this.f11759j = DismissType.AUTO_DISMISS;
        this.f11760k = 5000;
        this.f11761l = Orientation.ANY;
        this.f11762m = CropType.FIT_CENTER;
        this.f11763n = TextAlign.CENTER;
        this.f11764o = -1;
        this.f11765p = Color.parseColor("#ff0073d5");
        this.f11766q = Color.parseColor("#555555");
        this.f11767r = -1;
        this.f11768s = -1;
        this.f11769t = new AtomicBoolean(false);
        this.f11770u = new AtomicBoolean(false);
        this.f11771v = new AtomicBoolean(false);
    }
}
