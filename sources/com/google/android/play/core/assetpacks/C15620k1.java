package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.google.android.play.core.assetpacks.k1 */
public final /* synthetic */ class C15620k1 implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f35224a;

    public /* synthetic */ C15620k1(String str) {
        this.f35224a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f35224a).concat(HelpFormatter.DEFAULT_OPT_PREFIX)) && str.endsWith(".apk");
    }
}
