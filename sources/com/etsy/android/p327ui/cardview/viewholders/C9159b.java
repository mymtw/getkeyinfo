package com.etsy.android.p327ui.cardview.viewholders;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import p423pf.C13236g;

/* renamed from: com.etsy.android.ui.cardview.viewholders.b */
public final class C9159b extends C12086e<BaseActionableItem> {

    /* renamed from: c */
    public final C13236g f20144c;

    /* renamed from: d */
    public final TextView f20145d = ((TextView) mo38986f(R.id.txt_module_title));

    /* renamed from: e */
    public final View f20146e = mo38986f(R.id.btn_menu);

    public C9159b(ViewGroup viewGroup, C13236g gVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_actionable_header, viewGroup, false));
        this.f20144c = gVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        BaseActionableItem baseActionableItem = (BaseActionableItem) obj;
        BasicSectionHeader basicSectionHeader = (BasicSectionHeader) baseActionableItem.getData();
        int i = 0;
        if (!TextUtils.isEmpty(basicSectionHeader.getIcon())) {
            String title = basicSectionHeader.getTitle();
            String icon = basicSectionHeader.getIcon();
            Resources resources = this.itemView.getResources();
            int identifier = resources.getIdentifier(C0326j.m864i("sk_ic_", icon), "drawable", this.itemView.getContext().getPackageName());
            if (identifier > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(title);
                spannableStringBuilder.insert(0, "  ");
                VectorDrawableCompat create = VectorDrawableCompat.create(resources, identifier, this.itemView.getContext().getTheme());
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.text_view_icon_drawable_medium);
                create.setTint(resources.getColor(R.color.clg_color_black));
                create.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                spannableStringBuilder.setSpan(new ImageSpan(create, 1), 0, 1, 33);
                this.f20145d.setText(spannableStringBuilder);
            } else {
                this.f20145d.setText(title);
            }
        } else {
            this.f20145d.setText(basicSectionHeader.getTitle());
        }
        View view = this.f20146e;
        if (baseActionableItem.getActions().size() <= 0) {
            i = 4;
        }
        view.setVisibility(i);
        if (baseActionableItem.getActions().size() > 0 && this.f20144c != null) {
            this.f20146e.setOnClickListener(new C9156a(this, baseActionableItem));
        }
    }
}
