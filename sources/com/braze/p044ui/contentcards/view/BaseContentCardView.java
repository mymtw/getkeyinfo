package com.braze.p044ui.contentcards.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.p043ui.C4940R;
import com.appboy.p043ui.widget.BaseCardView;
import com.braze.p044ui.actions.C5623a;
import com.braze.p044ui.actions.UriAction;
import com.braze.p044ui.contentcards.managers.BrazeContentCardsManager;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p102f4.C6783a;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.view.BaseContentCardView */
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContentCardView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* access modifiers changed from: private */
    /* renamed from: bindViewHolder$lambda-0  reason: not valid java name */
    public static final void m34834bindViewHolder$lambda0(BaseContentCardView baseContentCardView, Card card, UriAction uriAction, View view) {
        C19383o.m32797g(baseContentCardView, "this$0");
        C19383o.m32797g(card, "$card");
        baseContentCardView.handleCardClick(baseContentCardView.applicationContext, card, uriAction);
    }

    public void bindViewHolder(C6784b bVar, Card card) {
        C19383o.m32797g(bVar, "viewHolder");
        C19383o.m32797g(card, ResponseConstants.CARD);
        boolean isPinned = card.isPinned();
        ImageView imageView = bVar.f14926c;
        int i = 8;
        if (imageView != null) {
            imageView.setVisibility(isPinned ? 0 : 8);
        }
        boolean z = true;
        boolean z2 = this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() && !card.isIndicatorHighlighted();
        View view = bVar.f14925b;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
        UriAction uriActionForCard = BaseCardView.getUriActionForCard(card);
        bVar.itemView.setOnClickListener(new C6783a(this, card, uriActionForCard));
        if (uriActionForCard == null) {
            z = false;
        }
        TextView textView = bVar.f14927d;
        if (textView != null) {
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public abstract C6784b createViewHolder(ViewGroup viewGroup);

    public boolean isClickHandled(Context context, Card card, C5623a aVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(card, ResponseConstants.CARD);
        C19421p pVar = BrazeContentCardsManager.f12051b.getValue().f12052a;
        return false;
    }

    @TargetApi(21)
    public final void safeSetClipToOutline(ImageView imageView) {
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
    }

    public final void setOptionalCardImage(ImageView imageView, float f, String str, Card card) {
        C19383o.m32797g(card, ResponseConstants.CARD);
        if (imageView != null && str != null) {
            setImageViewToUrl(imageView, str, f, card);
        }
    }

    public final void setViewBackground(View view) {
        C19383o.m32797g(view, "view");
        view.setBackground(getResources().getDrawable(C4940R.C4941drawable.com_braze_content_card_background));
        view.setForeground(getResources().getDrawable(C4940R.C4941drawable.com_braze_content_card_scrim));
    }
}
