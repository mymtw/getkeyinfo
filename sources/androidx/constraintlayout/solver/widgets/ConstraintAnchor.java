package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.C2208h;
import androidx.constraintlayout.solver.widgets.analyzer.C2216n;
import com.etsy.android.lib.conversation.MessageDraft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class ConstraintAnchor {

    /* renamed from: a */
    public HashSet<ConstraintAnchor> f5100a = null;

    /* renamed from: b */
    public int f5101b;

    /* renamed from: c */
    public boolean f5102c;

    /* renamed from: d */
    public final ConstraintWidget f5103d;

    /* renamed from: e */
    public final Type f5104e;

    /* renamed from: f */
    public ConstraintAnchor f5105f;

    /* renamed from: g */
    public int f5106g = 0;

    /* renamed from: h */
    public int f5107h = -1;

    /* renamed from: i */
    public SolverVariable f5108i;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$a */
    public static /* synthetic */ class C2195a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5109a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5109a = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5109a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5109a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5109a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5109a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5109a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5109a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5109a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5109a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintAnchor.C2195a.<clinit>():void");
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f5103d = constraintWidget;
        this.f5104e = type;
    }

    /* renamed from: a */
    public final void mo8248a(ConstraintAnchor constraintAnchor, int i) {
        mo8249b(constraintAnchor, i, -1, false);
    }

    /* renamed from: b */
    public final boolean mo8249b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            mo8257j();
            return true;
        } else if (!z && !mo8256i(constraintAnchor)) {
            return false;
        } else {
            this.f5105f = constraintAnchor;
            if (constraintAnchor.f5100a == null) {
                constraintAnchor.f5100a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f5105f.f5100a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.f5106g = i;
            } else {
                this.f5106g = 0;
            }
            this.f5107h = i2;
            return true;
        }
    }

    /* renamed from: c */
    public final void mo8250c(int i, C2216n nVar, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f5100a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                C2208h.m4842a(it.next().f5103d, i, arrayList, nVar);
            }
        }
    }

    /* renamed from: d */
    public final int mo8251d() {
        if (!this.f5102c) {
            return 0;
        }
        return this.f5101b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = r3.f5105f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8252e() {
        /*
            r3 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.f5103d
            int r0 = r0.f5143d0
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            int r0 = r3.f5107h
            r2 = -1
            if (r0 <= r2) goto L_0x001a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r3.f5105f
            if (r2 == 0) goto L_0x001a
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.f5103d
            int r2 = r2.f5143d0
            if (r2 != r1) goto L_0x001a
            return r0
        L_0x001a:
            int r0 = r3.f5106g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintAnchor.mo8252e():int");
    }

    /* renamed from: f */
    public final ConstraintAnchor mo8253f() {
        switch (C2195a.f5109a[this.f5104e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f5103d.f5116G;
            case 3:
                return this.f5103d.f5114E;
            case 4:
                return this.f5103d.f5117H;
            case 5:
                return this.f5103d.f5115F;
            default:
                throw new AssertionError(this.f5104e.name());
        }
    }

    /* renamed from: g */
    public final boolean mo8254g() {
        HashSet<ConstraintAnchor> hashSet = this.f5100a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo8253f().mo8255h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo8255h() {
        return this.f5105f != null;
    }

    /* renamed from: i */
    public final boolean mo8256i(ConstraintAnchor constraintAnchor) {
        boolean z = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.f5104e;
        Type type2 = this.f5104e;
        if (type == type2) {
            return type2 != Type.BASELINE || (constraintAnchor.f5103d.f5176z && this.f5103d.f5176z);
        }
        switch (C2195a.f5109a[type2.ordinal()]) {
            case 1:
                return (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = type == Type.LEFT || type == Type.RIGHT;
                if (!(constraintAnchor.f5103d instanceof C2223f)) {
                    return z2;
                }
                if (z2 || type == Type.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = type == Type.TOP || type == Type.BOTTOM;
                if (!(constraintAnchor.f5103d instanceof C2223f)) {
                    return z3;
                }
                if (z3 || type == Type.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f5104e.name());
        }
    }

    /* renamed from: j */
    public final void mo8257j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f5105f;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.f5100a) == null)) {
            hashSet.remove(this);
            if (this.f5105f.f5100a.size() == 0) {
                this.f5105f.f5100a = null;
            }
        }
        this.f5100a = null;
        this.f5105f = null;
        this.f5106g = 0;
        this.f5107h = -1;
        this.f5102c = false;
        this.f5101b = 0;
    }

    /* renamed from: k */
    public final void mo8258k() {
        SolverVariable solverVariable = this.f5108i;
        if (solverVariable == null) {
            this.f5108i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.mo8196c();
        }
    }

    /* renamed from: l */
    public final void mo8259l(int i) {
        this.f5101b = i;
        this.f5102c = true;
    }

    public final String toString() {
        return this.f5103d.f5145e0 + MessageDraft.IMAGE_DELIMITER + this.f5104e.toString();
    }
}
