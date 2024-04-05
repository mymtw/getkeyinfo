package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19459m;
import p753kq.C19846a;

final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements C19846a<File> {
    public final /* synthetic */ C19846a<File> $produceFile;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(C19846a<? extends File> aVar) {
        super(0);
        this.$produceFile = aVar;
    }

    public final File invoke() {
        File invoke = this.$produceFile.invoke();
        C19383o.m32797g(invoke, "<this>");
        String name = invoke.getName();
        C19383o.m32796f(name, "name");
        if (C19383o.m32792b(C19459m.m33031D1(name, ""), "preferences_pb")) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + "preferences_pb").toString());
    }
}
