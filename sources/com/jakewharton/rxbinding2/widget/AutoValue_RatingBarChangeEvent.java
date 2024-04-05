package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.widget.RatingBar;

final class AutoValue_RatingBarChangeEvent extends C17019g {
    private final boolean fromUser;
    private final float rating;
    private final RatingBar view;

    public AutoValue_RatingBarChangeEvent(RatingBar ratingBar, float f, boolean z) {
        if (ratingBar != null) {
            this.view = ratingBar;
            this.rating = f;
            this.fromUser = z;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17019g)) {
            return false;
        }
        C17019g gVar = (C17019g) obj;
        return this.view.equals(gVar.view()) && Float.floatToIntBits(this.rating) == Float.floatToIntBits(gVar.rating()) && this.fromUser == gVar.fromUser();
    }

    public boolean fromUser() {
        return this.fromUser;
    }

    public int hashCode() {
        return ((((this.view.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.rating)) * 1000003) ^ (this.fromUser ? 1231 : 1237);
    }

    public float rating() {
        return this.rating;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("RatingBarChangeEvent{view=");
        h.append(this.view);
        h.append(", rating=");
        h.append(this.rating);
        h.append(", fromUser=");
        h.append(this.fromUser);
        h.append("}");
        return h.toString();
    }

    public RatingBar view() {
        return this.view;
    }
}
