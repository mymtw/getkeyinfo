package androidx.activity.compose;

import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends Lambda implements C19846a<String> {
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 INSTANCE = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1();

    public ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1() {
        super(0);
    }

    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
