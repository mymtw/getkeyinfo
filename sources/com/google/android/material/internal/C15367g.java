package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0340p0;
import com.etsy.android.R;
import p010a9.C0048b;
import p610kp.C18161c;

/* renamed from: com.google.android.material.internal.g */
public final class C15367g {

    /* renamed from: a */
    public static final int[] f34513a = {R.attr.colorPrimary};

    /* renamed from: b */
    public static final int[] f34514b = {R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static void m24954a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39705p1, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m24956c(context, f34514b, "Theme.MaterialComponents");
            }
        }
        m24956c(context, f34513a, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x0037;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24955b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = p610kp.C18161c.f39705p1
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            r1 = -1
            int r3 = r9.length
            if (r3 != 0) goto L_0x001d
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L_0x0038
            goto L_0x0037
        L_0x001d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L_0x0023:
            if (r6 >= r5) goto L_0x0034
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L_0x0031
            r4.recycle()
            goto L_0x0038
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0034:
            r4.recycle()
        L_0x0037:
            r2 = 1
        L_0x0038:
            r0.recycle()
            if (r2 == 0) goto L_0x003e
            return
        L_0x003e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C15367g.m24955b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: c */
    public static void m24956c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(C0048b.m163a("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* renamed from: d */
    public static TypedArray m24957d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m24954a(context, attributeSet, i, i2);
        m24955b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: e */
    public static C0340p0 m24958e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m24954a(context, attributeSet, i, i2);
        m24955b(context, attributeSet, iArr, i, i2, iArr2);
        return new C0340p0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
