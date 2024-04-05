package com.fasterxml.jackson.core.util;

import java.lang.ref.SoftReference;
import p454tg.C13445a;

public class BufferRecyclers {
    public static final String SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";
    private static final C13445a _bufferRecyclerTracker;
    public static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef = new ThreadLocal<>();

    static {
        boolean z;
        try {
            z = "true".equals(System.getProperty(SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS));
        } catch (SecurityException unused) {
            z = false;
        }
        _bufferRecyclerTracker = z ? C13445a.C13446a.f29465a : null;
    }

    public static BufferRecycler getBufferRecycler() {
        SoftReference softReference;
        ThreadLocal<SoftReference<BufferRecycler>> threadLocal = _recyclerRef;
        SoftReference softReference2 = threadLocal.get();
        BufferRecycler bufferRecycler = softReference2 == null ? null : (BufferRecycler) softReference2.get();
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            C13445a aVar = _bufferRecyclerTracker;
            if (aVar != null) {
                softReference = new SoftReference(bufferRecycler, aVar.f29464c);
                aVar.f29463b.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) aVar.f29464c.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    aVar.f29463b.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(bufferRecycler);
            }
            threadLocal.set(softReference);
        }
        return bufferRecycler;
    }

    public static int releaseBuffers() {
        int i;
        C13445a aVar = _bufferRecyclerTracker;
        if (aVar == null) {
            return -1;
        }
        synchronized (aVar.f29462a) {
            i = 0;
            while (true) {
                SoftReference softReference = (SoftReference) aVar.f29464c.poll();
                if (softReference != null) {
                    aVar.f29463b.remove(softReference);
                } else {
                    for (SoftReference clear : aVar.f29463b.keySet()) {
                        clear.clear();
                        i++;
                    }
                    aVar.f29463b.clear();
                }
            }
        }
        return i;
    }
}
