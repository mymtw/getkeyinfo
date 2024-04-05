package com.etsy.android.p327ui.favorites.createalist;

import android.content.DialogInterface;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.favorites.createalist.CreateAListContainerPresenter;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.c */
public final /* synthetic */ class C9801c implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CreateAListContainerPresenter f21689b;

    /* renamed from: c */
    public final /* synthetic */ CreateAListContainerPresenter.C9794a f21690c;

    /* renamed from: d */
    public final /* synthetic */ DialogInterface f21691d;

    public /* synthetic */ C9801c(CreateAListContainerPresenter createAListContainerPresenter, CreateAListContainerPresenter.C9794a aVar, DialogInterface dialogInterface) {
        this.f21689b = createAListContainerPresenter;
        this.f21690c = aVar;
        this.f21691d = dialogInterface;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateAListContainerPresenter createAListContainerPresenter = this.f21689b;
        CreateAListContainerPresenter.C9794a aVar = this.f21690c;
        DialogInterface dialogInterface2 = this.f21691d;
        C19383o.m32797g(createAListContainerPresenter, "this$0");
        C19383o.m32797g(aVar, "$exitStyle");
        C19383o.m32797g(dialogInterface, "alert");
        createAListContainerPresenter.f21660f = false;
        dialogInterface.dismiss();
        if (aVar instanceof CreateAListContainerPresenter.C9794a.C9796b) {
            if (dialogInterface2 != null) {
                dialogInterface2.dismiss();
            }
        } else if (aVar instanceof CreateAListContainerPresenter.C9794a.C9795a) {
            C19383o.m32795e(dialogInterface2, "null cannot be cast to non-null type com.etsy.android.ui.favorites.createalist.CustomBottomSheetDialog");
            ((CustomBottomSheetDialog) dialogInterface2).customDialogCancel();
        }
        createAListContainerPresenter.f21657c.mo21333d("favorites_create_list_dismiss", (Map<? extends AnalyticsProperty, Object>) null);
    }
}
