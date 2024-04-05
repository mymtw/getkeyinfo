package androidx.navigation.fragment;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class FragmentNavArgsLazyKt$navArgs$1 extends Lambda implements C19846a<Bundle> {
    public final /* synthetic */ Fragment $this_navArgs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentNavArgsLazyKt$navArgs$1(Fragment fragment) {
        super(0);
        this.$this_navArgs = fragment;
    }

    public final Bundle invoke() {
        Bundle arguments = this.$this_navArgs.getArguments();
        if (arguments != null) {
            return arguments;
        }
        StringBuilder h = C0072d.m201h("Fragment ");
        h.append(this.$this_navArgs);
        h.append(" has null arguments");
        throw new IllegalStateException(h.toString());
    }
}
