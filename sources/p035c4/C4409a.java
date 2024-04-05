package p035c4;

import com.appboy.models.cards.Card;
import com.braze.p044ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.google.android.exoplayer2.p526ui.C14416b;
import java.util.Comparator;

/* renamed from: c4.a */
public final /* synthetic */ class C4409a implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f9681b;

    public /* synthetic */ C4409a(int i) {
        this.f9681b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f9681b) {
            case 0:
                return DefaultContentCardsUpdateHandler.m34833handleCardUpdate$lambda0((Card) obj, (Card) obj2);
            default:
                C14416b.C14418b bVar = (C14416b.C14418b) obj;
                C14416b.C14418b bVar2 = (C14416b.C14418b) obj2;
                int compare = Integer.compare(bVar2.f32460b, bVar.f32460b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = bVar.f32461c.compareTo(bVar2.f32461c);
                return compareTo != 0 ? compareTo : bVar.f32462d.compareTo(bVar2.f32462d);
        }
    }
}
