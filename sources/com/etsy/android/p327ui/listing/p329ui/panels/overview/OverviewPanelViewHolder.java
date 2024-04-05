package com.etsy.android.p327ui.listing.p329ui.panels.overview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import p466vc.C13573c;
import p466vc.C13597g;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.overview.OverviewPanelViewHolder */
public final class OverviewPanelViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f23062b;

    /* renamed from: c */
    public final CollageContentToggle f23063c;

    /* renamed from: d */
    public final TableLayout f23064d;

    /* renamed from: e */
    public final ArrayList f23065e = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverviewPanelViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_overview_panel, false));
        this.f23062b = cVar;
        View findViewById = this.itemView.findViewById(R.id.overview_panel);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.overview_panel)");
        CollageContentToggle collageContentToggle = (CollageContentToggle) findViewById;
        this.f23063c = collageContentToggle;
        View findViewById2 = this.itemView.findViewById(R.id.table_overview);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.table_overview)");
        this.f23064d = (TableLayout) findViewById2;
        C0761x.m1669H(new C19857l<Boolean, C19394m>(this) {
            public final /* synthetic */ OverviewPanelViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C19394m.f43287a;
            }

            public final void invoke(boolean z) {
                this.this$0.f23062b.mo38043a(new C13597g.C13706p2(z));
            }
        }, collageContentToggle);
        mo34099f(false);
        for (int i = 0; i < 9; i++) {
            mo34099f(true);
        }
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10518b) {
            C10518b bVar = (C10518b) jVar;
            int size = bVar.f23067a.size();
            int size2 = size - this.f23065e.size();
            int i = 0;
            int i2 = 1;
            if (size2 > 0) {
                for (int i3 = 0; i3 < size2; i3++) {
                    mo34099f(true);
                }
            }
            int size3 = this.f23065e.size() - size;
            if (size3 > 0 && 1 <= size3) {
                while (true) {
                    ArrayList arrayList = this.f23065e;
                    ViewExtensions.m12860d((View) arrayList.get(arrayList.size() - i2));
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                }
            }
            for (T next : bVar.f23067a) {
                int i4 = i + 1;
                if (i >= 0) {
                    CharSequence charSequence = (CharSequence) next;
                    TextView textView = (TextView) ((TableRow) this.f23065e.get(i)).findViewById(R.id.line_body_text_view);
                    if (!C19383o.m32792b(textView.getText(), charSequence)) {
                        textView.setText(charSequence);
                    }
                    i = i4;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
            if (!bVar.f23069c) {
                this.f23062b.mo38043a(C13597g.C13754w1.f30282a);
            }
            this.f23063c.setExpanded(bVar.f23068b);
            return;
        }
        throw new IllegalArgumentException();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: f */
    public final void mo34099f(boolean z) {
        TableRow tableRow = (TableRow) C0114h.m305j0(this.f23063c, R.layout.list_item_listing_overview_panel_item, false);
        tableRow.setGravity(48);
        TextView textView = (TextView) tableRow.findViewById(R.id.line_bullet_text_view);
        if (z) {
            Context context = this.f23063c.getContext();
            C19383o.m32796f(context, "panel.context");
            C19421p.m32938f0(C19543e0.m33295K(2, context), tableRow);
        }
        textView.setText(C18263b.m30818M(StructuredShopPoliciesView.BULLET_POINT_AND_SPACE));
        this.f23064d.addView(tableRow);
        this.f23065e.add(tableRow);
    }
}
