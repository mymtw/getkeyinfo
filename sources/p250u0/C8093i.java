package p250u0;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: u0.i */
public final class C8093i {

    /* renamed from: a */
    public final String f17635a;

    /* renamed from: b */
    public CharSequence f17636b;

    /* renamed from: c */
    public String f17637c;

    /* renamed from: d */
    public List<C8092h> f17638d;

    public C8093i(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    /* renamed from: a */
    public final ArrayList mo20682a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.f17635a.equals(notificationChannel.getGroup())) {
                arrayList.add(new C8092h(notificationChannel));
            }
        }
        return arrayList;
    }

    public C8093i(NotificationChannelGroup notificationChannelGroup, List<NotificationChannel> list) {
        String id = notificationChannelGroup.getId();
        this.f17638d = Collections.emptyList();
        id.getClass();
        this.f17635a = id;
        this.f17636b = notificationChannelGroup.getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f17637c = notificationChannelGroup.getDescription();
        }
        if (i >= 28) {
            notificationChannelGroup.isBlocked();
            this.f17638d = mo20682a(notificationChannelGroup.getChannels());
            return;
        }
        this.f17638d = mo20682a(list);
    }
}
