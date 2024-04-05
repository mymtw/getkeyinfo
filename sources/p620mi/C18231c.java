package p620mi;

import java.util.Collections;
import java.util.List;
import p579hi.C17812d;

/* renamed from: mi.c */
public abstract class C18231c implements C17812d<C18231c> {

    /* renamed from: a */
    public final String f39972a;

    /* renamed from: b */
    public final List<String> f39973b;

    /* renamed from: c */
    public final boolean f39974c;

    public C18231c(boolean z, String str, List list) {
        this.f39972a = str;
        this.f39973b = Collections.unmodifiableList(list);
        this.f39974c = z;
    }
}
