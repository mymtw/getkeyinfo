package com.braze.p044ui.contentcards.handlers;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.models.cards.Card;
import com.braze.p044ui.actions.brazeactions.BrazeActionParser;
import com.braze.p044ui.actions.brazeactions.C5625a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p035c4.C4409a;
import p301z3.C8433c;
import p568fn.C17782b;

/* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler */
public final class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new DefaultContentCardsUpdateHandler$Companion$CREATOR$1();
    public static final C5639a Companion = new C5639a();

    /* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$a */
    public static final class C5639a {
    }

    /* access modifiers changed from: private */
    /* renamed from: handleCardUpdate$lambda-0  reason: not valid java name */
    public static final int m34833handleCardUpdate$lambda0(Card card, Card card2) {
        C19383o.m32797g(card, "cardA");
        C19383o.m32797g(card2, "cardB");
        if (!card.isPinned() || card2.isPinned()) {
            if (!card.isPinned() && card2.isPinned()) {
                return 1;
            }
            if (card.getUpdated() <= card2.getUpdated()) {
                return card.getUpdated() < card2.getUpdated() ? 1 : 0;
            }
        }
        return -1;
    }

    public int describeContents() {
        return 0;
    }

    public List<Card> handleCardUpdate(C8433c cVar) {
        C19383o.m32797g(cVar, "event");
        C4409a aVar = new C4409a(0);
        ArrayList q1 = C19327t.m32661q1(cVar.f18447a);
        ArrayList arrayList = new ArrayList();
        Iterator it = q1.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Card card = (Card) next;
            C19383o.m32797g(card, "<this>");
            if (!(card.getUrl() != null ? C5625a.m11393a(BrazeActionParser.ActionType.INVALID, C17782b.m29864d0(Uri.parse(card.getUrl()))) : false)) {
                arrayList.add(next);
            }
        }
        return C19327t.m32656l1(arrayList, aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
    }
}
