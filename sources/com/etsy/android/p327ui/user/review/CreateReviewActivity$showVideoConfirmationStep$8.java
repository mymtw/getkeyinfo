package com.etsy.android.p327ui.user.review;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showVideoConfirmationStep$8 */
public final class CreateReviewActivity$showVideoConfirmationStep$8 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showVideoConfirmationStep$8(CreateReviewActivity createReviewActivity) {
        super(1);
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [kotlin.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(android.view.View r18) {
        /*
            r17 = this;
            r0 = r17
            com.etsy.android.ui.user.review.CreateReviewActivity r1 = r0.this$0
            com.etsy.android.ui.user.review.CreateReviewViewModel r1 = r1.getViewModel()
            com.etsy.android.ui.user.review.ReviewFlow r2 = r1.f25946x
            r3 = 0
            if (r2 == 0) goto L_0x00bb
            com.etsy.android.ui.user.review.ReviewMetadata r2 = r2.f25980a
            java.lang.Integer r2 = r2.f26037c
            r4 = 0
            if (r2 == 0) goto L_0x0019
            int r2 = r2.intValue()
            goto L_0x001a
        L_0x0019:
            r2 = r4
        L_0x001a:
            com.etsy.android.ui.user.review.ReviewCard r2 = r1.mo37847e(r2)
            if (r2 == 0) goto L_0x00b3
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r2 = r2.f25962d
            java.util.Iterator r2 = r2.iterator()
        L_0x0026:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00ab
            java.lang.Object r5 = r2.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r5 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r5
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r6 = r5.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r7 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.EDIT_VIDEO
            if (r6 != r7) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x003a:
            r6 = r4
        L_0x003b:
            if (r6 == 0) goto L_0x0026
            com.etsy.android.ui.user.review.ReviewFlowPromptAction r2 = r5.f26002e
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x0096
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r2 = r2.f26011c
            if (r2 == 0) goto L_0x0096
            java.util.Iterator r2 = r2.iterator()
            r5 = r3
            r6 = r5
            r7 = r4
            r8 = r7
            r9 = r8
        L_0x0050:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x008e
            java.lang.Object r10 = r2.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r10 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r10
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r11 = r10.f25998a
            int[] r12 = com.etsy.android.p327ui.user.review.CreateReviewViewModel.C11692a.f25951c
            int r11 = r11.ordinal()
            r11 = r12[r11]
            r12 = 3
            if (r11 == r12) goto L_0x0084
            r12 = 4
            if (r11 == r12) goto L_0x007a
            r12 = 5
            if (r11 == r12) goto L_0x0070
            goto L_0x0050
        L_0x0070:
            java.lang.String r6 = r10.f25999b
            if (r6 != 0) goto L_0x0076
            r9 = r4
            goto L_0x0077
        L_0x0076:
            r9 = r6
        L_0x0077:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r6 = r10.f26007j
            goto L_0x0050
        L_0x007a:
            java.lang.String r5 = r10.f25999b
            if (r5 != 0) goto L_0x0080
            r8 = r4
            goto L_0x0081
        L_0x0080:
            r8 = r5
        L_0x0081:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r5 = r10.f26007j
            goto L_0x0050
        L_0x0084:
            java.lang.String r3 = r10.f25999b
            if (r3 != 0) goto L_0x008a
            r7 = r4
            goto L_0x008b
        L_0x008a:
            r7 = r3
        L_0x008b:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r3 = r10.f26007j
            goto L_0x0050
        L_0x008e:
            r14 = r3
            r15 = r5
            r16 = r6
            r11 = r7
            r12 = r8
            r13 = r9
            goto L_0x009d
        L_0x0096:
            r14 = r3
            r15 = r14
            r16 = r15
            r11 = r4
            r12 = r11
            r13 = r12
        L_0x009d:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r2 = r1.f25930h
            com.etsy.android.ui.user.review.r$e r3 = new com.etsy.android.ui.user.review.r$e
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r2.postValue(r3)
            kotlin.m r3 = kotlin.C19394m.f43287a
            goto L_0x00b3
        L_0x00ab:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        L_0x00b3:
            if (r3 != 0) goto L_0x00ba
            com.etsy.android.ui.user.review.ReviewScreen r2 = com.etsy.android.p327ui.user.review.ReviewScreen.VIDEO
            r1.mo37857p(r2)
        L_0x00ba:
            return
        L_0x00bb:
            java.lang.String r1 = "reviewFlowModel"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewActivity$showVideoConfirmationStep$8.invoke(android.view.View):void");
    }
}
