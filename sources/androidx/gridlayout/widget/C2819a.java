package androidx.gridlayout.widget;

import androidx.gridlayout.widget.GridLayout;
import java.util.Arrays;

/* renamed from: androidx.gridlayout.widget.a */
public final class C2819a {

    /* renamed from: a */
    public GridLayout.C2812j[] f6407a;

    /* renamed from: b */
    public int f6408b;

    /* renamed from: c */
    public GridLayout.C2812j[][] f6409c;

    /* renamed from: d */
    public int[] f6410d;

    /* renamed from: e */
    public final /* synthetic */ GridLayout.C2813k f6411e;

    static {
        Class<GridLayout> cls = GridLayout.class;
    }

    public C2819a(GridLayout.C2813k kVar, GridLayout.C2812j[] jVarArr) {
        this.f6411e = kVar;
        int length = jVarArr.length;
        this.f6407a = new GridLayout.C2812j[length];
        this.f6408b = length - 1;
        int f = kVar.mo10684f() + 1;
        GridLayout.C2812j[][] jVarArr2 = new GridLayout.C2812j[f][];
        int[] iArr = new int[f];
        for (GridLayout.C2812j jVar : jVarArr) {
            int i = jVar.f6366a.f6396a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < f; i2++) {
            jVarArr2[i2] = new GridLayout.C2812j[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (GridLayout.C2812j jVar2 : jVarArr) {
            int i3 = jVar2.f6366a.f6396a;
            GridLayout.C2812j[] jVarArr3 = jVarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            jVarArr3[i4] = jVar2;
        }
        this.f6409c = jVarArr2;
        this.f6410d = new int[(this.f6411e.mo10684f() + 1)];
    }

    /* renamed from: a */
    public final void mo10703a(int i) {
        int[] iArr = this.f6410d;
        if (iArr[i] == 0) {
            iArr[i] = 1;
            for (GridLayout.C2812j jVar : this.f6409c[i]) {
                mo10703a(jVar.f6366a.f6397b);
                GridLayout.C2812j[] jVarArr = this.f6407a;
                int i2 = this.f6408b;
                this.f6408b = i2 - 1;
                jVarArr[i2] = jVar;
            }
            this.f6410d[i] = 2;
        }
    }
}
