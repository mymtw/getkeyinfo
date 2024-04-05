package com.google.android.play.core.appupdate;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.appupdate.a */
public final class C15559a {

    /* renamed from: a */
    public final int f35007a;

    /* renamed from: b */
    public final int f35008b;

    /* renamed from: c */
    public final int f35009c;

    /* renamed from: d */
    public final long f35010d;

    /* renamed from: e */
    public final long f35011e;

    /* renamed from: f */
    public final PendingIntent f35012f;

    /* renamed from: g */
    public final PendingIntent f35013g;

    /* renamed from: h */
    public final PendingIntent f35014h;

    /* renamed from: i */
    public final PendingIntent f35015i;

    /* renamed from: j */
    public boolean f35016j = false;

    public C15559a(int i, int i2, int i3, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f35007a = i;
        this.f35008b = i2;
        this.f35009c = i3;
        this.f35010d = j;
        this.f35011e = j2;
        this.f35012f = pendingIntent;
        this.f35013g = pendingIntent2;
        this.f35014h = pendingIntent3;
        this.f35015i = pendingIntent4;
    }

    /* renamed from: a */
    public final PendingIntent mo55333a(C15577s sVar) {
        int i = sVar.f35058a;
        boolean z = false;
        if (i == 0) {
            PendingIntent pendingIntent = this.f35013g;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (sVar.f35059b && this.f35010d <= this.f35011e) {
                z = true;
            }
            if (z) {
                return this.f35015i;
            }
            return null;
        }
        if (i == 1) {
            PendingIntent pendingIntent2 = this.f35012f;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (sVar.f35059b && this.f35010d <= this.f35011e) {
                z = true;
            }
            if (z) {
                return this.f35014h;
            }
        }
        return null;
    }
}
