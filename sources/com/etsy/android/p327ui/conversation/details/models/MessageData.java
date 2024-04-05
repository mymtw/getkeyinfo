package com.etsy.android.p327ui.conversation.details.models;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.conversation.details.models.MessageData */
public final class MessageData {

    /* renamed from: a */
    public final Long f21210a;

    /* renamed from: b */
    public final Long f21211b;

    /* renamed from: c */
    public final List<Message> f21212c;

    public MessageData(@C17402n(name = "older_cursor") Long l, @C17402n(name = "newer_cursor") Long l2, @C17402n(name = "messages") List<Message> list) {
        C19383o.m32797g(list, ResponseConstants.MESSAGES);
        this.f21210a = l;
        this.f21211b = l2;
        this.f21212c = list;
    }

    public final MessageData copy(@C17402n(name = "older_cursor") Long l, @C17402n(name = "newer_cursor") Long l2, @C17402n(name = "messages") List<Message> list) {
        C19383o.m32797g(list, ResponseConstants.MESSAGES);
        return new MessageData(l, l2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageData)) {
            return false;
        }
        MessageData messageData = (MessageData) obj;
        return C19383o.m32792b(this.f21210a, messageData.f21210a) && C19383o.m32792b(this.f21211b, messageData.f21211b) && C19383o.m32792b(this.f21212c, messageData.f21212c);
    }

    public final int hashCode() {
        Long l = this.f21210a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f21211b;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return this.f21212c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MessageData(olderCursor=");
        h.append(this.f21210a);
        h.append(", newerCursor=");
        h.append(this.f21211b);
        h.append(", messages=");
        return C0070b.m186i(h, this.f21212c, ')');
    }
}
