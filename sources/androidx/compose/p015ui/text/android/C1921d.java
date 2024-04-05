package androidx.compose.p015ui.text.android;

import com.appboy.models.cards.Card;
import com.appboy.p043ui.AppboyFeedFragment;
import java.util.Comparator;
import kotlin.Pair;
import p513bj.C14079t;
import p710xi.C18775e;

/* renamed from: androidx.compose.ui.text.android.d */
public final /* synthetic */ class C1921d implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f4327b;

    public /* synthetic */ C1921d(int i) {
        this.f4327b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f4327b) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
            case 1:
                return AppboyFeedFragment.lambda$sortFeedCards$4((Card) obj, (Card) obj2);
            case 2:
                return Long.compare(((C18775e) obj).f41622b, ((C18775e) obj2).f41622b);
            default:
                return ((C14079t.C14080a) obj).f31002a - ((C14079t.C14080a) obj2).f31002a;
        }
    }
}
