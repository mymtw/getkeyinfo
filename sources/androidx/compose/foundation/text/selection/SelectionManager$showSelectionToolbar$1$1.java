package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C1011g;
import androidx.compose.p015ui.platform.C1827e0;
import androidx.compose.p015ui.text.C1913a;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class SelectionManager$showSelectionToolbar$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$showSelectionToolbar$1$1(SelectionManager selectionManager) {
        super(0);
        this.this$0 = selectionManager;
    }

    public final void invoke() {
        C1827e0 e0Var;
        SelectionManager selectionManager = this.this$0;
        ArrayList k = selectionManager.f2065a.mo4723k(selectionManager.mo4615g());
        C1011g d = selectionManager.mo4612d();
        C1913a aVar = null;
        if (d != null) {
            int size = k.size();
            for (int i = 0; i < size; i++) {
                C1010f fVar = (C1010f) k.get(i);
                if (fVar.mo4699e() == d.f2121a.f2126c || fVar.mo4699e() == d.f2122b.f2126c || aVar != null) {
                    C1913a text = fVar.getText();
                    if (fVar.mo4699e() == d.f2121a.f2126c || fVar.mo4699e() == d.f2122b.f2126c) {
                        if (fVar.mo4699e() == d.f2121a.f2126c) {
                            long e = fVar.mo4699e();
                            C1011g.C1012a aVar2 = d.f2122b;
                            if (e == aVar2.f2126c) {
                                if (d.f2123c) {
                                    text = text.subSequence(aVar2.f2125b, d.f2121a.f2125b);
                                } else {
                                    text = text.subSequence(d.f2121a.f2125b, aVar2.f2125b);
                                }
                            }
                        }
                        long e2 = fVar.mo4699e();
                        C1011g.C1012a aVar3 = d.f2121a;
                        if (e2 == aVar3.f2126c) {
                            if (d.f2123c) {
                                text = text.subSequence(0, aVar3.f2125b);
                            } else {
                                text = text.subSequence(aVar3.f2125b, text.length());
                            }
                        } else if (d.f2123c) {
                            text = text.subSequence(d.f2122b.f2125b, text.length());
                        } else {
                            text = text.subSequence(0, d.f2122b.f2125b);
                        }
                    }
                    aVar = aVar != null ? aVar.mo7389a(text) : text;
                    if (fVar.mo4699e() == d.f2122b.f2126c) {
                        if (!d.f2123c) {
                            break;
                        }
                    }
                    if (fVar.mo4699e() == d.f2121a.f2126c && d.f2123c) {
                        break;
                    }
                }
            }
        }
        if (!(aVar == null || (e0Var = selectionManager.f2069e) == null)) {
            e0Var.mo7207a(aVar);
        }
        this.this$0.mo4614f();
    }
}
