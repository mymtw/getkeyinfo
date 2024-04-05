package com.etsy.android.p327ui.conversation.details.legacy;

import android.graphics.Bitmap;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8891f;
import com.etsy.android.p327ui.conversation.details.C9559o;
import java.io.File;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$addImage$2 */
final class LegacyConversationDetailsPresenter$addImage$2 extends Lambda implements C19857l<C8891f, C19394m> {
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsPresenter$addImage$2(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        super(1);
        this.this$0 = legacyConversationDetailsPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8891f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8891f fVar) {
        if (fVar instanceof C8891f.C8894c) {
            this.this$0.f21120b.showError((int) R.string.error_no_image_chooser_app_found);
            return;
        }
        int i = -1;
        int i2 = 0;
        if (fVar instanceof C8891f.C8896e) {
            LegacyConversationDetailsPresenter legacyConversationDetailsPresenter = this.this$0;
            C9559o[] oVarArr = legacyConversationDetailsPresenter.f21134p;
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
            legacyConversationDetailsPresenter.f21134p[i] = C9559o.C9561b.f21219a;
            legacyConversationDetailsPresenter.f21120b.showImageLoadingIndicator(i);
            legacyConversationDetailsPresenter.mo32105b();
        } else if (fVar instanceof C8891f.C8893b) {
            LegacyConversationDetailsPresenter legacyConversationDetailsPresenter2 = this.this$0;
            C8891f.C8893b bVar = (C8891f.C8893b) fVar;
            Bitmap bitmap = bVar.f19652b;
            File file = bVar.f19653c;
            legacyConversationDetailsPresenter2.getClass();
            if (file != null) {
                C19383o.m32797g(bitmap, "bitmap");
                C9559o[] oVarArr2 = legacyConversationDetailsPresenter2.f21134p;
                int length2 = oVarArr2.length;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    } else if (oVarArr2[i2] instanceof C9559o.C9561b) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                legacyConversationDetailsPresenter2.f21134p[i] = new C9559o.C9560a(bitmap, file);
                legacyConversationDetailsPresenter2.f21120b.addImageAttachment(bitmap, i);
                legacyConversationDetailsPresenter2.mo32105b();
                legacyConversationDetailsPresenter2.mo32104a();
            }
        } else if (fVar instanceof C8891f.C8892a) {
            LegacyConversationDetailsPresenter legacyConversationDetailsPresenter3 = this.this$0;
            File file2 = ((C8891f.C8892a) fVar).f19650b;
            C9559o[] oVarArr3 = legacyConversationDetailsPresenter3.f21134p;
            int length3 = oVarArr3.length;
            while (true) {
                if (i2 >= length3) {
                    break;
                } else if (oVarArr3[i2] instanceof C9559o.C9561b) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            legacyConversationDetailsPresenter3.f21134p[i] = C9559o.C9562c.f21220a;
            legacyConversationDetailsPresenter3.f21120b.removeImageLoadingIndicator(i);
            if (file2 != null) {
                file2.delete();
            }
            legacyConversationDetailsPresenter3.f21120b.showError((int) R.string.image_save_fail);
            legacyConversationDetailsPresenter3.mo32104a();
        } else if (fVar instanceof C8891f.C8895d) {
            this.this$0.f21120b.addImage();
        }
    }
}
