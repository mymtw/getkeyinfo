package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5489g;
import com.braze.models.inappmessage.C5490h;
import com.braze.models.inappmessage.C5491i;
import com.braze.models.inappmessage.C5492j;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONArray;
import org.json.JSONObject;
import p030bo.app.C3787j;
import p753kq.C19846a;

/* renamed from: bo.app.b3 */
public final class C3582b3 {

    /* renamed from: a */
    private static final String f8244a = C19383o.m32802l("InAppMessageModelUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: bo.app.b3$a */
    public /* synthetic */ class C3583a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8245a;

        static {
            int[] iArr = new int[MessageType.values().length];
            iArr[MessageType.FULL.ordinal()] = 1;
            iArr[MessageType.MODAL.ordinal()] = 2;
            iArr[MessageType.SLIDEUP.ordinal()] = 3;
            iArr[MessageType.HTML_FULL.ordinal()] = 4;
            iArr[MessageType.HTML.ordinal()] = 5;
            f8245a = iArr;
        }
    }

    /* renamed from: bo.app.b3$b */
    public static final class C3584b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3584b f8246b = new C3584b();

        public C3584b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Deserializing control in-app message.";
        }
    }

    /* renamed from: bo.app.b3$c */
    public static final class C3585c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8247b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3585c(JSONObject jSONObject) {
            super(0);
            this.f8247b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(JsonUtils.m11315f(this.f8247b), "In-app message type was unknown for in-app message: ");
        }
    }

    /* renamed from: bo.app.b3$d */
    public static final class C3586d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8248b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3586d(JSONObject jSONObject) {
            super(0);
            this.f8248b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(JsonUtils.m11315f(this.f8248b), "Unknown in-app message type. Returning null: ");
        }
    }

    /* renamed from: bo.app.b3$e */
    public static final class C3587e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8249b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3587e(JSONObject jSONObject) {
            super(0);
            this.f8249b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to deserialize the in-app message: ");
            h.append(JsonUtils.m11315f(this.f8249b));
            h.append(". Returning null.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.b3$f */
    public static final class C3588f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3588f f8250b = new C3588f();

        public C3588f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "In-app message string was blank.";
        }
    }

    /* renamed from: bo.app.b3$g */
    public static final class C3589g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8251b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3589g(String str) {
            super(0);
            this.f8251b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8251b, "Failed to deserialize the in-app message string: ");
        }
    }

    /* renamed from: a */
    public static final C5483a m8481a(String str, C4274x1 x1Var) {
        C19383o.m32797g(str, "inAppMessageJsonString");
        C19383o.m32797g(x1Var, "brazeManager");
        if (C19457k.m33020X0(str)) {
            BrazeLogger.m11283e(f8244a, BrazeLogger.Priority.I, (Throwable) null, C3588f.f8250b, 12);
            return null;
        }
        try {
            return m8482a(new JSONObject(str), x1Var);
        } catch (Exception e) {
            BrazeLogger.m11283e(f8244a, BrazeLogger.Priority.E, e, new C3589g(str), 8);
            return null;
        }
    }

    /* renamed from: b */
    public static final JSONArray m8483b(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject optJSONObject;
        C19383o.m32797g(jSONObject, "inAppMessageJson");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("themes");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(ResponseConstants.DARK)) == null) {
            jSONArray = null;
        } else {
            jSONArray = optJSONObject.optJSONArray("btns");
        }
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    /* renamed from: c */
    public static final boolean m8485c(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "inAppMessageJson");
        return jSONObject.optBoolean("is_control", false);
    }

    /* renamed from: b */
    private static final void m8484b(JSONObject jSONObject, C4274x1 x1Var) {
        String optString = jSONObject.optString("trigger_id");
        if (!(optString == null || optString.length() == 0)) {
            C3787j.C3788a aVar = C3787j.f8608h;
            C19383o.m32796f(optString, "triggerId");
            C4208t1 a = aVar.mo13466a(optString, InAppMessageFailureType.UNKNOWN_MESSAGE_TYPE);
            if (a != null) {
                x1Var.mo13838a(a);
            }
        }
    }

    /* renamed from: a */
    public static final C5483a m8482a(JSONObject jSONObject, C4274x1 x1Var) {
        MessageType messageType;
        C5483a aVar;
        C19383o.m32797g(jSONObject, "inAppMessageJson");
        C19383o.m32797g(x1Var, "brazeManager");
        try {
            if (m8485c(jSONObject)) {
                BrazeLogger.m11283e(f8244a, BrazeLogger.Priority.D, (Throwable) null, C3584b.f8246b, 12);
                return new InAppMessageControl(jSONObject, x1Var);
            }
            try {
                C4230u0 u0Var = C4230u0.f9378a;
                String string = jSONObject.getString("type");
                C19383o.m32796f(string, "jsonObject.getString(key)");
                Locale locale = Locale.US;
                C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
                String upperCase = string.toUpperCase(locale);
                C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                MessageType[] values = MessageType.values();
                int i = 0;
                int length = values.length;
                while (i < length) {
                    messageType = values[i];
                    i++;
                    if (C19383o.m32792b(messageType.name(), upperCase)) {
                        if (messageType == null) {
                            BrazeLogger.m11283e(f8244a, BrazeLogger.Priority.I, (Throwable) null, new C3585c(jSONObject), 12);
                            m8484b(jSONObject, x1Var);
                            return null;
                        }
                        int i2 = C3583a.f8245a[messageType.ordinal()];
                        if (i2 == 1) {
                            aVar = new C5489g(jSONObject, x1Var);
                        } else if (i2 == 2) {
                            aVar = new C5492j(jSONObject, x1Var);
                        } else if (i2 == 3) {
                            aVar = new InAppMessageSlideup(jSONObject, x1Var);
                        } else if (i2 == 4) {
                            aVar = new C5491i(jSONObject, x1Var);
                        } else if (i2 != 5) {
                            BrazeLogger.m11283e(f8244a, BrazeLogger.Priority.W, (Throwable) null, new C3586d(jSONObject), 12);
                            m8484b(jSONObject, x1Var);
                            return null;
                        } else {
                            aVar = new C5490h(jSONObject, x1Var);
                        }
                        return aVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                messageType = null;
            }
        } catch (Exception e) {
            BrazeLogger.m11283e(f8244a, BrazeLogger.Priority.E, e, new C3587e(jSONObject), 8);
            return null;
        }
    }

    /* renamed from: a */
    public static final C3621d3 m8480a(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "inAppMessageJson");
        JSONObject optJSONObject = jSONObject.optJSONObject("themes");
        JSONObject optJSONObject2 = optJSONObject == null ? null : optJSONObject.optJSONObject(ResponseConstants.DARK);
        if (optJSONObject2 == null) {
            return null;
        }
        return new C3621d3(optJSONObject2);
    }
}
