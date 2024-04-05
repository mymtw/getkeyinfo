package com.etsy.android.p327ui.favorites.add;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.favorites.createalist.C9818j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListBottomSheetDialog */
public final class AddToListBottomSheetDialog extends BottomSheetDialog {
    public static final int $stable = 8;
    private final C9818j listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetDialog(Context context, int i, C9818j jVar) {
        super(context, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(jVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = jVar;
    }

    public void cancel() {
        this.listener.mo32757a(this);
    }

    public final void customDialogCancel() {
        super.cancel();
    }

    public final C9818j getListener() {
        return this.listener;
    }
}
