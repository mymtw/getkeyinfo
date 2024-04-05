package com.braze.support;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19446a;
import kotlin.text.C19457k;
import org.apache.commons.lang3.ClassUtils;
import p753kq.C19846a;

public final class StringUtils {

    /* renamed from: a */
    public static final String f11974a = C19383o.m32802l("StringUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: com.braze.support.StringUtils$a */
    public static final class C5595a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5595a f11975b = new C5595a();

        public C5595a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The saved user id hash was null or empty.";
        }
    }

    /* renamed from: com.braze.support.StringUtils$b */
    public static final class C5596b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11976b;

        /* renamed from: c */
        public final /* synthetic */ String f11977c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5596b(String str, String str2) {
            super(0);
            this.f11976b = str;
            this.f11977c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Generating MD5 for user id: ");
            h.append(this.f11976b);
            h.append(" apiKey: ");
            h.append(this.f11977c);
            return h.toString();
        }
    }

    /* renamed from: a */
    public static final long m11340a(String str) {
        C19383o.m32797g(str, "<this>");
        byte[] bytes = str.getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        return (long) bytes.length;
    }

    /* renamed from: b */
    public static final String m11341b(Context context, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (str == null) {
            str = "null";
        }
        if (C19383o.m32792b(str, "null")) {
            return m11342c("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.stringutils.cachefilesuffix", 0);
        String string = sharedPreferences.getString("user_id_key", (String) null);
        if (string != null && C19383o.m32792b(string, str)) {
            String string2 = sharedPreferences.getString("user_id_hash_value", (String) null);
            if (!(string2 == null || string2.length() == 0)) {
                return m11342c(string2, str2);
            }
            BrazeLogger.m11283e(f11974a, (BrazeLogger.Priority) null, (Throwable) null, C5595a.f11975b, 14);
        }
        BrazeLogger.m11283e(f11974a, BrazeLogger.Priority.V, (Throwable) null, new C5596b(str, str2), 12);
        MessageDigest instance = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        String format = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{new BigInteger(1, instance.digest(bytes))}, 1));
        C19383o.m32796f(format, "format(locale, format, *args)");
        sharedPreferences.edit().putString("user_id_key", str).putString("user_id_hash_value", format).apply();
        return m11342c(format, str2);
    }

    /* renamed from: c */
    public static final String m11342c(String str, String str2) {
        if (str2 == null || C19457k.m33020X0(str2)) {
            return C19383o.m32802l(str, ".");
        }
        return ClassUtils.PACKAGE_SEPARATOR_CHAR + str + ClassUtils.PACKAGE_SEPARATOR_CHAR + str2;
    }

    /* renamed from: d */
    public static final boolean m11343d(String str) {
        return str == null || C19457k.m33020X0(str);
    }
}
