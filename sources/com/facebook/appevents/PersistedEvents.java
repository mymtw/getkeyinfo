package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

public final class PersistedEvents implements Serializable {
    public static final C12212a Companion = new C12212a();
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    public static final class SerializationProxyV1 implements Serializable {
        public static final C12211a Companion = new C12211a();
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        /* renamed from: com.facebook.appevents.PersistedEvents$SerializationProxyV1$a */
        public static final class C12211a {
        }

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
            C19383o.m32797g(hashMap, "proxyEvents");
            this.proxyEvents = hashMap;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    /* renamed from: com.facebook.appevents.PersistedEvents$a */
    public static final class C12212a {
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public final void addEvents(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (!C13080a.m20762b(this)) {
            try {
                C19383o.m32797g(accessTokenAppIdPair, "accessTokenAppIdPair");
                C19383o.m32797g(list, "appEvents");
                if (!this.events.containsKey(accessTokenAppIdPair)) {
                    this.events.put(accessTokenAppIdPair, C19327t.m32661q1(list));
                    return;
                }
                List list2 = this.events.get(accessTokenAppIdPair);
                if (list2 != null) {
                    list2.addAll(list);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public final boolean containsKey(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (C13080a.m20762b(this)) {
            return false;
        }
        try {
            C19383o.m32797g(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.containsKey(accessTokenAppIdPair);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return false;
        }
    }

    public final List<AppEvent> get(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C19383o.m32797g(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.get(accessTokenAppIdPair);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public final Set<AccessTokenAppIdPair> keySet() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            Set<AccessTokenAppIdPair> keySet = this.events.keySet();
            C19383o.m32796f(keySet, "events.keys");
            return keySet;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
        C19383o.m32797g(hashMap, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap2 = new HashMap<>();
        this.events = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
