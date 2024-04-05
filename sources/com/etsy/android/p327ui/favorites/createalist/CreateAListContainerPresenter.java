package com.etsy.android.p327ui.favorites.createalist;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.stylekit.views.C9056g;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListContainerPresenter */
public final class CreateAListContainerPresenter implements C9825n {

    /* renamed from: b */
    public final CreateAListContainerFragment f21656b;

    /* renamed from: c */
    public final C8672b f21657c;

    /* renamed from: d */
    public final C9816h f21658d;

    /* renamed from: e */
    public final C13265p f21659e;

    /* renamed from: f */
    public boolean f21660f;

    /* renamed from: g */
    public final C9799a f21661g = new C9799a(new CreateAListContainerPresenter$_eventDispatcher$1(this));

    /* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListContainerPresenter$a */
    public static abstract class C9794a {

        /* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListContainerPresenter$a$a */
        public static final class C9795a extends C9794a {

            /* renamed from: a */
            public static final C9795a f21662a = new C9795a();
        }

        /* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListContainerPresenter$a$b */
        public static final class C9796b extends C9794a {

            /* renamed from: a */
            public static final C9796b f21663a = new C9796b();
        }
    }

    public CreateAListContainerPresenter(CreateAListContainerFragment createAListContainerFragment, C8672b bVar, C9816h hVar, C13265p pVar) {
        C19383o.m32797g(createAListContainerFragment, "fragment");
        C19383o.m32797g(bVar, "tracker");
        C19383o.m32797g(pVar, "session");
        this.f21656b = createAListContainerFragment;
        this.f21657c = bVar;
        this.f21658d = hVar;
        this.f21659e = pVar;
    }

    /* renamed from: a */
    public final void mo32795a(boolean z) {
        if (z) {
            mo32797c(this.f21656b.getDialog(), C9794a.C9796b.f21663a);
            return;
        }
        this.f21657c.mo21333d("favorites_create_list_dismiss", (Map<? extends AnalyticsProperty, Object>) null);
        Dialog dialog = this.f21656b.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo32796b(boolean z) {
        FragmentManager childFragmentManager = this.f21656b.getChildFragmentManager();
        C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
        if (z) {
            c.mo10532i(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("ENABLE_BACK_BUTTON", z);
        c.mo10531h(R.id.create_a_list_container, c.mo10530e(bundle, NameAListFragment.class), (String) null);
        c.mo10529c(C19386q.m32807a(NameAListFragment.class).mo71919c());
        c.mo10483d();
    }

    /* renamed from: c */
    public final void mo32797c(DialogInterface dialogInterface, C9794a aVar) {
        Context context = this.f21656b.getContext();
        if (context != null) {
            C9056g gVar = new C9056g(context);
            gVar.mo70029r(R.string.create_collection_abandon_alert_title);
            gVar.mo70023l(R.string.create_collection_abandon_alert_body);
            gVar.setPositiveButton(R.string.exit, new C9801c(this, aVar, dialogInterface));
            gVar.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
            gVar.create();
            gVar.mo1240k();
        }
    }

    public final C9799a eventDispatcher() {
        return this.f21661g;
    }
}
