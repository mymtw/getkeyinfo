package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ActivityNavArgsLazyKt$navArgs$1 extends Lambda implements C19846a<Bundle> {
    public final /* synthetic */ Activity $this_navArgs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityNavArgsLazyKt$navArgs$1(Activity activity) {
        super(0);
        this.$this_navArgs = activity;
    }

    public final Bundle invoke() {
        Intent intent = this.$this_navArgs.getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras;
            }
            StringBuilder h = C0072d.m201h("Activity ");
            h.append(this.$this_navArgs);
            h.append(" has null extras in ");
            h.append(intent);
            throw new IllegalStateException(h.toString());
        }
        StringBuilder h2 = C0072d.m201h("Activity ");
        h2.append(this.$this_navArgs);
        h2.append(" has a null Intent");
        throw new IllegalStateException(h2.toString());
    }
}
