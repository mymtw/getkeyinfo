package androidx.work;

import android.app.Notification;

/* renamed from: androidx.work.f */
public final class C3382f {

    /* renamed from: a */
    public final int f7901a;

    /* renamed from: b */
    public final int f7902b;

    /* renamed from: c */
    public final Notification f7903c;

    public C3382f(int i, int i2, Notification notification) {
        this.f7901a = i;
        this.f7903c = notification;
        this.f7902b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3382f.class != obj.getClass()) {
            return false;
        }
        C3382f fVar = (C3382f) obj;
        if (this.f7901a == fVar.f7901a && this.f7902b == fVar.f7902b) {
            return this.f7903c.equals(fVar.f7903c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7903c.hashCode() + (((this.f7901a * 31) + this.f7902b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f7901a + ", mForegroundServiceType=" + this.f7902b + ", mNotification=" + this.f7903c + '}';
    }
}
