
/**
 * RcTermInstanceRateOverrideObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  RcTermInstanceRateOverrideObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RcTermInstanceRateOverrideObject extends com.comverse.www.RcTermInstanceRateOverrideIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = rcTermInstanceRateOverrideObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ChgDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localChgDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChgDtTracker = false ;

                           public boolean isChgDtSpecified(){
                               return localChgDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getChgDt(){
                               return localChgDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChgDt
                               */
                               public void setChgDt(com.comverse.www.DateAttributeJAXBElement param){
                            localChgDtTracker = param != null;
                                   
                                            this.localChgDt=param;
                                    

                               }
                            

                        /**
                        * field for ChgWho
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localChgWho ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChgWhoTracker = false ;

                           public boolean isChgWhoSpecified(){
                               return localChgWhoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getChgWho(){
                               return localChgWho;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChgWho
                               */
                               public void setChgWho(com.comverse.www.StringAttributeJAXBElement param){
                            localChgWhoTracker = param != null;
                                   
                                            this.localChgWho=param;
                                    

                               }
                            

                        /**
                        * field for CurrencyCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localCurrencyCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrencyCodeTracker = false ;

                           public boolean isCurrencyCodeSpecified(){
                               return localCurrencyCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getCurrencyCode(){
                               return localCurrencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrencyCode
                               */
                               public void setCurrencyCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localCurrencyCodeTracker = param != null;
                                   
                                            this.localCurrencyCode=param;
                                    

                               }
                            

                        /**
                        * field for InactiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localInactiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInactiveDtTracker = false ;

                           public boolean isInactiveDtSpecified(){
                               return localInactiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getInactiveDt(){
                               return localInactiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactiveDt
                               */
                               public void setInactiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localInactiveDtTracker = true;
                                   
                                            this.localInactiveDt=param;
                                    

                               }
                            

                        /**
                        * field for OverrideRate
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localOverrideRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOverrideRateTracker = false ;

                           public boolean isOverrideRateSpecified(){
                               return localOverrideRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getOverrideRate(){
                               return localOverrideRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OverrideRate
                               */
                               public void setOverrideRate(com.comverse.www.NumericAttributeJAXBElement param){
                            localOverrideRateTracker = param != null;
                                   
                                            this.localOverrideRate=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.comverse.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":rcTermInstanceRateOverrideObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "rcTermInstanceRateOverrideObject",
                           xmlWriter);
                   }

               
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribs", xmlWriter);
                             
                                               if (localAttribs==java.lang.Byte.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("attribs cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localActiveDtTracker){
                                            if (localActiveDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("activeDt cannot be null!!");
                                            }
                                           localActiveDt.serialize(new javax.xml.namespace.QName("","activeDt"),
                                               xmlWriter);
                                        } if (localRcTermInstIdTracker){
                                            if (localRcTermInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rcTermInstId cannot be null!!");
                                            }
                                           localRcTermInstId.serialize(new javax.xml.namespace.QName("","rcTermInstId"),
                                               xmlWriter);
                                        } if (localChgDtTracker){
                                            if (localChgDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chgDt cannot be null!!");
                                            }
                                           localChgDt.serialize(new javax.xml.namespace.QName("","chgDt"),
                                               xmlWriter);
                                        } if (localChgWhoTracker){
                                            if (localChgWho==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chgWho cannot be null!!");
                                            }
                                           localChgWho.serialize(new javax.xml.namespace.QName("","chgWho"),
                                               xmlWriter);
                                        } if (localCurrencyCodeTracker){
                                            if (localCurrencyCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                            }
                                           localCurrencyCode.serialize(new javax.xml.namespace.QName("","currencyCode"),
                                               xmlWriter);
                                        } if (localInactiveDtTracker){
                                    if (localInactiveDt==null){

                                        writeStartElement(null, "", "inactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInactiveDt.serialize(new javax.xml.namespace.QName("","inactiveDt"),
                                        xmlWriter);
                                    }
                                } if (localOverrideRateTracker){
                                            if (localOverrideRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("overrideRate cannot be null!!");
                                            }
                                           localOverrideRate.serialize(new javax.xml.namespace.QName("","overrideRate"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.comverse.com")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","rcTermInstanceRateOverrideObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localActiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "activeDt"));
                            
                            
                                    if (localActiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("activeDt cannot be null!!");
                                    }
                                    elementList.add(localActiveDt);
                                } if (localRcTermInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcTermInstId"));
                            
                            
                                    if (localRcTermInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("rcTermInstId cannot be null!!");
                                    }
                                    elementList.add(localRcTermInstId);
                                } if (localChgDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chgDt"));
                            
                            
                                    if (localChgDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("chgDt cannot be null!!");
                                    }
                                    elementList.add(localChgDt);
                                } if (localChgWhoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chgWho"));
                            
                            
                                    if (localChgWho==null){
                                         throw new org.apache.axis2.databinding.ADBException("chgWho cannot be null!!");
                                    }
                                    elementList.add(localChgWho);
                                } if (localCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyCode"));
                            
                            
                                    if (localCurrencyCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                    }
                                    elementList.add(localCurrencyCode);
                                } if (localInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inactiveDt"));
                            
                            
                                    elementList.add(localInactiveDt==null?null:
                                    localInactiveDt);
                                } if (localOverrideRateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "overrideRate"));
                            
                            
                                    if (localOverrideRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("overrideRate cannot be null!!");
                                    }
                                    elementList.add(localOverrideRate);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static RcTermInstanceRateOverrideObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RcTermInstanceRateOverrideObject object =
                new RcTermInstanceRateOverrideObject();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"rcTermInstanceRateOverrideObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RcTermInstanceRateOverrideObject)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribs").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribs" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAttribs(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToByte(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","activeDt").equals(reader.getName())){
                                
                                                object.setActiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermInstId").equals(reader.getName())){
                                
                                                object.setRcTermInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chgDt").equals(reader.getName())){
                                
                                                object.setChgDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chgWho").equals(reader.getName())){
                                
                                                object.setChgWho(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currencyCode").equals(reader.getName())){
                                
                                                object.setCurrencyCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","overrideRate").equals(reader.getName())){
                                
                                                object.setOverrideRate(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    