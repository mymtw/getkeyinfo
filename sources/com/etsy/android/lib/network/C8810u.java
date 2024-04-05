package com.etsy.android.lib.network;

import android.util.Base64;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8890e0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.text.C19446a;
import kotlin.text.C19459m;
import okhttp3.C19994o;
import okhttp3.C19997p;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import p409o9.C13135n;
import p568fn.C17782b;
import p628nj.C18263b;
import p739dr.C19006f;
import p753kq.C19857l;
import p756lr.C19893f;

/* renamed from: com.etsy.android.lib.network.u */
public final class C8810u implements C20000q {

    /* renamed from: e */
    public static final byte[] f19356e = new byte[0];

    /* renamed from: f */
    public static final List<String> f19357f = C17782b.m29865e0("authorization", "x-etsy-device");

    /* renamed from: b */
    public final C13135n f19358b;

    /* renamed from: c */
    public final C8890e0 f19359c;

    /* renamed from: d */
    public final C8618c f19360d;

    /* renamed from: com.etsy.android.lib.network.u$a */
    public static final class C8811a {
    }

    static {
        new C8811a();
    }

    public C8810u(C13135n nVar, C8890e0 e0Var, C8618c cVar) {
        C19383o.m32797g(nVar, "secrets");
        C19383o.m32797g(e0Var, "systemTime");
        C19383o.m32797g(cVar, "configMap");
        this.f19358b = nVar;
        this.f19359c = e0Var;
        this.f19360d = cVar;
    }

    public final C20018z intercept(C20000q.C20001a aVar) {
        Pair pair;
        String str;
        String str2;
        Throwable th;
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        if (!this.f19360d.mo21132b(C8592b.f18820p1)) {
            return fVar.mo70453a(uVar);
        }
        C19383o.m32797g(uVar, "<this>");
        this.f19359c.getClass();
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        C20016y yVar = uVar.f44345e;
        if (yVar == null || yVar.mo72943a() == 0) {
            pair = new Pair(f19356e, Boolean.TRUE);
        } else if (yVar.mo72943a() == -1) {
            pair = new Pair(f19356e, Boolean.FALSE);
        } else {
            try {
                C19893f fVar2 = new C19893f();
                try {
                    yVar.mo72945c(fVar2);
                    Pair pair2 = new Pair(fVar2.mo72732d0(), Boolean.TRUE);
                    C19421p.m32917E(fVar2, (Throwable) null);
                    pair = pair2;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    C19421p.m32917E(fVar2, th);
                    throw th3;
                }
            } catch (Exception unused) {
                pair = new Pair(f19356e, Boolean.FALSE);
            }
        }
        boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
        byte[] digest = MessageDigest.getInstance("SHA-256").digest((byte[]) pair.component1());
        C19383o.m32796f(digest, "bytes");
        String encodeToString = Base64.encodeToString(digest, 0);
        C19383o.m32796f(encodeToString, "encodeToString(this, flags)");
        Pair pair3 = new Pair(C19459m.m33035H1(encodeToString).toString(), Boolean.valueOf(booleanValue));
        String str3 = (String) pair3.component1();
        boolean booleanValue2 = ((Boolean) pair3.component2()).booleanValue();
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("host", uVar.f44342b.f44243e);
        String str4 = uVar.f44343c;
        C19997p pVar = uVar.f44342b;
        String b = pVar.mo72965b();
        String lowerCase = str4.toLowerCase(Locale.ROOT);
        C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (pVar.f44246h == null) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            C19997p.C19999b bVar = C19997p.f44238l;
            List<String> list = pVar.f44246h;
            bVar.getClass();
            C19997p.C19999b.m34238g(list, sb);
            str = sb.toString();
        }
        if (C18263b.m30839d0(str)) {
            str2 = lowerCase + ' ' + b + RFC1522Codec.SEP + str;
        } else {
            str2 = lowerCase + ' ' + b;
        }
        pairArr[1] = new Pair("target", str2);
        pairArr[2] = new Pair(ResponseConstants.TIMESTAMP, Long.valueOf(currentTimeMillis));
        pairArr[3] = new Pair(ResponseConstants.VERSION, 1);
        pairArr[4] = new Pair("digest", str3);
        pairArr[5] = new Pair("key-id", this.f19358b.f28885a);
        Map s0 = C19294b0.m32562s0(pairArr);
        C19994o oVar = uVar.f44344d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String next : f19357f) {
            String a = oVar.mo72948a(next);
            if (a != null) {
                linkedHashMap.put(next, a);
            }
        }
        TreeMap treeMap = new TreeMap(C19294b0.m32564u0(s0, linkedHashMap));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C19421p.m32930T(treeMap.size()));
        for (Map.Entry entry : treeMap.entrySet()) {
            String str5 = (String) entry.getKey();
            C19383o.m32796f(str5, "key");
            String lowerCase2 = str5.toLowerCase(Locale.ROOT);
            C19383o.m32796f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            linkedHashMap2.put(lowerCase2, entry.getValue());
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList.add(((String) entry2.getKey()) + ':' + entry2.getValue());
        }
        String Z0 = C19327t.m32644Z0(arrayList, "\n", (String) null, (String) null, (C19857l) null, 62);
        String str6 = this.f19358b.f28886b;
        Charset charset = C19446a.f43373b;
        byte[] bytes = str6.getBytes(charset);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(secretKeySpec);
        byte[] bytes2 = Z0.getBytes(charset);
        C19383o.m32796f(bytes2, "this as java.lang.String).getBytes(charset)");
        instance.update(bytes2);
        byte[] doFinal = instance.doFinal();
        C19383o.m32796f(doFinal, "hmac.doFinal()");
        String encodeToString2 = Base64.encodeToString(doFinal, 0);
        C19383o.m32796f(encodeToString2, "encodeToString(this, flags)");
        String obj = C19459m.m33035H1(encodeToString2).toString();
        Pair pair4 = new Pair("key-id=" + this.f19358b.f28885a + ", version=" + 1 + ", timestamp=" + currentTimeMillis + ", signature=" + obj, Boolean.valueOf(booleanValue2));
        boolean booleanValue3 = ((Boolean) pair4.component2()).booleanValue();
        C20011u.C20012a aVar2 = new C20011u.C20012a(uVar);
        aVar2.mo72998a("x-etsy-signature", (String) pair4.component1());
        aVar2.mo72998a("x-etsy-signed-body", String.valueOf(booleanValue3));
        return fVar.mo70453a(aVar2.mo72999b());
    }
}
