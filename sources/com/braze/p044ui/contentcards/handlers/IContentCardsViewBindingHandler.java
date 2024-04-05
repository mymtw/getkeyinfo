package com.braze.p044ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.appboy.models.cards.Card;
import java.util.List;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler */
public interface IContentCardsViewBindingHandler extends Parcelable {
    int getItemViewType(Context context, List<? extends Card> list, int i);

    void onBindViewHolder(Context context, List<? extends Card> list, C6784b bVar, int i);

    C6784b onCreateViewHolder(Context context, List<? extends Card> list, ViewGroup viewGroup, int i);
}
