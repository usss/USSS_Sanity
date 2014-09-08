
/**
 * MessageBaseChoice_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  MessageBaseChoice_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MessageBaseChoice_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = messageBaseChoice_type0
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localAccountInternalIdLocatorTracker = false;
                
                   localAccountExternalIdLocatorTracker = false;
                
                   localSubscriberExternalIdLocatorTracker = false;
                
                   localSubscriberInternalIdLocatorTracker = false;
                
                   localSubscriberExternalIdViewLocatorTracker = false;
                
                   localSubscriberRangeMapLocatorTracker = false;
                
                   localOrderIdLocatorTracker = false;
                
                   localServerIdLocatorTracker = false;
                
            }
        

                        /**
                        * field for AccountInternalIdLocator
                        */

                        
                                    protected com.comverse.www.AccountInternalIdLocator localAccountInternalIdLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountInternalIdLocatorTracker = false ;

                           public boolean isAccountInternalIdLocatorSpecified(){
                               return localAccountInternalIdLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.AccountInternalIdLocator
                           */
                           public  com.comverse.www.AccountInternalIdLocator getAccountInternalIdLocator(){
                               return localAccountInternalIdLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountInternalIdLocator
                               */
                               public void setAccountInternalIdLocator(com.comverse.www.AccountInternalIdLocator param){
                            
                                clearAllSettingTrackers();
                            localAccountInternalIdLocatorTracker = param != null;
                                   
                                            this.localAccountInternalIdLocator=param;
                                    

                               }
                            

                        /**
                        * field for AccountExternalIdLocator
                        */

                        
                                    protected com.comverse.www.AccountExternalIdLocator localAccountExternalIdLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountExternalIdLocatorTracker = false ;

                           public boolean isAccountExternalIdLocatorSpecified(){
                               return localAccountExternalIdLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.AccountExternalIdLocator
                           */
                           public  com.comverse.www.AccountExternalIdLocator getAccountExternalIdLocator(){
                               return localAccountExternalIdLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountExternalIdLocator
                               */
                               public void setAccountExternalIdLocator(com.comverse.www.AccountExternalIdLocator param){
                            
                                clearAllSettingTrackers();
                            localAccountExternalIdLocatorTracker = param != null;
                                   
                                            this.localAccountExternalIdLocator=param;
                                    

                               }
                            

                        /**
                        * field for SubscriberExternalIdLocator
                        */

                        
                                    protected com.comverse.www.SubscriberExternalIdLocator localSubscriberExternalIdLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberExternalIdLocatorTracker = false ;

                           public boolean isSubscriberExternalIdLocatorSpecified(){
                               return localSubscriberExternalIdLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.SubscriberExternalIdLocator
                           */
                           public  com.comverse.www.SubscriberExternalIdLocator getSubscriberExternalIdLocator(){
                               return localSubscriberExternalIdLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberExternalIdLocator
                               */
                               public void setSubscriberExternalIdLocator(com.comverse.www.SubscriberExternalIdLocator param){
                            
                                clearAllSettingTrackers();
                            localSubscriberExternalIdLocatorTracker = param != null;
                                   
                                            this.localSubscriberExternalIdLocator=param;
                                    

                               }
                            

                        /**
                        * field for SubscriberInternalIdLocator
                        */

                        
                                    protected com.comverse.www.SubscriberInternalIdLocator localSubscriberInternalIdLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberInternalIdLocatorTracker = false ;

                           public boolean isSubscriberInternalIdLocatorSpecified(){
                               return localSubscriberInternalIdLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.SubscriberInternalIdLocator
                           */
                           public  com.comverse.www.SubscriberInternalIdLocator getSubscriberInternalIdLocator(){
                               return localSubscriberInternalIdLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberInternalIdLocator
                               */
                               public void setSubscriberInternalIdLocator(com.comverse.www.SubscriberInternalIdLocator param){
                            
                                clearAllSettingTrackers();
                            localSubscriberInternalIdLocatorTracker = param != null;
                                   
                                            this.localSubscriberInternalIdLocator=param;
                                    

                               }
                            

                        /**
                        * field for SubscriberExternalIdViewLocator
                        */

                        
                                    protected com.comverse.www.SubscriberExternalIdViewLocator localSubscriberExternalIdViewLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberExternalIdViewLocatorTracker = false ;

                           public boolean isSubscriberExternalIdViewLocatorSpecified(){
                               return localSubscriberExternalIdViewLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.SubscriberExternalIdViewLocator
                           */
                           public  com.comverse.www.SubscriberExternalIdViewLocator getSubscriberExternalIdViewLocator(){
                               return localSubscriberExternalIdViewLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberExternalIdViewLocator
                               */
                               public void setSubscriberExternalIdViewLocator(com.comverse.www.SubscriberExternalIdViewLocator param){
                            
                                clearAllSettingTrackers();
                            localSubscriberExternalIdViewLocatorTracker = param != null;
                                   
                                            this.localSubscriberExternalIdViewLocator=param;
                                    

                               }
                            

                        /**
                        * field for SubscriberRangeMapLocator
                        */

                        
                                    protected com.comverse.www.SubscriberRangeMapLocator localSubscriberRangeMapLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberRangeMapLocatorTracker = false ;

                           public boolean isSubscriberRangeMapLocatorSpecified(){
                               return localSubscriberRangeMapLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.SubscriberRangeMapLocator
                           */
                           public  com.comverse.www.SubscriberRangeMapLocator getSubscriberRangeMapLocator(){
                               return localSubscriberRangeMapLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberRangeMapLocator
                               */
                               public void setSubscriberRangeMapLocator(com.comverse.www.SubscriberRangeMapLocator param){
                            
                                clearAllSettingTrackers();
                            localSubscriberRangeMapLocatorTracker = param != null;
                                   
                                            this.localSubscriberRangeMapLocator=param;
                                    

                               }
                            

                        /**
                        * field for OrderIdLocator
                        */

                        
                                    protected com.comverse.www.OrderIdLocator localOrderIdLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderIdLocatorTracker = false ;

                           public boolean isOrderIdLocatorSpecified(){
                               return localOrderIdLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.OrderIdLocator
                           */
                           public  com.comverse.www.OrderIdLocator getOrderIdLocator(){
                               return localOrderIdLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrderIdLocator
                               */
                               public void setOrderIdLocator(com.comverse.www.OrderIdLocator param){
                            
                                clearAllSettingTrackers();
                            localOrderIdLocatorTracker = param != null;
                                   
                                            this.localOrderIdLocator=param;
                                    

                               }
                            

                        /**
                        * field for ServerIdLocator
                        */

                        
                                    protected com.comverse.www.ServerIdLocator localServerIdLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerIdLocatorTracker = false ;

                           public boolean isServerIdLocatorSpecified(){
                               return localServerIdLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ServerIdLocator
                           */
                           public  com.comverse.www.ServerIdLocator getServerIdLocator(){
                               return localServerIdLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerIdLocator
                               */
                               public void setServerIdLocator(com.comverse.www.ServerIdLocator param){
                            
                                clearAllSettingTrackers();
                            localServerIdLocatorTracker = param != null;
                                   
                                            this.localServerIdLocator=param;
                                    

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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.comverse.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":messageBaseChoice_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "messageBaseChoice_type0",
                           xmlWriter);
                   }

               
                   }
                if (localAccountInternalIdLocatorTracker){
                                            if (localAccountInternalIdLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AccountInternalIdLocator cannot be null!!");
                                            }
                                           localAccountInternalIdLocator.serialize(new javax.xml.namespace.QName("","AccountInternalIdLocator"),
                                               xmlWriter);
                                        } if (localAccountExternalIdLocatorTracker){
                                            if (localAccountExternalIdLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AccountExternalIdLocator cannot be null!!");
                                            }
                                           localAccountExternalIdLocator.serialize(new javax.xml.namespace.QName("","AccountExternalIdLocator"),
                                               xmlWriter);
                                        } if (localSubscriberExternalIdLocatorTracker){
                                            if (localSubscriberExternalIdLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SubscriberExternalIdLocator cannot be null!!");
                                            }
                                           localSubscriberExternalIdLocator.serialize(new javax.xml.namespace.QName("","SubscriberExternalIdLocator"),
                                               xmlWriter);
                                        } if (localSubscriberInternalIdLocatorTracker){
                                            if (localSubscriberInternalIdLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SubscriberInternalIdLocator cannot be null!!");
                                            }
                                           localSubscriberInternalIdLocator.serialize(new javax.xml.namespace.QName("","SubscriberInternalIdLocator"),
                                               xmlWriter);
                                        } if (localSubscriberExternalIdViewLocatorTracker){
                                            if (localSubscriberExternalIdViewLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SubscriberExternalIdViewLocator cannot be null!!");
                                            }
                                           localSubscriberExternalIdViewLocator.serialize(new javax.xml.namespace.QName("","SubscriberExternalIdViewLocator"),
                                               xmlWriter);
                                        } if (localSubscriberRangeMapLocatorTracker){
                                            if (localSubscriberRangeMapLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SubscriberRangeMapLocator cannot be null!!");
                                            }
                                           localSubscriberRangeMapLocator.serialize(new javax.xml.namespace.QName("","SubscriberRangeMapLocator"),
                                               xmlWriter);
                                        } if (localOrderIdLocatorTracker){
                                            if (localOrderIdLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OrderIdLocator cannot be null!!");
                                            }
                                           localOrderIdLocator.serialize(new javax.xml.namespace.QName("","OrderIdLocator"),
                                               xmlWriter);
                                        } if (localServerIdLocatorTracker){
                                            if (localServerIdLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServerIdLocator cannot be null!!");
                                            }
                                           localServerIdLocator.serialize(new javax.xml.namespace.QName("","ServerIdLocator"),
                                               xmlWriter);
                                        }

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

                 if (localAccountInternalIdLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "AccountInternalIdLocator"));
                            
                            
                                    if (localAccountInternalIdLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("AccountInternalIdLocator cannot be null!!");
                                    }
                                    elementList.add(localAccountInternalIdLocator);
                                } if (localAccountExternalIdLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "AccountExternalIdLocator"));
                            
                            
                                    if (localAccountExternalIdLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("AccountExternalIdLocator cannot be null!!");
                                    }
                                    elementList.add(localAccountExternalIdLocator);
                                } if (localSubscriberExternalIdLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "SubscriberExternalIdLocator"));
                            
                            
                                    if (localSubscriberExternalIdLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("SubscriberExternalIdLocator cannot be null!!");
                                    }
                                    elementList.add(localSubscriberExternalIdLocator);
                                } if (localSubscriberInternalIdLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "SubscriberInternalIdLocator"));
                            
                            
                                    if (localSubscriberInternalIdLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("SubscriberInternalIdLocator cannot be null!!");
                                    }
                                    elementList.add(localSubscriberInternalIdLocator);
                                } if (localSubscriberExternalIdViewLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "SubscriberExternalIdViewLocator"));
                            
                            
                                    if (localSubscriberExternalIdViewLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("SubscriberExternalIdViewLocator cannot be null!!");
                                    }
                                    elementList.add(localSubscriberExternalIdViewLocator);
                                } if (localSubscriberRangeMapLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "SubscriberRangeMapLocator"));
                            
                            
                                    if (localSubscriberRangeMapLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("SubscriberRangeMapLocator cannot be null!!");
                                    }
                                    elementList.add(localSubscriberRangeMapLocator);
                                } if (localOrderIdLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "OrderIdLocator"));
                            
                            
                                    if (localOrderIdLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("OrderIdLocator cannot be null!!");
                                    }
                                    elementList.add(localOrderIdLocator);
                                } if (localServerIdLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ServerIdLocator"));
                            
                            
                                    if (localServerIdLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServerIdLocator cannot be null!!");
                                    }
                                    elementList.add(localServerIdLocator);
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
        public static MessageBaseChoice_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MessageBaseChoice_type0 object =
                new MessageBaseChoice_type0();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","AccountInternalIdLocator").equals(reader.getName())){
                                
                                                object.setAccountInternalIdLocator(com.comverse.www.AccountInternalIdLocator.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","AccountExternalIdLocator").equals(reader.getName())){
                                
                                                object.setAccountExternalIdLocator(com.comverse.www.AccountExternalIdLocator.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SubscriberExternalIdLocator").equals(reader.getName())){
                                
                                                object.setSubscriberExternalIdLocator(com.comverse.www.SubscriberExternalIdLocator.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SubscriberInternalIdLocator").equals(reader.getName())){
                                
                                                object.setSubscriberInternalIdLocator(com.comverse.www.SubscriberInternalIdLocator.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SubscriberExternalIdViewLocator").equals(reader.getName())){
                                
                                                object.setSubscriberExternalIdViewLocator(com.comverse.www.SubscriberExternalIdViewLocator.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SubscriberRangeMapLocator").equals(reader.getName())){
                                
                                                object.setSubscriberRangeMapLocator(com.comverse.www.SubscriberRangeMapLocator.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","OrderIdLocator").equals(reader.getName())){
                                
                                                object.setOrderIdLocator(com.comverse.www.OrderIdLocator.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ServerIdLocator").equals(reader.getName())){
                                
                                                object.setServerIdLocator(com.comverse.www.ServerIdLocator.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    