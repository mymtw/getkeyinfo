package p250u0;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: u0.o */
public final class C8102o extends C8105q {

    /* renamed from: e */
    public ArrayList<CharSequence> f17683e = new ArrayList<>();

    /* renamed from: b */
    public final void mo20684b(C8106r rVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(rVar.f17697b).setBigContentTitle(this.f17693b);
        if (this.f17695d) {
            bigContentTitle.setSummaryText(this.f17694c);
        }
        Iterator<CharSequence> it = this.f17683e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    /* renamed from: c */
    public final String mo20685c() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }
}
