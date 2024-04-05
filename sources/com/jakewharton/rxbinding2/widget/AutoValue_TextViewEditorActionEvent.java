package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.view.KeyEvent;
import android.widget.TextView;

final class AutoValue_TextViewEditorActionEvent extends C17029p {
    private final int actionId;
    private final KeyEvent keyEvent;
    private final TextView view;

    public AutoValue_TextViewEditorActionEvent(TextView textView, int i, KeyEvent keyEvent2) {
        if (textView != null) {
            this.view = textView;
            this.actionId = i;
            this.keyEvent = keyEvent2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public int actionId() {
        return this.actionId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17029p)) {
            return false;
        }
        C17029p pVar = (C17029p) obj;
        if (this.view.equals(pVar.view()) && this.actionId == pVar.actionId()) {
            KeyEvent keyEvent2 = this.keyEvent;
            if (keyEvent2 == null) {
                if (pVar.keyEvent() == null) {
                    return true;
                }
            } else if (keyEvent2.equals(pVar.keyEvent())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.view.hashCode() ^ 1000003) * 1000003) ^ this.actionId) * 1000003;
        KeyEvent keyEvent2 = this.keyEvent;
        return hashCode ^ (keyEvent2 == null ? 0 : keyEvent2.hashCode());
    }

    public KeyEvent keyEvent() {
        return this.keyEvent;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TextViewEditorActionEvent{view=");
        h.append(this.view);
        h.append(", actionId=");
        h.append(this.actionId);
        h.append(", keyEvent=");
        h.append(this.keyEvent);
        h.append("}");
        return h.toString();
    }

    public TextView view() {
        return this.view;
    }
}
