package com.etsy.android.p327ui.user.review;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showPhotoConfirmationStep$2 */
public final class CreateReviewActivity$showPhotoConfirmationStep$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showPhotoConfirmationStep$2(CreateReviewActivity createReviewActivity) {
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
    public final void invoke(android.view.View r19) {
        /*
            r18 = this;
            r0 = r18
            com.etsy.android.ui.user.review.CreateReviewActivity r1 = r0.this$0
            com.etsy.android.ui.user.review.CreateReviewViewModel r1 = r1.getViewModel()
            com.etsy.android.ui.user.review.ReviewFlow r2 = r1.f25946x
            r3 = 0
            if (r2 == 0) goto L_0x00bd
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
            if (r2 == 0) goto L_0x00b5
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r2 = r2.f25962d
            java.util.Iterator r2 = r2.iterator()
        L_0x0026:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00ad
            java.lang.Object r5 = r2.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r5 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r5
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r6 = r5.f25998a
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r7 = com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType.EDIT_PHOTO
            r8 = 1
            if (r6 != r7) goto L_0x003b
            r6 = r8
            goto L_0x003c
        L_0x003b:
            r6 = r4
        L_0x003c:
            if (r6 == 0) goto L_0x0026
            com.etsy.android.ui.user.review.ReviewFlowPromptAction r2 = r5.f26002e
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x0097
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r2 = r2.f26011c
            if (r2 == 0) goto L_0x0097
            java.util.Iterator r2 = r2.iterator()
            r5 = r3
            r6 = r5
            r7 = r4
            r9 = r7
            r10 = r9
        L_0x0051:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x008e
            java.lang.Object r11 = r2.next()
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r11 = (com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption) r11
            com.etsy.android.ui.user.review.ReviewFlowNavigationOptionType r12 = r11.f25998a
            int[] r13 = com.etsy.android.p327ui.user.review.CreateReviewViewModel.C11692a.f25951c
            int r12 = r12.ordinal()
            r12 = r13[r12]
            if (r12 == r8) goto L_0x0084
            r13 = 2
            if (r12 == r13) goto L_0x007a
            r13 = 6
            if (r12 == r13) goto L_0x0070
            goto L_0x0051
        L_0x0070:
            java.lang.String r6 = r11.f25999b
            if (r6 != 0) goto L_0x0076
            r10 = r4
            goto L_0x0077
        L_0x0076:
            r10 = r6
        L_0x0077:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r6 = r11.f26007j
            goto L_0x0051
        L_0x007a:
            java.lang.String r5 = r11.f25999b
            if (r5 != 0) goto L_0x0080
            r9 = r4
            goto L_0x0081
        L_0x0080:
            r9 = r5
        L_0x0081:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r5 = r11.f26007j
            goto L_0x0051
        L_0x0084:
            java.lang.String r3 = r11.f25999b
            if (r3 != 0) goto L_0x008a
            r7 = r4
            goto L_0x008b
        L_0x008a:
            r7 = r3
        L_0x008b:
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r3 = r11.f26007j
            goto L_0x0051
        L_0x008e:
            r15 = r3
            r16 = r5
            r17 = r6
            r12 = r7
            r13 = r9
            r14 = r10
            goto L_0x009f
        L_0x0097:
            r15 = r3
            r16 = r15
            r17 = r16
            r12 = r4
            r13 = r12
            r14 = r13
        L_0x009f:
            androidx.lifecycle.z<com.etsy.android.ui.user.review.r> r2 = r1.f25930h
            com.etsy.android.ui.user.review.r$d r3 = new com.etsy.android.ui.user.review.r$d
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r2.postValue(r3)
            kotlin.m r3 = kotlin.C19394m.f43287a
            goto L_0x00b5
        L_0x00ad:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        L_0x00b5:
            if (r3 != 0) goto L_0x00bc
            com.etsy.android.ui.user.review.ReviewScreen r2 = com.etsy.android.p327ui.user.review.ReviewScreen.PHOTO
            r1.mo37857p(r2)
        L_0x00bc:
            return
        L_0x00bd:
            java.lang.String r1 = "reviewFlowModel"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.CreateReviewActivity$showPhotoConfirmationStep$2.invoke(android.view.View):void");
    }
}
