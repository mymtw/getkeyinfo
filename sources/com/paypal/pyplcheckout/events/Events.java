package com.paypal.pyplcheckout.events;

import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19375g;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;
import p755lq.C19875a;
import p755lq.C19877c;

public final class Events {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "Events";
    /* access modifiers changed from: private */
    public static Events _instance;
    private final HashMap<EventType, List<EventListener>> eventToListenerMap = new HashMap<>();
    private final HashMap<EventType, List<Error<?>>> lastErrorListDataForEvent = new HashMap<>();
    private final HashMap<EventType, Success<?>> lastSuccessDataForEvent = new HashMap<>();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Events getInstance() {
            Events access$get_instance$cp = Events._instance;
            if (access$get_instance$cp != null) {
                return access$get_instance$cp;
            }
            Events events = new Events();
            Events._instance = events;
            return events;
        }
    }

    public Events() {
        register((Class<? extends EventType>) PayPalEventTypes.class);
    }

    public static final Events getInstance() {
        return Companion.getInstance();
    }

    public final void clearAllListeners() {
        for (EventType next : this.eventToListenerMap.keySet()) {
            HashMap<EventType, List<EventListener>> hashMap = this.eventToListenerMap;
            C19383o.m32796f(next, "key");
            hashMap.put(next, (Object) null);
        }
    }

    public final boolean doesEventExist(EventType eventType) {
        C19383o.m32797g(eventType, "eventType");
        return this.eventToListenerMap.get(eventType) != null;
    }

    public final void fire(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "eventType");
        List list = this.eventToListenerMap.get(eventType);
        if (list != null) {
            for (EventListener eventListener : new ArrayList(list)) {
                String str = TAG;
                C19383o.m32796f(str, "TAG");
                String name = eventListener.getClass().getName();
                PLog.v$default(str, "fire: " + eventType + " -> " + name, 0, 4, (Object) null);
                eventListener.onEvent(eventType, resultData);
            }
        } else {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            String format = String.format("fire: No one listening to the event of type %s.", Arrays.copyOf(new Object[]{eventType.toString()}, 1));
            C19383o.m32796f(format, "format(format, *args)");
            PLog.eR$default(str2, format, (Exception) null, 4, (Object) null);
        }
        if (resultData instanceof Success) {
            this.lastSuccessDataForEvent.put(eventType, resultData);
        } else if (resultData instanceof Error) {
            List b = C19389t.m32908b(this.lastErrorListDataForEvent.get(eventType));
            if (b == null) {
                b = new ArrayList();
            }
            b.add(resultData);
        }
    }

    public final List<Error<?>> getErrorListForEvent(EventType eventType) {
        C19383o.m32797g(eventType, "eventType");
        EmptyList emptyList = EmptyList.INSTANCE;
        if (this.eventToListenerMap.containsKey(eventType)) {
            List<Error<?>> list = this.lastErrorListDataForEvent.get(eventType);
            return list == null ? emptyList : list;
        }
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        String format = String.format("fire: The event of type %s has not been registered.", Arrays.copyOf(new Object[]{eventType.toString()}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str, format, (Exception) null, 4, (Object) null);
        return emptyList;
    }

    public final Error<?> getLastErrorDataForEvent(EventType eventType) {
        C19383o.m32797g(eventType, "eventType");
        if (this.eventToListenerMap.containsKey(eventType)) {
            List list = this.lastErrorListDataForEvent.get(eventType);
            if (list == null) {
                return null;
            }
            return (Error) list.get(C17782b.m29859Y(list));
        }
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        String format = String.format("fire: The event of type %s has not been registered.", Arrays.copyOf(new Object[]{eventType.toString()}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str, format, (Exception) null, 4, (Object) null);
        return null;
    }

    public final Success<?> getLastSuccessDataForEvent(EventType eventType) {
        C19383o.m32797g(eventType, "eventType");
        if (this.eventToListenerMap.containsKey(eventType)) {
            return this.lastSuccessDataForEvent.get(eventType);
        }
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        String format = String.format("fire: The event of type %s has not been registered or has not had a Successful completion yet.", Arrays.copyOf(new Object[]{eventType.toString()}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str, format, (Exception) null, 4, (Object) null);
        return null;
    }

    public final void listen(EventType eventType, EventListener eventListener) {
        C19383o.m32797g(eventType, "eventType");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        String name = eventListener == null ? null : eventListener.getClass().getName();
        PLog.v$default(str, "listen: " + eventType + " -> " + name, 0, 4, (Object) null);
        if (this.eventToListenerMap.containsKey(eventType)) {
            List b = C19389t.m32908b(this.eventToListenerMap.get(eventType));
            if (b == null) {
                b = new ArrayList();
            }
            if (eventListener != null && !b.contains(eventListener)) {
                b.add(eventListener);
            }
            this.eventToListenerMap.put(eventType, b);
            return;
        }
        C19383o.m32796f(str, "TAG");
        String format = String.format("listen: The event of type %s has not been registered.", Arrays.copyOf(new Object[]{eventType.toString()}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str, format, (Exception) null, 4, (Object) null);
    }

    public final void register(EventType eventType) {
        if (eventType == null) {
            String str = TAG;
            C19383o.m32796f(str, "TAG");
            PLog.w$default(str, "trying to register null event", 0, 4, (Object) null);
            return;
        }
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.v$default(str2, "register: " + eventType, 0, 4, (Object) null);
        if (!this.eventToListenerMap.containsKey(eventType)) {
            this.eventToListenerMap.put(eventType, (Object) null);
            this.lastErrorListDataForEvent.put(eventType, (Object) null);
            return;
        }
        C19383o.m32796f(str2, "TAG");
        String format = String.format("register: The event of type %s has already been registered.", Arrays.copyOf(new Object[]{eventType.toString()}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str2, format, (Exception) null, 4, (Object) null);
    }

    public final void removeListener(EventType eventType, EventListener eventListener) {
        C19383o.m32797g(eventType, "eventType");
        boolean z = false;
        List list = null;
        if (this.eventToListenerMap.containsKey(eventType)) {
            List<EventListener> list2 = this.eventToListenerMap.get(eventType);
            if ((list2 instanceof List) && (!(list2 instanceof C19875a) || (list2 instanceof C19877c))) {
                z = true;
            }
            if (z) {
                list = list2;
            }
            if (list != null) {
                list.remove(eventListener);
                return;
            }
            return;
        }
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        String format = String.format("remove listener: The event of type %s has not been registered.", Arrays.copyOf(new Object[]{eventType.toString()}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str, format, (Exception) null, 4, (Object) null);
    }

    public final void register(Class<? extends EventType> cls) {
        C19383o.m32797g(cls, "eventTypeClass");
        EventType[] eventTypeArr = (EventType[]) cls.getEnumConstants();
        if (eventTypeArr != null) {
            C19375g u0 = C15588c1.m25350u0(eventTypeArr);
            while (u0.hasNext()) {
                register((EventType) u0.next());
            }
            return;
        }
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        String format = String.format("register: The provided class: %s, does not contain enums. Please check your code", Arrays.copyOf(new Object[]{cls}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        PLog.eR$default(str, format, (Exception) null, 4, (Object) null);
    }
}
