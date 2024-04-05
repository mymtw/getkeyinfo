package androidx.compose.p015ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.C19394m;
import kotlinx.coroutines.channels.C19499d;

/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 */
public final class C1807x23580bd9 extends ContentObserver {
    public final /* synthetic */ C19499d<C19394m> $channel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1807x23580bd9(C19499d<C19394m> dVar, Handler handler) {
        super(handler);
        this.$channel = dVar;
    }

    public void onChange(boolean z, Uri uri) {
        this.$channel.mo72199l(C19394m.f43287a);
    }
}
