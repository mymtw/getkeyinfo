package com.braze.p044ui.inappmessage.jsinterface;

import android.content.Context;
import android.support.p013v4.media.session.C0087d;
import android.webkit.JavascriptInterface;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import p753kq.C19857l;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface */
public final class InAppMessageUserJavascriptInterface {

    /* renamed from: a */
    public final Context f12075a;

    /* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$a */
    public static final class C5653a {
        /* renamed from: a */
        public static final void m11447a(Braze braze, C19857l lVar) {
            braze.mo15498m(new C5664a(lVar));
        }
    }

    static {
        new C5653a();
    }

    public InAppMessageUserJavascriptInterface(Context context) {
        this.f12075a = context;
    }

    @JavascriptInterface
    public final void addAlias(String str, String str2) {
        C19383o.m32797g(str, "alias");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$addAlias$1(str, str2));
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(String str, String str2) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "value");
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$addToCustomAttributeArray$1(str, str2));
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(String str) {
        C19383o.m32797g(str, "subscriptionGroupId");
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$addToSubscriptionGroup$1(str));
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(String str) {
        C19383o.m32797g(str, AttributeFacet.ATTRIBUTE);
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new C5654x8a54a3ac(str));
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(String str, String str2) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "value");
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new C5656xb9552497(str, str2));
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(String str) {
        C19383o.m32797g(str, "subscriptionGroupId");
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new C5657xebf52453(str));
    }

    @JavascriptInterface
    public final void setCountry(String str) {
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setCountry$1(str));
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(String str, double d, double d2) {
        C19383o.m32797g(str, AttributeFacet.ATTRIBUTE);
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setCustomLocationAttribute$1(str, d, d2));
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(String str, String str2) {
        String[] strArr;
        C19383o.m32797g(str, "key");
        try {
            JSONArray jSONArray = new JSONArray(str2);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                strArr = (String[]) array;
                if (strArr == null) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C5658xd6e2457a(str), 6);
                    return;
                }
                C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new C5659xd6e2457b(str, strArr));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5655x2f7a4514.INSTANCE, 4);
            strArr = null;
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(String str, String str2) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "jsonStringValue");
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setCustomUserAttributeJSON$1(this, str, str2));
    }

    @JavascriptInterface
    public final void setDateOfBirth(int i, int i2, int i3) {
        Month month = (i2 < 1 || i2 > 12) ? null : Month.Companion.getMonth(i2 - 1);
        if (month == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setDateOfBirth$1(i2), 6);
        } else {
            C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setDateOfBirth$2(i, month, i3));
        }
    }

    @JavascriptInterface
    public final void setEmail(String str) {
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setEmail$1(str));
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(String str) {
        C19383o.m32797g(str, "subscriptionType");
        NotificationSubscriptionType fromValue = NotificationSubscriptionType.Companion.fromValue(str);
        if (fromValue == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C5660xf814ba37(str), 6);
            return;
        }
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new C5661xf814ba38(fromValue));
    }

    @JavascriptInterface
    public final void setFirstName(String str) {
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setFirstName$1(str));
    }

    @JavascriptInterface
    public final void setGender(String str) {
        C19383o.m32797g(str, "genderString");
        Locale locale = Locale.US;
        String g = C0087d.m237g(locale, UserStateKt.US_COUNTRY, str, locale, "this as java.lang.String).toLowerCase(locale)");
        Gender gender = Gender.MALE;
        if (!C19383o.m32792b(g, gender.forJsonPut())) {
            gender = Gender.FEMALE;
            if (!C19383o.m32792b(g, gender.forJsonPut())) {
                gender = Gender.OTHER;
                if (!C19383o.m32792b(g, gender.forJsonPut())) {
                    gender = Gender.UNKNOWN;
                    if (!C19383o.m32792b(g, gender.forJsonPut())) {
                        gender = Gender.NOT_APPLICABLE;
                        if (!C19383o.m32792b(g, gender.forJsonPut())) {
                            gender = Gender.PREFER_NOT_TO_SAY;
                            if (!C19383o.m32792b(g, gender.forJsonPut())) {
                                gender = null;
                            }
                        }
                    }
                }
            }
        }
        if (gender == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new InAppMessageUserJavascriptInterface$setGender$1(str), 6);
            return;
        }
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setGender$2(gender));
    }

    @JavascriptInterface
    public final void setHomeCity(String str) {
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setHomeCity$1(str));
    }

    @JavascriptInterface
    public final void setLanguage(String str) {
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setLanguage$1(str));
    }

    @JavascriptInterface
    public final void setLastName(String str) {
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setLastName$1(str));
    }

    @JavascriptInterface
    public final void setPhoneNumber(String str) {
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new InAppMessageUserJavascriptInterface$setPhoneNumber$1(str));
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(String str) {
        C19383o.m32797g(str, "subscriptionType");
        NotificationSubscriptionType fromValue = NotificationSubscriptionType.Companion.fromValue(str);
        if (fromValue == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C5662x2f580add(str), 6);
            return;
        }
        C5653a.m11447a(Braze.f11170m.mo15515f(this.f12075a), new C5663x2f580ade(fromValue));
    }
}
