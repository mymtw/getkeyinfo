package com.braze.p044ui.actions.brazeactions;

import android.net.Uri;
import com.appboy.enums.Channel;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5485c;
import com.braze.models.inappmessage.MessageButton;
import com.braze.p044ui.actions.brazeactions.BrazeActionParser;
import com.braze.p044ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$1;
import com.braze.p044ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$2;
import com.braze.p044ui.actions.brazeactions.steps.StepData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.braze.ui.actions.brazeactions.a */
public final class C5625a {

    /* renamed from: com.braze.ui.actions.brazeactions.a$a */
    public /* synthetic */ class C5626a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12019a;

        static {
            int[] iArr = new int[BrazeActionParser.ActionType.values().length];
            iArr[BrazeActionParser.ActionType.CONTAINER.ordinal()] = 1;
            f12019a = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m11393a(BrazeActionParser.ActionType actionType, List<? extends Uri> list) {
        boolean z;
        C19383o.m32797g(actionType, "actionType");
        C19383o.m32797g(list, "uriList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Uri uri = (Uri) next;
            if (uri != null) {
                str = uri.getScheme();
            }
            if (C19383o.m32792b(str, "brazeActions")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair c = BrazeActionParser.m11388c((Uri) it2.next());
            JSONObject jSONObject = c == null ? null : (JSONObject) c.getSecond();
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            arrayList2.add(jSONObject);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C19324q.m32628J0(m11394b((JSONObject) it3.next()), arrayList3);
        }
        if (!arrayList3.isEmpty()) {
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                if (((BrazeActionParser.ActionType) it4.next()) == actionType) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final ArrayList m11394b(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "json");
        ArrayList arrayList = new ArrayList();
        StepData stepData = new StepData(jSONObject, Channel.UNKNOWN);
        BrazeActionParser.ActionType b = BrazeActionParser.f12018a.mo16183b(stepData);
        if (C5626a.f12019a[b.ordinal()] == 1) {
            JSONArray jSONArray = stepData.f12027a.getJSONArray("steps");
            Iterator it = jSONArray == null ? EmptyList.INSTANCE.iterator() : new C19439n.C19440a(SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, jSONArray.length())), new ContainerStep$getChildStepIterator$$inlined$iterator$1(jSONArray)), new ContainerStep$getChildStepIterator$$inlined$iterator$2(jSONArray)));
            while (it.hasNext()) {
                arrayList.addAll(m11394b((JSONObject) it.next()));
            }
        } else {
            arrayList.add(b);
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final List m11395c(C5483a aVar) {
        if (aVar == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Uri uri = aVar.getUri();
        if (uri != null) {
            arrayList.add(uri);
        }
        if (aVar instanceof C5485c) {
            List<MessageButton> X = ((C5485c) aVar).mo16017X();
            ArrayList arrayList2 = new ArrayList();
            for (MessageButton messageButton : X) {
                Uri uri2 = messageButton.f11833f;
                if (uri2 != null) {
                    arrayList2.add(uri2);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
