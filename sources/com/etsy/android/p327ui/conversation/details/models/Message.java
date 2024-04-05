package com.etsy.android.p327ui.conversation.details.models;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ImageInfo;
import com.etsy.android.lib.models.ListingPartial;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.conversation.details.models.Message */
public final class Message {

    /* renamed from: a */
    public final long f21194a;

    /* renamed from: b */
    public final long f21195b;

    /* renamed from: c */
    public final long f21196c;

    /* renamed from: d */
    public final long f21197d;

    /* renamed from: e */
    public final String f21198e;

    /* renamed from: f */
    public final long f21199f;

    /* renamed from: g */
    public final boolean f21200g;

    /* renamed from: h */
    public final String f21201h;

    /* renamed from: i */
    public final String f21202i;

    /* renamed from: j */
    public final boolean f21203j;

    /* renamed from: k */
    public final int f21204k;

    /* renamed from: l */
    public final List<ListingPartial> f21205l;

    /* renamed from: m */
    public final List<ImageInfo> f21206m;

    /* renamed from: n */
    public final String f21207n;

    /* renamed from: o */
    public final String f21208o;

    /* renamed from: p */
    public final List<Receipt> f21209p;

    public Message(@C17402n(name = "messenger_conversation_id") long j, @C17402n(name = "messenger_conversation_message_id") long j2, @C17402n(name = "create_date") long j3, @C17402n(name = "sort_key_send_date_ms") long j4, @C17402n(name = "message") String str, @C17402n(name = "sender_user_id") long j5, @C17402n(name = "is_sender") boolean z, @C17402n(name = "message_date") String str2, @C17402n(name = "message_display_day") String str3, @C17402n(name = "is_system_message") boolean z2, @C17402n(name = "message_type") int i, @C17402n(name = "listings") List<ListingPartial> list, @C17402n(name = "images") List<ImageInfo> list2, @C17402n(name = "language") String str4, @C17402n(name = "message_source") String str5, @C17402n(name = "receipt") List<Receipt> list3) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        List<ListingPartial> list4 = list;
        List<ImageInfo> list5 = list2;
        String str9 = str4;
        C19383o.m32797g(str6, "text");
        C19383o.m32797g(str7, "messageDate");
        C19383o.m32797g(str8, "messageDisplayDate");
        C19383o.m32797g(list4, "listings");
        C19383o.m32797g(list5, "images");
        C19383o.m32797g(str9, "language");
        this.f21194a = j;
        this.f21195b = j2;
        this.f21196c = j3;
        this.f21197d = j4;
        this.f21198e = str6;
        this.f21199f = j5;
        this.f21200g = z;
        this.f21201h = str7;
        this.f21202i = str8;
        this.f21203j = z2;
        this.f21204k = i;
        this.f21205l = list4;
        this.f21206m = list5;
        this.f21207n = str9;
        this.f21208o = str5;
        this.f21209p = list3;
    }

    public final Message copy(@C17402n(name = "messenger_conversation_id") long j, @C17402n(name = "messenger_conversation_message_id") long j2, @C17402n(name = "create_date") long j3, @C17402n(name = "sort_key_send_date_ms") long j4, @C17402n(name = "message") String str, @C17402n(name = "sender_user_id") long j5, @C17402n(name = "is_sender") boolean z, @C17402n(name = "message_date") String str2, @C17402n(name = "message_display_day") String str3, @C17402n(name = "is_system_message") boolean z2, @C17402n(name = "message_type") int i, @C17402n(name = "listings") List<ListingPartial> list, @C17402n(name = "images") List<ImageInfo> list2, @C17402n(name = "language") String str4, @C17402n(name = "message_source") String str5, @C17402n(name = "receipt") List<Receipt> list3) {
        long j6 = j;
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, "messageDate");
        C19383o.m32797g(str3, "messageDisplayDate");
        C19383o.m32797g(list, "listings");
        C19383o.m32797g(list2, "images");
        C19383o.m32797g(str4, "language");
        return new Message(j, j2, j3, j4, str, j5, z, str2, str3, z2, i, list, list2, str4, str5, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return this.f21194a == message.f21194a && this.f21195b == message.f21195b && this.f21196c == message.f21196c && this.f21197d == message.f21197d && C19383o.m32792b(this.f21198e, message.f21198e) && this.f21199f == message.f21199f && this.f21200g == message.f21200g && C19383o.m32792b(this.f21201h, message.f21201h) && C19383o.m32792b(this.f21202i, message.f21202i) && this.f21203j == message.f21203j && this.f21204k == message.f21204k && C19383o.m32792b(this.f21205l, message.f21205l) && C19383o.m32792b(this.f21206m, message.f21206m) && C19383o.m32792b(this.f21207n, message.f21207n) && C19383o.m32792b(this.f21208o, message.f21208o) && C19383o.m32792b(this.f21209p, message.f21209p);
    }

    public final int hashCode() {
        int b = C0071c.m190b(this.f21199f, C0023f.m105e(this.f21198e, C0071c.m190b(this.f21197d, C0071c.m190b(this.f21196c, C0071c.m190b(this.f21195b, Long.hashCode(this.f21194a) * 31, 31), 31), 31), 31), 31);
        boolean z = this.f21200g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int e = C0023f.m105e(this.f21202i, C0023f.m105e(this.f21201h, (b + (z ? 1 : 0)) * 31, 31), 31);
        boolean z3 = this.f21203j;
        if (!z3) {
            z2 = z3;
        }
        int e2 = C0023f.m105e(this.f21207n, C13983i.m21488g(this.f21206m, C13983i.m21488g(this.f21205l, C0069a.m170a(this.f21204k, (e + (z2 ? 1 : 0)) * 31, 31), 31), 31), 31);
        String str = this.f21208o;
        int i = 0;
        int hashCode = (e2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Receipt> list = this.f21209p;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Message(conversationId=");
        h.append(this.f21194a);
        h.append(", messageId=");
        h.append(this.f21195b);
        h.append(", createDate=");
        h.append(this.f21196c);
        h.append(", sortKey=");
        h.append(this.f21197d);
        h.append(", text=");
        h.append(this.f21198e);
        h.append(", senderUserId=");
        h.append(this.f21199f);
        h.append(", isSender=");
        h.append(this.f21200g);
        h.append(", messageDate=");
        h.append(this.f21201h);
        h.append(", messageDisplayDate=");
        h.append(this.f21202i);
        h.append(", isSystemMessage=");
        h.append(this.f21203j);
        h.append(", messageType=");
        h.append(this.f21204k);
        h.append(", listings=");
        h.append(this.f21205l);
        h.append(", images=");
        h.append(this.f21206m);
        h.append(", language=");
        h.append(this.f21207n);
        h.append(", messageSource=");
        h.append(this.f21208o);
        h.append(", receipt=");
        return C0070b.m186i(h, this.f21209p, ')');
    }
}
