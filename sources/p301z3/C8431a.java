package p301z3;

import android.support.p013v4.media.C0072d;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.enums.BrazePushEventType;
import kotlin.jvm.internal.C19383o;

/* renamed from: z3.a */
public final class C8431a {

    /* renamed from: a */
    public final BrazePushEventType f18444a;

    /* renamed from: b */
    public final BrazeNotificationPayload f18445b;

    public C8431a(BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload) {
        C19383o.m32797g(brazeNotificationPayload, "notificationPayload");
        this.f18444a = brazePushEventType;
        this.f18445b = brazeNotificationPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8431a)) {
            return false;
        }
        C8431a aVar = (C8431a) obj;
        return this.f18444a == aVar.f18444a && C19383o.m32792b(this.f18445b, aVar.f18445b);
    }

    public final int hashCode() {
        return this.f18445b.hashCode() + (this.f18444a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BrazePushEvent(eventType=");
        h.append(this.f18444a);
        h.append(", notificationPayload=");
        h.append(this.f18445b);
        h.append(')');
        return h.toString();
    }
}
