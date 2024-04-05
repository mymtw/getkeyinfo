package com.etsy.android.p327ui.home.editorspicks;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.home.editorspicks.EditorPicksRepository", mo70541f = "EditorPicksRepository.kt", mo70542l = {37}, mo70543m = "getEditorPicksModules")
/* renamed from: com.etsy.android.ui.home.editorspicks.EditorPicksRepository$getEditorPicksModules$1 */
public final class EditorPicksRepository$getEditorPicksModules$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EditorPicksRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorPicksRepository$getEditorPicksModules$1(EditorPicksRepository editorPicksRepository, C19340c<? super EditorPicksRepository$getEditorPicksModules$1> cVar) {
        super(cVar);
        this.this$0 = editorPicksRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo33070a((C9925b) null, this);
    }
}
