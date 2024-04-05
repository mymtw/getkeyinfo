package p507al;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* renamed from: al.c */
public final class C14025c {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p260v0.C8184a.m16459b(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m21582a(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = p260v0.C8184a.m16459b(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p507al.C14025c.m21582a(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p260v0.C8184a.m16459b(r1, (r0 = r2.mo3105i(r3, 0)));
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m21583b(android.content.Context r1, androidx.appcompat.widget.C0340p0 r2, int r3) {
        /*
            boolean r0 = r2.mo3108l(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.mo3105i(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = p260v0.C8184a.m16459b(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.mo3098b(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p507al.C14025c.m21583b(android.content.Context, androidx.appcompat.widget.p0, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static int m21584c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p075d.C6614a.m12981a(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m21585d(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = p075d.C6614a.m12981a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p507al.C14025c.m21585d(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    public static boolean m21586e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
