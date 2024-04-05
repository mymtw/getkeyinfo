package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p013v4.media.C0069a;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p396mb.C13036b;
import p396mb.C13037c;
import p396mb.C13042h;
import p404nb.C13100a;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.required.PersonalizationRequiredViewHolder */
public final class PersonalizationRequiredViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22592b;

    /* renamed from: c */
    public final Button f22593c;

    /* renamed from: d */
    public final TextView f22594d;

    /* renamed from: e */
    public final CollageTextInput f22595e;

    /* renamed from: f */
    public final C13037c f22596f;

    /* renamed from: g */
    public final C13036b f22597g;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.required.PersonalizationRequiredViewHolder$a */
    public static final class C10284a implements C13042h.C13043a {

        /* renamed from: a */
        public final /* synthetic */ PersonalizationRequiredViewHolder f22598a;

        public C10284a(PersonalizationRequiredViewHolder personalizationRequiredViewHolder) {
            this.f22598a = personalizationRequiredViewHolder;
        }

        /* renamed from: a */
        public final boolean mo30839a(Bundle bundle) {
            this.f22598a.f22593c.performClick();
            return true;
        }
    }

    public PersonalizationRequiredViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_personalization_required, false));
        this.f22592b = cVar;
        View findViewById = this.itemView.findViewById(R.id.button_personalization_toggle);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…n_personalization_toggle)");
        this.f22593c = (Button) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_personalization_description);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…sonalization_description)");
        this.f22594d = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.text_input_personalization);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…xt_input_personalization)");
        this.f22595e = (CollageTextInput) findViewById3;
        C10284a aVar = new C10284a(this);
        this.f22596f = new C13037c(aVar);
        this.f22597g = new C13036b(aVar);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10285a) {
            C10285a aVar = (C10285a) jVar;
            if (aVar.f22599a) {
                C13100a.m20773d(this.f22593c, this.f22596f, this.f22597g);
                ViewExtensions.m12869m(this.f22594d);
                ViewExtensions.m12869m(this.f22595e);
            } else {
                C13100a.m20773d(this.f22593c, this.f22597g, this.f22596f);
                ViewExtensions.m12860d(this.f22594d);
                ViewExtensions.m12860d(this.f22595e);
            }
            this.f22594d.setText(aVar.f22600b);
            Button button = this.f22593c;
            Context context = this.itemView.getContext();
            int i = aVar.f22599a ? R.drawable.clg_icon_core_minus_v1 : R.drawable.clg_icon_core_add_v1;
            Object obj = C8184a.f17966a;
            Drawable b = C8184a.C8187c.m16466b(context, i);
            if (b != null) {
                button.setCompoundDrawablesWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            button.setContentDescription(this.f22593c.getText() + ' ' + this.itemView.getContext().getString(R.string.required_content_description));
            ViewExtensions.m12867k(button, false, new PersonalizationRequiredViewHolder$bind$1$2(this));
            Integer num = aVar.f22602d;
            String string = num != null ? this.itemView.getContext().getString(num.intValue()) : null;
            CollageTextInput collageTextInput = this.f22595e;
            collageTextInput.setTextChangeListener((TextWatcher) null);
            if (!C19383o.m32792b(collageTextInput.getText(), aVar.f22603e)) {
                collageTextInput.setText(aVar.f22603e);
            }
            collageTextInput.setErrorText(string);
            collageTextInput.setRequired(true);
            collageTextInput.setMinLines(3);
            collageTextInput.setMaxLines(3);
            collageTextInput.setCounterMaxLength(aVar.f22601c);
            TextinputKt.m18959a(collageTextInput, new PersonalizationRequiredViewHolder$bind$2$1(this));
            return;
        }
        throw new IllegalArgumentException();
    }
}
