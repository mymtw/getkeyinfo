package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.m */
public final class C2317m {

    /* renamed from: a */
    public ViewParent f5573a;

    /* renamed from: b */
    public ViewParent f5574b;

    /* renamed from: c */
    public final View f5575c;

    /* renamed from: d */
    public boolean f5576d;

    /* renamed from: e */
    public int[] f5577e;

    public C2317m(View view) {
        this.f5575c = view;
    }

    /* renamed from: a */
    public final boolean mo8901a(float f, float f2, boolean z) {
        ViewParent e;
        if (!this.f5576d || (e = mo8905e(0)) == null) {
            return false;
        }
        try {
            return e.onNestedFling(this.f5575c, f, f2, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo8902b(float f, float f2) {
        ViewParent e;
        if (!this.f5576d || (e = mo8905e(0)) == null) {
            return false;
        }
        try {
            return e.onNestedPreFling(this.f5575c, f, f2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo8903c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent e;
        int i4;
        int i5;
        int[] iArr3;
        int i6 = i;
        int i7 = i2;
        int[] iArr4 = iArr2;
        int i8 = i3;
        if (!this.f5576d || (e = mo8905e(i8)) == null) {
            return false;
        }
        if (i6 != 0 || i7 != 0) {
            if (iArr4 != null) {
                this.f5575c.getLocationInWindow(iArr4);
                i5 = iArr4[0];
                i4 = iArr4[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.f5577e == null) {
                    this.f5577e = new int[2];
                }
                iArr3 = this.f5577e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f5575c;
            if (e instanceof C2319n) {
                ((C2319n) e).onNestedPreScroll(view, i, i2, iArr3, i3);
            } else if (i8 == 0) {
                try {
                    e.onNestedPreScroll(view, i, i7, iArr3);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreScroll", e2);
                }
            }
            if (iArr4 != null) {
                this.f5575c.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i5;
                iArr4[1] = iArr4[1] - i4;
            }
            return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo8904d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent e;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (!this.f5576d || (e = mo8905e(i8)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f5575c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.f5577e == null) {
                this.f5577e = new int[2];
            }
            int[] iArr5 = this.f5577e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f5575c;
        if (e instanceof C2321o) {
            ((C2321o) e).onNestedScroll(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (e instanceof C2319n) {
                ((C2319n) e).onNestedScroll(view, i, i2, i3, i4, i5);
            } else if (i8 == 0) {
                try {
                    e.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr4 != null) {
            this.f5575c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: e */
    public final ViewParent mo8905e(int i) {
        if (i == 0) {
            return this.f5573a;
        }
        if (i != 1) {
            return null;
        }
        return this.f5574b;
    }

    /* renamed from: f */
    public final boolean mo8906f(int i) {
        return mo8905e(i) != null;
    }

    /* renamed from: g */
    public final boolean mo8907g(int i, int i2) {
        boolean z;
        if (mo8906f(i2)) {
            return true;
        }
        if (this.f5576d) {
            View view = this.f5575c;
            for (ViewParent parent = this.f5575c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f5575c;
                boolean z2 = parent instanceof C2319n;
                if (z2) {
                    z = ((C2319n) parent).onStartNestedScroll(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f5573a = parent;
                    } else if (i2 == 1) {
                        this.f5574b = parent;
                    }
                    View view3 = this.f5575c;
                    if (z2) {
                        ((C2319n) parent).onNestedScrollAccepted(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void mo8908h(int i) {
        ViewParent e = mo8905e(i);
        if (e != null) {
            View view = this.f5575c;
            if (e instanceof C2319n) {
                ((C2319n) e).onStopNestedScroll(view, i);
            } else if (i == 0) {
                try {
                    e.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                this.f5573a = null;
            } else if (i == 1) {
                this.f5574b = null;
            }
        }
    }
}
