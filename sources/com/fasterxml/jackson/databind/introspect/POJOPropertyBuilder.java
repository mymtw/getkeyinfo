package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    private static final AnnotationIntrospector.ReferenceProperty NOT_REFEFERENCE_PROP = AnnotationIntrospector.ReferenceProperty.managed("");
    public final AnnotationIntrospector _annotationIntrospector;
    public final MapperConfig<?> _config;
    public Linked<AnnotatedParameter> _ctorParameters;
    public Linked<AnnotatedField> _fields;
    public final boolean _forSerialization;
    public Linked<AnnotatedMethod> _getters;
    public final PropertyName _internalName;
    public transient PropertyMetadata _metadata;
    public final PropertyName _name;
    public transient AnnotationIntrospector.ReferenceProperty _referenceInfo;
    public Linked<AnnotatedMethod> _setters;

    public static final class Linked<T> {
        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked<T> next;
        public final T value;

        public Linked(T t, Linked<T> linked, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.value = t;
            this.next = linked;
            PropertyName propertyName2 = (propertyName == null || propertyName.isEmpty()) ? null : propertyName;
            this.name = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                } else if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.isNameExplicit = z;
            this.isVisible = z2;
            this.isMarkedIgnored = z3;
        }

        public Linked<T> append(Linked<T> linked) {
            Linked<T> linked2 = this.next;
            return linked2 == null ? withNext(linked) : withNext(linked2.append(linked));
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[]{this.value.toString(), Boolean.valueOf(this.isVisible), Boolean.valueOf(this.isMarkedIgnored), Boolean.valueOf(this.isNameExplicit)});
            if (this.next == null) {
                return format;
            }
            StringBuilder k = C0073e.m211k(format, ", ");
            k.append(this.next.toString());
            return k.toString();
        }

        public Linked<T> trimByVisibility() {
            Linked<T> linked = this.next;
            if (linked == null) {
                return this;
            }
            Linked<T> trimByVisibility = linked.trimByVisibility();
            if (this.name != null) {
                return trimByVisibility.name == null ? withNext((Linked) null) : withNext(trimByVisibility);
            }
            if (trimByVisibility.name != null) {
                return trimByVisibility;
            }
            boolean z = this.isVisible;
            return z == trimByVisibility.isVisible ? withNext(trimByVisibility) : z ? withNext((Linked) null) : trimByVisibility;
        }

        public Linked<T> withNext(Linked<T> linked) {
            if (linked == this.next) {
                return this;
            }
            return new Linked(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withValue(T t) {
            if (t == this.value) {
                return this;
            }
            return new Linked(t, this.next, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
            r0 = r0.withoutIgnored();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.Linked<T> withoutIgnored() {
            /*
                r2 = this;
                boolean r0 = r2.isMarkedIgnored
                if (r0 == 0) goto L_0x000f
                com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r0 = r2.next
                if (r0 != 0) goto L_0x000a
                r0 = 0
                goto L_0x000e
            L_0x000a:
                com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r0 = r0.withoutIgnored()
            L_0x000e:
                return r0
            L_0x000f:
                com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r0 = r2.next
                if (r0 == 0) goto L_0x0020
                com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r0 = r0.withoutIgnored()
                com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r1 = r2.next
                if (r0 == r1) goto L_0x0020
                com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r0 = r2.withNext(r0)
                return r0
            L_0x0020:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.Linked.withoutIgnored():com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        }

        public Linked<T> withoutNext() {
            return this.next == null ? this : new Linked(this.value, (Linked) null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutNonVisible() {
            Linked<T> linked = this.next;
            Linked<T> withoutNonVisible = linked == null ? null : linked.withoutNonVisible();
            return this.isVisible ? withNext(withoutNonVisible) : withoutNonVisible;
        }
    }

    public static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {
        private Linked<T> next;

        public MemberIterator(Linked<T> linked) {
            this.next = linked;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            Linked<T> linked = this.next;
            if (linked != null) {
                T t = (AnnotatedMember) linked.value;
                this.next = linked.next;
                return t;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$a */
    public static /* synthetic */ class C12539a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27697a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonProperty$Access[] r0 = com.fasterxml.jackson.annotation.JsonProperty.Access.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27697a = r0
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27697a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.READ_WRITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27697a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27697a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.C12539a.<clinit>():void");
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$b */
    public class C12540b implements C12549k<Class<?>[]> {
        public C12540b() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$c */
    public class C12541c implements C12549k<AnnotationIntrospector.ReferenceProperty> {
        public C12541c() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$d */
    public class C12542d implements C12549k<Boolean> {
        public C12542d() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$e */
    public class C12543e implements C12549k<Boolean> {
        public C12543e() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.hasRequiredMarker(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$f */
    public class C12544f implements C12549k<String> {
        public C12544f() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDescription(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$g */
    public class C12545g implements C12549k<Integer> {
        public C12545g() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyIndex(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$h */
    public class C12546h implements C12549k<String> {
        public C12546h() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDefaultValue(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$i */
    public class C12547i implements C12549k<ObjectIdInfo> {
        public C12547i() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            ObjectIdInfo findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectIdInfo(annotatedMember);
            return findObjectIdInfo != null ? POJOPropertyBuilder.this._annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo) : findObjectIdInfo;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$j */
    public class C12548j implements C12549k<JsonProperty.Access> {
        public C12548j() {
        }

        public final Object withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyAccess(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$k */
    public interface C12549k<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    private <T> boolean _anyExplicitNames(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicits(Linked<T> linked) {
        while (linked != null) {
            PropertyName propertyName = linked.name;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyIgnorals(Linked<T> linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyVisible(Linked<T> linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T extends AnnotatedMember> Linked<T> _applyAnnotations(Linked<T> linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) ((AnnotatedMember) linked.value).withAnnotations(annotationMap);
        Linked<T> linked2 = linked.next;
        if (linked2 != null) {
            linked = linked.withNext(_applyAnnotations(linked2, annotationMap));
        }
        return linked.withValue(annotatedMember);
    }

    private void _explode(Collection<PropertyName> collection, Map<PropertyName, POJOPropertyBuilder> map, Linked<?> linked) {
        for (Linked linked2 = linked; linked2 != null; linked2 = linked2.next) {
            PropertyName propertyName = linked2.name;
            if (linked2.isNameExplicit && propertyName != null) {
                POJOPropertyBuilder pOJOPropertyBuilder = map.get(propertyName);
                if (pOJOPropertyBuilder == null) {
                    pOJOPropertyBuilder = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, this._internalName, propertyName);
                    map.put(propertyName, pOJOPropertyBuilder);
                }
                if (linked == this._fields) {
                    pOJOPropertyBuilder._fields = linked2.withNext(pOJOPropertyBuilder._fields);
                } else if (linked == this._getters) {
                    pOJOPropertyBuilder._getters = linked2.withNext(pOJOPropertyBuilder._getters);
                } else if (linked == this._setters) {
                    pOJOPropertyBuilder._setters = linked2.withNext(pOJOPropertyBuilder._setters);
                } else if (linked == this._ctorParameters) {
                    pOJOPropertyBuilder._ctorParameters = linked2.withNext(pOJOPropertyBuilder._ctorParameters);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (linked2.isVisible) {
                StringBuilder h = C0072d.m201h("Conflicting/ambiguous property name definitions (implicit name '");
                h.append(this._name);
                h.append("'): found multiple explicit names: ");
                h.append(collection);
                h.append(", but also implicit accessor: ");
                h.append(linked2);
                throw new IllegalStateException(h.toString());
            }
        }
    }

    private Set<PropertyName> _findExplicitNames(Linked<? extends AnnotatedMember> linked, Set<PropertyName> set) {
        Linked<T> linked2;
        while (linked2 != null) {
            if (linked2.isNameExplicit && linked2.name != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(linked2.name);
            }
            Linked<T> linked3 = linked2.next;
            linked2 = linked;
            linked2 = linked3;
        }
        return set;
    }

    private <T extends AnnotatedMember> AnnotationMap _getAllAnnotations(Linked<T> linked) {
        AnnotationMap allAnnotations = ((AnnotatedMember) linked.value).getAllAnnotations();
        Linked<T> linked2 = linked.next;
        return linked2 != null ? AnnotationMap.merge(allAnnotations, _getAllAnnotations(linked2)) : allAnnotations;
    }

    private AnnotationMap _mergeAnnotations(int i, Linked<? extends AnnotatedMember>... linkedArr) {
        AnnotationMap _getAllAnnotations = _getAllAnnotations(linkedArr[i]);
        do {
            i++;
            if (i >= linkedArr.length) {
                return _getAllAnnotations;
            }
        } while (linkedArr[i] == null);
        return AnnotationMap.merge(_getAllAnnotations, _mergeAnnotations(i, linkedArr));
    }

    private <T> Linked<T> _removeIgnored(Linked<T> linked) {
        return linked == null ? linked : linked.withoutIgnored();
    }

    private <T> Linked<T> _removeNonVisible(Linked<T> linked) {
        return linked == null ? linked : linked.withoutNonVisible();
    }

    private <T> Linked<T> _trimByVisibility(Linked<T> linked) {
        return linked == null ? linked : linked.trimByVisibility();
    }

    private static <T> Linked<T> merge(Linked<T> linked, Linked<T> linked2) {
        return linked == null ? linked2 : linked2 == null ? linked : linked.append(linked2);
    }

    public String _findDefaultValue() {
        return (String) fromMemberAnnotations(new C12546h());
    }

    public String _findDescription() {
        return (String) fromMemberAnnotations(new C12544f());
    }

    public Integer _findIndex() {
        return (Integer) fromMemberAnnotations(new C12545g());
    }

    public Boolean _findRequired() {
        return (Boolean) fromMemberAnnotations(new C12543e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.PropertyMetadata _getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata r8) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r7.getPrimaryMemberUnchecked()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = r7.getAccessor()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0075
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r7._annotationIntrospector
            if (r5 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0028
            java.lang.Boolean r5 = r5.findMergeInfo(r0)
            if (r5 == 0) goto L_0x0028
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L_0x0027
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r4 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForPropertyOverride(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r4)
        L_0x0027:
            r4 = r2
        L_0x0028:
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r7._annotationIntrospector
            com.fasterxml.jackson.annotation.JsonSetter$Value r5 = r5.findSetterInfo(r0)
            if (r5 == 0) goto L_0x0039
            com.fasterxml.jackson.annotation.Nulls r3 = r5.nonDefaultValueNulls()
            com.fasterxml.jackson.annotation.Nulls r5 = r5.nonDefaultContentNulls()
            goto L_0x003a
        L_0x0039:
            r5 = r3
        L_0x003a:
            if (r4 != 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
            if (r5 != 0) goto L_0x0076
        L_0x0040:
            java.lang.Class r0 = r7._rawTypeOf(r0)
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r6 = r7._config
            com.fasterxml.jackson.databind.cfg.ConfigOverride r0 = r6.getConfigOverride(r0)
            com.fasterxml.jackson.annotation.JsonSetter$Value r6 = r0.getSetterInfo()
            if (r6 == 0) goto L_0x005c
            if (r3 != 0) goto L_0x0056
            com.fasterxml.jackson.annotation.Nulls r3 = r6.nonDefaultValueNulls()
        L_0x0056:
            if (r5 != 0) goto L_0x005c
            com.fasterxml.jackson.annotation.Nulls r5 = r6.nonDefaultContentNulls()
        L_0x005c:
            if (r4 == 0) goto L_0x0076
            if (r1 == 0) goto L_0x0076
            java.lang.Boolean r0 = r0.getMergeable()
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0077
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r0 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForTypeOverride(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r0)
            goto L_0x0077
        L_0x0075:
            r5 = r3
        L_0x0076:
            r2 = r4
        L_0x0077:
            if (r2 != 0) goto L_0x007d
            if (r3 == 0) goto L_0x007d
            if (r5 != 0) goto L_0x00a9
        L_0x007d:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r0 = r7._config
            com.fasterxml.jackson.annotation.JsonSetter$Value r0 = r0.getDefaultSetterInfo()
            if (r3 != 0) goto L_0x0089
            com.fasterxml.jackson.annotation.Nulls r3 = r0.nonDefaultValueNulls()
        L_0x0089:
            if (r5 != 0) goto L_0x008f
            com.fasterxml.jackson.annotation.Nulls r5 = r0.nonDefaultContentNulls()
        L_0x008f:
            if (r2 == 0) goto L_0x00a9
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r0 = r7._config
            java.lang.Boolean r0 = r0.getDefaultMergeable()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a9
            if (r1 == 0) goto L_0x00a9
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r0 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForDefaults(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r0)
        L_0x00a9:
            if (r3 != 0) goto L_0x00ad
            if (r5 == 0) goto L_0x00b1
        L_0x00ad:
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withNulls(r3, r5)
        L_0x00b1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata):com.fasterxml.jackson.databind.PropertyMetadata");
    }

    public int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public Class<?> _rawTypeOf(AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() > 0) {
                return annotatedMethod.getParameterType(0).getRawClass();
            }
        }
        return annotatedMember.getType().getRawClass();
    }

    public int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        return (!name.startsWith("set") || name.length() <= 3) ? 2 : 1;
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = merge(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = merge(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = merge(this._getters, pOJOPropertyBuilder._getters);
        this._setters = merge(this._setters, pOJOPropertyBuilder._setters);
    }

    public void addCtor(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._ctorParameters = new Linked(annotatedParameter, this._ctorParameters, propertyName, z, z2, z3);
    }

    public void addField(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._fields = new Linked(annotatedField, this._fields, propertyName, z, z2, z3);
    }

    public void addGetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._getters = new Linked(annotatedMethod, this._getters, propertyName, z, z2, z3);
    }

    public void addSetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._setters = new Linked(annotatedMethod, this._setters, propertyName, z, z2, z3);
    }

    public boolean anyIgnorals() {
        return _anyIgnorals(this._fields) || _anyIgnorals(this._getters) || _anyIgnorals(this._setters) || _anyIgnorals(this._ctorParameters);
    }

    public boolean anyVisible() {
        return _anyVisible(this._fields) || _anyVisible(this._getters) || _anyVisible(this._setters) || _anyVisible(this._ctorParameters);
    }

    public boolean couldDeserialize() {
        return (this._ctorParameters == null && this._setters == null && this._fields == null) ? false : true;
    }

    public boolean couldSerialize() {
        return (this._getters == null && this._fields == null) ? false : true;
    }

    public Collection<POJOPropertyBuilder> explode(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        _explode(collection, hashMap, this._fields);
        _explode(collection, hashMap, this._getters);
        _explode(collection, hashMap, this._setters);
        _explode(collection, hashMap, this._ctorParameters);
        return hashMap.values();
    }

    public JsonProperty.Access findAccess() {
        return (JsonProperty.Access) fromMemberAnnotationsExcept(new C12548j(), JsonProperty.Access.AUTO);
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> _findExplicitNames = _findExplicitNames(this._ctorParameters, _findExplicitNames(this._setters, _findExplicitNames(this._getters, _findExplicitNames(this._fields, (Set<PropertyName>) null))));
        return _findExplicitNames == null ? Collections.emptySet() : _findExplicitNames;
    }

    public JsonInclude.Value findInclusion() {
        AnnotatedMember accessor = getAccessor();
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        JsonInclude.Value findPropertyInclusion = annotationIntrospector == null ? null : annotationIntrospector.findPropertyInclusion(accessor);
        return findPropertyInclusion == null ? JsonInclude.Value.empty() : findPropertyInclusion;
    }

    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new C12547i());
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this._referenceInfo;
        if (referenceProperty == null) {
            AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) fromMemberAnnotations(new C12541c());
            this._referenceInfo = referenceProperty2 == null ? NOT_REFEFERENCE_PROP : referenceProperty2;
            return referenceProperty2;
        } else if (referenceProperty == NOT_REFEFERENCE_PROP) {
            return null;
        } else {
            return referenceProperty;
        }
    }

    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new C12540b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r0 = r2._fields;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T fromMemberAnnotations(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.C12549k<T> r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r2._annotationIntrospector
            r1 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = r2._forSerialization
            if (r0 == 0) goto L_0x0016
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r0 = r2._getters
            if (r0 == 0) goto L_0x0030
            T r0 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            java.lang.Object r1 = r3.withMember(r0)
            goto L_0x0030
        L_0x0016:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r0 = r2._ctorParameters
            if (r0 == 0) goto L_0x0022
            T r0 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            java.lang.Object r1 = r3.withMember(r0)
        L_0x0022:
            if (r1 != 0) goto L_0x0030
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r0 = r2._setters
            if (r0 == 0) goto L_0x0030
            T r0 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            java.lang.Object r1 = r3.withMember(r0)
        L_0x0030:
            if (r1 != 0) goto L_0x003e
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedField> r0 = r2._fields
            if (r0 == 0) goto L_0x003e
            T r0 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            java.lang.Object r1 = r3.withMember(r0)
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.fromMemberAnnotations(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$k):java.lang.Object");
    }

    public <T> T fromMemberAnnotationsExcept(C12549k<T> kVar, T t) {
        T withMember;
        T withMember2;
        T withMember3;
        T withMember4;
        T withMember5;
        T withMember6;
        T withMember7;
        T withMember8;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null && (withMember8 = kVar.withMember((AnnotatedMember) linked.value)) != null && withMember8 != t) {
                return withMember8;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null && (withMember7 = kVar.withMember((AnnotatedMember) linked2.value)) != null && withMember7 != t) {
                return withMember7;
            }
            Linked<AnnotatedParameter> linked3 = this._ctorParameters;
            if (linked3 != null && (withMember6 = kVar.withMember((AnnotatedMember) linked3.value)) != null && withMember6 != t) {
                return withMember6;
            }
            Linked<AnnotatedMethod> linked4 = this._setters;
            if (linked4 == null || (withMember5 = kVar.withMember((AnnotatedMember) linked4.value)) == null || withMember5 == t) {
                return null;
            }
            return withMember5;
        }
        Linked<AnnotatedParameter> linked5 = this._ctorParameters;
        if (linked5 != null && (withMember4 = kVar.withMember((AnnotatedMember) linked5.value)) != null && withMember4 != t) {
            return withMember4;
        }
        Linked<AnnotatedMethod> linked6 = this._setters;
        if (linked6 != null && (withMember3 = kVar.withMember((AnnotatedMember) linked6.value)) != null && withMember3 != t) {
            return withMember3;
        }
        Linked<AnnotatedField> linked7 = this._fields;
        if (linked7 != null && (withMember2 = kVar.withMember((AnnotatedMember) linked7.value)) != null && withMember2 != t) {
            return withMember2;
        }
        Linked<AnnotatedMethod> linked8 = this._getters;
        if (linked8 == null || (withMember = kVar.withMember((AnnotatedMember) linked8.value)) == null || withMember == t) {
            return null;
        }
        return withMember;
    }

    public AnnotatedParameter getConstructorParameter() {
        Linked linked = this._ctorParameters;
        if (linked == null) {
            return null;
        }
        while (!(((AnnotatedParameter) linked.value).getOwner() instanceof AnnotatedConstructor)) {
            linked = linked.next;
            if (linked == null) {
                return (AnnotatedParameter) this._ctorParameters.value;
            }
        }
        return (AnnotatedParameter) linked.value;
    }

    public Iterator<AnnotatedParameter> getConstructorParameters() {
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        return linked == null ? ClassUtil.emptyIterator() : new MemberIterator(linked);
    }

    public AnnotatedField getField() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        AnnotatedField annotatedField = (AnnotatedField) linked.value;
        Linked<T> linked2 = linked.next;
        while (linked2 != null) {
            AnnotatedField annotatedField2 = (AnnotatedField) linked2.value;
            Class<?> declaringClass = annotatedField.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                linked2 = linked2.next;
            }
            StringBuilder h = C0072d.m201h("Multiple fields representing property \"");
            h.append(getName());
            h.append("\": ");
            h.append(annotatedField.getFullName());
            h.append(" vs ");
            h.append(annotatedField2.getFullName());
            throw new IllegalArgumentException(h.toString());
        }
        return annotatedField;
    }

    public PropertyName getFullName() {
        return this._name;
    }

    public AnnotatedMethod getGetter() {
        Linked<AnnotatedMethod> linked = this._getters;
        if (linked == null) {
            return null;
        }
        Linked<T> linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            int _getterPriority = _getterPriority((AnnotatedMethod) linked2.value);
            int _getterPriority2 = _getterPriority((AnnotatedMethod) linked.value);
            if (_getterPriority != _getterPriority2) {
                if (_getterPriority >= _getterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                StringBuilder h = C0072d.m201h("Conflicting getter definitions for property \"");
                h.append(getName());
                h.append("\": ");
                h.append(((AnnotatedMethod) linked.value).getFullName());
                h.append(" vs ");
                h.append(((AnnotatedMethod) linked2.value).getFullName());
                throw new IllegalArgumentException(h.toString());
            }
        }
        this._getters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    public PropertyMetadata getMetadata() {
        if (this._metadata == null) {
            Boolean _findRequired = _findRequired();
            String _findDescription = _findDescription();
            Integer _findIndex = _findIndex();
            String _findDefaultValue = _findDefaultValue();
            if (_findRequired == null && _findIndex == null && _findDefaultValue == null) {
                PropertyMetadata propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                if (_findDescription != null) {
                    propertyMetadata = propertyMetadata.withDescription(_findDescription);
                }
                this._metadata = propertyMetadata;
            } else {
                this._metadata = PropertyMetadata.construct(_findRequired, _findDescription, _findIndex, _findDefaultValue);
            }
            if (!this._forSerialization) {
                this._metadata = _getSetterInfo(this._metadata);
            }
        }
        return this._metadata;
    }

    public String getName() {
        PropertyName propertyName = this._name;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        AnnotatedMember mutator = getMutator();
        return mutator == null ? getAccessor() : mutator;
    }

    public AnnotatedMember getPrimaryMemberUnchecked() {
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                return (AnnotatedMember) linked.value;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                return (AnnotatedMember) linked2.value;
            }
            return null;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            return (AnnotatedMember) linked3.value;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            return (AnnotatedMember) linked4.value;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            return (AnnotatedMember) linked5.value;
        }
        Linked<AnnotatedMethod> linked6 = this._getters;
        if (linked6 != null) {
            return (AnnotatedMember) linked6.value;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = getField();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType getPrimaryType() {
        /*
            r2 = this;
            boolean r0 = r2._forSerialization
            if (r0 == 0) goto L_0x001a
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r0 = r2.getGetter()
            if (r0 != 0) goto L_0x0015
            com.fasterxml.jackson.databind.introspect.AnnotatedField r0 = r2.getField()
            if (r0 != 0) goto L_0x0015
            com.fasterxml.jackson.databind.JavaType r0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType()
            return r0
        L_0x0015:
            com.fasterxml.jackson.databind.JavaType r0 = r0.getType()
            return r0
        L_0x001a:
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r0 = r2.getConstructorParameter()
            if (r0 != 0) goto L_0x0030
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r0 = r2.getSetter()
            if (r0 == 0) goto L_0x002c
            r1 = 0
            com.fasterxml.jackson.databind.JavaType r0 = r0.getParameterType(r1)
            return r0
        L_0x002c:
            com.fasterxml.jackson.databind.introspect.AnnotatedField r0 = r2.getField()
        L_0x0030:
            if (r0 != 0) goto L_0x003d
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r0 = r2.getGetter()
            if (r0 != 0) goto L_0x003d
            com.fasterxml.jackson.databind.JavaType r0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType()
            return r0
        L_0x003d:
            com.fasterxml.jackson.databind.JavaType r0 = r0.getType()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getPrimaryType():com.fasterxml.jackson.databind.JavaType");
    }

    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    public AnnotatedMethod getSetter() {
        Linked<AnnotatedMethod> linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked<T> linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) linked2.value;
            AnnotatedMethod annotatedMethod2 = (AnnotatedMethod) linked.value;
            int _setterPriority = _setterPriority(annotatedMethod);
            int _setterPriority2 = _setterPriority(annotatedMethod2);
            if (_setterPriority != _setterPriority2) {
                if (_setterPriority >= _setterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
                if (annotationIntrospector != null) {
                    AnnotatedMethod resolveSetterConflict = annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod2, annotatedMethod);
                    if (resolveSetterConflict != annotatedMethod2) {
                        if (resolveSetterConflict != annotatedMethod) {
                        }
                        linked = linked2;
                        linked2 = linked2.next;
                    } else {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", new Object[]{getName(), ((AnnotatedMethod) linked.value).getFullName(), ((AnnotatedMethod) linked2.value).getFullName()}));
            }
        }
        this._setters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember == null || (annotationIntrospector = this._annotationIntrospector) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(primaryMember);
    }

    public boolean hasConstructorParameter() {
        return this._ctorParameters != null;
    }

    public boolean hasField() {
        return this._fields != null;
    }

    public boolean hasGetter() {
        return this._getters != null;
    }

    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    public boolean hasSetter() {
        return this._setters != null;
    }

    public boolean isExplicitlyIncluded() {
        return _anyExplicits(this._fields) || _anyExplicits(this._getters) || _anyExplicits(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    public boolean isExplicitlyNamed() {
        return _anyExplicitNames(this._fields) || _anyExplicitNames(this._getters) || _anyExplicitNames(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new C12542d());
        return bool != null && bool.booleanValue();
    }

    public void mergeAnnotations(boolean z) {
        if (z) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                this._getters = _applyAnnotations(this._getters, _mergeAnnotations(0, linked, this._fields, this._ctorParameters, this._setters));
                return;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked2, this._ctorParameters, this._setters));
                return;
            }
            return;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            this._ctorParameters = _applyAnnotations(this._ctorParameters, _mergeAnnotations(0, linked3, this._setters, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            this._setters = _applyAnnotations(this._setters, _mergeAnnotations(0, linked4, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked5, this._getters));
        }
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void removeIgnored() {
        this._fields = _removeIgnored(this._fields);
        this._getters = _removeIgnored(this._getters);
        this._setters = _removeIgnored(this._setters);
        this._ctorParameters = _removeIgnored(this._ctorParameters);
    }

    public JsonProperty.Access removeNonVisible(boolean z) {
        JsonProperty.Access findAccess = findAccess();
        if (findAccess == null) {
            findAccess = JsonProperty.Access.AUTO;
        }
        int i = C12539a.f27697a[findAccess.ordinal()];
        if (i == 1) {
            this._setters = null;
            this._ctorParameters = null;
            if (!this._forSerialization) {
                this._fields = null;
            }
        } else if (i != 2) {
            if (i != 3) {
                this._getters = _removeNonVisible(this._getters);
                this._ctorParameters = _removeNonVisible(this._ctorParameters);
                if (!z || this._getters == null) {
                    this._fields = _removeNonVisible(this._fields);
                    this._setters = _removeNonVisible(this._setters);
                }
            } else {
                this._getters = null;
                if (this._forSerialization) {
                    this._fields = null;
                }
            }
        }
        return findAccess;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[Property '");
        h.append(this._name);
        h.append("'; ctors: ");
        h.append(this._ctorParameters);
        h.append(", field(s): ");
        h.append(this._fields);
        h.append(", getter(s): ");
        h.append(this._getters);
        h.append(", setter(s): ");
        h.append(this._setters);
        h.append("]");
        return h.toString();
    }

    public void trimByVisibility() {
        this._fields = _trimByVisibility(this._fields);
        this._getters = _trimByVisibility(this._getters);
        this._setters = _trimByVisibility(this._setters);
        this._ctorParameters = _trimByVisibility(this._ctorParameters);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z;
    }

    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    public POJOPropertyBuilder withName(PropertyName propertyName) {
        return new POJOPropertyBuilder(this, propertyName);
    }

    public POJOPropertyBuilder withSimpleName(String str) {
        PropertyName withSimpleName = this._name.withSimpleName(str);
        return withSimpleName == this._name ? this : new POJOPropertyBuilder(this, withSimpleName);
    }

    public POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }
}
