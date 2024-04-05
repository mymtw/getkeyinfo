package com.etsy.android.config.flags.events;

import com.etsy.android.config.flags.C6343a;
import com.etsy.android.config.flags.C6377g;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p409o9.C13124e;
import p568fn.C17782b;

/* renamed from: com.etsy.android.config.flags.events.j */
public final class C6363j {

    /* renamed from: f */
    public static final ArrayList f14177f = C17782b.m29866f0(C8592b.f18746M0.f18695a, C8592b.f18744L0.f18695a);

    /* renamed from: a */
    public final C6377g f14178a;

    /* renamed from: b */
    public final C8591a f14179b;

    /* renamed from: c */
    public final C13124e f14180c;

    /* renamed from: d */
    public final C6343a f14181d;

    /* renamed from: e */
    public final ConfigFlagsEventDispatcher f14182e;

    public C6363j(C6377g gVar, C8591a aVar, C13124e eVar, C6343a aVar2, ConfigFlagsEventDispatcher configFlagsEventDispatcher) {
        C19383o.m32797g(gVar, "configFlagsUiFactory");
        C19383o.m32797g(aVar, "etsyConfig");
        C19383o.m32797g(eVar, "configOverrides");
        C19383o.m32797g(aVar2, "compiledKeys");
        C19383o.m32797g(configFlagsEventDispatcher, "configFlagsEventDispatcher");
        this.f14178a = gVar;
        this.f14179b = aVar;
        this.f14180c = eVar;
        this.f14181d = aVar2;
        this.f14182e = configFlagsEventDispatcher;
    }
}
