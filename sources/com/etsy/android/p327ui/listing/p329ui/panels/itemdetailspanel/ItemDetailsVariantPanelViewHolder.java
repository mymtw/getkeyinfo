package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.ListingMachineTranslationHelper;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.stylekit.views.CollageContentToggleShort;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.view.TranslateButton;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;
import p075d.C6614a;
import p466vc.C13573c;
import p568fn.C17782b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsVariantPanelViewHolder */
public final class ItemDetailsVariantPanelViewHolder extends C10424k {

    /* renamed from: b */
    public final C11786n f23036b;

    /* renamed from: c */
    public final C13573c f23037c;

    /* renamed from: d */
    public final CollageContentToggle f23038d;

    /* renamed from: e */
    public final TableLayout f23039e;

    /* renamed from: f */
    public final TextView f23040f;

    /* renamed from: g */
    public final CollageContentToggleShort f23041g;

    /* renamed from: h */
    public final Button f23042h;

    /* renamed from: i */
    public final TranslateButton f23043i;

    /* renamed from: j */
    public final ArrayList f23044j = new ArrayList();

    /* renamed from: k */
    public boolean f23045k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemDetailsVariantPanelViewHolder(ViewGroup viewGroup, C13573c cVar, C11786n nVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_item_details_panel, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23036b = nVar;
        this.f23037c = cVar;
        View findViewById = this.itemView.findViewById(R.id.item_details_panel);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.item_details_panel)");
        CollageContentToggle collageContentToggle = (CollageContentToggle) findViewById;
        this.f23038d = collageContentToggle;
        ConstraintLayout constraintLayout = (ConstraintLayout) C0114h.m305j0(collageContentToggle, R.layout.list_item_listing_item_details_variant_panel_content, true);
        View findViewById2 = this.itemView.findViewById(R.id.table_item_details);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.table_item_details)");
        this.f23039e = (TableLayout) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.inline_item_description);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.….inline_item_description)");
        this.f23040f = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.expandable_item_description);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…andable_item_description)");
        this.f23041g = (CollageContentToggleShort) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.button_read_item_description);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.…on_read_item_description)");
        this.f23042h = (Button) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.machine_translation_one_click);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.…ne_translation_one_click)");
        this.f23043i = (TranslateButton) findViewById6;
        mo34056f(5);
    }

    /* renamed from: b */
    public final void mo33629b() {
        EtsyLinkify.m19614h(this.f23040f);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof ItemDetailsPanel) {
            ItemDetailsPanel itemDetailsPanel = (ItemDetailsPanel) jVar;
            if (C19543e0.m33306Y(itemDetailsPanel.f23011c)) {
                int size = itemDetailsPanel.f23011c.size() - this.f23044j.size();
                if (size > 0) {
                    mo34056f(size);
                } else {
                    int abs = Math.abs(size);
                    int i = 1;
                    if (1 <= abs) {
                        while (true) {
                            ArrayList arrayList = this.f23044j;
                            ViewExtensions.m12860d((View) arrayList.get(arrayList.size() - i));
                            if (i == abs) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                int i2 = 0;
                for (T next : itemDetailsPanel.f23011c) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C10487a aVar = (C10487a) next;
                        ConstraintLayout constraintLayout = (ConstraintLayout) this.f23044j.get(i2);
                        TextView textView = (TextView) constraintLayout.findViewById(R.id.detail_text);
                        ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.detail_icon);
                        textView.setText(aVar.f23047b);
                        textView.setContentDescription(aVar.f23047b);
                        imageView.setImageDrawable(C6614a.m12981a(this.itemView.getContext(), aVar.f23046a));
                        imageView.setContentDescription(aVar.f23047b);
                        i2 = i3;
                    } else {
                        C17782b.m29877o0();
                        throw null;
                    }
                }
            }
            ListingMachineTranslationHelper listingMachineTranslationHelper = new ListingMachineTranslationHelper(this.f23043i, this.f23036b, this.f23037c);
            Boolean bool = itemDetailsPanel.f23014f;
            if (bool == null) {
                return;
            }
            if (bool.booleanValue()) {
                this.f23040f.setText(itemDetailsPanel.f23012d);
                Context context = this.itemView.getContext();
                C19383o.m32796f(context, "itemView.context");
                EtsyLinkify.m19612f(context, this.f23040f, false, (C19846a) null, 28);
                ViewExtensions.m12860d(listingMachineTranslationHelper.f22362e);
                listingMachineTranslationHelper.mo33547a(itemDetailsPanel.f23022n, itemDetailsPanel.mo34050b(), (C19846a<C19394m>) null);
                if (C19383o.m32792b(itemDetailsPanel.f23015g, Boolean.TRUE)) {
                    ViewExtensions.m12869m(this.f23041g);
                    ViewExtensions.m12860d(this.f23040f);
                    ViewExtensions.m12860d(this.f23042h);
                    CollageContentToggleShort collageContentToggleShort = this.f23041g;
                    collageContentToggleShort.setContentText((CharSequence) String.valueOf(itemDetailsPanel.f23012d));
                    collageContentToggleShort.setMaxChars(C19388s.m32857c0(this.f23040f) * 3);
                    collageContentToggleShort.setOnExpandListener(new ItemDetailsVariantPanelViewHolder$bind$2$1$1(collageContentToggleShort, this));
                    if (this.f23045k) {
                        this.f23041g.expand();
                    }
                    Context context2 = this.itemView.getContext();
                    C19383o.m32796f(context2, "itemView.context");
                    EtsyLinkify.m19612f(context2, this.f23041g, false, (C19846a) null, 28);
                    return;
                }
                ViewExtensions.m12869m(this.f23040f);
                ViewExtensions.m12860d(this.f23042h);
                ViewExtensions.m12860d(this.f23041g);
                this.f23040f.setText(itemDetailsPanel.f23012d);
                Context context3 = this.itemView.getContext();
                C19383o.m32796f(context3, "itemView.context");
                EtsyLinkify.m19612f(context3, this.f23040f, false, (C19846a) null, 28);
                return;
            }
            ViewExtensions.m12860d(this.f23040f);
            ViewExtensions.m12869m(this.f23042h);
            ViewExtensions.m12860d(this.f23041g);
            ViewExtensions.m12860d(listingMachineTranslationHelper.f22358a);
            ViewExtensions.m12860d(listingMachineTranslationHelper.f22362e);
            ViewExtensions.m12860d(listingMachineTranslationHelper.f22361d);
            ViewExtensions.m12860d(listingMachineTranslationHelper.f22363f);
            ViewExtensions.m12860d(listingMachineTranslationHelper.f22364g);
            ViewExtensions.m12866j(this.f23042h, new ItemDetailsVariantPanelViewHolder$bind$2$2(jVar, this));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final void mo34056f(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ConstraintLayout constraintLayout = (ConstraintLayout) C0114h.m305j0(this.f23038d, R.layout.listing_item_detail_variant_item, false);
            this.f23039e.addView(constraintLayout);
            this.f23044j.add(constraintLayout);
        }
    }
}
