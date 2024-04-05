package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;

public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    /* access modifiers changed from: private */
    public static final EnumSet<SmartLoginOption> ALL = null;
    public static final C12263a Companion = null;
    private final long value;

    /* renamed from: com.facebook.internal.SmartLoginOption$a */
    public static final class C12263a {
        /* renamed from: a */
        public static EnumSet m20111a(long j) {
            EnumSet<E> noneOf = EnumSet.noneOf(SmartLoginOption.class);
            Iterator it = SmartLoginOption.ALL.iterator();
            while (it.hasNext()) {
                SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
                if ((smartLoginOption.getValue() & j) != 0) {
                    noneOf.add(smartLoginOption);
                }
            }
            C19383o.m32796f(noneOf, "result");
            return noneOf;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C12263a();
        EnumSet<SmartLoginOption> allOf = EnumSet.allOf(SmartLoginOption.class);
        C19383o.m32796f(allOf, "EnumSet.allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    private SmartLoginOption(long j) {
        this.value = j;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j) {
        Companion.getClass();
        return C12263a.m20111a(j);
    }

    public final long getValue() {
        return this.value;
    }
}
