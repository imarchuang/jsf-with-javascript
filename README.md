# jsf-with-javascript

This project is to simple demo primitive JSF integration with javascript.

web.xml:
```
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" id="WebApp_ID" version="3.0">
    <display-name>HelloWorldJSF</display-name>
    <welcome-file-list>
        <welcome-file>faces/helloworld.xhtml</welcome-file>
    </welcome-file-list>
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>/faces/*</url-pattern>
    </servlet-mapping>

    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>*.jsf</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>*.faces</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>*.xhtml</url-pattern>
    </servlet-mapping>

    <context-param>
        <param-name>javax.faces.CONFIG_FILES</param-name>
        <param-value>
            WEB-INF/faces-config.xml
        </param-value>
    </context-param>
    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>

</web-app>
```

faces-config.xml:
```
<?xml version="1.0" encoding="UTF-8"?>
<faces-config
        xmlns="http://xmlns.jcp.org/xml/ns/javaee"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-facesconfig_2_2.xsd"
        version="2.2">
    <application>
        <resource-bundle>
            <base-name>JSF Hello World</base-name>
            <var>labels</var>
        </resource-bundle>
    </application>

    <navigation-rule>
        <from-view-id>/helloworld1.xhtml</from-view-id>
        <navigation-case>
            <from-action>#{resultBean.result}</from-action>
            <from-outcome>success</from-outcome>
            <to-view-id>/result.xhtml</to-view-id>
            <redirect></redirect>
        </navigation-case>

    </navigation-rule>

</faces-config>
```
