package com.etsy.android.p327ui.conversation.details.models;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.conversation.details.models.DraftMessage */
public final class DraftMessage {

    /* renamed from: a */
    public long f21175a;

    /* renamed from: b */
    public long f21176b;

    /* renamed from: c */
    public long f21177c;

    /* renamed from: d */
    public String f21178d;

    /* renamed from: e */
    public Status f21179e;

    /* renamed from: f */
    public long f21180f;

    /* renamed from: g */
    public List<? extends File> f21181g;

    /* renamed from: com.etsy.android.ui.conversation.details.models.DraftMessage$Status */
    public enum Status {
        IN_DRAFT,
        SENDING,
        FAILED
    }

    public DraftMessage() {
        this((Object) null);
    }

    public DraftMessage(Object obj) {
        Status status = Status.IN_DRAFT;
        C19383o.m32797g(status, ResponseConstants.STATUS);
        this.f21175a = 0;
        this.f21176b = 0;
        this.f21177c = 0;
        this.f21178d = "";
        this.f21179e = status;
        this.f21180f = 0;
        this.f21181g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftMessage)) {
            return false;
        }
        DraftMessage draftMessage = (DraftMessage) obj;
        return this.f21175a == draftMessage.f21175a && this.f21176b == draftMessage.f21176b && this.f21177c == draftMessage.f21177c && C19383o.m32792b(this.f21178d, draftMessage.f21178d) && this.f21179e == draftMessage.f21179e && this.f21180f == draftMessage.f21180f && C19383o.m32792b(this.f21181g, draftMessage.f21181g);
    }

    public final int hashCode() {
        int b = C0071c.m190b(this.f21180f, (this.f21179e.hashCode() + C0023f.m105e(this.f21178d, C0071c.m190b(this.f21177c, C0071c.m190b(this.f21176b, Long.hashCode(this.f21175a) * 31, 31), 31), 31)) * 31, 31);
        List<? extends File> list = this.f21181g;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DraftMessage(messageId=");
        h.append(this.f21175a);
        h.append(", conversationId=");
        h.append(this.f21176b);
        h.append(", recipientUserId=");
        h.append(this.f21177c);
        h.append(", text=");
        h.append(this.f21178d);
        h.append(", status=");
        h.append(this.f21179e);
        h.append(", sendAttemptDate=");
        h.append(this.f21180f);
        h.append(", imageAttachments=");
        return C0070b.m186i(h, this.f21181g, ')');
    }
}
