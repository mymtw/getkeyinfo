package androidx.compose.p015ui.platform.actionmodecallback;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: androidx.compose.ui.platform.actionmodecallback.MenuItemOption */
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: id */
    private final int f4069id;
    private final int order;

    /* renamed from: androidx.compose.ui.platform.actionmodecallback.MenuItemOption$a */
    public /* synthetic */ class C1816a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4070a = null;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            iArr[MenuItemOption.Copy.ordinal()] = 1;
            iArr[MenuItemOption.Paste.ordinal()] = 2;
            iArr[MenuItemOption.Cut.ordinal()] = 3;
            iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            f4070a = iArr;
        }
    }

    private MenuItemOption(int i) {
        this.f4069id = i;
        this.order = i;
    }

    public final int getId() {
        return this.f4069id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i = C1816a.f4070a[ordinal()];
        if (i == 1) {
            return 17039361;
        }
        if (i == 2) {
            return 17039371;
        }
        if (i == 3) {
            return 17039363;
        }
        if (i == 4) {
            return 17039373;
        }
        throw new NoWhenBranchMatchedException();
    }
}
