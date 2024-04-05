package com.braze.models.inappmessage;

import android.graphics.Color;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.collections.C19327t;
import kotlin.collections.C19331x;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C19457k;
import org.json.JSONArray;
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
import p568fn.C17782b;
import p753kq.C19846a;
import p753kq.C19857l;

public abstract class InAppMessageImmersiveBase extends C5493k implements C5485c {

    /* renamed from: D */
    public int f11809D;

    /* renamed from: E */
    public int f11810E;

    /* renamed from: F */
    public String f11811F;

    /* renamed from: G */
    public List<? extends MessageButton> f11812G;

    /* renamed from: H */
    public ImageStyle f11813H;

    /* renamed from: I */
    public Integer f11814I;

    /* renamed from: J */
    public TextAlign f11815J;

    /* renamed from: K */
    public boolean f11816K;

    /* renamed from: L */
    public String f11817L;

    /* renamed from: com.braze.models.inappmessage.InAppMessageImmersiveBase$b */
    public static final class C5472b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5472b f11818b = new C5472b();

        public C5472b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageImmersiveBase$c */
    public static final class C5473c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5473c f11819b = new C5473c();

        public C5473c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging button click.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageImmersiveBase$d */
    public static final class C5474d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5474d f11820b = new C5474d();

        public C5474d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Button click already logged for this message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageImmersiveBase$e */
    public static final class C5475e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5475e f11821b = new C5475e();

        public C5475e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log a button click because the AppboyManager is null.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageImmersiveBase$f */
    public static final class C5476f extends Lambda implements C19857l<Integer, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f11822b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5476f(JSONArray jSONArray) {
            super(1);
            this.f11822b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo16023a(int i) {
            return Boolean.valueOf(this.f11822b.opt(i) instanceof JSONObject);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo16023a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageImmersiveBase$g */
    public static final class C5477g extends Lambda implements C19857l<Integer, JSONObject> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f11823b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5477g(JSONArray jSONArray) {
            super(1);
            this.f11823b = jSONArray;
        }

        /* renamed from: a */
        public final JSONObject mo16024a(int i) {
            Object obj = this.f11823b.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo16024a(((Number) obj).intValue());
        }
    }

    public InAppMessageImmersiveBase() {
        this.f11809D = Color.parseColor("#333333");
        this.f11810E = Color.parseColor("#9B9B9B");
        this.f11812G = EmptyList.INSTANCE;
        this.f11813H = ImageStyle.TOP;
        this.f11815J = TextAlign.CENTER;
    }

    /* renamed from: D */
    public final ImageStyle mo16015D() {
        return this.f11813H;
    }

