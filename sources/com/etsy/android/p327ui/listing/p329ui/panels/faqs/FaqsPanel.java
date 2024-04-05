package com.etsy.android.p327ui.listing.p329ui.panels.faqs;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p498zc.C13949d;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel */
public final class FaqsPanel extends C10423j implements C13949d {

    /* renamed from: a */
    public final List<C10461a> f22975a;

    /* renamed from: b */
    public final List<C10461a> f22976b;

    /* renamed from: c */
    public final LanguageState f22977c;

    /* renamed from: d */
    public final MachineTranslationViewState f22978d;

    /* renamed from: e */
    public final boolean f22979e;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel$LanguageState */
    public enum LanguageState {
        ORIGINAL,
        ALTERNATE
    }

    /* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel$a */
    public static final class C10461a {

        /* renamed from: a */
        public final long f22980a;

        /* renamed from: b */
        public final String f22981b;

        /* renamed from: c */
        public final String f22982c;

        /* renamed from: d */
        public final String f22983d;

        public C10461a(long j, String str, String str2, String str3) {
            C19383o.m32797g(str, "language");
            this.f22980a = j;
            this.f22981b = str;
            this.f22982c = str2;
            this.f22983d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10461a)) {
                return false;
            }
            C10461a aVar = (C10461a) obj;
            return this.f22980a == aVar.f22980a && C19383o.m32792b(this.f22981b, aVar.f22981b) && C19383o.m32792b(this.f22982c, aVar.f22982c) && C19383o.m32792b(this.f22983d, aVar.f22983d);
        }

        public final int hashCode() {
            return this.f22983d.hashCode() + C0023f.m105e(this.f22982c, C0023f.m105e(this.f22981b, Long.hashCode(this.f22980a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Faq(id=");
            h.append(this.f22980a);
            h.append(", language=");
            h.append(this.f22981b);
            h.append(", question=");
            h.append(this.f22982c);
            h.append(", answer=");
            return C0391c.m1057c(h, this.f22983d, ')');
        }
    }

    public FaqsPanel(List<C10461a> list, List<C10461a> list2, LanguageState languageState, MachineTranslationViewState machineTranslationViewState, boolean z) {
        C19383o.m32797g(list, "faqs");
        C19383o.m32797g(list2, "faqsInAlternateLanguage");
        C19383o.m32797g(languageState, "languageState");
        C19383o.m32797g(machineTranslationViewState, "machineTranslationViewState");
        this.f22975a = list;
        this.f22976b = list2;
        this.f22977c = languageState;
        this.f22978d = machineTranslationViewState;
        this.f22979e = z;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.FAQS_PANEL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaqsPanel)) {
            return false;
        }
        FaqsPanel faqsPanel = (FaqsPanel) obj;
        return C19383o.m32792b(this.f22975a, faqsPanel.f22975a) && C19383o.m32792b(this.f22976b, faqsPanel.f22976b) && this.f22977c == faqsPanel.f22977c && this.f22978d == faqsPanel.f22978d && this.f22979e == faqsPanel.f22979e;
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f22976b, this.f22975a.hashCode() * 31, 31);
        int hashCode = (this.f22978d.hashCode() + ((this.f22977c.hashCode() + g) * 31)) * 31;
        boolean z = this.f22979e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FaqsPanel(faqs=");
        h.append(this.f22975a);
        h.append(", faqsInAlternateLanguage=");
        h.append(this.f22976b);
        h.append(", languageState=");
        h.append(this.f22977c);
        h.append(", machineTranslationViewState=");
        h.append(this.f22978d);
        h.append(", isExpanded=");
        return C0391c.m1058d(h, this.f22979e, ')');
    }
}
