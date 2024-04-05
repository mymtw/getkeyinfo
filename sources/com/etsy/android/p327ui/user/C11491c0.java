package com.etsy.android.p327ui.user;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageListItem;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.c0 */
public final class C11491c0 extends RecyclerView.Adapter<C11492a> {

    /* renamed from: b */
    public final C19857l<C11489b0, C19394m> f25359b;

    /* renamed from: c */
    public List<C11489b0> f25360c = EmptyList.INSTANCE;

    /* renamed from: com.etsy.android.ui.user.c0$a */
    public static final class C11492a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final CollageListItem f25361b;

        /* renamed from: c */
        public final CollageCheckbox f25362c;

        static {
            CollageCheckbox.C9026b bVar = CollageCheckbox.Companion;
            int i = CollageListItem.$stable;
        }

        public C11492a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.settings_list_item);
            C19383o.m32796f(findViewById, "itemView.findViewById(R.id.settings_list_item)");
            this.f25361b = (CollageListItem) findViewById;
            View findViewById2 = view.findViewById(R.id.settings_checkbox_item);
            C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.settings_checkbox_item)");
            this.f25362c = (CollageCheckbox) findViewById2;
        }
    }

    public C11491c0(C19857l<? super C11489b0, C19394m> lVar) {
        this.f25359b = lVar;
    }

    public final int getItemCount() {
        return this.f25360c.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C11492a aVar = (C11492a) b0Var;
        C19383o.m32797g(aVar, "viewHolder");
        C11489b0 b0Var2 = this.f25360c.get(i);
        C19857l<C11489b0, C19394m> lVar = this.f25359b;
        C19383o.m32797g(b0Var2, "settingsItem");
        C19383o.m32797g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        CollageListItem collageListItem = aVar.f25361b;
        CollageCheckbox collageCheckbox = aVar.f25362c;
        C19383o.m32797g(collageListItem, "listItem");
        C19383o.m32797g(collageCheckbox, "checkbox");
        collageListItem.setText(b0Var2.f25343a);
        collageCheckbox.setText(b0Var2.f25343a);
        collageListItem.setEnabled(b0Var2.f25345c);
        collageCheckbox.setEnabled(b0Var2.f25345c);
        if (b0Var2.f25346d) {
            ViewExtensions.m12869m(collageCheckbox);
            ViewExtensions.m12860d(collageListItem);
            collageCheckbox.setChecked(b0Var2.f25347e);
            collageCheckbox.setOnCheckedChangeListener(new C11359a0(lVar, b0Var2));
        } else {
            ViewExtensions.m12860d(collageCheckbox);
            ViewExtensions.m12869m(collageListItem);
            ViewExtensions.m12866j(collageListItem, new SettingsItem$bind$2(lVar, b0Var2));
        }
        if (b0Var2.f25348f > 0) {
            ((TextView) collageListItem.findViewById(R.id.clg_line_item_meta)).setText(b0Var2.f25348f);
            ViewExtensions.m12869m(collageListItem.findViewById(R.id.clg_line_item_meta));
            return;
        }
        ViewExtensions.m12860d(collageListItem.findViewById(R.id.clg_line_item_meta));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_settings, viewGroup, false);
        C19383o.m32796f(h, "view");
        return new C11492a(h);
    }
}
