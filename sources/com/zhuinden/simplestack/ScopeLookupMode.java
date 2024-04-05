package com.zhuinden.simplestack;

import androidx.compose.animation.C0388a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public enum ScopeLookupMode {
    ALL {
        public boolean executeCanFindFromService(C17536l lVar, String str, String str2) {
            if (!lVar.f38367m) {
                return false;
            }
            Iterator<String> it = lVar.f38356b.mo68767c(str, false).iterator();
            while (true) {
                if (it.hasNext()) {
                    C17540m d = lVar.f38356b.mo68768d(it.next());
                    if (d != null && d.mo68771b(str2)) {
                        break;
                    }
                } else if (lVar.f38368n || !lVar.f38363i.f38336a.mo68771b(str2)) {
                    return false;
                }
            }
            return true;
        }

        public Set<String> executeFindScopesForKey(C17536l lVar, Object obj) {
            if (!lVar.f38367m) {
                return Collections.emptySet();
            }
            LinkedHashSet<String> b = lVar.f38356b.mo68766b(obj, false);
            if (!lVar.f38368n && !lVar.f38363i.f38336a.f38376a.isEmpty()) {
                b.add("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__");
            }
            return Collections.unmodifiableSet(b);
        }

        public <T> T executeLookupFromScope(C17536l lVar, String str, String str2) {
            if (lVar.f38367m) {
                LinkedHashSet<String> c = lVar.f38356b.mo68767c(str, false);
                Iterator<String> it = c.iterator();
                while (it.hasNext()) {
                    C17540m d = lVar.f38356b.mo68768d(it.next());
                    if (d != null && d.mo68771b(str2)) {
                        return d.mo68770a(str2);
                    }
                }
                if (!lVar.f38368n && lVar.f38363i.f38336a.mo68771b(str2)) {
                    return lVar.f38363i.f38336a.mo68770a(str2);
                }
                StringBuilder f = C0388a.m1050f("The service [", str2, "] does not exist in any scope that is accessible from [", str, "], scopes are [");
                f.append(Arrays.toString(c.toArray()));
                f.append("]!");
                throw new IllegalStateException(f.toString());
            }
            throw new IllegalStateException("Cannot lookup from an empty stack.");
        }
    },
    EXPLICIT {
        public boolean executeCanFindFromService(C17536l lVar, String str, String str2) {
            if (lVar.f38367m) {
                for (String d : lVar.f38356b.mo68767c(str, true)) {
                    C17540m d2 = lVar.f38356b.mo68768d(d);
                    if (d2 != null && d2.mo68771b(str2)) {
                        return true;
                    }
                }
                return !lVar.f38368n && lVar.f38363i.f38336a.mo68771b(str2);
            }
        }

        public Set<String> executeFindScopesForKey(C17536l lVar, Object obj) {
            if (!lVar.f38367m) {
                return Collections.emptySet();
            }
            LinkedHashSet<String> b = lVar.f38356b.mo68766b(obj, true);
            if (!lVar.f38368n && !lVar.f38363i.f38336a.f38376a.isEmpty()) {
                b.add("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__");
            }
            return Collections.unmodifiableSet(b);
        }

        public <T> T executeLookupFromScope(C17536l lVar, String str, String str2) {
            if (lVar.f38367m) {
                LinkedHashSet<String> c = lVar.f38356b.mo68767c(str, true);
                Iterator<String> it = c.iterator();
                while (it.hasNext()) {
                    C17540m d = lVar.f38356b.mo68768d(it.next());
                    if (d != null && d.mo68771b(str2)) {
                        return d.mo68770a(str2);
                    }
                }
                if (!lVar.f38368n && lVar.f38363i.f38336a.mo68771b(str2)) {
                    return lVar.f38363i.f38336a.mo68770a(str2);
                }
                StringBuilder f = C0388a.m1050f("The service [", str2, "] does not exist in any scope that is accessible from [", str, "], scopes are [");
                f.append(Arrays.toString(c.toArray()));
                f.append("]!");
                throw new IllegalStateException(f.toString());
            }
            throw new IllegalStateException("Cannot lookup from an empty stack.");
        }
    };

    public abstract boolean executeCanFindFromService(C17536l lVar, String str, String str2);

    public abstract Set<String> executeFindScopesForKey(C17536l lVar, Object obj);

    public abstract <T> T executeLookupFromScope(C17536l lVar, String str, String str2);
}