    /* renamed from: H */
    public final boolean mo16016H(MessageButton messageButton) {
        C19383o.m32797g(messageButton, "messageButton");
        C4274x1 x1Var = this.f11773x;
        String c0 = mo15971c0();
        if (c0 == null || C19457k.m33020X0(c0)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5473c.f11819b, 7);
            return false;
        } else if (this.f11816K) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5474d.f11820b, 6);
            return false;
        } else if (x1Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5475e.f11821b, 6);
            return false;
        } else {
            this.f11817L = String.valueOf(messageButton.f11831d);
            C4208t1 a = C3787j.f8608h.mo13467a(c0, messageButton);
            if (a != null) {
                x1Var.mo13838a(a);
            }
            this.f11816K = true;
            return true;
        }
    }

    /* renamed from: P */
    public JSONObject mo15961P() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            jSONObject = super.forJsonPut();
            try {
                jSONObject.putOpt(ResponseConstants.HEADER, this.f11811F);
                jSONObject.put("header_text_color", this.f11809D);
                jSONObject.put("close_btn_color", this.f11810E);
                jSONObject.putOpt("image_style", this.f11813H.toString());
                jSONObject.putOpt("text_align_header", this.f11815J.toString());
                Integer num = this.f11814I;
                if (num != null) {
                    jSONObject.put("frame_color", num.intValue());
                }
                JSONArray jSONArray = new JSONArray();
                for (MessageButton v : this.f11812G) {
                    jSONArray.put(v.forJsonPut());
                }
                jSONObject.put("btns", jSONArray);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: X */
    public final List<MessageButton> mo16017X() {
        return this.f11812G;
    }

    /* renamed from: Z */
    public final void mo15968Z() {
        super.mo15968Z();
        C4274x1 x1Var = this.f11773x;
        if (this.f11816K) {
            String c0 = mo15971c0();
            boolean z = false;
            if (!(c0 == null || C19457k.m33020X0(c0))) {
                String str = this.f11817L;
                if (str == null || C19457k.m33020X0(str)) {
                    z = true;
                }
                if (!z && x1Var != null) {
                    x1Var.mo13829a((C4173s2) new C3549a3(mo15971c0(), this.f11817L));
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo15972e() {
        super.mo15972e();
        C3621d3 d3Var = this.f11774y;
        if (d3Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5472b.f11818b, 7);
            return;
        }
        if (d3Var.mo13199c() != null) {
            this.f11814I = d3Var.mo13199c();
        }
        if (d3Var.mo13198b() != null) {
            this.f11810E = d3Var.mo13198b().intValue();
        }
        if (d3Var.mo13200d() != null) {
            this.f11809D = d3Var.mo13200d().intValue();
        }
        for (MessageButton e : this.f11812G) {
            e.mo15972e();
        }
    }

    public final String getHeader() {
        return this.f11811F;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageImmersiveBase(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        int i;
        Iterator it;
        JSONObject jSONObject2 = jSONObject;
        C19383o.m32797g(jSONObject2, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
        String optString = jSONObject2.optString(ResponseConstants.HEADER);
        C19383o.m32796f(optString, "jsonObject.optString(HEADER)");
        int optInt = jSONObject2.optInt("header_text_color");
        int optInt2 = jSONObject2.optInt("close_btn_color");
        ImageStyle imageStyle = ImageStyle.TOP;
        try {
            C4230u0 u0Var = C4230u0.f9378a;
            String string = jSONObject2.getString("image_style");
            C19383o.m32796f(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
            String upperCase = string.toUpperCase(locale);
            C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            ImageStyle[] values = ImageStyle.values();
            int length = values.length;
            int i2 = 0;
            while (i2 < length) {
                ImageStyle imageStyle2 = values[i2];
                i2++;
                if (C19383o.m32792b(imageStyle2.name(), upperCase)) {
                    imageStyle = imageStyle2;
                    TextAlign textAlign = TextAlign.CENTER;
                    try {
                        C4230u0 u0Var2 = C4230u0.f9378a;
                        String string2 = jSONObject2.getString("text_align_header");
                        C19383o.m32796f(string2, "jsonObject.getString(key)");
                        Locale locale2 = Locale.US;
                        C19383o.m32796f(locale2, UserStateKt.US_COUNTRY);
                        String upperCase2 = string2.toUpperCase(locale2);
                        C19383o.m32796f(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                        TextAlign[] values2 = TextAlign.values();
                        int length2 = values2.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            TextAlign textAlign2 = values2[i3];
                            i3++;
                            if (C19383o.m32792b(textAlign2.name(), upperCase2)) {
                                textAlign = textAlign2;
                                TextAlign textAlign3 = TextAlign.CENTER;
                                try {
                                    C4230u0 u0Var3 = C4230u0.f9378a;
                                    String string3 = jSONObject2.getString("text_align_message");
                                    C19383o.m32796f(string3, "jsonObject.getString(key)");
                                    Locale locale3 = Locale.US;
                                    C19383o.m32796f(locale3, UserStateKt.US_COUNTRY);
                                    String upperCase3 = string3.toUpperCase(locale3);
                                    C19383o.m32796f(upperCase3, "this as java.lang.String).toUpperCase(locale)");
                                    TextAlign[] values3 = TextAlign.values();
                                    int length3 = values3.length;
                                    int i4 = 0;
                                    while (i4 < length3) {
                                        TextAlign textAlign4 = values3[i4];
                                        i4++;
                                        if (C19383o.m32792b(textAlign4.name(), upperCase3)) {
                                            textAlign3 = textAlign4;
                                            this.f11809D = Color.parseColor("#333333");
                                            this.f11810E = Color.parseColor("#9B9B9B");
                                            EmptyList emptyList = EmptyList.INSTANCE;
                                            this.f11812G = emptyList;
                                            this.f11813H = ImageStyle.TOP;
                                            this.f11815J = TextAlign.CENTER;
                                            this.f11811F = optString;
                                            this.f11809D = optInt;
                                            this.f11810E = optInt2;
                                            if (jSONObject2.has("frame_color")) {
                                                this.f11814I = Integer.valueOf(jSONObject2.optInt("frame_color"));
                                            }
                                            C19383o.m32797g(imageStyle, "<set-?>");
                                            this.f11813H = imageStyle;
                                            C19383o.m32797g(textAlign, "<set-?>");
                                            this.f11815J = textAlign;
                                            C19383o.m32797g(textAlign3, "<set-?>");
                                            this.f11763n = textAlign3;
                                            JSONArray optJSONArray = jSONObject2.optJSONArray("btns");
                                            JSONArray b = C3582b3.m8483b(jSONObject);
                                            ArrayList arrayList = new ArrayList();
                                            if (optJSONArray == null) {
                                                it = emptyList.iterator();
                                                i = 0;
                                            } else {
                                                i = 0;
                                                it = new C19439n.C19440a(SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, optJSONArray.length())), new C5476f(optJSONArray)), new C5477g(optJSONArray)));
                                            }
                                            C19383o.m32797g(it, "<this>");
                                            while (true) {
                                                int i5 = i;
                                                if (it.hasNext()) {
                                                    i = i5 + 1;
                                                    if (i5 >= 0) {
                                                        C19331x xVar = new C19331x(i5, it.next());
                                                        arrayList.add(new MessageButton((JSONObject) xVar.f43191b, b.optJSONObject(xVar.f43190a)));
                                                    } else {
                                                        C17782b.m29877o0();
                                                        throw null;
                                                    }
                                                } else {
                                                    this.f11812G = arrayList;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                } catch (Exception unused) {
                                }
                            } else {
                                C4274x1 x1Var2 = x1Var;
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
}
