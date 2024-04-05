package androidx.compose.p015ui.text.android;

import android.text.Layout;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.l */
public final class C1929l {

    /* renamed from: a */
    public static final Layout.Alignment f4349a;

    /* renamed from: b */
    public static final Layout.Alignment f4350b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (C19383o.m32792b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (C19383o.m32792b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f4349a = alignment;
        f4350b = alignment2;
    }
}
