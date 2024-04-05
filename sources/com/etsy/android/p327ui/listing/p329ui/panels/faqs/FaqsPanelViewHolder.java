package com.etsy.android.p327ui.listing.p329ui.panels.faqs;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import com.etsy.android.uikit.view.TranslateButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13597g;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanelViewHolder */
public final class FaqsPanelViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22984b;

    /* renamed from: c */
    public final C11786n f22985c;

    /* renamed from: d */
    public final CollageContentToggle f22986d;

    /* renamed from: e */
    public final TranslateButton f22987e;

    /* renamed from: f */
    public final TextView f22988f;

    /* renamed from: g */
    public final Button f22989g;

    /* renamed from: h */
    public final LoadingIndicatorView f22990h;

    /* renamed from: i */
    public final TextView f22991i;

    /* renamed from: j */
    public final ArrayList f22992j = new ArrayList();

    /* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanelViewHolder$a */
    public static final class C10463a {

        /* renamed from: a */
        public final View f22993a;

        /* renamed from: b */
        public final TextView f22994b;

        /* renamed from: c */
        public final TextView f22995c;

        public C10463a(View view, TextView textView, TextView textView2) {
            this.f22993a = view;
            this.f22994b = textView;
            this.f22995c = textView2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10463a)) {
                return false;
            }
            C10463a aVar = (C10463a) obj;
            return C19383o.m32792b(this.f22993a, aVar.f22993a) && C19383o.m32792b(this.f22994b, aVar.f22994b) && C19383o.m32792b(this.f22995c, aVar.f22995c);
        }

        public final int hashCode() {
            int hashCode = this.f22994b.hashCode();
            return this.f22995c.hashCode() + ((hashCode + (this.f22993a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FaqView(parent=");
            h.append(this.f22993a);
            h.append(", question=");
            h.append(this.f22994b);
            h.append(", answer=");
            h.append(this.f22995c);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanelViewHolder$b */
    public /* synthetic */ class C10464b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22996a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f22997b;

        static {
            int[] iArr = new int[FaqsPanel.LanguageState.values().length];
            iArr[FaqsPanel.LanguageState.ORIGINAL.ordinal()] = 1;
            iArr[FaqsPanel.LanguageState.ALTERNATE.ordinal()] = 2;
            f22996a = iArr;
            int[] iArr2 = new int[MachineTranslationViewState.values().length];
            iArr2[MachineTranslationViewState.VISIBLE.ordinal()] = 1;
            iArr2[MachineTranslationViewState.GONE.ordinal()] = 2;
            iArr2[MachineTranslationViewState.LOADING.ordinal()] = 3;
            iArr2[MachineTranslationViewState.ERROR.ordinal()] = 4;
            f22997b = iArr2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaqsPanelViewHolder(ViewGroup viewGroup, C13573c cVar, C11786n nVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_faqs_panel, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f22984b = cVar;
        this.f22985c = nVar;
        View findViewById = this.itemView.findViewById(R.id.faqs_panel);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.faqs_panel)");
        CollageContentToggle collageContentToggle = (CollageContentToggle) findViewById;
        this.f22986d = collageContentToggle;
        View findViewById2 = this.itemView.findViewById(R.id.faqs_translation_view);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.faqs_translation_view)");
        TranslateButton translateButton = (TranslateButton) findViewById2;
        this.f22987e = translateButton;
        View findViewById3 = translateButton.findViewById(R.id.translate_disclaimer);
        C19383o.m32796f(findViewById3, "translationView.findView….id.translate_disclaimer)");
        this.f22988f = (TextView) findViewById3;
        View findViewById4 = translateButton.findViewById(R.id.translate_button);
        C19383o.m32796f(findViewById4, "translationView.findView…Id(R.id.translate_button)");
        this.f22989g = (Button) findViewById4;
        View findViewById5 = translateButton.findViewById(R.id.translate_loading_spinner);
        C19383o.m32796f(findViewById5, "translationView.findView…ranslate_loading_spinner)");
        this.f22990h = (LoadingIndicatorView) findViewById5;
        View findViewById6 = translateButton.findViewById(R.id.translate_error);
        C19383o.m32796f(findViewById6, "translationView.findViewById(R.id.translate_error)");
        this.f22991i = (TextView) findViewById6;
        C0761x.m1669H(new C19857l<Boolean, C19394m>(this) {
            public final /* synthetic */ FaqsPanelViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C19394m.f43287a;
            }

            public final void invoke(boolean z) {
                this.this$0.f22984b.mo38043a(new C13597g.C13676l0(z));
            }
        }, collageContentToggle);
        for (int i = 0; i < 9; i++) {
            mo34023f();
        }
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof FaqsPanel) {
            FaqsPanel faqsPanel = (FaqsPanel) jVar;
            int i = C10464b.f22997b[faqsPanel.f22978d.ordinal()];
            if (i == 1) {
                ViewExtensions.m12869m(this.f22987e);
                ViewExtensions.m12860d(this.f22990h);
                ViewExtensions.m12860d(this.f22991i);
                int i2 = C10464b.f22996a[faqsPanel.f22977c.ordinal()];
                if (i2 == 1) {
                    ViewExtensions.m12860d(this.f22988f);
                    this.f22989g.setText(this.f22985c.mo38059c(R.string.translate, new Object[0]));
                } else if (i2 == 2) {
                    ViewExtensions.m12869m(this.f22988f);
                    this.f22989g.setText(this.f22985c.mo38059c(R.string.see_original, new Object[0]));
                }
                ViewExtensions.m12866j(this.f22989g, new FaqsPanelViewHolder$bind$1(this));
            } else if (i == 2) {
                ViewExtensions.m12860d(this.f22987e);
            } else if (i == 3) {
                ViewExtensions.m12860d(this.f22988f);
                ViewExtensions.m12869m(this.f22990h);
                ViewExtensions.m12860d(this.f22991i);
            } else if (i == 4) {
                ViewExtensions.m12860d(this.f22988f);
                ViewExtensions.m12860d(this.f22990h);
                ViewExtensions.m12869m(this.f22991i);
            }
            int size = faqsPanel.f22975a.size();
            int size2 = size - this.f22992j.size();
            if (size2 > 0) {
                for (int i3 = 0; i3 < size2; i3++) {
                    mo34023f();
                }
            }
            int size3 = this.f22992j.size() - size;
            if (size3 > 0 && 1 <= size3) {
                int i4 = 1;
                while (true) {
                    ArrayList arrayList = this.f22992j;
                    ViewExtensions.m12860d(((C10463a) arrayList.get(arrayList.size() - i4)).f22993a);
                    if (i4 == size3) {
                        break;
                    }
                    i4++;
                }
            }
            int i5 = C10464b.f22996a[faqsPanel.f22977c.ordinal()];
            if (i5 == 1) {
                mo34024g(faqsPanel.f22975a);
            } else if (i5 == 2) {
                mo34024g(faqsPanel.f22976b);
            }
            this.f22986d.setExpanded(faqsPanel.f22979e);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final void mo34023f() {
        View j0 = C0114h.m305j0(this.f22986d, R.layout.list_item_faq_panel_item, false);
        View findViewById = j0.findViewById(R.id.faq_question);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.faq_question)");
        View findViewById2 = j0.findViewById(R.id.faq_answer);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.faq_answer)");
        C10463a aVar = new C10463a(j0, (TextView) findViewById, (TextView) findViewById2);
        this.f22986d.addView(j0);
        this.f22992j.add(aVar);
    }

    /* renamed from: g */
    public final void mo34024g(List<FaqsPanel.C10461a> list) {
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                FaqsPanel.C10461a aVar = (FaqsPanel.C10461a) next;
                C10463a aVar2 = (C10463a) this.f22992j.get(i);
                aVar2.f22994b.setText(aVar.f22982c);
                aVar2.f22995c.setText(aVar.f22983d);
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
    }
}
