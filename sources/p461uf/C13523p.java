package p461uf;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;
import p469vf.C13791d;

/* renamed from: uf.p */
public final class C13523p {

    /* renamed from: a */
    public static final String f29584a = C13523p.class.getSimpleName();

    /* renamed from: b */
    public static SharedPreferences f29585b;

    /* renamed from: c */
    public static final AtomicBoolean f29586c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final ConcurrentHashMap<String, String> f29587d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final ConcurrentHashMap<String, String> f29588e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final C13523p f29589f = new C13523p();

    /* renamed from: a */
    public final HashMap mo46182a() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            C13791d.f30352e.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = C13791d.m21342a().iterator();
            while (it.hasNext()) {
                hashSet.add(((C13791d) it.next()).mo46654b());
            }
            for (String next : f29588e.keySet()) {
                if (hashSet.contains(next)) {
                    hashMap.put(next, f29588e.get(next));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo46183b() {
        if (!C13080a.m20762b(this)) {
            try {
                AtomicBoolean atomicBoolean = f29586c;
                if (!atomicBoolean.get()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C13418j.m21106b());
                    C19383o.m32796f(defaultSharedPreferences, "PreferenceManager.getDef….getApplicationContext())");
                    f29585b = defaultSharedPreferences;
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferences = f29585b;
                    if (sharedPreferences != null) {
                        String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                        if (string2 == null) {
                            string2 = "";
                        }
                        f29587d.putAll(C12869i0.m20549E(string));
                        f29588e.putAll(C12869i0.m20549E(string2));
                        atomicBoolean.set(true);
                        return;
                    }
                    C19383o.m32805o("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final String mo46184c(String str, String str2) {
        String str3;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i > length) {
                    break;
                }
                boolean z2 = C19383o.m32799i(str2.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str2.subSequence(i, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (C19383o.m32792b("em", str)) {
                    if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        return lowerCase;
                    }
                    Log.e(f29584a, "Setting email failure: this is not a valid email address");
                    return "";
                } else if (C19383o.m32792b("ph", str)) {
                    return new Regex("[^0-9]").replace((CharSequence) lowerCase, "");
                } else {
                    if (!C19383o.m32792b("ge", str)) {
                        return lowerCase;
                    }
                    if (lowerCase.length() > 0) {
                        str3 = lowerCase.substring(0, 1);
                        C19383o.m32796f(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        str3 = "";
                    }
                    if (!C19383o.m32792b("f", str3)) {
                        if (!C19383o.m32792b("m", str3)) {
                            Log.e(f29584a, "Setting gender failure: the supported value for gender is f or m");
                            return "";
                        }
                    }
                    return str3;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
