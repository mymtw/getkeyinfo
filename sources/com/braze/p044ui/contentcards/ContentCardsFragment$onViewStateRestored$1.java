package com.braze.p044ui.contentcards;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C0761x;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.p044ui.contentcards.adapters.ContentCardAdapter;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1", mo70541f = "ContentCardsFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1 */
public final class ContentCardsFragment$onViewStateRestored$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Bundle $savedInstanceState;
    public int label;
    public final /* synthetic */ ContentCardsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$onViewStateRestored$1(Bundle bundle, ContentCardsFragment contentCardsFragment, C19340c<? super ContentCardsFragment$onViewStateRestored$1> cVar) {
        super(2, cVar);
        this.$savedInstanceState = bundle;
        this.this$0 = contentCardsFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ContentCardsFragment$onViewStateRestored$1(this.$savedInstanceState, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ContentCardsFragment$onViewStateRestored$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList<String> stringArrayList;
        C19388s.m32856b0();
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) this.$savedInstanceState.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", Parcelable.class) : this.$savedInstanceState.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY");
            RecyclerView contentCardsRecyclerView = this.this$0.getContentCardsRecyclerView();
            if (contentCardsRecyclerView != null) {
                RecyclerView.C3100o layoutManager = contentCardsRecyclerView.getLayoutManager();
                if (!(parcelable == null || layoutManager == null)) {
                    layoutManager.mo11303j0(parcelable);
                }
            }
            ContentCardAdapter contentCardAdapter = this.this$0.cardAdapter;
            if (!(contentCardAdapter == null || (stringArrayList = this.$savedInstanceState.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY")) == null)) {
                contentCardAdapter.mo16244m(stringArrayList);
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
