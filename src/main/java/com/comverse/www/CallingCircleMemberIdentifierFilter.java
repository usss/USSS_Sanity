
/**
 * CallingCircleMemberIdentifierFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  CallingCircleMemberIdentifierFilter bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CallingCircleMemberIdentifierFilter
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = callingCircleMemberIdentifierFilter
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CircleId
                        */

                        
                                    protected com.comverse.www.FilterCriteria localCircleId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCircleIdTracker = false ;

                           public boolean isCircleIdSpecified(){
                               return localCircleIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.FilterCriteria
                           */
                           public  com.comverse.www.FilterCriteria getCircleId(){
                               return localCircleId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CircleId
                               */
                               public void setCircleId(com.comverse.www.FilterCriteria param){
                            localCircleIdTracker = param != null;
                                   
                                            this.localCircleId=param;
                                    

                               }
                            

                        /**
                        * field for ExternalId
                        */

                        
                                    protected com.comverse.www.FilterCriteria localExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalIdTracker = false ;

                           public boolean isExternalIdSpecified(){
                               return localExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.FilterCriteria
                           */
                           public  com.comverse.www.FilterCriteria getExternalId(){
                               return localExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalId
                               */
                               public void setExternalId(com.comverse.www.FilterCriteria param){
                            localExternalIdTracker = param != null;
                                   
                                            this.localExternalId=param;
                                    

                               }
                            

                        /**
                        * field for ServiceInternalId
                        */

                        
                                    protected com.comverse.www.FilterCriteria localServiceInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceInternalIdTracker = false ;

                           public boolean isServiceInternalIdSpecified(){
                               return localServiceInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.FilterCriteria
                           */
                           public  com.comverse.www.FilterCriteria getServiceInternalId(){
                               return localServiceInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInternalId
                               */
                               public void setServiceInternalId(com.comverse.www.FilterCriteria param){
                            localServiceInternalIdTracker = param != null;
                                   
                                            this.localServiceInternalId=param;
                                    

                               }
                            

                        /**
                        * field for ServiceInternalIdResets
                        */

                        
                                    protected com.comverse.www.FilterCriteria localServiceInternalIdResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceInternalIdResetsTracker = false ;

                           public boolean isServiceInternalIdResetsSpecified(){
                               return localServiceInternalIdResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.FilterCriteria
                           */
                           public  com.comverse.www.FilterCriteria getServiceInternalIdResets(){
                               return localServiceInternalIdResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInternalIdResets
                               */
                               public void setServiceInternalIdResets(com.comverse.www.FilterCriteria param){
                            localServiceInternalIdResetsTracker = param != null;
                                   
                                            this.localServiceInternalIdResets=param;
                                    

                               }
                            

                        /**
                        * field for Sorts
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.SortCriteria[] localSorts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSortsTracker = false ;

                           public boolean isSortsSpecified(){
                               return localSortsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.SortCriteria[]
                           */
                           public  com.comverse.www.SortCriteria[] getSorts(){
                               return localSorts;
                           }

                           
                        


                               
                              /**
                               * validate the array for Sorts
                               */
                              protected void validateSorts(com.comverse.www.SortCriteria[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Sorts
                              */
                              public void setSorts(com.comverse.www.SortCriteria[] param){
                              
                                   validateSorts(param);

                               localSortsTracker = true;
                                      
                                      this.localSorts=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.SortCriteria
                             */
                             public void addSorts(com.comverse.www.SortCriteria param){
                                   if (localSorts == null){
                                   localSorts = new com.comverse.www.SortCriteria[]{};
                                   }

                            
                                 //update the setting tracker
                                localSortsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSorts);
                               list.add(param);
                               this.localSorts =
                             (com.comverse.www.SortCriteria[])list.toArray(
                            new com.comverse.www.SortCriteria[list.size()]);

                             }
                             

                        /**
                        * field for Fetch
                        * This was an Attribute!
                        */

                        
                                    protected boolean localFetch ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getFetch(){
                               return localFetch;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fetch
                               */
                               public void setFetch(boolean param){
                            
                                            this.localFetch=param;
                                    

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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.comverse.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":callingCircleMemberIdentifierFilter",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "callingCircleMemberIdentifierFilter",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "fetch",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFetch), xmlWriter);

                                            
                                      }
                                     if (localCircleIdTracker){
                                            if (localCircleId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("circleId cannot be null!!");
                                            }
                                           localCircleId.serialize(new javax.xml.namespace.QName("","circleId"),
                                               xmlWriter);
                                        } if (localExternalIdTracker){
                                            if (localExternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("externalId cannot be null!!");
                                            }
                                           localExternalId.serialize(new javax.xml.namespace.QName("","externalId"),
                                               xmlWriter);
                                        } if (localServiceInternalIdTracker){
                                            if (localServiceInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceInternalId cannot be null!!");
                                            }
                                           localServiceInternalId.serialize(new javax.xml.namespace.QName("","serviceInternalId"),
                                               xmlWriter);
                                        } if (localServiceInternalIdResetsTracker){
                                            if (localServiceInternalIdResets==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceInternalIdResets cannot be null!!");
                                            }
                                           localServiceInternalIdResets.serialize(new javax.xml.namespace.QName("","serviceInternalIdResets"),
                                               xmlWriter);
                                        } if (localSortsTracker){
                                       if (localSorts!=null){
                                            for (int i = 0;i < localSorts.length;i++){
                                                if (localSorts[i] != null){
                                                 localSorts[i].serialize(new javax.xml.namespace.QName("","sorts"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "sorts", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "sorts", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
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

                 if (localCircleIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "circleId"));
                            
                            
                                    if (localCircleId==null){
                                         throw new org.apache.axis2.databinding.ADBException("circleId cannot be null!!");
                                    }
                                    elementList.add(localCircleId);
                                } if (localExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "externalId"));
                            
                            
                                    if (localExternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("externalId cannot be null!!");
                                    }
                                    elementList.add(localExternalId);
                                } if (localServiceInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceInternalId"));
                            
                            
                                    if (localServiceInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceInternalId cannot be null!!");
                                    }
                                    elementList.add(localServiceInternalId);
                                } if (localServiceInternalIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceInternalIdResets"));
                            
                            
                                    if (localServiceInternalIdResets==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceInternalIdResets cannot be null!!");
                                    }
                                    elementList.add(localServiceInternalIdResets);
                                } if (localSortsTracker){
                             if (localSorts!=null) {
                                 for (int i = 0;i < localSorts.length;i++){

                                    if (localSorts[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "sorts"));
                                         elementList.add(localSorts[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "sorts"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "sorts"));
                                        elementList.add(localSorts);
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","fetch"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFetch));
                                

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
        public static CallingCircleMemberIdentifierFilter parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CallingCircleMemberIdentifierFilter object =
                new CallingCircleMemberIdentifierFilter();

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
                    
                            if (!"callingCircleMemberIdentifierFilter".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CallingCircleMemberIdentifierFilter)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "fetch"
                    java.lang.String tempAttribFetch =
                        
                                reader.getAttributeValue(null,"fetch");
                            
                   if (tempAttribFetch!=null){
                         java.lang.String content = tempAttribFetch;
                        
                                                 object.setFetch(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribFetch));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("fetch");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","circleId").equals(reader.getName())){
                                
                                                object.setCircleId(com.comverse.www.FilterCriteria.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","externalId").equals(reader.getName())){
                                
                                                object.setExternalId(com.comverse.www.FilterCriteria.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceInternalId").equals(reader.getName())){
                                
                                                object.setServiceInternalId(com.comverse.www.FilterCriteria.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceInternalIdResets").equals(reader.getName())){
                                
                                                object.setServiceInternalIdResets(com.comverse.www.FilterCriteria.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sorts").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list5.add(null);
                                                              reader.next();
                                                          } else {
                                                        list5.add(com.comverse.www.SortCriteria.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone5 = false;
                                                        while(!loopDone5){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone5 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","sorts").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list5.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list5.add(com.comverse.www.SortCriteria.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSorts((com.comverse.www.SortCriteria[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.SortCriteria.class,
                                                                list5));
                                                            
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
           
    