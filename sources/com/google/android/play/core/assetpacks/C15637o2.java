package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.o2 */
public abstract class C15637o2 {
    /* renamed from: a */
    public abstract int mo55423a();

    /* renamed from: b */
    public abstract long mo55424b();

    /* renamed from: c */
    public abstract String mo55425c();

    /* renamed from: d */
    public abstract boolean mo55426d();

    /* renamed from: e */
    public abstract boolean mo55427e();

    /* renamed from: f */
    public abstract byte[] mo55429f();

    /* renamed from: g */
    public final boolean mo55476g() {
        if (mo55425c() == null) {
            return false;
        }
        return mo55425c().endsWith("/");
    }
}
