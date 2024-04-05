package p113g3;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6943o;

@TargetApi(19)
/* renamed from: g3.k */
public final class C6850k implements C6852l, C6848i {

    /* renamed from: a */
    public final Path f15114a = new Path();

    /* renamed from: b */
    public final Path f15115b = new Path();

    /* renamed from: c */
    public final Path f15116c = new Path();

    /* renamed from: d */
    public final ArrayList f15117d = new ArrayList();

    /* renamed from: e */
    public final MergePaths f15118e;

    /* renamed from: g3.k$a */
    public static /* synthetic */ class C6851a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15119a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode[] r0 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15119a = r0
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15119a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15119a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15119a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15119a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p113g3.C6850k.C6851a.<clinit>():void");
        }
    }

    public C6850k(MergePaths mergePaths) {
        mergePaths.getClass();
        this.f15118e = mergePaths;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final void mo18980a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.f15115b.reset();
        this.f15114a.reset();
        for (int size = this.f15117d.size() - 1; size >= 1; size--) {
            C6852l lVar = (C6852l) this.f15117d.get(size);
            if (lVar instanceof C6842c) {
                C6842c cVar = (C6842c) lVar;
                ArrayList arrayList = (ArrayList) cVar.mo18973e();
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    Path path = ((C6852l) arrayList.get(size2)).getPath();
                    C6943o oVar = cVar.f15066k;
                    if (oVar != null) {
                        matrix2 = oVar.mo19096d();
                    } else {
                        cVar.f15058c.reset();
                        matrix2 = cVar.f15058c;
                    }
                    path.transform(matrix2);
                    this.f15115b.addPath(path);
                }
            } else {
                this.f15115b.addPath(lVar.getPath());
            }
        }
        int i = 0;
        C6852l lVar2 = (C6852l) this.f15117d.get(0);
        if (lVar2 instanceof C6842c) {
            C6842c cVar2 = (C6842c) lVar2;
            List<C6852l> e = cVar2.mo18973e();
            while (true) {
                ArrayList arrayList2 = (ArrayList) e;
                if (i >= arrayList2.size()) {
                    break;
                }
                Path path2 = ((C6852l) arrayList2.get(i)).getPath();
                C6943o oVar2 = cVar2.f15066k;
                if (oVar2 != null) {
                    matrix = oVar2.mo19096d();
                } else {
                    cVar2.f15058c.reset();
                    matrix = cVar2.f15058c;
                }
                path2.transform(matrix);
                this.f15114a.addPath(path2);
                i++;
            }
        } else {
            this.f15114a.set(lVar2.getPath());
        }
        this.f15116c.op(this.f15114a, this.f15115b, op);
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        for (int i = 0; i < this.f15117d.size(); i++) {
            ((C6852l) this.f15117d.get(i)).mo14603b(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18979e(java.util.ListIterator<p113g3.C6841b> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            g3.b r0 = (p113g3.C6841b) r0
            boolean r1 = r0 instanceof p113g3.C6852l
            if (r1 == 0) goto L_0x000d
            java.util.ArrayList r1 = r2.f15117d
            g3.l r0 = (p113g3.C6852l) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p113g3.C6850k.mo18979e(java.util.ListIterator):void");
    }

    public final Path getPath() {
        this.f15116c.reset();
        MergePaths mergePaths = this.f15118e;
        if (mergePaths.f10921b) {
            return this.f15116c;
        }
        int i = C6851a.f15119a[mergePaths.f10920a.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.f15117d.size(); i2++) {
                this.f15116c.addPath(((C6852l) this.f15117d.get(i2)).getPath());
            }
        } else if (i == 2) {
            mo18980a(Path.Op.UNION);
        } else if (i == 3) {
            mo18980a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            mo18980a(Path.Op.INTERSECT);
        } else if (i == 5) {
            mo18980a(Path.Op.XOR);
        }
        return this.f15116c;
    }
}
