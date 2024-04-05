package com.etsy.android.p327ui.user;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.b0 */
public final class C11489b0 {

    /* renamed from: a */
    public final int f25343a;

    /* renamed from: b */
    public final SettingType f25344b;

    /* renamed from: c */
    public final boolean f25345c;

    /* renamed from: d */
    public final boolean f25346d;

    /* renamed from: e */
    public final boolean f25347e;

    /* renamed from: f */
    public final int f25348f;

    public C11489b0(int i, SettingType settingType, int i2, int i3) {
        boolean z = true;
        boolean z2 = (i3 & 4) != 0;
        z = (i3 & 16) == 0 ? false : z;
        i2 = (i3 & 32) != 0 ? -1 : i2;
        C19383o.m32797g(settingType, "type");
        this.f25343a = i;
        this.f25344b = settingType;
        this.f25345c = z2;
        this.f25346d = false;
        this.f25347e = z;
        this.f25348f = i2;
    }
}
