package p030bo.app;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19387r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import kotlin.text.C19453g;
import kotlin.text.C19460n;
import org.json.JSONArray;
import org.json.JSONObject;
import p030bo.app.C3600c1;
import p753kq.C19846a;

/* renamed from: bo.app.j */
public class C3787j implements C4208t1 {

    /* renamed from: h */
    public static final C3788a f8608h = new C3788a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final /* synthetic */ C19410j<Object>[] f8609i;

    /* renamed from: b */
    private final C3600c1 f8610b;

    /* renamed from: c */
    private final JSONObject f8611c;

    /* renamed from: d */
    private final double f8612d;

    /* renamed from: e */
    private final String f8613e;

    /* renamed from: f */
    private final C3667f3 f8614f;

    /* renamed from: g */
    private final C3667f3 f8615g;

    /* renamed from: bo.app.j$a */
    public static final class C3788a {

        /* renamed from: bo.app.j$a$a */
        public static final class C3789a extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8616b;

            /* renamed from: c */
            public final /* synthetic */ String f8617c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3789a(String str, String str2) {
                super(0);
                this.f8616b = str;
                this.f8617c = str2;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f8616b).put("value", this.f8617c);
                C3600c1 c1Var = C3600c1.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$a0 */
        public static final class C3790a0 extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ C3670f5 f8618b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3790a0(C3670f5 f5Var) {
                super(0);
                this.f8618b = f5Var;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                C3787j jVar = new C3787j(C3600c1.SESSION_START, (JSONObject) null, (double) ShadowDrawableWrapper.COS_45, (String) null, 14, (DefaultConstructorMarker) null);
                jVar.mo13445a(this.f8618b);
                return jVar;
            }
        }

        /* renamed from: bo.app.j$a$b */
        public static final class C3791b extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8619b;

