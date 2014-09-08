
/**
 * ExternalIdTypeObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  ExternalIdTypeObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExternalIdTypeObject extends com.comverse.www.ExternalIdTypeIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = externalIdTypeObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Description
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(com.comverse.www.StringAttributeJAXBElement param){
                            localDescriptionTracker = true;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for DisplayValue
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDisplayValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisplayValueTracker = false ;

                           public boolean isDisplayValueSpecified(){
                               return localDisplayValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDisplayValue(){
                               return localDisplayValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplayValue
                               */
                               public void setDisplayValue(com.comverse.www.StringAttributeJAXBElement param){
                            localDisplayValueTracker = param != null;
                                   
                                            this.localDisplayValue=param;
                                    

                               }
                            

                        /**
                        * field for IsDefault
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsDefault ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsDefaultTracker = false ;

                           public boolean isIsDefaultSpecified(){
                               return localIsDefaultTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsDefault(){
                               return localIsDefault;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsDefault
                               */
                               public void setIsDefault(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsDefaultTracker = param != null;
                                   
                                            this.localIsDefault=param;
                                    

                               }
                            

                        /**
                        * field for IsFandfEligible
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsFandfEligible ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsFandfEligibleTracker = false ;

                           public boolean isIsFandfEligibleSpecified(){
                               return localIsFandfEligibleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsFandfEligible(){
                               return localIsFandfEligible;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsFandfEligible
                               */
                               public void setIsFandfEligible(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsFandfEligibleTracker = param != null;
                                   
                                            this.localIsFandfEligible=param;
                                    

                               }
                            

                        /**
                        * field for IsForRating
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsForRating ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsForRatingTracker = false ;

                           public boolean isIsForRatingSpecified(){
                               return localIsForRatingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsForRating(){
                               return localIsForRating;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsForRating
                               */
                               public void setIsForRating(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsForRatingTracker = param != null;
                                   
                                            this.localIsForRating=param;
                                    

                               }
                            

                        /**
                        * field for IsInternal
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsInternal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsInternalTracker = false ;

                           public boolean isIsInternalSpecified(){
                               return localIsInternalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsInternal(){
                               return localIsInternal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsInternal
                               */
                               public void setIsInternal(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsInternalTracker = param != null;
                                   
                                            this.localIsInternal=param;
                                    

                               }
                            

                        /**
                        * field for IsNotification
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsNotification ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsNotificationTracker = false ;

                           public boolean isIsNotificationSpecified(){
                               return localIsNotificationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsNotification(){
                               return localIsNotification;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsNotification
                               */
                               public void setIsNotification(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsNotificationTracker = param != null;
                                   
                                            this.localIsNotification=param;
                                    

                               }
                            

                        /**
                        * field for IsRangeMap
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsRangeMap ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsRangeMapTracker = false ;

                           public boolean isIsRangeMapSpecified(){
                               return localIsRangeMapTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsRangeMap(){
                               return localIsRangeMap;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsRangeMap
                               */
                               public void setIsRangeMap(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsRangeMapTracker = param != null;
                                   
                                            this.localIsRangeMap=param;
                                    

                               }
                            

                        /**
                        * field for IsViewable
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsViewable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsViewableTracker = false ;

                           public boolean isIsViewableSpecified(){
                               return localIsViewableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsViewable(){
                               return localIsViewable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsViewable
                               */
                               public void setIsViewable(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsViewableTracker = param != null;
                                   
                                            this.localIsViewable=param;
                                    

                               }
                            

                        /**
                        * field for ShortDisplay
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localShortDisplay ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localShortDisplayTracker = false ;

                           public boolean isShortDisplaySpecified(){
                               return localShortDisplayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getShortDisplay(){
                               return localShortDisplay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShortDisplay
                               */
                               public void setShortDisplay(com.comverse.www.StringAttributeJAXBElement param){
                            localShortDisplayTracker = true;
                                   
                                            this.localShortDisplay=param;
                                    

                               }
                            

                        /**
                        * field for UniquenessType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localUniquenessType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUniquenessTypeTracker = false ;

                           public boolean isUniquenessTypeSpecified(){
                               return localUniquenessTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getUniquenessType(){
                               return localUniquenessType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UniquenessType
                               */
                               public void setUniquenessType(com.comverse.www.ShortAttributeJAXBElement param){
                            localUniquenessTypeTracker = param != null;
                                   
                                            this.localUniquenessType=param;
                                    

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
                           namespacePrefix+":externalIdTypeObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "externalIdTypeObject",
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
                              if (localExternalIdTypeTracker){
                                            if (localExternalIdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("externalIdType cannot be null!!");
                                            }
                                           localExternalIdType.serialize(new javax.xml.namespace.QName("","externalIdType"),
                                               xmlWriter);
                                        } if (localLanguageCodeTracker){
                                            if (localLanguageCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("languageCode cannot be null!!");
                                            }
                                           localLanguageCode.serialize(new javax.xml.namespace.QName("","languageCode"),
                                               xmlWriter);
                                        } if (localServiceVersionIdTracker){
                                            if (localServiceVersionId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceVersionId cannot be null!!");
                                            }
                                           localServiceVersionId.serialize(new javax.xml.namespace.QName("","serviceVersionId"),
                                               xmlWriter);
                                        } if (localDescriptionTracker){
                                    if (localDescription==null){

                                        writeStartElement(null, "", "description", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDescription.serialize(new javax.xml.namespace.QName("","description"),
                                        xmlWriter);
                                    }
                                } if (localDisplayValueTracker){
                                            if (localDisplayValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("displayValue cannot be null!!");
                                            }
                                           localDisplayValue.serialize(new javax.xml.namespace.QName("","displayValue"),
                                               xmlWriter);
                                        } if (localIsDefaultTracker){
                                            if (localIsDefault==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isDefault cannot be null!!");
                                            }
                                           localIsDefault.serialize(new javax.xml.namespace.QName("","isDefault"),
                                               xmlWriter);
                                        } if (localIsFandfEligibleTracker){
                                            if (localIsFandfEligible==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isFandfEligible cannot be null!!");
                                            }
                                           localIsFandfEligible.serialize(new javax.xml.namespace.QName("","isFandfEligible"),
                                               xmlWriter);
                                        } if (localIsForRatingTracker){
                                            if (localIsForRating==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isForRating cannot be null!!");
                                            }
                                           localIsForRating.serialize(new javax.xml.namespace.QName("","isForRating"),
                                               xmlWriter);
                                        } if (localIsInternalTracker){
                                            if (localIsInternal==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isInternal cannot be null!!");
                                            }
                                           localIsInternal.serialize(new javax.xml.namespace.QName("","isInternal"),
                                               xmlWriter);
                                        } if (localIsNotificationTracker){
                                            if (localIsNotification==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isNotification cannot be null!!");
                                            }
                                           localIsNotification.serialize(new javax.xml.namespace.QName("","isNotification"),
                                               xmlWriter);
                                        } if (localIsRangeMapTracker){
                                            if (localIsRangeMap==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isRangeMap cannot be null!!");
                                            }
                                           localIsRangeMap.serialize(new javax.xml.namespace.QName("","isRangeMap"),
                                               xmlWriter);
                                        } if (localIsViewableTracker){
                                            if (localIsViewable==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isViewable cannot be null!!");
                                            }
                                           localIsViewable.serialize(new javax.xml.namespace.QName("","isViewable"),
                                               xmlWriter);
                                        } if (localShortDisplayTracker){
                                    if (localShortDisplay==null){

                                        writeStartElement(null, "", "shortDisplay", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localShortDisplay.serialize(new javax.xml.namespace.QName("","shortDisplay"),
                                        xmlWriter);
                                    }
                                } if (localUniquenessTypeTracker){
                                            if (localUniquenessType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("uniquenessType cannot be null!!");
                                            }
                                           localUniquenessType.serialize(new javax.xml.namespace.QName("","uniquenessType"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","externalIdTypeObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localExternalIdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "externalIdType"));
                            
                            
                                    if (localExternalIdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("externalIdType cannot be null!!");
                                    }
                                    elementList.add(localExternalIdType);
                                } if (localLanguageCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "languageCode"));
                            
                            
                                    if (localLanguageCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("languageCode cannot be null!!");
                                    }
                                    elementList.add(localLanguageCode);
                                } if (localServiceVersionIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceVersionId"));
                            
                            
                                    if (localServiceVersionId==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceVersionId cannot be null!!");
                                    }
                                    elementList.add(localServiceVersionId);
                                } if (localDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "description"));
                            
                            
                                    elementList.add(localDescription==null?null:
                                    localDescription);
                                } if (localDisplayValueTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "displayValue"));
                            
                            
                                    if (localDisplayValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("displayValue cannot be null!!");
                                    }
                                    elementList.add(localDisplayValue);
                                } if (localIsDefaultTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isDefault"));
                            
                            
                                    if (localIsDefault==null){
                                         throw new org.apache.axis2.databinding.ADBException("isDefault cannot be null!!");
                                    }
                                    elementList.add(localIsDefault);
                                } if (localIsFandfEligibleTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isFandfEligible"));
                            
                            
                                    if (localIsFandfEligible==null){
                                         throw new org.apache.axis2.databinding.ADBException("isFandfEligible cannot be null!!");
                                    }
                                    elementList.add(localIsFandfEligible);
                                } if (localIsForRatingTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isForRating"));
                            
                            
                                    if (localIsForRating==null){
                                         throw new org.apache.axis2.databinding.ADBException("isForRating cannot be null!!");
                                    }
                                    elementList.add(localIsForRating);
                                } if (localIsInternalTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isInternal"));
                            
                            
                                    if (localIsInternal==null){
                                         throw new org.apache.axis2.databinding.ADBException("isInternal cannot be null!!");
                                    }
                                    elementList.add(localIsInternal);
                                } if (localIsNotificationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isNotification"));
                            
                            
                                    if (localIsNotification==null){
                                         throw new org.apache.axis2.databinding.ADBException("isNotification cannot be null!!");
                                    }
                                    elementList.add(localIsNotification);
                                } if (localIsRangeMapTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isRangeMap"));
                            
                            
                                    if (localIsRangeMap==null){
                                         throw new org.apache.axis2.databinding.ADBException("isRangeMap cannot be null!!");
                                    }
                                    elementList.add(localIsRangeMap);
                                } if (localIsViewableTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isViewable"));
                            
                            
                                    if (localIsViewable==null){
                                         throw new org.apache.axis2.databinding.ADBException("isViewable cannot be null!!");
                                    }
                                    elementList.add(localIsViewable);
                                } if (localShortDisplayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "shortDisplay"));
                            
                            
                                    elementList.add(localShortDisplay==null?null:
                                    localShortDisplay);
                                } if (localUniquenessTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "uniquenessType"));
                            
                            
                                    if (localUniquenessType==null){
                                         throw new org.apache.axis2.databinding.ADBException("uniquenessType cannot be null!!");
                                    }
                                    elementList.add(localUniquenessType);
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
        public static ExternalIdTypeObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ExternalIdTypeObject object =
                new ExternalIdTypeObject();

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
                    
                            if (!"externalIdTypeObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ExternalIdTypeObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","externalIdType").equals(reader.getName())){
                                
                                                object.setExternalIdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","languageCode").equals(reader.getName())){
                                
                                                object.setLanguageCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceVersionId").equals(reader.getName())){
                                
                                                object.setServiceVersionId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","description").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDescription(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDescription(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","displayValue").equals(reader.getName())){
                                
                                                object.setDisplayValue(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isDefault").equals(reader.getName())){
                                
                                                object.setIsDefault(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isFandfEligible").equals(reader.getName())){
                                
                                                object.setIsFandfEligible(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isForRating").equals(reader.getName())){
                                
                                                object.setIsForRating(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isInternal").equals(reader.getName())){
                                
                                                object.setIsInternal(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isNotification").equals(reader.getName())){
                                
                                                object.setIsNotification(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isRangeMap").equals(reader.getName())){
                                
                                                object.setIsRangeMap(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isViewable").equals(reader.getName())){
                                
                                                object.setIsViewable(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","shortDisplay").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setShortDisplay(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setShortDisplay(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","uniquenessType").equals(reader.getName())){
                                
                                                object.setUniquenessType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    