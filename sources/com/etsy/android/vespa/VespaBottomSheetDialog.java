package com.etsy.android.vespa;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.vespa.viewholders.C12083c0;
import com.etsy.android.vespa.viewholders.C12086e;
import com.etsy.android.vespa.viewholders.C12087e0;
import com.etsy.android.vespa.viewholders.C12093h0;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p357gf.C12796e;
import p415of.C13171a;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13179h;
import p415of.C13180i;
import p415of.C13182k;
import p415of.C13186o;
import p423pf.C13239i;
import p487ya.C13895a;

public class VespaBottomSheetDialog extends BottomSheetDialog {
    private final C13173c mAdapter;

    /* renamed from: com.etsy.android.vespa.VespaBottomSheetDialog$a */
    public class C12073a extends C13172b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12073a(Fragment fragment, C8703p pVar) {
            super(new C13179h(fragment, pVar, (C13180i) null, (C13182k) null));
            C19383o.m32797g(fragment, "value");
            C19383o.m32797g(pVar, "value");
        }

        /* renamed from: b */
        public final C12086e mo31854b(ViewGroup viewGroup, int i) {
            if (i == R.id.view_type_single_line_text) {
                return new C12087e0(viewGroup, mo45891c(i));
            }
            if (i == R.id.view_type_bottom_sheet_list_item) {
                return new C12093h0(viewGroup, mo45891c(i));
            }
            if (i == R.id.view_type_multishop_shop_header) {
                return new C12083c0(viewGroup, (C13239i) mo45891c(i), this.f28983b);
            }
            return null;
        }
    }

    public VespaBottomSheetDialog(Fragment fragment, C8703p pVar) {
        super(fragment.requireActivity());
        RecyclerView recyclerView = new RecyclerView(fragment.requireActivity());
        setContentView((View) recyclerView);
        fragment.requireActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C13173c cVar = new C13173c(fragment, pVar, (C13182k) null, (C13895a) null, (C8923u) null, (C12796e) null);
        this.mAdapter = cVar;
        cVar.f28991c.mo45890a(new C12073a(fragment, pVar));
        recyclerView.setAdapter(cVar);
    }

    public void addItem(C13186o oVar) {
        this.mAdapter.addItem(oVar);
    }

    public void addItems(List<? extends C13186o> list) {
        this.mAdapter.addItems(list);
    }

    public void registerItemClickHandler(int i, C13171a aVar) {
        this.mAdapter.mo45897p(i, aVar);
    }

    public void addItem(ServerDrivenAction serverDrivenAction) {
        this.mAdapter.addItem(serverDrivenAction);
    }
}
