package com.etsy.android.p327ui.favorites.createalist;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.favorites.createalist.CustomBottomSheetDialog */
public final class CustomBottomSheetDialog extends BottomSheetDialog {
    public static final int $stable = 8;
    private final C9818j listener;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomBottomSheetDialog(Context context, int i, boolean z, C9818j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? false : z, jVar);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBottomSheetDialog(Context context, int i, boolean z, C9818j jVar) {
        super(context, i);
        View decorView;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(jVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = jVar;
        getBehavior().setHideable(false);
        getBehavior().setFitToContents(z);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.addOnLayoutChangeListener(new CustomBottomSheetDialog$special$$inlined$doOnNextLayout$1(this));
        }
    }
}
