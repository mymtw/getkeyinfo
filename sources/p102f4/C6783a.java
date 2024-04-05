package p102f4;

import android.view.View;
import com.appboy.models.cards.Card;
import com.braze.p044ui.actions.UriAction;
import com.braze.p044ui.contentcards.view.BaseContentCardView;

/* renamed from: f4.a */
public final /* synthetic */ class C6783a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ BaseContentCardView f14922b;

    /* renamed from: c */
    public final /* synthetic */ Card f14923c;

    /* renamed from: d */
    public final /* synthetic */ UriAction f14924d;

    public /* synthetic */ C6783a(BaseContentCardView baseContentCardView, Card card, UriAction uriAction) {
        this.f14922b = baseContentCardView;
        this.f14923c = card;
        this.f14924d = uriAction;
    }

    public final void onClick(View view) {
        BaseContentCardView.m34834bindViewHolder$lambda0(this.f14922b, this.f14923c, this.f14924d, view);
    }
}
