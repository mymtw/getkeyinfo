package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import p088e1.C6689b;

public final class AccessibilityClickableSpanCompat extends ClickableSpan {
    public static final String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    private final int mClickableSpanActionId;
    private final C6689b mNodeInfoCompat;
    private final int mOriginalClickableSpanId;

    public AccessibilityClickableSpanCompat(int i, C6689b bVar, int i2) {
        this.mOriginalClickableSpanId = i;
        this.mNodeInfoCompat = bVar;
        this.mClickableSpanActionId = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(SPAN_ID, this.mOriginalClickableSpanId);
        C6689b bVar = this.mNodeInfoCompat;
        bVar.f14759a.performAction(this.mClickableSpanActionId, bundle);
    }
}
