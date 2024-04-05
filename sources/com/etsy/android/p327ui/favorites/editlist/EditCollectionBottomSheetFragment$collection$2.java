package com.etsy.android.p327ui.favorites.editlist;

import android.os.Bundle;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import kotlin.C19285c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$collection$2 */
public final class EditCollectionBottomSheetFragment$collection$2 extends Lambda implements C19846a<Collection> {
    public final /* synthetic */ EditCollectionBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionBottomSheetFragment$collection$2(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        super(0);
        this.this$0 = editCollectionBottomSheetFragment;
    }

    public final Collection invoke() {
        Bundle arguments = this.this$0.getArguments();
        int i = arguments != null ? arguments.getInt("transaction-data") : -1;
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        C11869a aVar = (C11869a) TransactionDataRepository.C11867a.m19552a().mo38342a(i);
        Collection collection = null;
        Object b = aVar != null ? aVar.mo38345b(Collection.TYPE_COLLECTION) : null;
        if (b instanceof Collection) {
            collection = (Collection) b;
        }
        if (collection != null) {
            return collection;
        }
        LogCatKt.m17045a().mo21313g("Attempted to launch/resume EditCollectionBottomSheetFragment with a null collection from the transactionData. See https://developer.android.com/topic/libraries/architecture/saving-states for more");
        this.this$0.dismissAllowingStateLoss();
        return new Collection();
    }
}
