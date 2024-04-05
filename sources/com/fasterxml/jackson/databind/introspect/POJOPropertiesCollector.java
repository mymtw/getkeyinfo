package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class POJOPropertiesCollector {
    public final AnnotationIntrospector _annotationIntrospector;
    public LinkedList<AnnotatedMember> _anyGetters;
    public LinkedList<AnnotatedMember> _anySetterField;
    public LinkedList<AnnotatedMethod> _anySetters;
    public final AnnotatedClass _classDef;
    public boolean _collected;
    public final MapperConfig<?> _config;
    public LinkedList<POJOPropertyBuilder> _creatorProperties;
    public Map<PropertyName, PropertyName> _fieldRenameMappings;
    public final boolean _forSerialization;
    public HashSet<String> _ignoredPropertyNames;
    public LinkedHashMap<Object, AnnotatedMember> _injectables;
    public LinkedList<AnnotatedMember> _jsonValueAccessors;
    public final String _mutatorPrefix;
    public LinkedHashMap<String, POJOPropertyBuilder> _properties;
    public final boolean _stdBeanNaming;
    public final JavaType _type;
    public final boolean _useAnnotations;
    public final VisibilityChecker<?> _visibilityChecker;

    public POJOPropertiesCollector(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, AnnotatedClass annotatedClass, String str) {
        this._config = mapperConfig;
        this._stdBeanNaming = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this._forSerialization = z;
        this._type = javaType;
        this._classDef = annotatedClass;
        this._mutatorPrefix = str == null ? "set" : str;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this._useAnnotations = true;
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        } else {
            this._useAnnotations = false;
            this._annotationIntrospector = AnnotationIntrospector.nopInstance();
        }
        this._visibilityChecker = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), annotatedClass);
    }

    private boolean _anyIndexed(Collection<POJOPropertyBuilder> collection) {
        for (POJOPropertyBuilder metadata : collection) {
            if (metadata.getMetadata().hasIndex()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.get(_propNameFromSimple(r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String _checkRenameByField(java.lang.String r3) {
        /*
            r2 = this;
            java.util.Map<com.fasterxml.jackson.databind.PropertyName, com.fasterxml.jackson.databind.PropertyName> r0 = r2._fieldRenameMappings
            if (r0 == 0) goto L_0x0014
            com.fasterxml.jackson.databind.PropertyName r1 = r2._propNameFromSimple(r3)
            java.lang.Object r0 = r0.get(r1)
            com.fasterxml.jackson.databind.PropertyName r0 = (com.fasterxml.jackson.databind.PropertyName) r0
            if (r0 == 0) goto L_0x0014
            java.lang.String r3 = r0.getSimpleName()
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._checkRenameByField(java.lang.String):java.lang.String");
    }

    private void _collectIgnorals(String str) {
        if (!this._forSerialization) {
            if (this._ignoredPropertyNames == null) {
                this._ignoredPropertyNames = new HashSet<>();
            }
            this._ignoredPropertyNames.add(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r1 = r1.namingStrategyInstance(r4._config, r4._classDef, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.fasterxml.jackson.databind.PropertyNamingStrategy _findNamingStrategy() {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r4._annotationIntrospector
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r1 = r4._classDef
            java.lang.Object r0 = r0.findNamingStrategy(r1)
            if (r0 != 0) goto L_0x0011
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r0 = r4._config
            com.fasterxml.jackson.databind.PropertyNamingStrategy r0 = r0.getPropertyNamingStrategy()
            return r0
        L_0x0011:
            boolean r1 = r0 instanceof com.fasterxml.jackson.databind.PropertyNamingStrategy
            if (r1 == 0) goto L_0x0018
            com.fasterxml.jackson.databind.PropertyNamingStrategy r0 = (com.fasterxml.jackson.databind.PropertyNamingStrategy) r0
            return r0
        L_0x0018:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x005e
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<com.fasterxml.jackson.databind.PropertyNamingStrategy> r1 = com.fasterxml.jackson.databind.PropertyNamingStrategy.class
            if (r0 != r1) goto L_0x0024
            r0 = 0
            return r0
        L_0x0024:
            java.lang.Class<com.fasterxml.jackson.databind.PropertyNamingStrategy> r1 = com.fasterxml.jackson.databind.PropertyNamingStrategy.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L_0x004c
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r1 = r4._config
            com.fasterxml.jackson.databind.cfg.HandlerInstantiator r1 = r1.getHandlerInstantiator()
            if (r1 == 0) goto L_0x003f
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r4._config
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r3 = r4._classDef
            com.fasterxml.jackson.databind.PropertyNamingStrategy r1 = r1.namingStrategyInstance(r2, r3, r0)
            if (r1 == 0) goto L_0x003f
            return r1
        L_0x003f:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r1 = r4._config
            boolean r1 = r1.canOverrideAccessModifiers()
            java.lang.Object r0 = com.fasterxml.jackson.databind.util.ClassUtil.createInstance(r0, r1)
            com.fasterxml.jackson.databind.PropertyNamingStrategy r0 = (com.fasterxml.jackson.databind.PropertyNamingStrategy) r0
            return r0
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r3 = "; expected Class<PropertyNamingStrategy>"
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m863h(r0, r2, r3)
            r1.<init>(r0)
            throw r1
        L_0x005e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "AnnotationIntrospector returned PropertyNamingStrategy definition of type "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r3 = "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead"
            java.lang.String r0 = p504ai.C13983i.m21493l(r0, r2, r3)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._findNamingStrategy():com.fasterxml.jackson.databind.PropertyNamingStrategy");
    }

    private PropertyName _propNameFromSimple(String str) {
        return PropertyName.construct(str, (String) null);
    }

    public void _addCreatorParam(Map<String, POJOPropertyBuilder> map, AnnotatedParameter annotatedParameter) {
        JsonCreator.Mode findCreatorAnnotation;
        String findImplicitPropertyName = this._annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null) {
            findImplicitPropertyName = "";
        }
        PropertyName findNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedParameter);
        boolean z = findNameForDeserialization != null && !findNameForDeserialization.isEmpty();
        if (!z) {
            if (!findImplicitPropertyName.isEmpty() && (findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedParameter.getOwner())) != null && findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                findNameForDeserialization = PropertyName.construct(findImplicitPropertyName);
            } else {
                return;
            }
        }
        PropertyName propertyName = findNameForDeserialization;
        String _checkRenameByField = _checkRenameByField(findImplicitPropertyName);
        POJOPropertyBuilder _property = (!z || !_checkRenameByField.isEmpty()) ? _property(map, _checkRenameByField) : _property(map, propertyName);
        _property.addCtor(annotatedParameter, propertyName, z, true, false);
        this._creatorProperties.add(_property);
    }

    public void _addCreators(Map<String, POJOPropertyBuilder> map) {
        if (this._useAnnotations) {
            Iterator<AnnotatedConstructor> it = this._classDef.getConstructors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i = 0; i < parameterCount; i++) {
                    _addCreatorParam(map, next.getParameter(i));
                }
            }
            for (AnnotatedMethod next2 : this._classDef.getFactoryMethods()) {
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount2 = next2.getParameterCount();
                for (int i2 = 0; i2 < parameterCount2; i2++) {
                    _addCreatorParam(map, next2.getParameter(i2));
                }
            }
        }
    }

    public void _addFields(Map<String, POJOPropertyBuilder> map) {
        boolean z;
        PropertyName propertyName;
        boolean z2;
        boolean z3;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        boolean z4 = !this._forSerialization && !this._config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS);
        boolean isEnabled = this._config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField next : this._classDef.fields()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsValue(next))) {
                if (this._jsonValueAccessors == null) {
                    this._jsonValueAccessors = new LinkedList<>();
                }
                this._jsonValueAccessors.add(next);
            } else if (bool.equals(annotationIntrospector.hasAnySetter(next))) {
                if (this._anySetterField == null) {
                    this._anySetterField = new LinkedList<>();
                }
                this._anySetterField.add(next);
            } else {
                String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(next);
                if (findImplicitPropertyName == null) {
                    findImplicitPropertyName = next.getName();
                }
                PropertyName _propNameFromSimple = _propNameFromSimple(findImplicitPropertyName);
                PropertyName findRenameByField = annotationIntrospector.findRenameByField(this._config, next, _propNameFromSimple);
                if (findRenameByField != null && !findRenameByField.equals(_propNameFromSimple)) {
                    if (this._fieldRenameMappings == null) {
                        this._fieldRenameMappings = new HashMap();
                    }
                    this._fieldRenameMappings.put(findRenameByField, _propNameFromSimple);
                }
                PropertyName findNameForSerialization = this._forSerialization ? annotationIntrospector.findNameForSerialization(next) : annotationIntrospector.findNameForDeserialization(next);
                boolean z5 = findNameForSerialization != null;
                if (!z5 || !findNameForSerialization.isEmpty()) {
                    propertyName = findNameForSerialization;
                    z = z5;
                } else {
                    z = false;
                    propertyName = _propNameFromSimple(findImplicitPropertyName);
                }
                boolean z6 = propertyName != null;
                if (!z6) {
                    z6 = this._visibilityChecker.isFieldVisible(next);
                }
                boolean hasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(next);
                if (!next.isTransient() || z5) {
                    z2 = hasIgnoreMarker;
                    z3 = z6;
                } else {
                    z2 = isEnabled ? true : hasIgnoreMarker;
                    z3 = false;
                }
                if (!z4 || propertyName != null || z2 || !Modifier.isFinal(next.getModifiers())) {
                    _property(map, findImplicitPropertyName).addField(next, propertyName, z, z3, z2);
                }
            }
        }
    }

    public void _addGetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        boolean z;
        boolean z2;
        PropertyName propertyName;
        String str;
        boolean z3;
        if (annotatedMethod.hasReturnType()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                if (this._anyGetters == null) {
                    this._anyGetters = new LinkedList<>();
                }
                this._anyGetters.add(annotatedMethod);
            } else if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                if (this._jsonValueAccessors == null) {
                    this._jsonValueAccessors = new LinkedList<>();
                }
                this._jsonValueAccessors.add(annotatedMethod);
            } else {
                PropertyName findNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
                boolean z4 = false;
                boolean z5 = findNameForSerialization != null;
                if (!z5) {
                    str = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (str == null) {
                        str = BeanUtil.okNameForRegularGetter(annotatedMethod, annotatedMethod.getName(), this._stdBeanNaming);
                    }
                    if (str == null) {
                        str = BeanUtil.okNameForIsGetter(annotatedMethod, annotatedMethod.getName(), this._stdBeanNaming);
                        if (str != null) {
                            z3 = this._visibilityChecker.isIsGetterVisible(annotatedMethod);
                        } else {
                            return;
                        }
                    } else {
                        z3 = this._visibilityChecker.isGetterVisible(annotatedMethod);
                    }
                    propertyName = findNameForSerialization;
                    z = z3;
                    z2 = z5;
                } else {
                    String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (findImplicitPropertyName == null) {
                        findImplicitPropertyName = BeanUtil.okNameForGetter(annotatedMethod, this._stdBeanNaming);
                    }
                    if (findImplicitPropertyName == null) {
                        findImplicitPropertyName = annotatedMethod.getName();
                    }
                    if (findNameForSerialization.isEmpty()) {
                        findNameForSerialization = _propNameFromSimple(findImplicitPropertyName);
                    } else {
                        z4 = z5;
                    }
                    propertyName = findNameForSerialization;
                    z = true;
                    z2 = z4;
                    str = findImplicitPropertyName;
                }
                _property(map, _checkRenameByField(str)).addGetter(annotatedMethod, propertyName, z2, z, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
            }
        }
    }

    public void _addInjectables(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        for (AnnotatedField next : this._classDef.fields()) {
            _doAddInjectable(annotationIntrospector.findInjectableValue(next), next);
        }
        for (AnnotatedMethod next2 : this._classDef.memberMethods()) {
            if (next2.getParameterCount() == 1) {
                _doAddInjectable(annotationIntrospector.findInjectableValue(next2), next2);
            }
        }
    }

    public void _addMethods(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        for (AnnotatedMethod next : this._classDef.memberMethods()) {
            int parameterCount = next.getParameterCount();
            if (parameterCount == 0) {
                _addGetterMethod(map, next, annotationIntrospector);
            } else if (parameterCount == 1) {
                _addSetterMethod(map, next, annotationIntrospector);
            } else if (parameterCount == 2 && annotationIntrospector != null && Boolean.TRUE.equals(annotationIntrospector.hasAnySetter(next))) {
                if (this._anySetters == null) {
                    this._anySetters = new LinkedList<>();
                }
                this._anySetters.add(next);
            }
        }
    }

    public void _addSetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        String str = null;
        PropertyName findNameForDeserialization = annotationIntrospector == null ? null : annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z = true;
        boolean z2 = false;
        boolean z3 = findNameForDeserialization != null;
        if (!z3) {
            if (annotationIntrospector != null) {
                str = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            }
            if (str == null) {
                str = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix, this._stdBeanNaming);
            }
            if (str != null) {
                z = this._visibilityChecker.isSetterVisible(annotatedMethod);
            } else {
                return;
            }
        } else {
            if (annotationIntrospector != null) {
                str = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            }
            if (str == null) {
                str = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix, this._stdBeanNaming);
            }
            if (str == null) {
                str = annotatedMethod.getName();
            }
            if (findNameForDeserialization.isEmpty()) {
                findNameForDeserialization = _propNameFromSimple(str);
                z3 = false;
            }
        }
        PropertyName propertyName = findNameForDeserialization;
        boolean z4 = z;
        boolean z5 = z3;
        String _checkRenameByField = _checkRenameByField(str);
        if (annotationIntrospector != null) {
            z2 = annotationIntrospector.hasIgnoreMarker(annotatedMethod);
        }
        _property(map, _checkRenameByField).addSetter(annotatedMethod, propertyName, z5, z4, z2);
    }

    public void _doAddInjectable(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value != null) {
            Object id = value.getId();
            if (this._injectables == null) {
                this._injectables = new LinkedHashMap<>();
            }
            AnnotatedMember put = this._injectables.put(id, annotatedMember);
            if (put != null && put.getClass() == annotatedMember.getClass()) {
                String name = id.getClass().getName();
                StringBuilder h = C0072d.m201h("Duplicate injectable value with id '");
                h.append(String.valueOf(id));
                h.append("' (of type ");
                h.append(name);
                h.append(")");
                throw new IllegalArgumentException(h.toString());
            }
        }
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(simpleName);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, propertyName);
        map.put(simpleName, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    public void _removeUnwantedAccessor(Map<String, POJOPropertyBuilder> map) {
        boolean isEnabled = this._config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        for (POJOPropertyBuilder next : map.values()) {
            if (next.removeNonVisible(isEnabled) == JsonProperty.Access.READ_ONLY) {
                _collectIgnorals(next.getName());
            }
        }
    }

    public void _removeUnwantedProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            POJOPropertyBuilder next = it.next();
            if (!next.anyVisible()) {
                it.remove();
            } else if (next.anyIgnorals()) {
                if (!next.isExplicitlyIncluded()) {
                    it.remove();
                    _collectIgnorals(next.getName());
                } else {
                    next.removeIgnored();
                    if (!next.couldDeserialize()) {
                        _collectIgnorals(next.getName());
                    }
                }
            }
        }
    }

    public void _renameProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it.next().getValue();
            Set<PropertyName> findExplicitNames = pOJOPropertyBuilder.findExplicitNames();
            if (!findExplicitNames.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (findExplicitNames.size() == 1) {
                    linkedList.add(pOJOPropertyBuilder.withName(findExplicitNames.iterator().next()));
                } else {
                    linkedList.addAll(pOJOPropertyBuilder.explode(findExplicitNames));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder2.getName();
                POJOPropertyBuilder pOJOPropertyBuilder3 = map.get(name);
                if (pOJOPropertyBuilder3 == null) {
                    map.put(name, pOJOPropertyBuilder2);
                } else {
                    pOJOPropertyBuilder3.addAll(pOJOPropertyBuilder2);
                }
                _updateCreatorProperty(pOJOPropertyBuilder2, this._creatorProperties);
                HashSet<String> hashSet = this._ignoredPropertyNames;
                if (hashSet != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    public void _renameUsing(Map<String, POJOPropertyBuilder> map, PropertyNamingStrategy propertyNamingStrategy) {
        POJOPropertyBuilder[] pOJOPropertyBuilderArr = (POJOPropertyBuilder[]) map.values().toArray(new POJOPropertyBuilder[map.size()]);
        map.clear();
        for (POJOPropertyBuilder pOJOPropertyBuilder : pOJOPropertyBuilderArr) {
            PropertyName fullName = pOJOPropertyBuilder.getFullName();
            String str = null;
            if (!pOJOPropertyBuilder.isExplicitlyNamed() || this._config.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                if (this._forSerialization) {
                    if (pOJOPropertyBuilder.hasGetter()) {
                        str = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilder.getGetter(), fullName.getSimpleName());
                    } else if (pOJOPropertyBuilder.hasField()) {
                        str = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilder.getField(), fullName.getSimpleName());
                    }
                } else if (pOJOPropertyBuilder.hasSetter()) {
                    str = propertyNamingStrategy.nameForSetterMethod(this._config, pOJOPropertyBuilder.getSetter(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilder.hasConstructorParameter()) {
                    str = propertyNamingStrategy.nameForConstructorParameter(this._config, pOJOPropertyBuilder.getConstructorParameter(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilder.hasField()) {
                    str = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilder.getField(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilder.hasGetter()) {
                    str = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilder.getGetter(), fullName.getSimpleName());
                }
            }
            if (str == null || fullName.hasSimpleName(str)) {
                str = fullName.getSimpleName();
            } else {
                pOJOPropertyBuilder = pOJOPropertyBuilder.withSimpleName(str);
            }
            POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(str);
            if (pOJOPropertyBuilder2 == null) {
                map.put(str, pOJOPropertyBuilder);
            } else {
                pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
            }
            _updateCreatorProperty(pOJOPropertyBuilder, this._creatorProperties);
        }
    }

    public void _renameWithWrappers(Map<String, POJOPropertyBuilder> map) {
        PropertyName findWrapperName;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it.next().getValue();
            AnnotatedMember primaryMember = pOJOPropertyBuilder.getPrimaryMember();
            if (primaryMember != null && (findWrapperName = this._annotationIntrospector.findWrapperName(primaryMember)) != null && findWrapperName.hasSimpleName() && !findWrapperName.equals(pOJOPropertyBuilder.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(pOJOPropertyBuilder.withName(findWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder2.getName();
                POJOPropertyBuilder pOJOPropertyBuilder3 = map.get(name);
                if (pOJOPropertyBuilder3 == null) {
                    map.put(name, pOJOPropertyBuilder2);
                } else {
                    pOJOPropertyBuilder3.addAll(pOJOPropertyBuilder2);
                }
            }
        }
    }

    public void _sortProperties(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Boolean findSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this._classDef);
        boolean shouldSortPropertiesAlphabetically = findSerializationSortAlphabetically == null ? this._config.shouldSortPropertiesAlphabetically() : findSerializationSortAlphabetically.booleanValue();
        boolean _anyIndexed = _anyIndexed(map.values());
        String[] findSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this._classDef);
        if (shouldSortPropertiesAlphabetically || _anyIndexed || this._creatorProperties != null || findSerializationPropertyOrder != null) {
            int size = map.size();
            Map treeMap = shouldSortPropertiesAlphabetically ? new TreeMap() : new LinkedHashMap(size + size);
            for (POJOPropertyBuilder next : map.values()) {
                treeMap.put(next.getName(), next);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
            if (findSerializationPropertyOrder != null) {
                for (String str : findSerializationPropertyOrder) {
                    POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) treeMap.remove(str);
                    if (pOJOPropertyBuilder == null) {
                        Iterator<POJOPropertyBuilder> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            POJOPropertyBuilder next2 = it.next();
                            if (str.equals(next2.getInternalName())) {
                                str = next2.getName();
                                pOJOPropertyBuilder = next2;
                                break;
                            }
                        }
                    }
                    if (pOJOPropertyBuilder != null) {
                        linkedHashMap.put(str, pOJOPropertyBuilder);
                    }
                }
            }
            if (_anyIndexed) {
                TreeMap treeMap2 = new TreeMap();
                Iterator it2 = treeMap.entrySet().iterator();
                while (it2.hasNext()) {
                    POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) ((Map.Entry) it2.next()).getValue();
                    Integer index = pOJOPropertyBuilder2.getMetadata().getIndex();
                    if (index != null) {
                        treeMap2.put(index, pOJOPropertyBuilder2);
                        it2.remove();
                    }
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder3 : treeMap2.values()) {
                    linkedHashMap.put(pOJOPropertyBuilder3.getName(), pOJOPropertyBuilder3);
                }
            }
            Collection<POJOPropertyBuilder> collection = this._creatorProperties;
            if (collection != null) {
                if (shouldSortPropertiesAlphabetically) {
                    TreeMap treeMap3 = new TreeMap();
                    Iterator<POJOPropertyBuilder> it3 = this._creatorProperties.iterator();
                    while (it3.hasNext()) {
                        POJOPropertyBuilder next3 = it3.next();
                        treeMap3.put(next3.getName(), next3);
                    }
                    collection = treeMap3.values();
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder4 : collection) {
                    String name = pOJOPropertyBuilder4.getName();
                    if (treeMap.containsKey(name)) {
                        linkedHashMap.put(name, pOJOPropertyBuilder4);
                    }
                }
            }
            linkedHashMap.putAll(treeMap);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    public void _updateCreatorProperty(POJOPropertyBuilder pOJOPropertyBuilder, List<POJOPropertyBuilder> list) {
        if (list != null) {
            String internalName = pOJOPropertyBuilder.getInternalName();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).getInternalName().equals(internalName)) {
                    list.set(i, pOJOPropertyBuilder);
                    return;
                }
            }
        }
    }

    public void collectAll() {
        LinkedHashMap<String, POJOPropertyBuilder> linkedHashMap = new LinkedHashMap<>();
        _addFields(linkedHashMap);
        _addMethods(linkedHashMap);
        if (!this._classDef.isNonStaticInnerClass()) {
            _addCreators(linkedHashMap);
        }
        _removeUnwantedProperties(linkedHashMap);
        _removeUnwantedAccessor(linkedHashMap);
        _renameProperties(linkedHashMap);
        _addInjectables(linkedHashMap);
        for (POJOPropertyBuilder mergeAnnotations : linkedHashMap.values()) {
            mergeAnnotations.mergeAnnotations(this._forSerialization);
        }
        PropertyNamingStrategy _findNamingStrategy = _findNamingStrategy();
        if (_findNamingStrategy != null) {
            _renameUsing(linkedHashMap, _findNamingStrategy);
        }
        for (POJOPropertyBuilder trimByVisibility : linkedHashMap.values()) {
            trimByVisibility.trimByVisibility();
        }
        if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            _renameWithWrappers(linkedHashMap);
        }
        _sortProperties(linkedHashMap);
        this._properties = linkedHashMap;
        this._collected = true;
    }

    @Deprecated
    public Class<?> findPOJOBuilderClass() {
        return this._annotationIntrospector.findPOJOBuilder(this._classDef);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public AnnotatedMember getAnyGetter() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-getters' defined (%s vs %s)", this._anyGetters.get(0), this._anyGetters.get(1));
        }
        return this._anyGetters.getFirst();
    }

    public AnnotatedMember getAnySetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anySetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' fields defined (%s vs %s)", this._anySetterField.get(0), this._anySetterField.get(1));
        }
        return this._anySetterField.getFirst();
    }

    public AnnotatedMethod getAnySetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMethod> linkedList = this._anySetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' methods defined (%s vs %s)", this._anySetters.get(0), this._anySetters.get(1));
        }
        return this._anySetters.getFirst();
    }

    public AnnotatedClass getClassDef() {
        return this._classDef;
    }

    public MapperConfig<?> getConfig() {
        return this._config;
    }

    public Set<String> getIgnoredPropertyNames() {
        return this._ignoredPropertyNames;
    }

    public Map<Object, AnnotatedMember> getInjectables() {
        if (!this._collected) {
            collectAll();
        }
        return this._injectables;
    }

    public AnnotatedMember getJsonValueAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonValueAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'as-value' properties defined (%s vs %s)", this._jsonValueAccessors.get(0), this._jsonValueAccessors.get(1));
        }
        return this._jsonValueAccessors.get(0);
    }

    @Deprecated
    public AnnotatedMethod getJsonValueMethod() {
        AnnotatedMember jsonValueAccessor = getJsonValueAccessor();
        if (jsonValueAccessor instanceof AnnotatedMethod) {
            return (AnnotatedMethod) jsonValueAccessor;
        }
        return null;
    }

    public ObjectIdInfo getObjectIdInfo() {
        ObjectIdInfo findObjectIdInfo = this._annotationIntrospector.findObjectIdInfo(this._classDef);
        return findObjectIdInfo != null ? this._annotationIntrospector.findObjectReferenceInfo(this._classDef, findObjectIdInfo) : findObjectIdInfo;
    }

    public List<BeanPropertyDefinition> getProperties() {
        return new ArrayList(getPropertyMap().values());
    }

    public Map<String, POJOPropertyBuilder> getPropertyMap() {
        if (!this._collected) {
            collectAll();
        }
        return this._properties;
    }

    public JavaType getType() {
        return this._type;
    }

    public void reportProblem(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StringBuilder h = C0072d.m201h("Problem with definition of ");
        h.append(this._classDef);
        h.append(": ");
        h.append(str);
        throw new IllegalArgumentException(h.toString());
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, PropertyName.construct(str));
        map.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }
}
