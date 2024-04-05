package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.font.C1962p;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C19543e0;
import p010a9.C0048b;
import p514bk.C14088a;
import p568fn.C17782b;

/* renamed from: com.google.android.gms.measurement.internal.j2 */
public final class C15004j2 {

    /* renamed from: b */
    public static final AtomicReference<String[]> f33590b = new AtomicReference<>();

    /* renamed from: c */
    public static final AtomicReference<String[]> f33591c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<String[]> f33592d = new AtomicReference<>();

    /* renamed from: a */
    public final C1962p f33593a;

    public C15004j2(C1962p pVar) {
        this.f33593a = pVar;
    }

    /* renamed from: g */
    public static final String m24426g(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C15018k7.m24472U(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String mo52139a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder h = C0072d.m201h("[");
        for (Bundle bundle : objArr) {
            String b = bundle instanceof Bundle ? mo52140b(bundle) : String.valueOf(bundle);
            if (b != null) {
                if (h.length() != 1) {
                    h.append(", ");
                }
                h.append(b);
            }
        }
        h.append("]");
        return h.toString();
    }

    /* renamed from: b */
    public final String mo52140b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f33593a.mo7583b()) {
            return bundle.toString();
        }
        StringBuilder h = C0072d.m201h("Bundle[{");
        for (String next : bundle.keySet()) {
            if (h.length() != 8) {
                h.append(", ");
            }
            h.append(mo52143e(next));
            h.append("=");
            Object obj = bundle.get(next);
            h.append(obj instanceof Bundle ? mo52139a(new Object[]{obj}) : obj instanceof Object[] ? mo52139a((Object[]) obj) : obj instanceof ArrayList ? mo52139a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        h.append("}]");
        return h.toString();
    }

    /* renamed from: c */
    public final String mo52141c(zzat zzat) {
        if (!this.f33593a.mo7583b()) {
            return zzat.toString();
        }
        StringBuilder h = C0072d.m201h("origin=");
        h.append(zzat.zzc);
        h.append(",name=");
        h.append(mo52142d(zzat.zza));
        h.append(",params=");
        zzar zzar = zzat.zzb;
        h.append(zzar == null ? null : !this.f33593a.mo7583b() ? zzar.toString() : mo52140b(zzar.zzc()));
        return h.toString();
    }

    /* renamed from: d */
    public final String mo52142d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f33593a.mo7583b() ? str : m24426g(str, C17782b.f38640k, C17782b.f38638i, f33590b);
    }

    /* renamed from: e */
    public final String mo52143e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f33593a.mo7583b() ? str : m24426g(str, C14088a.f31029j, C14088a.f31028i, f33591c);
    }

    /* renamed from: f */
    public final String mo52144f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f33593a.mo7583b() ? str : str.startsWith("_exp_") ? C0048b.m163a("experiment_id(", str, ")") : m24426g(str, C19543e0.f43495h, C19543e0.f43494g, f33592d);
    }
}
