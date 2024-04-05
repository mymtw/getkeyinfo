package com.etsy.android.p327ui.conversation.details;

import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.conversation.details.legacy.C9546f;
import com.etsy.android.p327ui.conversation.details.legacy.C9547g;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsFragment;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsPresenter$linkCardBoundListener$1;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsPresenter$translateClickedListener$1;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.adapter.C11829a;
import java.util.List;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p354gc.C12775i;
import p354gc.C12778k;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.conversation.details.g */
public final class C9524g extends C11829a<C12778k> {

    /* renamed from: b */
    public final C8923u f21104b;

    /* renamed from: c */
    public final C9558n f21105c;

    /* renamed from: d */
    public final C9563p f21106d;

    /* renamed from: e */
    public final C9564q f21107e;

    /* renamed from: f */
    public final C9568s f21108f;

    /* renamed from: g */
    public final C9475a f21109g;

    /* renamed from: h */
    public final C19846a<C19394m> f21110h = null;

    /* renamed from: com.etsy.android.ui.conversation.details.g$a */
    public final class C9525a extends RecyclerView.C3084b0 {
        public C9525a(View view) {
            super(view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9524g(FragmentActivity fragmentActivity, C8923u uVar, C9547g gVar, LegacyConversationDetailsPresenter$linkCardBoundListener$1 legacyConversationDetailsPresenter$linkCardBoundListener$1, C9546f fVar, LegacyConversationDetailsPresenter$translateClickedListener$1 legacyConversationDetailsPresenter$translateClickedListener$1, LegacyConversationDetailsFragment.C9533a aVar) {
        super(fragmentActivity);
        C19383o.m32797g(uVar, "translationHelper");
        C19383o.m32797g(gVar, "imageClickedListener");
        C19383o.m32797g(fVar, "linkCardClickListener");
        C19383o.m32797g(legacyConversationDetailsPresenter$translateClickedListener$1, "translateClickedListener");
        this.f21104b = uVar;
        this.f21105c = gVar;
        this.f21106d = legacyConversationDetailsPresenter$linkCardBoundListener$1;
        this.f21107e = fVar;
        this.f21108f = legacyConversationDetailsPresenter$translateClickedListener$1;
        this.f21109g = aVar;
    }

    public final int getListItemViewType(int i) {
        C12778k kVar = (C12778k) getItem(i);
        if (kVar instanceof C12778k.C12779a) {
            return R.layout.list_item_current_user_message;
        }
        if (kVar instanceof C12778k.C12781c) {
            return R.layout.list_item_other_user_message;
        }
        if (kVar instanceof C12778k.C12782d) {
            return R.layout.list_item_conversation_date;
        }
        if (kVar instanceof C12778k.C12780b) {
            return R.layout.list_item_help_with_order_message;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19846a<C19394m> aVar;
        C19383o.m32797g(b0Var, "viewHolder");
        C12778k kVar = (C12778k) getItem(i);
        if (i == getItemCount() - 1 && (aVar = this.f21110h) != null) {
            aVar.invoke();
        }
        C12775i iVar = null;
        if (kVar instanceof C12778k.C12779a) {
            C9563p pVar = this.f21106d;
            if (pVar != null) {
                List<C12775i> list = ((C12778k.C12779a) kVar).f28235b.mo45523a().f28256m;
                if (list != null) {
                    iVar = list.get(0);
                }
                pVar.mo32113a(i, iVar);
            }
            C19383o.m32796f(kVar, "message");
            C12778k.C12779a aVar2 = (C12778k.C12779a) kVar;
            ((C9556m) b0Var).mo31958e(aVar2.f28235b, aVar2.f28236c);
        } else if (kVar instanceof C12778k.C12781c) {
            C9563p pVar2 = this.f21106d;
            if (pVar2 != null) {
                List<C12775i> list2 = ((C12778k.C12781c) kVar).f28239b.mo45523a().f28256m;
                if (list2 != null) {
                    iVar = list2.get(0);
                }
                pVar2.mo32113a(i, iVar);
            }
            C19383o.m32796f(kVar, "message");
            ((OtherUserMessageViewHolder) b0Var).mo31964h((C12778k.C12781c) kVar);
        } else if (kVar instanceof C12778k.C12782d) {
            C9525a aVar3 = (C9525a) b0Var;
            C19383o.m32796f(kVar, "message");
            ((CollageHeadingTextView) aVar3.itemView.findViewById(R.id.date)).setText(DateUtils.formatDateTime(C9524g.this.mContext, ((C12778k.C12782d) kVar).f28243b, 17));
        } else if (kVar instanceof C12778k.C12780b) {
            C19383o.m32796f(kVar, "message");
            ((OrderHelpRequestViewHolder) b0Var).mo31962e((C12778k.C12780b) kVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (i == R.layout.list_item_conversation_date) {
            return new C9525a(C0114h.m305j0(viewGroup, i, false));
        }
        if (i == R.layout.list_item_current_user_message) {
            return new C9556m(viewGroup, this.f21105c, this.f21107e);
        }
        if (i == R.layout.list_item_other_user_message) {
            return new OtherUserMessageViewHolder(viewGroup, this.f21105c, this.f21107e, this.f21108f, this.f21104b, this.f21109g);
        }
        throw new IllegalArgumentException("Unrecognized view type!");
    }
}
