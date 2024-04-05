package androidx.compose.p015ui.window;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.platform.AbstractComposeView;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p173m.C7279a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.DialogLayout */
public final class DialogLayout extends AbstractComposeView {

    /* renamed from: b */
    public final Window f4713b;

    /* renamed from: c */
    public final ParcelableSnapshotMutableState f4714c = C0761x.m1751w0(ComposableSingletons$AndroidDialog_androidKt.f4711a, C1351n1.f2948a);

    /* renamed from: d */
    public boolean f4715d;

    /* renamed from: e */
    public boolean f4716e;

    public DialogLayout(Context context, Window window) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f4713b = window;
    }

    public final void Content(C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(1735448596);
        ((C19861p) this.f4714c.getValue()).invoke(h, 0);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new DialogLayout$Content$4(this, i);
        }
    }

    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f4716e;
    }

    public final void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f4713b.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    public final void internalOnMeasure$ui_release(int i, int i2) {
        if (this.f4715d) {
            super.internalOnMeasure$ui_release(i, i2);
            return;
        }
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(C7279a.m13954l(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C7279a.m13954l(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }
}
