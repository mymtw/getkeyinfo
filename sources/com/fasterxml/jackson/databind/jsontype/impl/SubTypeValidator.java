package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p003a2.C0023f;

public class SubTypeValidator {
    public static final Set<String> DEFAULT_NO_DESER_CLASS_NAMES;
    public static final String PREFIX_C3P0 = "com.mchange.v2.c3p0.";
    public static final String PREFIX_SPRING = "org.springframework.";
    private static final SubTypeValidator instance = new SubTypeValidator();
    public Set<String> _cfgIllegalClassNames = DEFAULT_NO_DESER_CLASS_NAMES;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("org.apache.commons.collections.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections.functors.InstantiateTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InstantiateTransformer");
        hashSet.add("org.codehaus.groovy.runtime.ConvertedClosure");
        C0023f.m115p(hashSet, "org.codehaus.groovy.runtime.MethodClosure", "org.springframework.beans.factory.ObjectFactory", "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl", "org.apache.xalan.xsltc.trax.TemplatesImpl");
        C0023f.m115p(hashSet, "com.sun.rowset.JdbcRowSetImpl", "java.util.logging.FileHandler", "java.rmi.server.UnicastRemoteObject", "org.springframework.beans.factory.config.PropertyPathFactoryBean");
        C0023f.m115p(hashSet, "org.springframework.aop.config.MethodLocatingFactoryBean", "org.springframework.beans.factory.config.BeanReferenceFactoryBean", "org.apache.tomcat.dbcp.dbcp2.BasicDataSource", "com.sun.org.apache.bcel.internal.util.ClassLoader");
        C0023f.m115p(hashSet, "org.hibernate.jmx.StatisticsService", "org.apache.ibatis.datasource.jndi.JndiDataSourceFactory", "org.apache.ibatis.parsing.XPathParser", "jodd.db.connection.DataSourceConnectionProvider");
        C0023f.m115p(hashSet, "oracle.jdbc.connector.OracleManagedConnectionFactory", "oracle.jdbc.rowset.OracleJDBCRowSet", "org.slf4j.ext.EventData", "flex.messaging.util.concurrent.AsynchBeansWorkManagerExecutor");
        C0023f.m115p(hashSet, "com.sun.deploy.security.ruleset.DRSHelper", "org.apache.axis2.jaxws.spi.handler.HandlerResolverImpl", "org.jboss.util.propertyeditor.DocumentEditor", "org.apache.openjpa.ee.RegistryManagedRuntime");
        C0023f.m115p(hashSet, "org.apache.openjpa.ee.JNDIManagedRuntime", "org.apache.openjpa.ee.WASRegistryManagedRuntime", "org.apache.axis2.transport.jms.JMSOutTransportInfo", "com.mysql.cj.jdbc.admin.MiniAdmin");
        C0023f.m115p(hashSet, "ch.qos.logback.core.db.DriverManagerConnectionSource", "org.jdom.transform.XSLTransformer", "org.jdom2.transform.XSLTransformer", "net.sf.ehcache.transaction.manager.DefaultTransactionManagerLookup");
        C0023f.m115p(hashSet, "net.sf.ehcache.hibernate.EhcacheJtaTransactionManagerLookup", "ch.qos.logback.core.db.JNDIConnectionSource", "com.zaxxer.hikari.HikariConfig", "com.zaxxer.hikari.HikariDataSource");
        C0023f.m115p(hashSet, "org.apache.cxf.jaxrs.provider.XSLTJaxbProvider", "org.apache.commons.configuration.JNDIConfiguration", "org.apache.commons.configuration2.JNDIConfiguration", "org.apache.xalan.lib.sql.JNDIConnectionPool");
        C0023f.m115p(hashSet, "com.sun.org.apache.xalan.internal.lib.sql.JNDIConnectionPool", "org.apache.commons.dbcp.datasources.PerUserPoolDataSource", "org.apache.commons.dbcp.datasources.SharedPoolDataSource", "com.p6spy.engine.spy.P6DataSource");
        C0023f.m115p(hashSet, "org.apache.log4j.receivers.db.DriverManagerConnectionSource", "org.apache.log4j.receivers.db.JNDIConnectionSource", "net.sf.ehcache.transaction.manager.selector.GenericJndiSelector", "net.sf.ehcache.transaction.manager.selector.GlassfishSelector");
        C0023f.m115p(hashSet, "org.apache.xbean.propertyeditor.JndiConverter", "org.apache.hadoop.shaded.com.zaxxer.hikari.HikariConfig", "com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig", "br.com.anteros.dbcp.AnterosDBCPConfig");
        C0023f.m115p(hashSet, "br.com.anteros.dbcp.AnterosDBCPDataSource", "javax.swing.JEditorPane", "javax.swing.JTextPane", "org.apache.shiro.realm.jndi.JndiRealmFactory");
        C0023f.m115p(hashSet, "org.apache.shiro.jndi.JndiObjectFactory", "org.apache.ignite.cache.jta.jndi.CacheJndiTmLookup", "org.apache.ignite.cache.jta.jndi.CacheJndiTmFactory", "org.quartz.utils.JNDIConnectionProvider");
        C0023f.m115p(hashSet, "org.apache.aries.transaction.jms.internal.XaPooledConnectionFactory", "org.apache.aries.transaction.jms.RecoverablePooledConnectionFactory", "com.caucho.config.types.ResourceRef", "org.aoju.bus.proxy.provider.RmiProvider");
        C0023f.m115p(hashSet, "org.aoju.bus.proxy.provider.remoting.RmiProvider", "org.apache.activemq.ActiveMQConnectionFactory", "org.apache.activemq.ActiveMQXAConnectionFactory", "org.apache.activemq.spring.ActiveMQConnectionFactory");
        C0023f.m115p(hashSet, "org.apache.activemq.spring.ActiveMQXAConnectionFactory", "org.apache.activemq.pool.JcaPooledConnectionFactory", "org.apache.activemq.pool.PooledConnectionFactory", "org.apache.activemq.pool.XaPooledConnectionFactory");
        C0023f.m115p(hashSet, "org.apache.activemq.jms.pool.XaPooledConnectionFactory", "org.apache.activemq.jms.pool.JcaPooledConnectionFactory", "org.apache.commons.proxy.provider.remoting.RmiProvider", "org.apache.commons.jelly.impl.Embedded");
        C0023f.m115p(hashSet, "oadd.org.apache.xalan.lib.sql.JNDIConnectionPool", "oracle.jms.AQjmsQueueConnectionFactory", "oracle.jms.AQjmsXATopicConnectionFactory", "oracle.jms.AQjmsTopicConnectionFactory");
        C0023f.m115p(hashSet, "oracle.jms.AQjmsXAQueueConnectionFactory", "oracle.jms.AQjmsXAConnectionFactory", "org.jsecurity.realm.jndi.JndiRealmFactory", "com.pastdev.httpcomponents.configuration.JndiConfiguration");
        hashSet.add("com.nqadmin.rowset.JdbcRowSetImpl");
        hashSet.add("org.arrah.framework.rdbms.UpdatableJdbcRowsetImpl");
        DEFAULT_NO_DESER_CLASS_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public static SubTypeValidator instance() {
        return instance;
    }

    public void validateSubType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class rawClass = javaType.getRawClass();
        String name = rawClass.getName();
        if (!this._cfgIllegalClassNames.contains(name)) {
            if (!rawClass.isInterface()) {
                if (name.startsWith(PREFIX_SPRING)) {
                    while (rawClass != null && rawClass != Object.class) {
                        String simpleName = rawClass.getSimpleName();
                        if (!"AbstractPointcutAdvisor".equals(simpleName) && !"AbstractApplicationContext".equals(simpleName)) {
                            rawClass = rawClass.getSuperclass();
                        }
                    }
                    return;
                } else if (!name.startsWith(PREFIX_C3P0) || !name.endsWith("DataSource")) {
                    return;
                }
            } else {
                return;
            }
        }
        deserializationContext.reportBadTypeDefinition(beanDescription, "Illegal type (%s) to deserialize: prevented for security reasons", name);
    }
}
