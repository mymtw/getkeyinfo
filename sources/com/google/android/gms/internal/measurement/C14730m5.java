package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C14717l5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
public final class C14730m5<T extends C14717l5<T>> {

    /* renamed from: c */
    public static final /* synthetic */ int f32951c = 0;

    /* renamed from: a */
    public final C14628e7 f32952a;

    /* renamed from: b */
    public boolean f32953b;

    static {
        new C14730m5(0);
    }

    public C14730m5() {
        this.f32952a = new C14628e7(16);
    }

    /* renamed from: b */
    public static final void m23736b(T t, Object obj) {
        boolean z;
        zzmr zzb = t.zzb();
        Charset charset = C14575a6.f32740a;
        obj.getClass();
        zzmr zzmr = zzmr.DOUBLE;
        zzms zzms = zzms.INT;
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
                if ((obj instanceof zzix) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof C14796r6) {
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
    public final void mo50681a(T t, Object obj) {
        if (!t.zzc()) {
            m23736b(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m23736b(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f32952a.put(t, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        C14730m5 m5Var = new C14730m5();
        for (int i = 0; i < this.f32952a.f32914c.size(); i++) {
            Map.Entry entry = this.f32952a.f32914c.get(i);
            m5Var.mo50681a((C14717l5) entry.getKey(), entry.getValue());
        }
        C14628e7 e7Var = this.f32952a;
        for (Map.Entry entry2 : e7Var.f32915d.isEmpty() ? C14794r4.f33069b : e7Var.f32915d.entrySet()) {
            m5Var.mo50681a((C14717l5) entry2.getKey(), entry2.getValue());
        }
        return m5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14730m5)) {
            return false;
        }
        return this.f32952a.equals(((C14730m5) obj).f32952a);
    }

    public final int hashCode() {
        return this.f32952a.hashCode();
    }

    public C14730m5(int i) {
        C14628e7 e7Var = new C14628e7(0);
        this.f32952a = e7Var;
        if (!this.f32953b) {
            e7Var.mo50477a();
            this.f32953b = true;
        }
        if (!this.f32953b) {
            e7Var.mo50477a();
            this.f32953b = true;
        }
    }
}
