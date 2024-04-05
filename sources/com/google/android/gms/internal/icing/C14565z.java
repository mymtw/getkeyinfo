package com.google.android.gms.internal.icing;

import androidx.compose.p015ui.text.input.C1993m;
import com.google.android.gms.internal.icing.C14562y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.icing.z */
public final class C14565z<T extends C14562y<T>> {

    /* renamed from: c */
    public static final /* synthetic */ int f32728c = 0;

    /* renamed from: a */
    public final C14532o1 f32729a;

    /* renamed from: b */
    public boolean f32730b;

    static {
        new C14565z(0);
    }

    public C14565z() {
        this.f32729a = new C14532o1(16);
    }

    /* renamed from: b */
    public static final void m23229b(T t, Object obj) {
        boolean z;
        zzfs zzb = t.zzb();
        Charset charset = C14515k0.f32655a;
        obj.getClass();
        zzfs zzfs = zzfs.DOUBLE;
        zzft zzft = zzft.INT;
        switch (zzb.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzcf) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof C14480b1) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().zza(), obj.getClass().getName()}));
    }

    /* renamed from: a */
    public final void mo49961a(T t, Object obj) {
        if (!t.zzc()) {
            m23229b(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m23229b(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f32729a.put(t, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        C14565z zVar = new C14565z();
        for (int i = 0; i < this.f32729a.f32711c.size(); i++) {
            Map.Entry entry = this.f32729a.f32711c.get(i);
            zVar.mo49961a((C14562y) entry.getKey(), entry.getValue());
        }
        C14532o1 o1Var = this.f32729a;
        for (Map.Entry entry2 : o1Var.f32712d.isEmpty() ? C1993m.f4505t : o1Var.f32712d.entrySet()) {
            zVar.mo49961a((C14562y) entry2.getKey(), entry2.getValue());
        }
        return zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14565z)) {
            return false;
        }
        return this.f32729a.equals(((C14565z) obj).f32729a);
    }

    public final int hashCode() {
        return this.f32729a.hashCode();
    }

    public C14565z(int i) {
        C14532o1 o1Var = new C14532o1(0);
        this.f32729a = o1Var;
        if (!this.f32730b) {
            o1Var.mo49858a();
            this.f32730b = true;
        }
        if (!this.f32730b) {
            o1Var.mo49858a();
            this.f32730b = true;
        }
    }
}
