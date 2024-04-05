package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.listing.ui.c */
public final class C10406c {

    /* renamed from: a */
    public List<FaqsPanel.C10461a> f22774a;

    /* renamed from: b */
    public List<FaqsPanel.C10461a> f22775b;

    /* renamed from: c */
    public FaqsPanel.LanguageState f22776c;

    /* renamed from: d */
    public MachineTranslationViewState f22777d;

    /* renamed from: e */
    public boolean f22778e;

    public C10406c() {
        throw null;
    }

    public C10406c(FaqsPanel faqsPanel) {
        List<FaqsPanel.C10461a> list = faqsPanel.f22975a;
        List<FaqsPanel.C10461a> list2 = faqsPanel.f22976b;
        FaqsPanel.LanguageState languageState = faqsPanel.f22977c;
        MachineTranslationViewState machineTranslationViewState = faqsPanel.f22978d;
        boolean z = faqsPanel.f22979e;
        C19383o.m32797g(list, "faqs");
        C19383o.m32797g(list2, "faqsInAlternateLanguage");
        C19383o.m32797g(languageState, "languageState");
        C19383o.m32797g(machineTranslationViewState, "machineTranslationViewState");
        this.f22774a = list;
        this.f22775b = list2;
        this.f22776c = languageState;
        this.f22777d = machineTranslationViewState;
        this.f22778e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10406c)) {
            return false;
        }
        C10406c cVar = (C10406c) obj;
        return C19383o.m32792b(this.f22774a, cVar.f22774a) && C19383o.m32792b(this.f22775b, cVar.f22775b) && this.f22776c == cVar.f22776c && this.f22777d == cVar.f22777d && this.f22778e == cVar.f22778e;
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f22775b, this.f22774a.hashCode() * 31, 31);
        int hashCode = (this.f22777d.hashCode() + ((this.f22776c.hashCode() + g) * 31)) * 31;
        boolean z = this.f22778e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FaqsPanelBuilder(faqs=");
        h.append(this.f22774a);
        h.append(", faqsInAlternateLanguage=");
        h.append(this.f22775b);
        h.append(", languageState=");
        h.append(this.f22776c);
        h.append(", machineTranslationViewState=");
        h.append(this.f22777d);
        h.append(", isExpanded=");
        return C0391c.m1058d(h, this.f22778e, ')');
    }
}