            /* renamed from: c */
            public final /* synthetic */ String f8620c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3791b(String str, String str2) {
                super(0);
                this.f8619b = str;
                this.f8620c = str2;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject(this.f8619b);
                String string = jSONObject.getString("name");
                C3600c1.C3601a aVar = C3600c1.f8273c;
                C19383o.m32796f(string, "eventTypeString");
                C3600c1 a = aVar.mo13155a(string);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                double d = jSONObject.getDouble("time");
                String e = JsonUtils.m11314e("user_id", jSONObject);
                String e2 = JsonUtils.m11314e("session_id", jSONObject);
                C19383o.m32796f(jSONObject2, "data");
                return new C3787j(a, jSONObject2, d, this.f8620c, e, e2);
            }
        }

        /* renamed from: bo.app.j$a$b0 */
        public static final class C3792b0 extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8621b;

            /* renamed from: c */
            public final /* synthetic */ String[] f8622c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3792b0(String str, String[] strArr) {
                super(0);
                this.f8621b = str;
                this.f8622c = strArr;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", this.f8621b);
                String[] strArr = this.f8622c;
                if (strArr == null) {
                    jSONObject.put("value", JSONObject.NULL);
                } else {
                    String str = JsonUtils.f11953a;
                    JSONArray jSONArray = new JSONArray();
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        String str2 = strArr[i];
                        i++;
                        jSONArray.put(str2);
                    }
                    jSONObject.put("value", jSONArray);
                }
                return new C3787j(C3600c1.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$c */
        public static final class C3793c extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8623b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3793c(String str) {
                super(0);
                this.f8623b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f8623b);
                jSONObject.put("ids", jSONArray);
                return new C3787j(C3600c1.CONTENT_CARDS_CLICK, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$c0 */
        public static final class C3794c0 extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8624b;

            /* renamed from: c */
            public final /* synthetic */ C4077p5 f8625c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3794c0(String str, C4077p5 p5Var) {
                super(0);
                this.f8624b = str;
                this.f8625c = p5Var;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("group_id", this.f8624b).put(ResponseConstants.STATUS, this.f8625c.forJsonPut());
                C3600c1 c1Var = C3600c1.SUBSCRIPTION_GROUP_UPDATE;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$d */
        public static final class C3795d extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8626b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3795d(String str) {
                super(0);
                this.f8626b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f8626b);
                jSONObject.put("ids", jSONArray);
                return new C3787j(C3600c1.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$d0 */
        public static final class C3796d0 extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8627b;

            /* renamed from: c */
            public final /* synthetic */ String f8628c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3796d0(String str, String str2) {
                super(0);
                this.f8627b = str;
                this.f8628c = str2;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put(Constants.APPBOY_PUSH_CONTENT_KEY, this.f8627b).put("l", this.f8628c);
                C3600c1 c1Var = C3600c1.USER_ALIAS;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$e */
        public static final class C3797e extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8629b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3797e(String str) {
                super(0);
                this.f8629b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f8629b);
                jSONObject.put("ids", jSONArray);
                return new C3787j(C3600c1.CONTENT_CARDS_DISMISS, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$e0 */
        public static final class C3798e0 extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C3798e0 f8630b = new C3798e0();

            public C3798e0() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to create event";
            }
        }

        /* renamed from: bo.app.j$a$f */
        public static final class C3799f extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8631b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3799f(String str) {
                super(0);
                this.f8631b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f8631b);
                jSONObject.put("ids", jSONArray);
                return new C3787j(C3600c1.CONTENT_CARDS_IMPRESSION, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$g */
        public static final class C3800g extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8632b;

            /* renamed from: c */
            public final /* synthetic */ BrazeProperties f8633c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3800g(String str, BrazeProperties brazeProperties) {
                super(0);
                this.f8632b = str;
                this.f8633c = brazeProperties;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("n", this.f8632b);
                BrazeProperties brazeProperties = this.f8633c;
                if (brazeProperties != null && brazeProperties.f11850b.length() > 0) {
                    put.put(Constants.APPBOY_PUSH_PRIORITY_KEY, this.f8633c.f11850b);
                }
                C3600c1 c1Var = C3600c1.CUSTOM_EVENT;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$h */
        public static final class C3801h extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ Throwable f8634b;

            /* renamed from: c */
            public final /* synthetic */ C3670f5 f8635c;

            /* renamed from: d */
            public final /* synthetic */ boolean f8636d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3801h(Throwable th, C3670f5 f5Var, boolean z) {
                super(0);
                this.f8634b = th;
                this.f8635c = f5Var;
                this.f8636d = z;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                StringBuilder h = C0072d.m201h("\n                original_sdk_version: 23.0.1\n                exception_class: ");
                h.append(this.f8634b.getClass().getName());
                h.append("\n                available_cpus: ");
                h.append(C4307y5.m9969a());
                h.append("\n                ");
                C3670f5 f5Var = this.f8635c;
                h.append(f5Var == null ? null : C19383o.m32802l(f5Var, "session_id: "));
                h.append("\n                ");
                h.append(C3787j.f8608h.mo13473a(this.f8634b));
                h.append("\n            ");
                JSONObject put = new JSONObject().put("e", C19453g.m33013Q0(h.toString()));
                if (!this.f8636d) {
                    put.put("nop", true);
                }
                C3600c1 c1Var = C3600c1.INTERNAL_ERROR;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$i */
        public static final class C3802i extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8637b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3802i(String str) {
                super(0);
                this.f8637b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f8637b);
                jSONObject.put("ids", jSONArray);
                return new C3787j(C3600c1.NEWS_FEED_CARD_CLICK, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$j */
        public static final class C3803j extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8638b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3803j(String str) {
                super(0);
                this.f8638b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f8638b);
                jSONObject.put("ids", jSONArray);
                return new C3787j(C3600c1.NEWS_FEED_CARD_IMPRESSION, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$k */
        public static final class C3804k extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8639b;

            /* renamed from: c */
            public final /* synthetic */ String f8640c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3804k(String str, String str2) {
                super(0);
                this.f8639b = str;
                this.f8640c = str2;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("geo_id", this.f8639b).put("event_type", this.f8640c);
                C3600c1 c1Var = C3600c1.GEOFENCE;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$l */
        public static final class C3805l extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8641b;

            /* renamed from: c */
            public final /* synthetic */ String f8642c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3805l(String str, String str2) {
                super(0);
                this.f8641b = str;
                this.f8642c = str2;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                return new C3787j(C3600c1.INAPP_MESSAGE_BUTTON_CLICK, C3788a.m8844a(C3787j.f8608h, this.f8641b, this.f8642c, (InAppMessageFailureType) null, 4, (Object) null), (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$m */
        public static final class C3806m extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8643b;

            /* renamed from: c */
            public final /* synthetic */ MessageButton f8644c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3806m(String str, MessageButton messageButton) {
                super(0);
                this.f8643b = str;
                this.f8644c = messageButton;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                return new C3787j(C3600c1.INAPP_MESSAGE_BUTTON_CLICK, C3788a.m8844a(C3787j.f8608h, this.f8643b, String.valueOf(this.f8644c.f11831d), (InAppMessageFailureType) null, 4, (Object) null), (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$n */
        public static final class C3807n extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8645b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3807n(String str) {
                super(0);
                this.f8645b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                return new C3787j(C3600c1.INAPP_MESSAGE_CLICK, C3788a.m8844a(C3787j.f8608h, this.f8645b, (String) null, (InAppMessageFailureType) null, 6, (Object) null), (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$o */
        public static final class C3808o extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8646b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3808o(String str) {
                super(0);
                this.f8646b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                return new C3787j(C3600c1.INAPP_MESSAGE_CONTROL_IMPRESSION, C3788a.m8844a(C3787j.f8608h, this.f8646b, (String) null, (InAppMessageFailureType) null, 6, (Object) null), (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$p */
        public static final class C3809p extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8647b;

            /* renamed from: c */
            public final /* synthetic */ InAppMessageFailureType f8648c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3809p(String str, InAppMessageFailureType inAppMessageFailureType) {
                super(0);
                this.f8647b = str;
                this.f8648c = inAppMessageFailureType;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                return new C3787j(C3600c1.INAPP_MESSAGE_DISPLAY_FAILURE, C3788a.m8844a(C3787j.f8608h, this.f8647b, (String) null, this.f8648c, 2, (Object) null), (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$q */
        public static final class C3810q extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8649b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3810q(String str) {
                super(0);
                this.f8649b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                return new C3787j(C3600c1.INAPP_MESSAGE_IMPRESSION, C3788a.m8844a(C3787j.f8608h, this.f8649b, (String) null, (InAppMessageFailureType) null, 6, (Object) null), (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$r */
        public static final class C3811r extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8650b;

            /* renamed from: c */
            public final /* synthetic */ int f8651c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3811r(String str, int i) {
                super(0);
                this.f8650b = str;
                this.f8651c = i;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f8650b).put("value", this.f8651c);
                C3600c1 c1Var = C3600c1.INCREMENT;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$s */
        public static final class C3812s extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8652b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3812s(String str) {
                super(0);
                this.f8652b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("n", this.f8652b);
                C3600c1 c1Var = C3600c1.INTERNAL;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$t */
        public static final class C3813t extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8653b;

            /* renamed from: c */
            public final /* synthetic */ double f8654c;

            /* renamed from: d */
            public final /* synthetic */ double f8655d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3813t(String str, double d, double d2) {
                super(0);
                this.f8653b = str;
                this.f8654c = d;
                this.f8655d = d2;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f8653b).put("latitude", this.f8654c).put("longitude", this.f8655d);
                C3600c1 c1Var = C3600c1.LOCATION_CUSTOM_ATTRIBUTE_ADD;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$u */
        public static final class C3814u extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8656b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3814u(String str) {
                super(0);
                this.f8656b = str;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f8656b);
                C3600c1 c1Var = C3600c1.LOCATION_CUSTOM_ATTRIBUTE_REMOVE;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$v */
        public static final class C3815v extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ C4257w1 f8657b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3815v(C4257w1 w1Var) {
                super(0);
                this.f8657b = w1Var;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                return new C3787j(C3600c1.LOCATION_RECORDED, (JSONObject) this.f8657b.forJsonPut(), (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$w */
        public static final class C3816w extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ BrazeProperties f8658b;

            /* renamed from: c */
            public final /* synthetic */ String f8659c;

            /* renamed from: d */
            public final /* synthetic */ String f8660d;

            /* renamed from: e */
            public final /* synthetic */ BigDecimal f8661e;

            /* renamed from: f */
            public final /* synthetic */ int f8662f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3816w(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i) {
                super(0);
                this.f8658b = brazeProperties;
                this.f8659c = str;
                this.f8660d = str2;
                this.f8661e = bigDecimal;
                this.f8662f = i;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject jSONObject = new JSONObject();
                String str = this.f8659c;
                String str2 = this.f8660d;
                BigDecimal bigDecimal = this.f8661e;
                int i = this.f8662f;
                jSONObject.put("pid", str);
                jSONObject.put("c", str2);
                jSONObject.put(Constants.APPBOY_PUSH_PRIORITY_KEY, C4138r3.m9508a(bigDecimal).doubleValue());
                jSONObject.put(SearchCategoryRedirectPage.PARAM_QUERY, i);
                BrazeProperties brazeProperties = this.f8658b;
                if (brazeProperties != null && brazeProperties.f11850b.length() > 0) {
                    jSONObject.put("pr", this.f8658b.f11850b);
                }
                return new C3787j(C3600c1.PURCHASE, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$x */
        public static final class C3817x extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8663b;

            /* renamed from: c */
            public final /* synthetic */ String f8664c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3817x(String str, String str2) {
                super(0);
                this.f8663b = str;
                this.f8664c = str2;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, this.f8663b).put(Constants.APPBOY_PUSH_CONTENT_KEY, this.f8664c);
                C3600c1 c1Var = C3600c1.PUSH_STORY_PAGE_CLICK;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$y */
        public static final class C3818y extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ String f8665b;

            /* renamed from: c */
            public final /* synthetic */ String f8666c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3818y(String str, String str2) {
                super(0);
                this.f8665b = str;
                this.f8666c = str2;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f8665b).put("value", this.f8666c);
                C3600c1 c1Var = C3600c1.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$z */
        public static final class C3819z extends Lambda implements C19846a<C4208t1> {

            /* renamed from: b */
            public final /* synthetic */ long f8667b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3819z(long j) {
                super(0);
                this.f8667b = j;
            }

            /* renamed from: a */
            public final C4208t1 invoke() {
                JSONObject put = new JSONObject().put("d", this.f8667b);
                C3600c1 c1Var = C3600c1.SESSION_END;
                C19383o.m32796f(put, "eventData");
                return new C3787j(c1Var, put, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        private C3788a() {
        }

        public /* synthetic */ C3788a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4208t1 mo13468a(String str, BrazeProperties brazeProperties) {
            C19383o.m32797g(str, "eventName");
            return m8843a((C19846a<? extends C4208t1>) new C3800g(str, brazeProperties));
        }

        /* renamed from: b */
        public final C4208t1 mo13475b(String str) {
            C19383o.m32797g(str, "cardId");
            return m8843a((C19846a<? extends C4208t1>) new C3795d(str));
        }

        /* renamed from: c */
        public final C4208t1 mo13477c(String str) {
            C19383o.m32797g(str, "cardId");
            return m8843a((C19846a<? extends C4208t1>) new C3797e(str));
        }

        /* renamed from: d */
        public final C4208t1 mo13479d(String str) {
            C19383o.m32797g(str, "cardId");
            return m8843a((C19846a<? extends C4208t1>) new C3799f(str));
        }

        /* renamed from: e */
        public final C4208t1 mo13481e(String str) {
            C19383o.m32797g(str, "cardId");
            return m8843a((C19846a<? extends C4208t1>) new C3802i(str));
        }

        /* renamed from: f */
        public final C4208t1 mo13483f(String str) {
            C19383o.m32797g(str, "cardId");
            return m8843a((C19846a<? extends C4208t1>) new C3803j(str));
        }

        /* renamed from: g */
        public final C4208t1 mo13486g(String str, String str2) {
            C19383o.m32797g(str, "alias");
            C19383o.m32797g(str2, ResponseConstants.LABEL);
            return m8843a((C19846a<? extends C4208t1>) new C3796d0(str, str2));
        }

        /* renamed from: h */
        public final C4208t1 mo13487h(String str) {
            C19383o.m32797g(str, "triggerId");
            return m8843a((C19846a<? extends C4208t1>) new C3808o(str));
        }

        /* renamed from: i */
        public final C4208t1 mo13488i(String str) {
            C19383o.m32797g(str, "triggerId");
            return m8843a((C19846a<? extends C4208t1>) new C3810q(str));
        }

        /* renamed from: j */
        public final C4208t1 mo13489j(String str) {
            C19383o.m32797g(str, "name");
            return m8843a((C19846a<? extends C4208t1>) new C3812s(str));
        }

        /* renamed from: k */
        public final C4208t1 mo13490k(String str) {
            return m8843a((C19846a<? extends C4208t1>) new C3814u(str));
        }

        /* renamed from: a */
        public final C4208t1 mo13470a(String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties) {
            C19383o.m32797g(str, "productId");
            C19383o.m32797g(str2, AppsFlyerProperties.CURRENCY_CODE);
            C19383o.m32797g(bigDecimal, ResponseConstants.PRICE);
            return m8843a((C19846a<? extends C4208t1>) new C3816w(brazeProperties, str, str2, bigDecimal, i));
        }

        /* renamed from: b */
        public final C4208t1 mo13476b(String str, String str2) {
            C19383o.m32797g(str, "serializedEvent");
            C19383o.m32797g(str2, "uniqueIdentifier");
            return m8843a((C19846a<? extends C4208t1>) new C3791b(str, str2));
        }

        /* renamed from: c */
        public final C4208t1 mo13478c(String str, String str2) {
            C19383o.m32797g(str, "id");
            C19383o.m32797g(str2, "eventType");
            return m8843a((C19846a<? extends C4208t1>) new C3804k(str, str2));
        }

        /* renamed from: d */
        public final C4208t1 mo13480d(String str, String str2) {
            C19383o.m32797g(str, "triggerId");
            C19383o.m32797g(str2, "buttonId");
            return m8843a((C19846a<? extends C4208t1>) new C3805l(str, str2));
        }

        /* renamed from: e */
        public final C4208t1 mo13482e(String str, String str2) {
            C19383o.m32797g(str, "campaignId");
            C19383o.m32797g(str2, "pageId");
            return m8843a((C19846a<? extends C4208t1>) new C3817x(str, str2));
        }

        /* renamed from: f */
        public final C4208t1 mo13484f(String str, String str2) {
            C19383o.m32797g(str, "key");
            C19383o.m32797g(str2, "value");
            return m8843a((C19846a<? extends C4208t1>) new C3818y(str, str2));
        }

        /* renamed from: g */
        public final C4208t1 mo13485g(String str) {
            C19383o.m32797g(str, "triggerId");
            return m8843a((C19846a<? extends C4208t1>) new C3807n(str));
        }

        /* renamed from: a */
        public final C4208t1 mo13461a(C4257w1 w1Var) {
            C19383o.m32797g(w1Var, "location");
            return m8843a((C19846a<? extends C4208t1>) new C3815v(w1Var));
        }

        /* renamed from: a */
        public final C4208t1 mo13472a(Throwable th, C3670f5 f5Var, boolean z) {
            C19383o.m32797g(th, "throwable");
            return m8843a((C19846a<? extends C4208t1>) new C3801h(th, f5Var, z));
        }

        /* renamed from: a */
        public final C4208t1 mo13462a(String str) {
            C19383o.m32797g(str, "cardId");
            return m8843a((C19846a<? extends C4208t1>) new C3793c(str));
        }

        /* renamed from: a */
        public final C4208t1 mo13467a(String str, MessageButton messageButton) {
            C19383o.m32797g(str, "triggerId");
            C19383o.m32797g(messageButton, "messageButton");
            return m8843a((C19846a<? extends C4208t1>) new C3806m(str, messageButton));
        }

        /* renamed from: a */
        public final C4208t1 mo13466a(String str, InAppMessageFailureType inAppMessageFailureType) {
            C19383o.m32797g(str, "triggerId");
            C19383o.m32797g(inAppMessageFailureType, "inAppMessageFailureType");
            return m8843a((C19846a<? extends C4208t1>) new C3809p(str, inAppMessageFailureType));
        }

        /* renamed from: a */
        public final C4208t1 mo13458a() {
            return mo13489j("feed_displayed");
        }

        /* renamed from: a */
        public final C4208t1 mo13464a(String str, int i) {
            C19383o.m32797g(str, "customUserAttributeKey");
            return m8843a((C19846a<? extends C4208t1>) new C3811r(str, i));
        }

        /* renamed from: a */
        public final C4208t1 mo13469a(String str, String str2) {
            C19383o.m32797g(str, "key");
            C19383o.m32797g(str2, "value");
            return m8843a((C19846a<? extends C4208t1>) new C3789a(str, str2));
        }

        /* renamed from: a */
        public final C4208t1 mo13471a(String str, String[] strArr) {
            C19383o.m32797g(str, "key");
            return m8843a((C19846a<? extends C4208t1>) new C3792b0(str, strArr));
        }

        /* renamed from: a */
        public final C4208t1 mo13460a(C3670f5 f5Var) {
            C19383o.m32797g(f5Var, "sessionId");
            return m8843a((C19846a<? extends C4208t1>) new C3790a0(f5Var));
        }

        /* renamed from: a */
        public final C4208t1 mo13459a(long j) {
            return m8843a((C19846a<? extends C4208t1>) new C3819z(j));
        }

        /* renamed from: a */
        public final C4208t1 mo13463a(String str, double d, double d2) {
            C19383o.m32797g(str, "key");
            return m8843a((C19846a<? extends C4208t1>) new C3813t(str, d, d2));
        }

        /* renamed from: a */
        public final C4208t1 mo13465a(String str, C4077p5 p5Var) {
            C19383o.m32797g(str, "subscriptionGroupId");
            C19383o.m32797g(p5Var, "subscriptionGroupStatus");
            return m8843a((C19846a<? extends C4208t1>) new C3794c0(str, p5Var));
        }

        /* renamed from: a */
        public final String mo13473a(Throwable th) {
            C19383o.m32797g(th, "throwable");
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            C19383o.m32796f(stringWriter2, "result.toString()");
            return C19460n.m33059J1(5000, stringWriter2);
        }

        /* renamed from: a */
        public static /* synthetic */ JSONObject m8844a(C3788a aVar, String str, String str2, InAppMessageFailureType inAppMessageFailureType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                inAppMessageFailureType = null;
            }
            return aVar.mo13474a(str, str2, inAppMessageFailureType);
        }

        /* renamed from: a */
        public final JSONObject mo13474a(String str, String str2, InAppMessageFailureType inAppMessageFailureType) {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                jSONObject.put("trigger_ids", jSONArray);
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                jSONObject.put("bid", str2);
            }
            if (inAppMessageFailureType != null) {
                jSONObject.put("error_code", inAppMessageFailureType.forJsonPut());
            }
            return jSONObject;
        }

        /* renamed from: a */
        private final C4208t1 m8843a(C19846a<? extends C4208t1> aVar) {
            try {
                return (C4208t1) aVar.invoke();
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3798e0.f8630b, 4);
                return null;
            }
        }
    }

    /* renamed from: bo.app.j$b */
    public static final class C3820b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3820b f8668b = new C3820b();

        public C3820b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating Braze event json";
        }
    }

    static {
        Class<C3787j> cls = C3787j.class;
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cls, "userId", "getUserId()Ljava/lang/String;", 0);
        C19387r rVar = C19386q.f43269a;
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(cls, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0);
        rVar.getClass();
        f8609i = new C19410j[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2};
    }

    public C3787j(C3600c1 c1Var, JSONObject jSONObject, double d, String str) {
        C19383o.m32797g(c1Var, "type");
        C19383o.m32797g(jSONObject, "data");
        C19383o.m32797g(str, "uniqueIdentifier");
        this.f8610b = c1Var;
        this.f8611c = jSONObject;
        this.f8612d = d;
        this.f8613e = str;
        this.f8614f = new C3667f3();
        this.f8615g = new C3667f3();
        if (c1Var == C3600c1.UNKNOWN) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    /* renamed from: a */
    public final void mo13446a(String str) {
        this.f8614f.setValue(this, f8609i[0], str);
    }

    /* renamed from: d */
    public boolean mo13447d() {
        return this.f8610b == C3600c1.INTERNAL_ERROR && mo13452k().optBoolean("nop", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[Catch:{ JSONException -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[Catch:{ JSONException -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[Catch:{ JSONException -> 0x004e }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject forJsonPut() {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "name"
            bo.app.c1 r2 = r8.f8610b     // Catch:{ JSONException -> 0x004e }
            java.lang.String r2 = r2.forJsonPut()     // Catch:{ JSONException -> 0x004e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r1 = "data"
            org.json.JSONObject r2 = r8.mo13452k()     // Catch:{ JSONException -> 0x004e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r1 = "time"
            double r2 = r8.mo13456v()     // Catch:{ JSONException -> 0x004e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r1 = r8.mo13457w()     // Catch:{ JSONException -> 0x004e }
            if (r1 == 0) goto L_0x0031
            int r1 = r1.length()     // Catch:{ JSONException -> 0x004e }
            if (r1 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r1 = 0
            goto L_0x0032
        L_0x0031:
            r1 = 1
        L_0x0032:
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "user_id"
            java.lang.String r2 = r8.mo13457w()     // Catch:{ JSONException -> 0x004e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004e }
        L_0x003d:
            bo.app.f5 r1 = r8.mo13453n()     // Catch:{ JSONException -> 0x004e }
            if (r1 != 0) goto L_0x0044
            goto L_0x005b
        L_0x0044:
            java.lang.String r2 = "session_id"
            java.lang.String r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x004e }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x004e }
            goto L_0x005b
        L_0x004e:
            r1 = move-exception
            r5 = r1
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.E
            bo.app.j$b r6 = p030bo.app.C3787j.C3820b.f8668b
            r7 = 4
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3787j.forJsonPut():org.json.JSONObject");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(getClass(), obj.getClass())) {
            return false;
        }
        return C19383o.m32792b(mo13454r(), ((C3787j) obj).mo13454r());
    }

    public int hashCode() {
        return mo13454r().hashCode();
    }

    /* renamed from: j */
    public final C3600c1 mo13451j() {
        return this.f8610b;
    }

    /* renamed from: k */
    public JSONObject mo13452k() {
        return this.f8611c;
    }

    /* renamed from: n */
    public final C3670f5 mo13453n() {
        return (C3670f5) this.f8615g.getValue(this, f8609i[1]);
    }

    /* renamed from: r */
    public String mo13454r() {
        return this.f8613e;
    }

    public String toString() {
        return mo14106p();
    }

    /* renamed from: v */
    public double mo13456v() {
        return this.f8612d;
    }

    /* renamed from: w */
    public final String mo13457w() {
        return (String) this.f8614f.getValue(this, f8609i[0]);
    }

    /* renamed from: a */
    public final void mo13445a(C3670f5 f5Var) {
        this.f8615g.setValue(this, f8609i[1], f5Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3787j(C3600c1 c1Var, JSONObject jSONObject, double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1Var, (i & 2) != 0 ? new JSONObject() : jSONObject, (i & 4) != 0 ? DateTimeUtils.m11303e() : d, (i & 8) != 0 ? C0069a.m174e("randomUUID().toString()") : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3787j(C3600c1 c1Var, JSONObject jSONObject, double d, String str, String str2, String str3) {
        this(c1Var, jSONObject, d, str);
        C3670f5 f5Var;
        C19383o.m32797g(c1Var, "eventType");
        C19383o.m32797g(jSONObject, "eventData");
        C19383o.m32797g(str, "uniqueIdentifier");
        mo13446a(str2);
        if (str3 == null) {
            f5Var = null;
        } else {
            f5Var = C3670f5.f8421d.mo13298a(str3);
        }
        mo13445a(f5Var);
    }
}
