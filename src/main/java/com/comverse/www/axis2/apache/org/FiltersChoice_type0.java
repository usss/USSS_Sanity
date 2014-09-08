
/**
 * FiltersChoice_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www.axis2.apache.org;
            

            /**
            *  FiltersChoice_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FiltersChoice_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = filtersChoice_type0
                Namespace URI = 
                Namespace Prefix = 
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localBetweenTracker = false;
                
                   localEqualsTracker = false;
                
                   localGreaterThanEqualsTracker = false;
                
                   localGreaterThanTracker = false;
                
                   localInTracker = false;
                
                   localIsNullTracker = false;
                
                   localLessThanTracker = false;
                
                   localLessThanEqualsTracker = false;
                
                   localLikeTracker = false;
                
                   localOuterJoinTracker = false;
                
                   localXPathTracker = false;
                
            }
        

                        /**
                        * field for Between
                        */

                        
                                    protected com.comverse.www.BetweenFilter localBetween ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBetweenTracker = false ;

                           public boolean isBetweenSpecified(){
                               return localBetweenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BetweenFilter
                           */
                           public  com.comverse.www.BetweenFilter getBetween(){
                               return localBetween;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Between
                               */
                               public void setBetween(com.comverse.www.BetweenFilter param){
                            
                                clearAllSettingTrackers();
                            localBetweenTracker = param != null;
                                   
                                            this.localBetween=param;
                                    

                               }
                            

                        /**
                        * field for Equals
                        */

                        
                                    protected com.comverse.www.EqualsFilter localEquals ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEqualsTracker = false ;

                           public boolean isEqualsSpecified(){
                               return localEqualsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.EqualsFilter
                           */
                           public  com.comverse.www.EqualsFilter getEquals(){
                               return localEquals;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Equals
                               */
                               public void setEquals(com.comverse.www.EqualsFilter param){
                            
                                clearAllSettingTrackers();
                            localEqualsTracker = param != null;
                                   
                                            this.localEquals=param;
                                    

                               }
                            

                        /**
                        * field for GreaterThanEquals
                        */

                        
                                    protected com.comverse.www.GreaterThanEqualsFilter localGreaterThanEquals ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGreaterThanEqualsTracker = false ;

                           public boolean isGreaterThanEqualsSpecified(){
                               return localGreaterThanEqualsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.GreaterThanEqualsFilter
                           */
                           public  com.comverse.www.GreaterThanEqualsFilter getGreaterThanEquals(){
                               return localGreaterThanEquals;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GreaterThanEquals
                               */
                               public void setGreaterThanEquals(com.comverse.www.GreaterThanEqualsFilter param){
                            
                                clearAllSettingTrackers();
                            localGreaterThanEqualsTracker = param != null;
                                   
                                            this.localGreaterThanEquals=param;
                                    

                               }
                            

                        /**
                        * field for GreaterThan
                        */

                        
                                    protected com.comverse.www.GreaterThanFilter localGreaterThan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGreaterThanTracker = false ;

                           public boolean isGreaterThanSpecified(){
                               return localGreaterThanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.GreaterThanFilter
                           */
                           public  com.comverse.www.GreaterThanFilter getGreaterThan(){
                               return localGreaterThan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GreaterThan
                               */
                               public void setGreaterThan(com.comverse.www.GreaterThanFilter param){
                            
                                clearAllSettingTrackers();
                            localGreaterThanTracker = param != null;
                                   
                                            this.localGreaterThan=param;
                                    

                               }
                            

                        /**
                        * field for In
                        */

                        
                                    protected com.comverse.www.InFilter localIn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInTracker = false ;

                           public boolean isInSpecified(){
                               return localInTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.InFilter
                           */
                           public  com.comverse.www.InFilter getIn(){
                               return localIn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param In
                               */
                               public void setIn(com.comverse.www.InFilter param){
                            
                                clearAllSettingTrackers();
                            localInTracker = param != null;
                                   
                                            this.localIn=param;
                                    

                               }
                            

                        /**
                        * field for IsNull
                        */

                        
                                    protected com.comverse.www.IsNullFilter localIsNull ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsNullTracker = false ;

                           public boolean isIsNullSpecified(){
                               return localIsNullTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IsNullFilter
                           */
                           public  com.comverse.www.IsNullFilter getIsNull(){
                               return localIsNull;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsNull
                               */
                               public void setIsNull(com.comverse.www.IsNullFilter param){
                            
                                clearAllSettingTrackers();
                            localIsNullTracker = param != null;
                                   
                                            this.localIsNull=param;
                                    

                               }
                            

                        /**
                        * field for LessThan
                        */

                        
                                    protected com.comverse.www.LessThanFilter localLessThan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLessThanTracker = false ;

                           public boolean isLessThanSpecified(){
                               return localLessThanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LessThanFilter
                           */
                           public  com.comverse.www.LessThanFilter getLessThan(){
                               return localLessThan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LessThan
                               */
                               public void setLessThan(com.comverse.www.LessThanFilter param){
                            
                                clearAllSettingTrackers();
                            localLessThanTracker = param != null;
                                   
                                            this.localLessThan=param;
                                    

                               }
                            

                        /**
                        * field for LessThanEquals
                        */

                        
                                    protected com.comverse.www.LessThanEqualsFilter localLessThanEquals ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLessThanEqualsTracker = false ;

                           public boolean isLessThanEqualsSpecified(){
                               return localLessThanEqualsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LessThanEqualsFilter
                           */
                           public  com.comverse.www.LessThanEqualsFilter getLessThanEquals(){
                               return localLessThanEquals;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LessThanEquals
                               */
                               public void setLessThanEquals(com.comverse.www.LessThanEqualsFilter param){
                            
                                clearAllSettingTrackers();
                            localLessThanEqualsTracker = param != null;
                                   
                                            this.localLessThanEquals=param;
                                    

                               }
                            

                        /**
                        * field for Like
                        */

                        
                                    protected com.comverse.www.LikeFilter localLike ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLikeTracker = false ;

                           public boolean isLikeSpecified(){
                               return localLikeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LikeFilter
                           */
                           public  com.comverse.www.LikeFilter getLike(){
                               return localLike;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Like
                               */
                               public void setLike(com.comverse.www.LikeFilter param){
                            
                                clearAllSettingTrackers();
                            localLikeTracker = param != null;
                                   
                                            this.localLike=param;
                                    

                               }
                            

                        /**
                        * field for OuterJoin
                        */

                        
                                    protected com.comverse.www.OuterJoinFilter localOuterJoin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOuterJoinTracker = false ;

                           public boolean isOuterJoinSpecified(){
                               return localOuterJoinTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.OuterJoinFilter
                           */
                           public  com.comverse.www.OuterJoinFilter getOuterJoin(){
                               return localOuterJoin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OuterJoin
                               */
                               public void setOuterJoin(com.comverse.www.OuterJoinFilter param){
                            
                                clearAllSettingTrackers();
                            localOuterJoinTracker = param != null;
                                   
                                            this.localOuterJoin=param;
                                    

                               }
                            

                        /**
                        * field for XPath
                        */

                        
                                    protected com.comverse.www.XpathFilter localXPath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localXPathTracker = false ;

                           public boolean isXPathSpecified(){
                               return localXPathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.XpathFilter
                           */
                           public  com.comverse.www.XpathFilter getXPath(){
                               return localXPath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param XPath
                               */
                               public void setXPath(com.comverse.www.XpathFilter param){
                            
                                clearAllSettingTrackers();
                            localXPathTracker = param != null;
                                   
                                            this.localXPath=param;
                                    

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
            
                


                String prefix = null;
                String namespace = null;
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":filtersChoice_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "filtersChoice_type0",
                           xmlWriter);
                   }

               
                   }
                if (localBetweenTracker){
                                            if (localBetween==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Between cannot be null!!");
                                            }
                                           localBetween.serialize(new javax.xml.namespace.QName("","Between"),
                                               xmlWriter);
                                        } if (localEqualsTracker){
                                            if (localEquals==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Equals cannot be null!!");
                                            }
                                           localEquals.serialize(new javax.xml.namespace.QName("","Equals"),
                                               xmlWriter);
                                        } if (localGreaterThanEqualsTracker){
                                            if (localGreaterThanEquals==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GreaterThanEquals cannot be null!!");
                                            }
                                           localGreaterThanEquals.serialize(new javax.xml.namespace.QName("","GreaterThanEquals"),
                                               xmlWriter);
                                        } if (localGreaterThanTracker){
                                            if (localGreaterThan==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GreaterThan cannot be null!!");
                                            }
                                           localGreaterThan.serialize(new javax.xml.namespace.QName("","GreaterThan"),
                                               xmlWriter);
                                        } if (localInTracker){
                                            if (localIn==null){
                                                 throw new org.apache.axis2.databinding.ADBException("In cannot be null!!");
                                            }
                                           localIn.serialize(new javax.xml.namespace.QName("","In"),
                                               xmlWriter);
                                        } if (localIsNullTracker){
                                            if (localIsNull==null){
                                                 throw new org.apache.axis2.databinding.ADBException("IsNull cannot be null!!");
                                            }
                                           localIsNull.serialize(new javax.xml.namespace.QName("","IsNull"),
                                               xmlWriter);
                                        } if (localLessThanTracker){
                                            if (localLessThan==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LessThan cannot be null!!");
                                            }
                                           localLessThan.serialize(new javax.xml.namespace.QName("","LessThan"),
                                               xmlWriter);
                                        } if (localLessThanEqualsTracker){
                                            if (localLessThanEquals==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LessThanEquals cannot be null!!");
                                            }
                                           localLessThanEquals.serialize(new javax.xml.namespace.QName("","LessThanEquals"),
                                               xmlWriter);
                                        } if (localLikeTracker){
                                            if (localLike==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Like cannot be null!!");
                                            }
                                           localLike.serialize(new javax.xml.namespace.QName("","Like"),
                                               xmlWriter);
                                        } if (localOuterJoinTracker){
                                            if (localOuterJoin==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OuterJoin cannot be null!!");
                                            }
                                           localOuterJoin.serialize(new javax.xml.namespace.QName("","OuterJoin"),
                                               xmlWriter);
                                        } if (localXPathTracker){
                                            if (localXPath==null){
                                                 throw new org.apache.axis2.databinding.ADBException("XPath cannot be null!!");
                                            }
                                           localXPath.serialize(new javax.xml.namespace.QName("","XPath"),
                                               xmlWriter);
                                        }

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("")){
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
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
        private void writeAttribute(String prefix,String namespace,String attName,
                                    String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace,String attName,
                                    String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
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
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                String attributeNamespace = qname.getNamespaceURI();
                String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                String attributeValue;
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
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
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
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

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
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
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

                 if (localBetweenTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "Between"));
                            
                            
                                    if (localBetween==null){
                                         throw new org.apache.axis2.databinding.ADBException("Between cannot be null!!");
                                    }
                                    elementList.add(localBetween);
                                } if (localEqualsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "Equals"));
                            
                            
                                    if (localEquals==null){
                                         throw new org.apache.axis2.databinding.ADBException("Equals cannot be null!!");
                                    }
                                    elementList.add(localEquals);
                                } if (localGreaterThanEqualsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "GreaterThanEquals"));
                            
                            
                                    if (localGreaterThanEquals==null){
                                         throw new org.apache.axis2.databinding.ADBException("GreaterThanEquals cannot be null!!");
                                    }
                                    elementList.add(localGreaterThanEquals);
                                } if (localGreaterThanTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "GreaterThan"));
                            
                            
                                    if (localGreaterThan==null){
                                         throw new org.apache.axis2.databinding.ADBException("GreaterThan cannot be null!!");
                                    }
                                    elementList.add(localGreaterThan);
                                } if (localInTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "In"));
                            
                            
                                    if (localIn==null){
                                         throw new org.apache.axis2.databinding.ADBException("In cannot be null!!");
                                    }
                                    elementList.add(localIn);
                                } if (localIsNullTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "IsNull"));
                            
                            
                                    if (localIsNull==null){
                                         throw new org.apache.axis2.databinding.ADBException("IsNull cannot be null!!");
                                    }
                                    elementList.add(localIsNull);
                                } if (localLessThanTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "LessThan"));
                            
                            
                                    if (localLessThan==null){
                                         throw new org.apache.axis2.databinding.ADBException("LessThan cannot be null!!");
                                    }
                                    elementList.add(localLessThan);
                                } if (localLessThanEqualsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "LessThanEquals"));
                            
                            
                                    if (localLessThanEquals==null){
                                         throw new org.apache.axis2.databinding.ADBException("LessThanEquals cannot be null!!");
                                    }
                                    elementList.add(localLessThanEquals);
                                } if (localLikeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "Like"));
                            
                            
                                    if (localLike==null){
                                         throw new org.apache.axis2.databinding.ADBException("Like cannot be null!!");
                                    }
                                    elementList.add(localLike);
                                } if (localOuterJoinTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "OuterJoin"));
                            
                            
                                    if (localOuterJoin==null){
                                         throw new org.apache.axis2.databinding.ADBException("OuterJoin cannot be null!!");
                                    }
                                    elementList.add(localOuterJoin);
                                } if (localXPathTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "XPath"));
                            
                            
                                    if (localXPath==null){
                                         throw new org.apache.axis2.databinding.ADBException("XPath cannot be null!!");
                                    }
                                    elementList.add(localXPath);
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
        public static FiltersChoice_type0 parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            FiltersChoice_type0 object =
                new FiltersChoice_type0();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Between").equals(reader.getName())){
                                
                                                object.setBetween(com.comverse.www.BetweenFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Equals").equals(reader.getName())){
                                
                                                object.setEquals(com.comverse.www.EqualsFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","GreaterThanEquals").equals(reader.getName())){
                                
                                                object.setGreaterThanEquals(com.comverse.www.GreaterThanEqualsFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","GreaterThan").equals(reader.getName())){
                                
                                                object.setGreaterThan(com.comverse.www.GreaterThanFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","In").equals(reader.getName())){
                                
                                                object.setIn(com.comverse.www.InFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","IsNull").equals(reader.getName())){
                                
                                                object.setIsNull(com.comverse.www.IsNullFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","LessThan").equals(reader.getName())){
                                
                                                object.setLessThan(com.comverse.www.LessThanFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","LessThanEquals").equals(reader.getName())){
                                
                                                object.setLessThanEquals(com.comverse.www.LessThanEqualsFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Like").equals(reader.getName())){
                                
                                                object.setLike(com.comverse.www.LikeFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","OuterJoin").equals(reader.getName())){
                                
                                                object.setOuterJoin(com.comverse.www.OuterJoinFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","XPath").equals(reader.getName())){
                                
                                                object.setXPath(com.comverse.www.XpathFilter.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    