package com.braze.p044ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$Companion$CREATOR$1 */
public final class DefaultContentCardsUpdateHandler$Companion$CREATOR$1 implements Parcelable.Creator<DefaultContentCardsUpdateHandler> {
    public DefaultContentCardsUpdateHandler createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new DefaultContentCardsUpdateHandler();
    }

    public DefaultContentCardsUpdateHandler[] newArray(int i) {
        return new DefaultContentCardsUpdateHandler[i];
    }
}
