package com.etsy.android.p327ui.conversation.details.legacy;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.details.models.MessageSource;
import com.etsy.android.p327ui.conversation.models.MessageType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;
import p003a2.C0023f;
import p354gc.C12767e;
import p354gc.C12775i;
import p354gc.C12778k;
import p354gc.C12783l;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyDraftMessage */
public final class LegacyDraftMessage {

    /* renamed from: a */
    public long f21152a;

    /* renamed from: b */
    public String f21153b;

    /* renamed from: c */
    public String f21154c;

    /* renamed from: d */
    public final boolean f21155d;

    /* renamed from: e */
    public int f21156e;

    /* renamed from: f */
    public int f21157f;

    /* renamed from: g */
    public Status f21158g;

    /* renamed from: h */
    public long f21159h;

    /* renamed from: i */
    public List<? extends File> f21160i;

    /* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyDraftMessage$Status */
    public enum Status {
        IN_DRAFT(R.string.convo_status_draft),
        SENDING(R.string.convo_status_sending),
        FAILED(R.string.convo_status_failed);
        
        private int resId;

        private Status(int i) {
            this.resId = i;
        }

        public final int getResId() {
            return this.resId;
        }

        public final void setResId(int i) {
            this.resId = i;
        }
    }

    public LegacyDraftMessage(long j, String str, String str2, boolean z, int i, int i2, Status status, long j2, List<? extends File> list) {
        C19383o.m32797g(status, ResponseConstants.STATUS);
        C19383o.m32797g(list, "imageAttachments");
        this.f21152a = j;
        this.f21153b = str;
        this.f21154c = str2;
        this.f21155d = z;
        this.f21156e = i;
        this.f21157f = i2;
        this.f21158g = status;
        this.f21159h = j2;
        this.f21160i = list;
    }

    /* renamed from: a */
    public final C12778k.C12779a mo32136a() {
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(this.f21153b);
        long j = this.f21152a;
        C12775i Q = C18263b.m30822Q(C18263b.m30826U(this.f21153b));
        List d0 = Q != null ? C17782b.m29864d0(Q) : null;
        C19383o.m32796f(unescapeHtml4, "unescapeHtml4(message)");
        return new C12778k.C12779a(new C12767e.C12769b(new C12783l(unescapeHtml4, j, 0, 0, (MessageType) null, 0, 0, (String) null, 0, (String) null, false, (ArrayList) null, d0, (MessageSource) null, (String) null, 28656)), EmptyList.INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDraftMessage)) {
            return false;
        }
        LegacyDraftMessage legacyDraftMessage = (LegacyDraftMessage) obj;
        return this.f21152a == legacyDraftMessage.f21152a && C19383o.m32792b(this.f21153b, legacyDraftMessage.f21153b) && C19383o.m32792b(this.f21154c, legacyDraftMessage.f21154c) && this.f21155d == legacyDraftMessage.f21155d && this.f21156e == legacyDraftMessage.f21156e && this.f21157f == legacyDraftMessage.f21157f && this.f21158g == legacyDraftMessage.f21158g && this.f21159h == legacyDraftMessage.f21159h && C19383o.m32792b(this.f21160i, legacyDraftMessage.f21160i);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f21153b, Long.hashCode(this.f21152a) * 31, 31);
        String str = this.f21154c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f21155d;
        if (z) {
            z = true;
        }
        return this.f21160i.hashCode() + C0071c.m190b(this.f21159h, (this.f21158g.hashCode() + C0069a.m170a(this.f21157f, C0069a.m170a(this.f21156e, (hashCode + (z ? 1 : 0)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LegacyDraftMessage(conversationId=");
        h.append(this.f21152a);
        h.append(", message=");
        h.append(this.f21153b);
        h.append(", userName=");
        h.append(this.f21154c);
        h.append(", hasAttachment=");
        h.append(this.f21155d);
        h.append(", cursorStartPosition=");
        h.append(this.f21156e);
        h.append(", cursorEndPosition=");
        h.append(this.f21157f);
        h.append(", status=");
        h.append(this.f21158g);
        h.append(", _creationDate=");
        h.append(this.f21159h);
        h.append(", imageAttachments=");
        return C0070b.m186i(h, this.f21160i, ')');
    }
}
