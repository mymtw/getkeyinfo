package androidx.compose.p015ui.node;

import androidx.compose.p015ui.node.LayoutNode;
import com.google.android.gms.common.api.Api;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p219r.C7734e;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.node.LayoutNode$layoutChildren$1 */
public final class LayoutNode$layoutChildren$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ LayoutNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNode$layoutChildren$1(LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNode;
    }

    public final void invoke() {
        LayoutNode layoutNode = this.this$0;
        int i = 0;
        layoutNode.f3840y = 0;
        C7734e<LayoutNode> y = layoutNode.mo6768y();
        int i2 = y.f17157d;
        if (i2 > 0) {
            T[] tArr = y.f17155b;
            int i3 = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) tArr[i3];
                layoutNode2.f3839x = layoutNode2.f3838w;
                layoutNode2.f3838w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                layoutNode2.f3836u.f3911d = false;
                if (layoutNode2.f3841z == LayoutNode.UsageByParent.InLayoutBlock) {
                    LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                    C19383o.m32797g(usageByParent, "<set-?>");
                    layoutNode2.f3841z = usageByParent;
                }
                i3++;
            } while (i3 < i2);
        }
        this.this$0.f3800D.mo6789Z0().mo4344c();
        C7734e<LayoutNode> y2 = this.this$0.mo6768y();
        LayoutNode layoutNode3 = this.this$0;
        int i4 = y2.f17157d;
        if (i4 > 0) {
            T[] tArr2 = y2.f17155b;
            do {
                LayoutNode layoutNode4 = (LayoutNode) tArr2[i];
                if (layoutNode4.f3839x != layoutNode4.f3838w) {
                    layoutNode3.mo6749N();
                    layoutNode3.mo6740C();
                    if (layoutNode4.f3838w == Integer.MAX_VALUE) {
                        layoutNode4.mo6745I();
                    }
                }
                C1740g gVar = layoutNode4.f3836u;
                gVar.f3912e = gVar.f3911d;
                i++;
            } while (i < i4);
        }
    }
}
