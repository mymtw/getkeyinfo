package androidx.appcompat.widget;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.widget.l */
public final class C0330l extends PopupWindow {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r4 = r3.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0330l(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            int[] r0 = p628nj.C18263b.f40037A
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r4 = 2
            boolean r5 = r3.hasValue(r4)
            r0 = 0
            if (r5 == 0) goto L_0x0018
            boolean r4 = r3.getBoolean(r4, r0)
            androidx.core.widget.C2403g.m5357c(r1, r4)
        L_0x0018:
            boolean r4 = r3.hasValue(r0)
            if (r4 == 0) goto L_0x0029
            int r4 = r3.getResourceId(r0, r0)
            if (r4 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r2 = p075d.C6614a.m12981a(r2, r4)
            goto L_0x002d
        L_0x0029:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
        L_0x002d:
            r1.setBackgroundDrawable(r2)
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0330l.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }
}
