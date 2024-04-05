package com.etsy.android.p327ui.favorites.add;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.CollectionPrivacyLevel;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListPresenter */
public final class NameAListPresenter {

    /* renamed from: a */
    public final NameAListFragment f21568a;

    /* renamed from: b */
    public final C9753b0 f21569b;

    /* renamed from: c */
    public final C13461f f21570c;

    /* renamed from: d */
    public ListingLike f21571d;

    /* renamed from: e */
    public C7091a f21572e = new C7091a();

    /* renamed from: f */
    public C7091a f21573f = new C7091a();

    /* renamed from: g */
    public CollectionPrivacyLevel f21574g = CollectionPrivacyLevel.PUBLIC;

    /* renamed from: h */
    public final C9788w f21575h = new C9788w(this, 0);

    /* renamed from: i */
    public final NameAListPresenter$textWatcher$1 f21576i = new NameAListPresenter$textWatcher$1(this);

    public NameAListPresenter(NameAListFragment nameAListFragment, C9753b0 b0Var, C13461f fVar, C8672b bVar) {
        C19383o.m32797g(nameAListFragment, "fragment");
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f21568a = nameAListFragment;
        this.f21569b = b0Var;
        this.f21570c = fVar;
        nameAListFragment.getResources().getDimensionPixelSize(R.dimen.create_collection_image);
    }

    /* renamed from: a */
    public final void mo32741a(boolean z) {
        View view = this.f21568a.getView();
        if (view == null) {
            return;
        }
        if (z) {
            ((ImageButton) view.findViewById(R.id.name_list_back)).setClickable(true);
            ((Button) view.findViewById(R.id.create_list)).setClickable(true);
            ((CollageTextInput) view.findViewById(R.id.name_input)).setEnabled(true);
            ((CollageSwitch) view.findViewById(R.id.privacy_switch)).setEnabled(true);
            return;
        }
        ((ImageButton) view.findViewById(R.id.name_list_back)).setClickable(false);
        ((Button) view.findViewById(R.id.create_list)).setClickable(false);
        ((CollageTextInput) view.findViewById(R.id.name_input)).setEnabled(false);
        ((CollageSwitch) view.findViewById(R.id.privacy_switch)).setEnabled(false);
    }

    /* renamed from: b */
    public final void mo32742b(String str) {
        CollageTextInput collageTextInput;
        CollageTextInput collageTextInput2;
        this.f21573f.mo19405d();
        this.f21573f = new C7091a();
        mo32741a(true);
        View view = this.f21568a.getView();
        if (!(view == null || (collageTextInput2 = (CollageTextInput) view.findViewById(R.id.name_input)) == null)) {
            collageTextInput2.setErrorText(str);
        }
        View view2 = this.f21568a.getView();
        if (view2 != null && (collageTextInput = (CollageTextInput) view2.findViewById(R.id.name_input)) != null) {
            collageTextInput.setTextChangeListener(this.f21576i);
        }
    }
}
