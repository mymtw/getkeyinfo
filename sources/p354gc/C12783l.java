package p354gc;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.conversation.details.models.MessageSource;
import com.etsy.android.p327ui.conversation.models.MessageType;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

/* renamed from: gc.l */
public final class C12783l {

    /* renamed from: a */
    public final String f28244a;

    /* renamed from: b */
    public final long f28245b;

    /* renamed from: c */
    public final long f28246c;

    /* renamed from: d */
    public final long f28247d;

    /* renamed from: e */
    public final MessageType f28248e;

    /* renamed from: f */
    public final long f28249f;

    /* renamed from: g */
    public final int f28250g;

    /* renamed from: h */
    public final String f28251h;

    /* renamed from: i */
    public final long f28252i;

    /* renamed from: j */
    public String f28253j;

    /* renamed from: k */
    public boolean f28254k;

    /* renamed from: l */
    public final List<C12774h> f28255l;

    /* renamed from: m */
    public final List<C12775i> f28256m;

    /* renamed from: n */
    public final MessageSource f28257n;

    /* renamed from: o */
    public final String f28258o;

    public C12783l() {
        throw null;
    }

    public C12783l(String str, long j, long j2, long j3, MessageType messageType, long j4, int i, String str2, long j5, String str3, boolean z, ArrayList arrayList, List list, MessageSource messageSource, String str4, int i2) {
        int i3 = i2;
        MessageType messageType2 = (i3 & 16) != 0 ? MessageType.USER : messageType;
        long j6 = 0;
        long j7 = (i3 & 32) != 0 ? 0 : j4;
        boolean z2 = false;
        int i4 = (i3 & 64) != 0 ? 0 : i;
        String str5 = (i3 & 128) != 0 ? "" : str2;
        j6 = (i3 & 256) == 0 ? j5 : j6;
        String str6 = null;
        String str7 = (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : str3;
        z2 = (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) == 0 ? z : z2;
        List<C12774h> list2 = (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? EmptyList.INSTANCE : arrayList;
        List list3 = (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : list;
        MessageSource messageSource2 = (i3 & 8192) != 0 ? MessageSource.NONE : messageSource;
        str6 = (i3 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) == 0 ? str4 : str6;
        C19383o.m32797g(messageType2, "messageType");
        C19383o.m32797g(str5, "language");
        C19383o.m32797g(list2, "images");
        C19383o.m32797g(messageSource2, "messageSource");
        this.f28244a = str;
        this.f28245b = j;
        this.f28246c = j2;
        this.f28247d = j3;
        this.f28248e = messageType2;
        this.f28249f = j7;
        this.f28250g = i4;
        this.f28251h = str5;
        this.f28252i = j6;
        this.f28253j = str7;
        this.f28254k = z2;
        this.f28255l = list2;
        this.f28256m = list3;
        this.f28257n = messageSource2;
        this.f28258o = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12783l)) {
            return false;
        }
        C12783l lVar = (C12783l) obj;
        return C19383o.m32792b(this.f28244a, lVar.f28244a) && this.f28245b == lVar.f28245b && this.f28246c == lVar.f28246c && this.f28247d == lVar.f28247d && this.f28248e == lVar.f28248e && this.f28249f == lVar.f28249f && this.f28250g == lVar.f28250g && C19383o.m32792b(this.f28251h, lVar.f28251h) && this.f28252i == lVar.f28252i && C19383o.m32792b(this.f28253j, lVar.f28253j) && this.f28254k == lVar.f28254k && C19383o.m32792b(this.f28255l, lVar.f28255l) && C19383o.m32792b(this.f28256m, lVar.f28256m) && this.f28257n == lVar.f28257n && C19383o.m32792b(this.f28258o, lVar.f28258o);
    }

    public final int hashCode() {
        int b = C0071c.m190b(this.f28252i, C0023f.m105e(this.f28251h, C0069a.m170a(this.f28250g, C0071c.m190b(this.f28249f, (this.f28248e.hashCode() + C0071c.m190b(this.f28247d, C0071c.m190b(this.f28246c, C0071c.m190b(this.f28245b, this.f28244a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31), 31), 31);
        String str = this.f28253j;
        int i = 0;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f28254k;
        if (z) {
            z = true;
        }
        int g = C13983i.m21488g(this.f28255l, (hashCode + (z ? 1 : 0)) * 31, 31);
        List<C12775i> list = this.f28256m;
        int hashCode2 = (this.f28257n.hashCode() + ((g + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str2 = this.f28258o;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MessageUiModel(text=");
        h.append(this.f28244a);
        h.append(", conversationId=");
        h.append(this.f28245b);
        h.append(", messageId=");
        h.append(this.f28246c);
        h.append(", senderUserId=");
        h.append(this.f28247d);
        h.append(", messageType=");
        h.append(this.f28248e);
        h.append(", sortKey=");
        h.append(this.f28249f);
        h.append(", messageOrder=");
        h.append(this.f28250g);
        h.append(", language=");
        h.append(this.f28251h);
        h.append(", creationDateInMillis=");
        h.append(this.f28252i);
        h.append(", translatedText=");
        h.append(this.f28253j);
        h.append(", hasTranslationError=");
        h.append(this.f28254k);
        h.append(", images=");
        h.append(this.f28255l);
        h.append(", linkCards=");
        h.append(this.f28256m);
        h.append(", messageSource=");
        h.append(this.f28257n);
        h.append(", helpWithOrderRequestUrl=");
        return C0391c.m1057c(h, this.f28258o, ')');
    }
}
