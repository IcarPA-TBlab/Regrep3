//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.20 at 09:49:52 AM CET 
//


package org.oasis.ebxml.registry.bindings.cms;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis.ebxml.registry.bindings.cms package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis.ebxml.registry.bindings.cms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogContentRequest }
     * 
     */
    public CatalogContentRequest createCatalogContentRequest() {
        return new CatalogContentRequest();
    }

    /**
     * Create an instance of {@link ContentManagementServiceRequestType }
     * 
     */
    public ContentManagementServiceRequestType createContentManagementServiceRequestType() {
        return new ContentManagementServiceRequestType();
    }

    /**
     * Create an instance of {@link ValidateContentResponse }
     * 
     */
    public ValidateContentResponse createValidateContentResponse() {
        return new ValidateContentResponse();
    }

    /**
     * Create an instance of {@link ContentManagementServiceResponseType }
     * 
     */
    public ContentManagementServiceResponseType createContentManagementServiceResponseType() {
        return new ContentManagementServiceResponseType();
    }

    /**
     * Create an instance of {@link ValidateContentRequest }
     * 
     */
    public ValidateContentRequest createValidateContentRequest() {
        return new ValidateContentRequest();
    }

    /**
     * Create an instance of {@link CatalogContentResponse }
     * 
     */
    public CatalogContentResponse createCatalogContentResponse() {
        return new CatalogContentResponse();
    }

}
