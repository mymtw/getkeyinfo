package com.braze.p044ui.contentcards.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p043ui.C4940R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.contentcards.adapters.c */
public final class C5637c extends RecyclerView.Adapter<RecyclerView.C3084b0> {

    /* renamed from: com.braze.ui.contentcards.adapters.c$a */
    public static final class C5638a extends RecyclerView.C3084b0 {
        public C5638a(View view) {
            super(view);
        }
    }

    public final int getItemCount() {
        return 1;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32797g(b0Var, "viewHolder");
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4940R.C4943layout.com_braze_content_cards_empty, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        return new C5638a(inflate);
    }
}
