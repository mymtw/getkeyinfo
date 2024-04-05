package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.m0 */
public final class C9197m0 extends C12086e<IVespaListSectionHeader> {

    /* renamed from: c */
    public TextView f20297c;

    /* renamed from: d */
    public TextView f20298d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9197m0(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.section_header_no_view_all, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        IVespaListSectionHeader iVespaListSectionHeader = (IVespaListSectionHeader) obj;
        C19383o.m32797g(iVespaListSectionHeader, "basicSectionHeader");
        View view = this.itemView;
        View findViewById = view.findViewById(R.id.headerTitle);
        C19383o.m32796f(findViewById, "findViewById(R.id.headerTitle)");
        this.f20298d = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.headerSubtitle);
        C19383o.m32796f(findViewById2, "findViewById(R.id.headerSubtitle)");
        this.f20297c = (TextView) findViewById2;
        if (C18263b.m30837c0(iVespaListSectionHeader.getTitle())) {
            TextView textView = this.f20298d;
            if (textView != null) {
                textView.setText(iVespaListSectionHeader.getTitle());
                TextView textView2 = this.f20298d;
                if (textView2 != null) {
                    ViewExtensions.m12869m(textView2);
                } else {
                    C19383o.m32805o("headerTitle");
                    throw null;
                }
            } else {
                C19383o.m32805o("headerTitle");
                throw null;
            }
        } else {
            TextView textView3 = this.f20298d;
            if (textView3 != null) {
                ViewExtensions.m12860d(textView3);
            } else {
                C19383o.m32805o("headerTitle");
                throw null;
            }
        }
        if (C18263b.m30837c0(iVespaListSectionHeader.getSubtitle())) {
            TextView textView4 = this.f20297c;
            if (textView4 != null) {
                textView4.setText(iVespaListSectionHeader.getSubtitle());
                TextView textView5 = this.f20297c;
                if (textView5 != null) {
                    ViewExtensions.m12869m(textView5);
                } else {
                    C19383o.m32805o("headerSubtitle");
                    throw null;
                }
            } else {
                C19383o.m32805o("headerSubtitle");
                throw null;
            }
        } else {
            TextView textView6 = this.f20297c;
            if (textView6 != null) {
                ViewExtensions.m12860d(textView6);
            } else {
                C19383o.m32805o("headerSubtitle");
                throw null;
            }
        }
    }
}
