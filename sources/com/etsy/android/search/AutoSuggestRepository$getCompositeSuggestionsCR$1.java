package com.etsy.android.search;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.search.AutoSuggestRepository", mo70541f = "AutoSuggestRepository.kt", mo70542l = {45}, mo70543m = "getCompositeSuggestionsCR")
public final class AutoSuggestRepository$getCompositeSuggestionsCR$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AutoSuggestRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoSuggestRepository$getCompositeSuggestionsCR$1(AutoSuggestRepository autoSuggestRepository, C19340c<? super AutoSuggestRepository$getCompositeSuggestionsCR$1> cVar) {
        super(cVar);
        this.this$0 = autoSuggestRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo30567a((String) null, (String) null, 0, false, this);
    }
}
