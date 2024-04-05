package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional;

import android.os.Bundle;
import android.support.p013v4.media.C0069a;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import p396mb.C13036b;
import p396mb.C13037c;
import p396mb.C13042h;
import p404nb.C13100a;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.optional.PersonalizationOptionalViewHolder */
public final class PersonalizationOptionalViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22577b;

    /* renamed from: c */
    public final CollageCheckbox f22578c;

    /* renamed from: d */
    public final TextView f22579d;

    /* renamed from: e */
    public final CollageTextInput f22580e;

    /* renamed from: f */
    public final C13037c f22581f;

    /* renamed from: g */
    public final C13036b f22582g;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.optional.PersonalizationOptionalViewHolder$a */
    public static final class C10277a implements CollageCheckbox.C9027c {

        /* renamed from: a */
        public final /* synthetic */ PersonalizationOptionalViewHolder f22583a;

        public C10277a(PersonalizationOptionalViewHolder personalizationOptionalViewHolder) {
            this.f22583a = personalizationOptionalViewHolder;
        }

        /* renamed from: a */
        public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
            C19383o.m32797g(collageCheckbox, "selectedButton");
            this.f22583a.f22577b.mo38043a(C13597g.C13720r2.f30236a);
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.optional.PersonalizationOptionalViewHolder$b */
    public static final class C10278b implements C13042h.C13043a {

        /* renamed from: a */
        public final /* synthetic */ PersonalizationOptionalViewHolder f22584a;

        public C10278b(PersonalizationOptionalViewHolder personalizationOptionalViewHolder) {
            this.f22584a = personalizationOptionalViewHolder;
        }

        /* renamed from: a */
        public final boolean mo30839a(Bundle bundle) {
            this.f22584a.f22578c.performClick();
            return true;
        }
    }

    public PersonalizationOptionalViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_personalization_optional, false));
        this.f22577b = cVar;
        View findViewById = this.itemView.findViewById(R.id.checkbox_personalization);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…checkbox_personalization)");
        this.f22578c = (CollageCheckbox) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_personalization_description);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…sonalization_description)");
        this.f22579d = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.text_input_personalization);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…xt_input_personalization)");
        this.f22580e = (CollageTextInput) findViewById3;
        C10278b bVar = new C10278b(this);
        this.f22581f = new C13037c(bVar);
        this.f22582g = new C13036b(bVar);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        String str;
        if (jVar instanceof C10279a) {
            C10279a aVar = (C10279a) jVar;
            if (aVar.f22585a) {
                C13100a.m20773d(this.f22578c, this.f22581f, this.f22582g);
                ViewExtensions.m12869m(this.f22579d);
                ViewExtensions.m12869m(this.f22580e);
            } else {
                C13100a.m20773d(this.f22578c, this.f22582g, this.f22581f);
                ViewExtensions.m12860d(this.f22579d);
                ViewExtensions.m12860d(this.f22580e);
            }
            this.f22579d.setText(aVar.f22586b);
            CollageCheckbox collageCheckbox = this.f22578c;
            collageCheckbox.setChecked(aVar.f22585a);
            collageCheckbox.setContentDescription(this.f22578c.getText() + ' ' + this.itemView.getContext().getString(R.string.listing_personalization_optional));
            collageCheckbox.setOnCheckedChangeListener(new C10277a(this));
            Integer num = aVar.f22588d;
            if (num != null) {
                str = this.itemView.getContext().getString(num.intValue());
            } else {
                str = null;
            }
            CollageTextInput collageTextInput = this.f22580e;
            collageTextInput.setTextChangeListener((TextWatcher) null);
            if (!C19383o.m32792b(collageTextInput.getText(), aVar.f22589e)) {
                collageTextInput.setText(aVar.f22589e);
            }
            collageTextInput.setErrorText(str);
            collageTextInput.setRequired(false);
            collageTextInput.setMinLines(3);
            collageTextInput.setMaxLines(3);
            collageTextInput.setCounterMaxLength(aVar.f22587c);
            TextinputKt.m18959a(collageTextInput, new PersonalizationOptionalViewHolder$bind$2$1(this));
            return;
        }
        throw new IllegalArgumentException();
    }
}
