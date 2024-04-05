package com.etsy.android.p327ui.conversation.details.ccm;

import android.graphics.Bitmap;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8891f;
import com.etsy.android.p327ui.conversation.details.C9559o;
import com.etsy.android.util.C12060q;
import java.io.File;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$onAddImageClicked$2 */
public final class ConversationDetailsFragment$onAddImageClicked$2 extends Lambda implements C19857l<C8891f, C19394m> {
    public final /* synthetic */ ConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsFragment$onAddImageClicked$2(ConversationDetailsFragment conversationDetailsFragment) {
        super(1);
        this.this$0 = conversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8891f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8891f fVar) {
        if (fVar instanceof C8891f.C8895d) {
            this.this$0.onAddImageClicked();
            return;
        }
        ConversationDetailsViewModel access$getViewModel = this.this$0.getViewModel();
        C19383o.m32796f(fVar, "it");
        access$getViewModel.getClass();
        if (fVar instanceof C8891f.C8894c) {
            C12060q.m19871b(access$getViewModel.f21042y, Integer.valueOf(R.string.error_no_image_chooser_app_found));
            return;
        }
        int i = -1;
        int i2 = 0;
        if (fVar instanceof C8891f.C8896e) {
            C9559o[] oVarArr = access$getViewModel.f21015H;
            int length = oVarArr.length;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (oVarArr[i2] instanceof C9559o.C9562c) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            C9559o[] oVarArr2 = access$getViewModel.f21015H;
            oVarArr2[i] = C9559o.C9561b.f21219a;
            access$getViewModel.f21030m.setValue(oVarArr2);
            access$getViewModel.mo32010f();
        } else if (fVar instanceof C8891f.C8893b) {
            C8891f.C8893b bVar = (C8891f.C8893b) fVar;
            Bitmap bitmap = bVar.f19652b;
            File file = bVar.f19653c;
            if (file != null) {
                C9559o[] oVarArr3 = access$getViewModel.f21015H;
                int length2 = oVarArr3.length;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    } else if (oVarArr3[i2] instanceof C9559o.C9561b) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                access$getViewModel.f21015H[i] = new C9559o.C9560a(bitmap, file);
                access$getViewModel.f21030m.setValue(access$getViewModel.f21015H);
                access$getViewModel.mo32010f();
                access$getViewModel.mo32011g();
            }
        } else if (fVar instanceof C8891f.C8892a) {
            File file2 = ((C8891f.C8892a) fVar).f19650b;
            C9559o[] oVarArr4 = access$getViewModel.f21015H;
            int length3 = oVarArr4.length;
            while (true) {
                if (i2 >= length3) {
                    break;
                } else if (oVarArr4[i2] instanceof C9559o.C9561b) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            C9559o[] oVarArr5 = access$getViewModel.f21015H;
            oVarArr5[i] = C9559o.C9562c.f21220a;
            access$getViewModel.f21030m.setValue(oVarArr5);
            C12060q.m19871b(access$getViewModel.f21042y, Integer.valueOf(R.string.image_save_fail));
            access$getViewModel.mo32011g();
            if (file2 != null) {
                file2.delete();
            }
        } else if (!(fVar instanceof C8891f.C8895d)) {
            boolean z = fVar instanceof C8891f.C8897f;
        }
    }
}
