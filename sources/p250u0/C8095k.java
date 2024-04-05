package p250u0;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: u0.k */
public final class C8095k extends C8105q {

    /* renamed from: e */
    public Bitmap f17649e;

    /* renamed from: f */
    public IconCompat f17650f;

    /* renamed from: g */
    public boolean f17651g;

    /* renamed from: u0.k$a */
    public static class C8096a {
        /* renamed from: a */
        public static void m16279a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }

        /* renamed from: b */
        public static void m16280b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setSummaryText(charSequence);
        }
    }

    /* renamed from: u0.k$b */
    public static class C8097b {
        /* renamed from: a */
        public static void m16281a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* renamed from: u0.k$c */
    public static class C8098c {
        /* renamed from: a */
        public static void m16282a(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    /* renamed from: b */
    public final void mo20684b(C8106r rVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(rVar.f17697b).setBigContentTitle(this.f17693b).bigPicture(this.f17649e);
        if (this.f17651g) {
            IconCompat iconCompat = this.f17650f;
            if (iconCompat == null) {
                C8096a.m16279a(bigPicture, (Bitmap) null);
            } else {
                C8097b.m16281a(bigPicture, iconCompat.mo8750g(rVar.f17696a));
            }
        }
        if (this.f17695d) {
            C8096a.m16280b(bigPicture, this.f17694c);
        }
        if (i >= 31) {
            C8098c.m16282a(bigPicture, false);
        }
    }

    /* renamed from: c */
    public final String mo20685c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
