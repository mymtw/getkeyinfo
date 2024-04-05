package com.braze.images;

import java.io.File;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class DefaultBrazeImageLoader$b$a extends Lambda implements C19846a<String> {

    /* renamed from: b */
    public final /* synthetic */ File f11749b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBrazeImageLoader$b$a(File file) {
        super(0);
        this.f11749b = file;
    }

    /* renamed from: a */
    public final String invoke() {
        return C19383o.m32802l(this.f11749b.getAbsolutePath(), "Deleting lru image cache directory at: ");
    }
}
