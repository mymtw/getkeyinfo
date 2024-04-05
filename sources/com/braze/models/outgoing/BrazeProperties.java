package com.braze.models.outgoing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.C5621a;
import com.braze.support.DateTimeUtils;
import com.braze.support.ValidationUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.apache.commons.lang3.ClassUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.C0035b;
import p753kq.C19846a;

public final class BrazeProperties implements C0035b<JSONObject> {

    /* renamed from: c */
    public static final C5495a f11849c = new C5495a();

    /* renamed from: b */
    public JSONObject f11850b = new JSONObject();

    /* renamed from: com.braze.models.outgoing.BrazeProperties$a */
    public static final class C5495a {

        /* renamed from: com.braze.models.outgoing.BrazeProperties$a$a */
        public static final class C5496a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5496a f11851b = new C5496a();

            public C5496a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
            }
        }

        /* renamed from: com.braze.models.outgoing.BrazeProperties$a$b */
        public static final class C5497b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5497b f11852b = new C5497b();

            public C5497b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "The leading character in the key string may not be '$'. Not adding property.";
            }
        }

        /* renamed from: a */
        public final boolean mo16040a(String str) {
            C19383o.m32797g(str, "key");
            if (C19457k.m33020X0(str)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5496a.f11851b, 6);
                return false;
            } else if (!C19457k.m33025c1(str, "$", false)) {
                return true;
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5497b.f11852b, 6);
                return false;
            }
        }
    }

    /* renamed from: com.braze.models.outgoing.BrazeProperties$b */
    final class C5498b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11853b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5498b(String str) {
            super(0);
            this.f11853b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Value type is not supported. Cannot add property "), this.f11853b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.models.outgoing.BrazeProperties$c */
    final class C5499c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5499c f11854b = new C5499c();

        public C5499c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception trying to add property.";
        }
    }

    /* renamed from: com.braze.models.outgoing.BrazeProperties$d */
    public static final class C5500d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5500d f11855b = new C5500d();

        public C5500d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to clone BrazeProperties";
        }
    }

    /* renamed from: com.braze.models.outgoing.BrazeProperties$e */
    final class C5501e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5501e f11856b = new C5501e();

        public C5501e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception trying to get property.";
        }
    }

    public BrazeProperties() {
    }

    /* renamed from: b */
    public static JSONObject m11183b(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C19383o.m32796f(next, "jsonObjectIterator.next()");
            arrayList.add(next);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z || f11849c.mo16040a(str)) {
                Object obj = jSONObject.get(str);
                if (obj instanceof Date) {
                    jSONObject.put(str, DateTimeUtils.m11300b((Date) obj, BrazeDateFormat.LONG));
                }
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    m11183b(jSONObject2, false);
                    jSONObject.put(str, jSONObject2);
                }
            } else {
                jSONObject.remove(str);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo16038a(String str, String str2) {
        if (f11849c.mo16040a(str2)) {
            try {
                if (str instanceof Long) {
                    this.f11850b.put(ValidationUtils.m11346a(str2), ((Number) str).longValue());
                } else if (str instanceof Integer) {
                    this.f11850b.put(ValidationUtils.m11346a(str2), ((Number) str).intValue());
                } else if (str instanceof Double) {
                    this.f11850b.put(ValidationUtils.m11346a(str2), ((Number) str).doubleValue());
                } else if (str instanceof Boolean) {
                    this.f11850b.put(ValidationUtils.m11346a(str2), ((Boolean) str).booleanValue());
                } else if (str instanceof Date) {
                    this.f11850b.put(ValidationUtils.m11346a(str2), DateTimeUtils.m11300b((Date) str, BrazeDateFormat.LONG));
                } else if (str instanceof String) {
                    this.f11850b.put(ValidationUtils.m11346a(str2), ValidationUtils.m11346a(str));
                } else if (str instanceof JSONObject) {
                    JSONObject jSONObject = this.f11850b;
                    String a = ValidationUtils.m11346a(str2);
                    JSONObject jSONObject2 = (JSONObject) str;
                    m11183b(jSONObject2, true);
                    jSONObject.put(a, jSONObject2);
                } else if (str instanceof Map) {
                    JSONObject jSONObject3 = this.f11850b;
                    String a2 = ValidationUtils.m11346a(str2);
                    JSONObject jSONObject4 = new JSONObject(C5621a.m11379a((Map) str));
                    m11183b(jSONObject4, true);
                    jSONObject3.put(a2, jSONObject4);
                } else if (str == null) {
                    this.f11850b.put(ValidationUtils.m11346a(str2), JSONObject.NULL);
                } else {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C5498b(str2), 6);
                }
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5499c.f11854b, 4);
            }
        }
    }

    /* renamed from: e */
    public final BrazeProperties mo16039e() {
        try {
            return new BrazeProperties(new JSONObject(this.f11850b.toString()));
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C5500d.f11855b, 4);
            return null;
        }
    }

    public final Object forJsonPut() {
        return this.f11850b;
    }

    public BrazeProperties(JSONObject jSONObject) {
        m11183b(jSONObject, true);
        this.f11850b = jSONObject;
    }
}
