package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b7 */
public final class C14589b7 implements C14757o6 {

    /* renamed from: a */
    public final C14796r6 f32757a;

    /* renamed from: b */
    public final String f32758b;

    /* renamed from: c */
    public final Object[] f32759c;

    /* renamed from: d */
    public final int f32760d;

    public C14589b7(C14819t5 t5Var, String str, Object[] objArr) {
        this.f32757a = t5Var;
        this.f32758b = str;
        this.f32759c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f32760d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.f32760d = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String mo50387a() {
        return this.f32758b;
    }

    /* renamed from: b */
    public final Object[] mo50388b() {
        return this.f32759c;
    }

    public final C14796r6 zza() {
        return this.f32757a;
    }

    public final boolean zzb() {
        return (this.f32760d & 2) == 2;
    }

    public final int zzc() {
        return (this.f32760d & 1) == 1 ? 1 : 2;
    }
}
