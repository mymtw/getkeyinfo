package p301z3;

import android.support.p013v4.media.C0072d;
import com.appboy.models.cards.Card;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: z3.c */
public final class C8433c {

    /* renamed from: a */
    public final List<Card> f18447a;

    /* renamed from: b */
    public final String f18448b;

    /* renamed from: c */
    public final long f18449c;

    /* renamed from: d */
    public final boolean f18450d;

    public C8433c(List list, String str, boolean z, long j) {
        C19383o.m32797g(list, "contentCards");
        this.f18447a = list;
        this.f18448b = str;
        this.f18449c = j;
        this.f18450d = z;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ContentCardsUpdatedEvent{userId='");
        h.append(this.f18448b);
        h.append("', timestampSeconds=");
        h.append(this.f18449c);
        h.append(", isFromOfflineStorage=");
        h.append(this.f18450d);
        h.append(", card count=");
        h.append(this.f18447a.size());
        h.append('}');
        return h.toString();
    }
}
