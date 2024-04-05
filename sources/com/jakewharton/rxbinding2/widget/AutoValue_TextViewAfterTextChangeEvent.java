package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.text.Editable;
import android.widget.TextView;

final class AutoValue_TextViewAfterTextChangeEvent extends C17025m {
    private final Editable editable;
    private final TextView view;

    public AutoValue_TextViewAfterTextChangeEvent(TextView textView, Editable editable2) {
        if (textView != null) {
            this.view = textView;
            this.editable = editable2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public Editable editable() {
        return this.editable;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17025m)) {
            return false;
        }
        C17025m mVar = (C17025m) obj;
        if (this.view.equals(mVar.view())) {
            Editable editable2 = this.editable;
            if (editable2 == null) {
                if (mVar.editable() == null) {
                    return true;
                }
            } else if (editable2.equals(mVar.editable())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.view.hashCode() ^ 1000003) * 1000003;
        Editable editable2 = this.editable;
        return hashCode ^ (editable2 == null ? 0 : editable2.hashCode());
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TextViewAfterTextChangeEvent{view=");
        h.append(this.view);
        h.append(", editable=");
        h.append(this.editable);
        h.append("}");
        return h.toString();
    }

    public TextView view() {
        return this.view;
    }
}
