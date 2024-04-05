package com.etsy.android.vespa.viewholders;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import p415of.C13171a;

/* renamed from: com.etsy.android.vespa.viewholders.h0 */
public final class C12093h0 extends C12086e<UserAction> {

    /* renamed from: c */
    public final C13171a f26974c;

    /* renamed from: d */
    public final TextView f26975d = ((TextView) mo38986f(R.id.text));

    /* renamed from: e */
    public final ImageView f26976e = ((ImageView) mo38986f(R.id.icon));

    public C12093h0(ViewGroup viewGroup, C13171a aVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_bottom_sheet_user_action, viewGroup, false));
        this.f26974c = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        int identifier;
        UserAction userAction = (UserAction) obj;
        this.f26975d.setText(userAction.getDisplayName());
        this.f26976e.setVisibility(8);
        if (!TextUtils.isEmpty(userAction.getIconName()) && (identifier = this.itemView.getResources().getIdentifier(userAction.getIconName(), "drawable", this.itemView.getContext().getPackageName())) > 0) {
            this.f26976e.setImageResource(identifier);
            this.f26976e.setVisibility(0);
        }
        if (this.f26974c != null) {
            this.itemView.setOnClickListener(new C12091g0(this, userAction));
        }
    }
}
