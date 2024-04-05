package com.etsy.android.p327ui.favorites.createalist;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.CollectionPrivacyLevel;
import com.etsy.android.stylekit.views.C9065p;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListPresenter */
public final class NameAListPresenter {

    /* renamed from: a */
    public final NameAListFragment f21676a;

    /* renamed from: b */
    public final C9831q f21677b;

    /* renamed from: c */
    public final C13461f f21678c;

    /* renamed from: d */
    public final C9816h f21679d;

    /* renamed from: e */
    public C9799a f21680e;

    /* renamed from: f */
    public C7091a f21681f = new C7091a();

    /* renamed from: g */
    public C7091a f21682g = new C7091a();

    /* renamed from: h */
    public CollectionPrivacyLevel f21683h = CollectionPrivacyLevel.PUBLIC;

    /* renamed from: i */
    public final C9065p f21684i = new C9065p(this, 1);

    /* renamed from: j */
    public final NameAListPresenter$textwatcher$1 f21685j = new NameAListPresenter$textwatcher$1(this);

    public NameAListPresenter(NameAListFragment nameAListFragment, C9831q qVar, C13461f fVar, C9816h hVar, C8672b bVar) {
        C19383o.m32797g(nameAListFragment, "fragment");
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f21676a = nameAListFragment;
        this.f21677b = qVar;
        this.f21678c = fVar;
        this.f21679d = hVar;
        nameAListFragment.getResources().getDimensionPixelSize(R.dimen.create_collection_image);
    }

    /* renamed from: a */
    public final void mo32836a(boolean z) {
        View view = this.f21676a.getView();
        if (view == null) {
            return;
        }
        if (z) {
            ((ImageButton) view.findViewById(R.id.favorites_name_list_back)).setClickable(true);
            ((Button) view.findViewById(R.id.favorites_create_list)).setClickable(true);
            ((CollageTextInput) view.findViewById(R.id.name_input)).setEnabled(true);
            ((CollageSwitch) view.findViewById(R.id.privacy_switch)).setEnabled(true);
            return;
        }
        ((ImageButton) view.findViewById(R.id.favorites_name_list_back)).setClickable(false);
        ((Button) view.findViewById(R.id.favorites_create_list)).setClickable(false);
        ((CollageTextInput) view.findViewById(R.id.name_input)).setEnabled(false);
        ((CollageSwitch) view.findViewById(R.id.privacy_switch)).setEnabled(false);
    }

    /* renamed from: b */
    public final void mo32837b(String str) {
        this.f21682g.mo19405d();
        this.f21682g = new C7091a();
        mo32836a(true);
        View view = this.f21676a.getView();
        if (view != null) {
            ((CollageTextInput) view.findViewById(R.id.name_input)).setErrorText(str);
            ((CollageTextInput) view.findViewById(R.id.name_input)).setTextChangeListener(this.f21685j);
        }
    }
}
