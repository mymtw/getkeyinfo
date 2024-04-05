package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class ListingCardSize implements Serializable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String LARGE = "large";
    public static final String SMALL = "small";
    public static final String XLARGE = "xlarge";
    public static final String XXSMALL = "xxsmall";
    private float aspectRatio;
    private int cardPerScreen;
    private Integer margins;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ListingCardSize() {
        this(0, 0.0f, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public ListingCardSize(int i, float f, Integer num) {
        this.cardPerScreen = i;
        this.aspectRatio = f;
        this.margins = num;
    }

    public static /* synthetic */ ListingCardSize copy$default(ListingCardSize listingCardSize, int i, float f, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = listingCardSize.cardPerScreen;
        }
        if ((i2 & 2) != 0) {
            f = listingCardSize.aspectRatio;
        }
        if ((i2 & 4) != 0) {
            num = listingCardSize.margins;
        }
        return listingCardSize.copy(i, f, num);
    }

    public final int component1() {
        return this.cardPerScreen;
    }

    public final float component2() {
        return this.aspectRatio;
    }

    public final Integer component3() {
        return this.margins;
    }

    public final ListingCardSize copy(int i, float f, Integer num) {
        return new ListingCardSize(i, f, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingCardSize)) {
            return false;
        }
        ListingCardSize listingCardSize = (ListingCardSize) obj;
        return this.cardPerScreen == listingCardSize.cardPerScreen && C19383o.m32792b(Float.valueOf(this.aspectRatio), Float.valueOf(listingCardSize.aspectRatio)) && C19383o.m32792b(this.margins, listingCardSize.margins);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getCardPerScreen() {
        return this.cardPerScreen;
    }

    public final Integer getMargins() {
        return this.margins;
    }

    public int hashCode() {
        int c = C0023f.m104c(this.aspectRatio, Integer.hashCode(this.cardPerScreen) * 31, 31);
        Integer num = this.margins;
        return c + (num == null ? 0 : num.hashCode());
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setCardPerScreen(int i) {
        this.cardPerScreen = i;
    }

    public final void setMargins(Integer num) {
        this.margins = num;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingCardSize(cardPerScreen=");
        h.append(this.cardPerScreen);
        h.append(", aspectRatio=");
        h.append(this.aspectRatio);
        h.append(", margins=");
        return C0023f.m109j(h, this.margins, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingCardSize(int i, float f, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? 0.75f : f, (i2 & 4) != 0 ? null : num);
    }
}
