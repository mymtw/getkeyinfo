package p576gn;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p530v1.C16672h;
import com.google.firebase.perf.p530v1.C16676i;
import com.google.firebase.perf.session.PerfSession;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: gn.c */
public final class C17802c {

    /* renamed from: a */
    public final Trace f38705a;

    public C17802c(Trace trace) {
        this.f38705a = trace;
    }

    /* renamed from: a */
    public final C16676i mo69043a() {
        C16676i.C16678b R = C16676i.m27636R();
        R.mo59424y(this.f38705a.getName());
        R.mo59422w(this.f38705a.getStartTime().getMicros());
        R.mo59423x(this.f38705a.getStartTime().getDurationMicros(this.f38705a.getEndTime()));
        for (Counter next : this.f38705a.getCounters().values()) {
            String name = next.getName();
            long count = next.getCount();
            name.getClass();
            R.mo59761u();
            C16676i.m27627A((C16676i) R.f37158c).put(name, Long.valueOf(count));
        }
        List<Trace> subtraces = this.f38705a.getSubtraces();
        if (!subtraces.isEmpty()) {
            for (Trace cVar : subtraces) {
                C16676i a = new C17802c(cVar).mo69043a();
                R.mo59761u();
                C16676i.m27628B((C16676i) R.f37158c, a);
            }
        }
        Map<String, String> attributes = this.f38705a.getAttributes();
        R.mo59761u();
        C16676i.m27630D((C16676i) R.f37158c).putAll(attributes);
        C16672h[] buildAndSort = PerfSession.buildAndSort(this.f38705a.getSessions());
        if (buildAndSort != null) {
            List asList = Arrays.asList(buildAndSort);
            R.mo59761u();
            C16676i.m27632F((C16676i) R.f37158c, asList);
        }
        return (C16676i) R.mo59759s();
    }
}
