package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0956j;
import androidx.compose.p015ui.text.C2022r;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p001a0.C0005b;
import p753kq.C19857l;

public /* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends FunctionReferenceImpl implements C19857l<Integer, C2022r> {
    public SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(Object obj) {
        super(1, obj, C0956j.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C2022r(m34715invokejx7JFs(((Number) obj).intValue()));
    }

    /* renamed from: invoke--jx7JFs  reason: not valid java name */
    public final long m34715invokejx7JFs(int i) {
        CharSequence charSequence = (CharSequence) this.receiver;
        C19383o.m32797g(charSequence, "<this>");
        int i2 = i - 1;
        while (true) {
            if (i2 <= 0) {
                i2 = 0;
                break;
            }
            int i3 = i2 - 1;
            if (charSequence.charAt(i3) == 10) {
                break;
            }
            i2 = i3;
        }
        return C0005b.m47l(i2, C0956j.m1992a(i, charSequence));
    }
}
