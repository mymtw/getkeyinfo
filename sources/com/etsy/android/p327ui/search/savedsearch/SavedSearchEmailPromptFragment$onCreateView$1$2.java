package com.etsy.android.p327ui.search.savedsearch;

import com.etsy.android.lib.models.MessageModel;
import com.etsy.android.search.savedsearch.C8978d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.savedsearch.SavedSearchEmailPromptFragment$onCreateView$1$2 */
public final class SavedSearchEmailPromptFragment$onCreateView$1$2 extends Lambda implements C19857l<C8978d, C19394m> {
    public final /* synthetic */ SavedSearchEmailPromptFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedSearchEmailPromptFragment$onCreateView$1$2(SavedSearchEmailPromptFragment savedSearchEmailPromptFragment) {
        super(1);
        this.this$0 = savedSearchEmailPromptFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8978d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8978d dVar) {
        if (dVar instanceof C8978d.C8980b) {
            SavedSearchEmailPromptFragment savedSearchEmailPromptFragment = this.this$0;
            List<MessageModel> messages = ((C8978d.C8980b) dVar).f19820a.getMessages();
            C19383o.m32796f(messages, "searchRepoResult.serverDrivenResult.messages");
            savedSearchEmailPromptFragment.showSuccessMessage(messages);
        } else {
            this.this$0.showErrorMessage();
        }
        this.this$0.dismiss();
    }
}
