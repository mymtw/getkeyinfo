package p250u0;

import android.app.Notification;
import android.os.Bundle;

/* renamed from: u0.l */
public final class C8099l extends C8105q {

    /* renamed from: e */
    public CharSequence f17652e;

    /* renamed from: a */
    public final void mo20686a(Bundle bundle) {
        super.mo20686a(bundle);
    }

    /* renamed from: b */
    public final void mo20684b(C8106r rVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(rVar.f17697b).setBigContentTitle(this.f17693b).bigText(this.f17652e);
        if (this.f17695d) {
            bigText.setSummaryText(this.f17694c);
        }
    }

    /* renamed from: c */
    public final String mo20685c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* renamed from: h */
    public final void mo20687h(CharSequence charSequence) {
        this.f17652e = C8100m.m16287c(charSequence);
    }
}
