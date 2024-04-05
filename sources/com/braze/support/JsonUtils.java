package com.braze.support;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C4230u0;
import p753kq.C19846a;
import p753kq.C19857l;

public final class JsonUtils {

    /* renamed from: a */
    public static final String f11953a = C19383o.m32802l("JsonUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: com.braze.support.JsonUtils$a */
    final class C5578a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11954b;

        /* renamed from: c */
        public final /* synthetic */ JSONArray f11955c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5578a(int i, JSONArray jSONArray) {
            super(0);
            this.f11954b = i;
            this.f11955c = jSONArray;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to get string for item at index: ");
            h.append(this.f11954b);
            h.append(" and array: ");
            h.append(this.f11955c);
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.JsonUtils$b */
    final class C5579b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5579b f11956b = new C5579b();

        public C5579b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve color integer from JSON";
        }
    }

    /* renamed from: com.braze.support.JsonUtils$c */
    public static final class C5580c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5580c f11957b = new C5580c();

        public C5580c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
        }
    }

    /* renamed from: com.braze.support.JsonUtils$d */
    final class C5581d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5581d f11958b = new C5581d();

        public C5581d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
        }
    }

    /* renamed from: com.braze.support.JsonUtils$e */
    public final class C5582e extends Lambda implements C19857l<Integer, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f11959b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5582e(JSONArray jSONArray) {
            super(1);
            this.f11959b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo16129a(int i) {
            this.f11959b.opt(i);
            C19383o.m32804n();
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo16129a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.braze.support.JsonUtils$f */
    public final class C5583f extends Lambda implements C19857l<Integer, Object> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f11960b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5583f(JSONArray jSONArray) {
            super(1);
            this.f11960b = jSONArray;
        }

        /* renamed from: a */
        public final Object mo16130a(int i) {
            this.f11960b.get(i);
            C19383o.m32804n();
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo16130a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.braze.support.JsonUtils$g */
    public final class C5584g extends Lambda implements C19857l<String, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f11961b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5584g(JSONObject jSONObject) {
            super(1);
            this.f11961b = jSONObject;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            this.f11961b.opt(str);
            C19383o.m32804n();
            throw null;
        }
    }

    /* renamed from: com.braze.support.JsonUtils$h */
    public final class C5585h extends Lambda implements C19857l<String, Object> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f11962b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5585h(JSONObject jSONObject) {
            super(1);
            this.f11962b = jSONObject;
        }

        /* renamed from: a */
        public final Object invoke(String str) {
            this.f11962b.get(str);
            C19383o.m32804n();
            throw null;
        }
    }

    /* renamed from: com.braze.support.JsonUtils$i */
    public static final class C5586i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11963b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5586i(String str) {
            super(0);
            this.f11963b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11963b, "Caught exception merging JSON for old key ");
        }
    }

    /* renamed from: com.braze.support.JsonUtils$j */
    public static final class C5587j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11964b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5587j(String str) {
            super(0);
            this.f11964b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11964b, "Caught exception merging JSON for new key ");
        }
    }

    /* renamed from: com.braze.support.JsonUtils$k */
    public static final class C5588k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5588k f11965b = new C5588k();

        public C5588k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable parse JSON into a bundle.";
        }
    }

    /* renamed from: a */
    public static final boolean m11310a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        C19383o.m32796f(keys, "target.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object opt = jSONObject.opt(next);
            Object opt2 = jSONObject2.opt(next);
            if (!(opt instanceof JSONObject) || !(opt2 instanceof JSONObject)) {
                if (!(opt == null || opt2 == null || C19383o.m32792b(opt, opt2))) {
                    return false;
                }
            } else if (!m11310a((JSONObject) opt, (JSONObject) opt2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final Map<String, String> m11311b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return C19294b0.m32559p0();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        C19383o.m32796f(keys, "this.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            C19383o.m32796f(next, "key");
            String string = jSONObject.getString(next);
            C19383o.m32796f(string, "this.getString(key)");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final ArrayList m11312c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int i = 0;
        int length = jSONArray.length();
        while (i < length) {
            int i2 = i + 1;
            try {
                String string = jSONArray.getString(i);
                C19383o.m32796f(string, "this.getString(i)");
                arrayList.add(string);
            } catch (Exception e) {
                BrazeLogger.m11283e(f11953a, BrazeLogger.Priority.E, e, new C5578a(i, jSONArray), 8);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final Integer m11313d(String str, JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable th) {
                BrazeLogger.m11283e(f11953a, BrazeLogger.Priority.E, th, C5579b.f11956b, 8);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final String m11314e(String str, JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* renamed from: f */
    public static final String m11315f(JSONObject jSONObject) {
        String str = "";
        if (jSONObject != null) {
            try {
                str = jSONObject.toString(2);
            } catch (Throwable th) {
                BrazeLogger.m11283e(f11953a, BrazeLogger.Priority.E, th, C5580c.f11957b, 8);
            }
            C19383o.m32796f(str, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        }
        return str;
    }

    /* renamed from: g */
    public static final JSONObject m11316g(JSONObject jSONObject, JSONObject jSONObject2) {
        C19383o.m32797g(jSONObject, "oldJson");
        C19383o.m32797g(jSONObject2, "newJson");
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        C19383o.m32796f(keys, "oldJson.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject3.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                BrazeLogger.m11283e(f11953a, BrazeLogger.Priority.E, e, new C5586i(next), 8);
            }
        }
        Iterator<String> keys2 = jSONObject2.keys();
        C19383o.m32796f(keys2, "newJson.keys()");
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            try {
                jSONObject3.put(next2, jSONObject2.get(next2));
            } catch (JSONException e2) {
                BrazeLogger.m11283e(f11953a, BrazeLogger.Priority.E, e2, new C5587j(next2), 8);
            }
        }
        return jSONObject3;
    }

    /* renamed from: h */
    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum m11317h(JSONObject jSONObject, String str, Class<TargetEnum> cls, TargetEnum targetenum) {
        C19383o.m32797g(jSONObject, "jsonObject");
        try {
            String string = jSONObject.getString(str);
            C19383o.m32796f(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
            String upperCase = string.toUpperCase(locale);
            C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            TargetEnum a = C4230u0.m9698a(upperCase, cls);
            return a == null ? targetenum : a;
        } catch (Exception unused) {
            return targetenum;
        }
    }

    /* renamed from: i */
    public static final Bundle m11318i(String str) {
        Bundle bundle = new Bundle();
        if (str == null || C19457k.m33020X0(str)) {
            return bundle;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (Exception e) {
            BrazeLogger.m11283e(f11953a, BrazeLogger.Priority.E, e, C5588k.f11965b, 8);
        }
        return bundle;
    }
}
