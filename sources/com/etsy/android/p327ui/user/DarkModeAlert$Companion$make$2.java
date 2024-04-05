package com.etsy.android.p327ui.user;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.DarkModeAlert$Companion$make$2 */
final class DarkModeAlert$Companion$make$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ PopupWindow $popupWindow;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DarkModeAlert$Companion$make$2(PopupWindow popupWindow) {
        super(1);
        this.$popupWindow = popupWindow;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$popupWindow.dismiss();
    }
}
