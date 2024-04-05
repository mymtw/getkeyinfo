package com.etsy.android.p327ui.favorites.createalist;

import android.content.DialogInterface;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.favorites.createalist.CreateAListContainerPresenter;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.d */
public final class C9802d implements C9818j {

    /* renamed from: a */
    public final /* synthetic */ CreateAListContainerPresenter f21692a;

    public C9802d(CreateAListContainerPresenter createAListContainerPresenter) {
        this.f21692a = createAListContainerPresenter;
    }

    /* renamed from: a */
    public final void mo32757a(DialogInterface dialogInterface) {
        C19383o.m32797g(dialogInterface, "dialog");
        CreateAListContainerPresenter createAListContainerPresenter = this.f21692a;
        createAListContainerPresenter.getClass();
        if (createAListContainerPresenter.f21660f) {
            createAListContainerPresenter.mo32797c(dialogInterface, CreateAListContainerPresenter.C9794a.C9795a.f21662a);
            return;
        }
        createAListContainerPresenter.f21657c.mo21333d("favorites_create_list_dismiss", (Map<? extends AnalyticsProperty, Object>) null);
        dialogInterface.dismiss();
    }
}
