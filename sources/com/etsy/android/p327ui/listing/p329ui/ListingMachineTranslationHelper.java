package com.etsy.android.p327ui.listing.p329ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import com.etsy.android.uikit.view.TranslateButton;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.listing.ui.ListingMachineTranslationHelper */
public final class ListingMachineTranslationHelper {

    /* renamed from: a */
    public final TranslateButton f22358a;

    /* renamed from: b */
    public final C11786n f22359b;

    /* renamed from: c */
    public final C13573c f22360c;

    /* renamed from: d */
    public final Button f22361d;

    /* renamed from: e */
    public final TextView f22362e;

    /* renamed from: f */
    public final LoadingIndicatorView f22363f;

    /* renamed from: g */
    public final TextView f22364g;

    /* renamed from: com.etsy.android.ui.listing.ui.ListingMachineTranslationHelper$a */
    public /* synthetic */ class C10193a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22365a;

        static {
            int[] iArr = new int[MachineTranslationViewState.values().length];
            iArr[MachineTranslationViewState.VISIBLE.ordinal()] = 1;
            iArr[MachineTranslationViewState.GONE.ordinal()] = 2;
            iArr[MachineTranslationViewState.LOADING.ordinal()] = 3;
            iArr[MachineTranslationViewState.ERROR.ordinal()] = 4;
            f22365a = iArr;
        }
    }

    public ListingMachineTranslationHelper(TranslateButton translateButton, C11786n nVar, C13573c cVar) {
        C19383o.m32797g(translateButton, "translationView");
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22358a = translateButton;
        this.f22359b = nVar;
        this.f22360c = cVar;
        View findViewById = translateButton.findViewById(R.id.translate_button);
        C19383o.m32796f(findViewById, "translationView.findView…Id(R.id.translate_button)");
        this.f22361d = (Button) findViewById;
        View findViewById2 = translateButton.findViewById(R.id.translate_disclaimer);
        C19383o.m32796f(findViewById2, "translationView.findView….id.translate_disclaimer)");
        this.f22362e = (TextView) findViewById2;
        View findViewById3 = translateButton.findViewById(R.id.translate_loading_spinner);
        C19383o.m32796f(findViewById3, "translationView.findView…ranslate_loading_spinner)");
        this.f22363f = (LoadingIndicatorView) findViewById3;
        View findViewById4 = translateButton.findViewById(R.id.translate_error);
        C19383o.m32796f(findViewById4, "translationView.findViewById(R.id.translate_error)");
        this.f22364g = (TextView) findViewById4;
    }

    /* renamed from: a */
    public final void mo33547a(MachineTranslationViewState machineTranslationViewState, boolean z, C19846a<C19394m> aVar) {
        C19383o.m32797g(machineTranslationViewState, "machineTranslationViewState");
        int i = C10193a.f22365a[machineTranslationViewState.ordinal()];
        if (i == 1) {
            ViewExtensions.m12869m(this.f22358a);
            ViewExtensions.m12860d(this.f22363f);
            ViewExtensions.m12860d(this.f22364g);
            if (z) {
                this.f22361d.setText(this.f22359b.mo38059c(R.string.see_original, new Object[0]));
            } else {
                this.f22361d.setText(this.f22359b.mo38059c(R.string.translate, new Object[0]));
            }
            ViewExtensions.m12866j(this.f22361d, new ListingMachineTranslationHelper$updateView$1(aVar, this));
        } else if (i == 2) {
            ViewExtensions.m12860d(this.f22358a);
        } else if (i == 3) {
            ViewExtensions.m12869m(this.f22363f);
            ViewExtensions.m12860d(this.f22364g);
        } else if (i == 4) {
            ViewExtensions.m12860d(this.f22363f);
            ViewExtensions.m12869m(this.f22364g);
        }
    }
}
