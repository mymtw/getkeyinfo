package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.content.Context;
import android.widget.Button;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.PersonalizationBottomSheet$start$1$2 */
final class PersonalizationBottomSheet$start$1$2 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ Button $btnBuyItNow;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isRequired;
    public final /* synthetic */ int $maxLength;
    public final /* synthetic */ CollageTextInput $textInputPersonalization;
    public final /* synthetic */ C9671l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizationBottomSheet$start$1$2(boolean z, CollageTextInput collageTextInput, Context context, C9671l lVar, int i, Button button) {
        super(1);
        this.$isRequired = z;
        this.$textInputPersonalization = collageTextInput;
        this.$context = context;
        this.this$0 = lVar;
        this.$maxLength = i;
        this.$btnBuyItNow = button;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if ((r7.length() == 0) != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            boolean r0 = r6.$isRequired
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0025
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0013
            r0 = r2
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            com.etsy.android.stylekit.views.CollageTextInput r0 = r6.$textInputPersonalization
            android.content.Context r3 = r6.$context
            r4 = 2131952459(0x7f13034b, float:1.9541361E38)
            java.lang.String r3 = r3.getString(r4)
            r0.setErrorText(r3)
            goto L_0x002b
        L_0x0025:
            com.etsy.android.stylekit.views.CollageTextInput r0 = r6.$textInputPersonalization
            r3 = 0
            r0.setErrorText(r3)
        L_0x002b:
            com.etsy.android.ui.core.listinggallery.buyitnow.l r0 = r6.this$0
            boolean r3 = r6.$isRequired
            int r4 = r6.$maxLength
            android.widget.Button r5 = r6.$btnBuyItNow
            r0.getClass()
            if (r3 == 0) goto L_0x0044
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0040
            r0 = r2
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            if (r0 == 0) goto L_0x0044
            goto L_0x004c
        L_0x0044:
            int r7 = r7.length()
            if (r7 <= r4) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r1 = r2
        L_0x004c:
            r5.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.listinggallery.buyitnow.PersonalizationBottomSheet$start$1$2.invoke(java.lang.String):void");
    }
}
