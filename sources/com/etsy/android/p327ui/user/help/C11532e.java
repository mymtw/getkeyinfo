package com.etsy.android.p327ui.user.help;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.help.HelpPhoneNumbersFragment;
import com.etsy.android.uikit.adapter.C11829a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.help.e */
public final class C11532e extends C11829a<PhoneRegion> {

    /* renamed from: b */
    public final HelpPhoneNumbersFragment.C11526a f25438b;

    /* renamed from: com.etsy.android.ui.user.help.e$a */
    public final class C11533a extends RecyclerView.C3084b0 {
        public C11533a(View view) {
            super(view);
        }
    }

    public C11532e(FragmentActivity fragmentActivity, HelpPhoneNumbersFragment.C11527b bVar) {
        super(fragmentActivity);
        this.f25438b = bVar;
    }

    public final int getListItemViewType(int i) {
        return 0;
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32797g(b0Var, "viewHolder");
        PhoneRegion phoneRegion = (PhoneRegion) getItem(i);
        C11533a aVar = (C11533a) b0Var;
        C19383o.m32796f(phoneRegion, "regionItem");
        ((TextView) aVar.itemView.findViewById(R.id.txt_phone_region)).setText(phoneRegion.f25424a);
        ((TextView) aVar.itemView.findViewById(R.id.txt_phone_number)).setText(phoneRegion.f25425b);
        View view = aVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new PhoneNumberAdapter$PhoneNumberViewHolder$bind$1(C11532e.this, phoneRegion));
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C11533a(C0114h.m305j0(viewGroup, R.layout.list_item_phonenumber, false));
    }
}
