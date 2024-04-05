package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.io.IOException;
import java.lang.Thread;

public final class Thread implements C5748g1.C5749a {

    /* renamed from: b */
    public final C5817o2 f12137b;

    public enum State {
        NEW("NEW"),
        BLOCKED("BLOCKED"),
        RUNNABLE("RUNNABLE"),
        TERMINATED("TERMINATED"),
        TIMED_WAITING("TIMED_WAITING"),
        WAITING("WAITING"),
        UNKNOWN("UNKNOWN");
        
        private final String descriptor;

        private State(String str) {
            this.descriptor = str;
        }

        public static State byDescriptor(String str) {
            if (str == null) {
                return UNKNOWN;
            }
            for (State state : values()) {
                if (state.getDescriptor().equals(str)) {
                    return state;
                }
            }
            return UNKNOWN;
        }

        public static State forThread(Thread thread) {
            return getState(thread.getState());
        }

        private static State getState(Thread.State state) {
            switch (C5713a.f12138a[state.ordinal()]) {
                case 1:
                    return NEW;
                case 2:
                    return BLOCKED;
                case 3:
                    return RUNNABLE;
                case 4:
                    return TERMINATED;
                case 5:
                    return TIMED_WAITING;
                case 6:
                    return WAITING;
                default:
                    return UNKNOWN;
            }
        }

        public String getDescriptor() {
            return this.descriptor;
        }
    }

    /* renamed from: com.bugsnag.android.Thread$a */
    public static /* synthetic */ class C5713a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12138a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                java.lang.Thread$State[] r0 = java.lang.Thread.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12138a = r0
                java.lang.Thread$State r1 = java.lang.Thread.State.NEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12138a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.lang.Thread$State r1 = java.lang.Thread.State.BLOCKED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12138a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.lang.Thread$State r1 = java.lang.Thread.State.RUNNABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12138a     // Catch:{ NoSuchFieldError -> 0x0033 }
                java.lang.Thread$State r1 = java.lang.Thread.State.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12138a     // Catch:{ NoSuchFieldError -> 0x003e }
                java.lang.Thread$State r1 = java.lang.Thread.State.TIMED_WAITING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12138a     // Catch:{ NoSuchFieldError -> 0x0049 }
                java.lang.Thread$State r1 = java.lang.Thread.State.WAITING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.Thread.C5713a.<clinit>():void");
        }
    }

    public Thread(long j, String str, ThreadType threadType, boolean z, State state, C5776j2 j2Var, C5816o1 o1Var) {
        this.f12137b = new C5817o2(j, str, threadType, z, state.getDescriptor(), j2Var);
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        this.f12137b.toStream(g1Var);
    }

    public Thread(C5817o2 o2Var, C5816o1 o1Var) {
        this.f12137b = o2Var;
    }
}
