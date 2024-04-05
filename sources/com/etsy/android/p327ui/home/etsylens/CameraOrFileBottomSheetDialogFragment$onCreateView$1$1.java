package com.etsy.android.p327ui.home.etsylens;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.etsylens.CameraOrFileBottomSheetDialogFragment$onCreateView$1$1 */
public final class CameraOrFileBottomSheetDialogFragment$onCreateView$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ CameraOrFileBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraOrFileBottomSheetDialogFragment$onCreateView$1$1(CameraOrFileBottomSheetDialogFragment cameraOrFileBottomSheetDialogFragment) {
        super(2);
        this.this$0 = cameraOrFileBottomSheetDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            final CameraOrFileBottomSheetDialogFragment cameraOrFileBottomSheetDialogFragment = this.this$0;
            C99551 r4 = new C19846a<C19394m>() {
                public final void invoke() {
                    cameraOrFileBottomSheetDialogFragment.getOnTakePictureClicked().invoke();
                }
            };
            final CameraOrFileBottomSheetDialogFragment cameraOrFileBottomSheetDialogFragment2 = this.this$0;
            CameraOrFileBottomSheetComposableKt.m18159a(r4, new C19846a<C19394m>() {
                public final void invoke() {
                    cameraOrFileBottomSheetDialogFragment2.getOnSelectFileClicked().invoke();
                }
            }, dVar, 0, 0);
            return;
        }
        dVar.mo5396C();
    }
}
