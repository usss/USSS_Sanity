
/**
 * NamedNrcTermInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  NamedNrcTermInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NamedNrcTermInstanceObject extends com.comverse.www.NrcTermInstanceObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = namedNrcTermInstanceObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for NrcName
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localNrcName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNrcNameTracker = false ;

                           public boolean isNrcNameSpecified(){
                               return localNrcNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getNrcName(){
                               return localNrcName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NrcName
                               */
                               public void setNrcName(com.comverse.www.StringAttributeJAXBElement param){
                            localNrcNameTracker = param != null;
                                   
                                            this.localNrcName=param;
                                    

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
                           namespacePrefix+":namedNrcTermInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "namedNrcTermInstanceObject",
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
                              if (localNrcTermInstIdTracker){
                                            if (localNrcTermInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("nrcTermInstId cannot be null!!");
                                            }
                                           localNrcTermInstId.serialize(new javax.xml.namespace.QName("","nrcTermInstId"),
                                               xmlWriter);
                                        } if (localAnnotationTracker){
                                    if (localAnnotation==null){

                                        writeStartElement(null, "", "annotation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAnnotation.serialize(new javax.xml.namespace.QName("","annotation"),
                                        xmlWriter);
                                    }
                                } if (localAnnotation2Tracker){
                                    if (localAnnotation2==null){

                                        writeStartElement(null, "", "annotation2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAnnotation2.serialize(new javax.xml.namespace.QName("","annotation2"),
                                        xmlWriter);
                                    }
                                } if (localApplyDateTracker){
                                    if (localApplyDate==null){

                                        writeStartElement(null, "", "applyDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localApplyDate.serialize(new javax.xml.namespace.QName("","applyDate"),
                                        xmlWriter);
                                    }
                                } if (localApplyDayTracker){
                                    if (localApplyDay==null){

                                        writeStartElement(null, "", "applyDay", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localApplyDay.serialize(new javax.xml.namespace.QName("","applyDay"),
                                        xmlWriter);
                                    }
                                } if (localAssociationTypeTracker){
                                            if (localAssociationType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("associationType cannot be null!!");
                                            }
                                           localAssociationType.serialize(new javax.xml.namespace.QName("","associationType"),
                                               xmlWriter);
                                        } if (localAutoActivationTracker){
                                            if (localAutoActivation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("autoActivation cannot be null!!");
                                            }
                                           localAutoActivation.serialize(new javax.xml.namespace.QName("","autoActivation"),
                                               xmlWriter);
                                        } if (localBillOrderNumberTracker){
                                    if (localBillOrderNumber==null){

                                        writeStartElement(null, "", "billOrderNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillOrderNumber.serialize(new javax.xml.namespace.QName("","billOrderNumber"),
                                        xmlWriter);
                                    }
                                } if (localBillingAccountInternalIdTracker){
                                            if (localBillingAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("billingAccountInternalId cannot be null!!");
                                            }
                                           localBillingAccountInternalId.serialize(new javax.xml.namespace.QName("","billingAccountInternalId"),
                                               xmlWriter);
                                        } if (localBundleInstIdTracker){
                                    if (localBundleInstId==null){

                                        writeStartElement(null, "", "bundleInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBundleInstId.serialize(new javax.xml.namespace.QName("","bundleInstId"),
                                        xmlWriter);
                                    }
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
                                        } if (localCityTaxTracker){
                                    if (localCityTax==null){

                                        writeStartElement(null, "", "cityTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCityTax.serialize(new javax.xml.namespace.QName("","cityTax"),
                                        xmlWriter);
                                    }
                                } if (localCountyTaxTracker){
                                    if (localCountyTax==null){

                                        writeStartElement(null, "", "countyTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCountyTax.serialize(new javax.xml.namespace.QName("","countyTax"),
                                        xmlWriter);
                                    }
                                } if (localCreateDtTracker){
                                            if (localCreateDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("createDt cannot be null!!");
                                            }
                                           localCreateDt.serialize(new javax.xml.namespace.QName("","createDt"),
                                               xmlWriter);
                                        } if (localCurrencyCodeTracker){
                                    if (localCurrencyCode==null){

                                        writeStartElement(null, "", "currencyCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCurrencyCode.serialize(new javax.xml.namespace.QName("","currencyCode"),
                                        xmlWriter);
                                    }
                                } if (localCurrentInstallmentTracker){
                                            if (localCurrentInstallment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currentInstallment cannot be null!!");
                                            }
                                           localCurrentInstallment.serialize(new javax.xml.namespace.QName("","currentInstallment"),
                                               xmlWriter);
                                        } if (localCustomerOrderNumberTracker){
                                    if (localCustomerOrderNumber==null){

                                        writeStartElement(null, "", "customerOrderNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustomerOrderNumber.serialize(new javax.xml.namespace.QName("","customerOrderNumber"),
                                        xmlWriter);
                                    }
                                } if (localDateNrcJournalableTracker){
                                    if (localDateNrcJournalable==null){

                                        writeStartElement(null, "", "dateNrcJournalable", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDateNrcJournalable.serialize(new javax.xml.namespace.QName("","dateNrcJournalable"),
                                        xmlWriter);
                                    }
                                } if (localFederalTaxTracker){
                                    if (localFederalTax==null){

                                        writeStartElement(null, "", "federalTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFederalTax.serialize(new javax.xml.namespace.QName("","federalTax"),
                                        xmlWriter);
                                    }
                                } if (localFlexibleCycleDurationTracker){
                                    if (localFlexibleCycleDuration==null){

                                        writeStartElement(null, "", "flexibleCycleDuration", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFlexibleCycleDuration.serialize(new javax.xml.namespace.QName("","flexibleCycleDuration"),
                                        xmlWriter);
                                    }
                                } if (localGeoAreaIdTracker){
                                    if (localGeoAreaId==null){

                                        writeStartElement(null, "", "geoAreaId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGeoAreaId.serialize(new javax.xml.namespace.QName("","geoAreaId"),
                                        xmlWriter);
                                    }
                                } if (localInventoryIdTracker){
                                    if (localInventoryId==null){

                                        writeStartElement(null, "", "inventoryId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInventoryId.serialize(new javax.xml.namespace.QName("","inventoryId"),
                                        xmlWriter);
                                    }
                                } if (localInventoryIdResetsTracker){
                                    if (localInventoryIdResets==null){

                                        writeStartElement(null, "", "inventoryIdResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInventoryIdResets.serialize(new javax.xml.namespace.QName("","inventoryIdResets"),
                                        xmlWriter);
                                    }
                                } if (localLastProcessedDtTracker){
                                            if (localLastProcessedDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("lastProcessedDt cannot be null!!");
                                            }
                                           localLastProcessedDt.serialize(new javax.xml.namespace.QName("","lastProcessedDt"),
                                               xmlWriter);
                                        } if (localNoBillTracker){
                                            if (localNoBill==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                            }
                                           localNoBill.serialize(new javax.xml.namespace.QName("","noBill"),
                                               xmlWriter);
                                        } if (localNrcCategoryTracker){
                                            if (localNrcCategory==null){
                                                 throw new org.apache.axis2.databinding.ADBException("nrcCategory cannot be null!!");
                                            }
                                           localNrcCategory.serialize(new javax.xml.namespace.QName("","nrcCategory"),
                                               xmlWriter);
                                        } if (localNrcTermIdTracker){
                                            if (localNrcTermId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("nrcTermId cannot be null!!");
                                            }
                                           localNrcTermId.serialize(new javax.xml.namespace.QName("","nrcTermId"),
                                               xmlWriter);
                                        } if (localOfferInstIdTracker){
                                    if (localOfferInstId==null){

                                        writeStartElement(null, "", "offerInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOfferInstId.serialize(new javax.xml.namespace.QName("","offerInstId"),
                                        xmlWriter);
                                    }
                                } if (localOrderNumberTracker){
                                    if (localOrderNumber==null){

                                        writeStartElement(null, "", "orderNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOrderNumber.serialize(new javax.xml.namespace.QName("","orderNumber"),
                                        xmlWriter);
                                    }
                                } if (localOtherTaxTracker){
                                    if (localOtherTax==null){

                                        writeStartElement(null, "", "otherTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOtherTax.serialize(new javax.xml.namespace.QName("","otherTax"),
                                        xmlWriter);
                                    }
                                } if (localParentAccountInternalIdTracker){
                                    if (localParentAccountInternalId==null){

                                        writeStartElement(null, "", "parentAccountInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentAccountInternalId.serialize(new javax.xml.namespace.QName("","parentAccountInternalId"),
                                        xmlWriter);
                                    }
                                } if (localParentServiceInternalIdTracker){
                                    if (localParentServiceInternalId==null){

                                        writeStartElement(null, "", "parentServiceInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentServiceInternalId.serialize(new javax.xml.namespace.QName("","parentServiceInternalId"),
                                        xmlWriter);
                                    }
                                } if (localParentServiceInternalIdResetsTracker){
                                    if (localParentServiceInternalIdResets==null){

                                        writeStartElement(null, "", "parentServiceInternalIdResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentServiceInternalIdResets.serialize(new javax.xml.namespace.QName("","parentServiceInternalIdResets"),
                                        xmlWriter);
                                    }
                                } if (localPostActiveChgAppliedTracker){
                                            if (localPostActiveChgApplied==null){
                                                 throw new org.apache.axis2.databinding.ADBException("postActiveChgApplied cannot be null!!");
                                            }
                                           localPostActiveChgApplied.serialize(new javax.xml.namespace.QName("","postActiveChgApplied"),
                                               xmlWriter);
                                        } if (localProcessErrorCodeTracker){
                                    if (localProcessErrorCode==null){

                                        writeStartElement(null, "", "processErrorCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProcessErrorCode.serialize(new javax.xml.namespace.QName("","processErrorCode"),
                                        xmlWriter);
                                    }
                                } if (localProcessingStatusTracker){
                                            if (localProcessingStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("processingStatus cannot be null!!");
                                            }
                                           localProcessingStatus.serialize(new javax.xml.namespace.QName("","processingStatus"),
                                               xmlWriter);
                                        } if (localProfileIdTracker){
                                    if (localProfileId==null){

                                        writeStartElement(null, "", "profileId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProfileId.serialize(new javax.xml.namespace.QName("","profileId"),
                                        xmlWriter);
                                    }
                                } if (localRateTracker){
                                    if (localRate==null){

                                        writeStartElement(null, "", "rate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRate.serialize(new javax.xml.namespace.QName("","rate"),
                                        xmlWriter);
                                    }
                                } if (localRateDtTracker){
                                            if (localRateDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rateDt cannot be null!!");
                                            }
                                           localRateDt.serialize(new javax.xml.namespace.QName("","rateDt"),
                                               xmlWriter);
                                        } if (localRedirectAccountNoTracker){
                                    if (localRedirectAccountNo==null){

                                        writeStartElement(null, "", "redirectAccountNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRedirectAccountNo.serialize(new javax.xml.namespace.QName("","redirectAccountNo"),
                                        xmlWriter);
                                    }
                                } if (localRedirectInactiveDtTracker){
                                    if (localRedirectInactiveDt==null){

                                        writeStartElement(null, "", "redirectInactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRedirectInactiveDt.serialize(new javax.xml.namespace.QName("","redirectInactiveDt"),
                                        xmlWriter);
                                    }
                                } if (localRedirectTypeTracker){
                                            if (localRedirectType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("redirectType cannot be null!!");
                                            }
                                           localRedirectType.serialize(new javax.xml.namespace.QName("","redirectType"),
                                               xmlWriter);
                                        } if (localRetryCountTracker){
                                            if (localRetryCount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("retryCount cannot be null!!");
                                            }
                                           localRetryCount.serialize(new javax.xml.namespace.QName("","retryCount"),
                                               xmlWriter);
                                        } if (localSalesChannelIdTracker){
                                    if (localSalesChannelId==null){

                                        writeStartElement(null, "", "salesChannelId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSalesChannelId.serialize(new javax.xml.namespace.QName("","salesChannelId"),
                                        xmlWriter);
                                    }
                                } if (localShipFromGeocodeTracker){
                                    if (localShipFromGeocode==null){

                                        writeStartElement(null, "", "shipFromGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localShipFromGeocode.serialize(new javax.xml.namespace.QName("","shipFromGeocode"),
                                        xmlWriter);
                                    }
                                } if (localShipToGeocodeTracker){
                                    if (localShipToGeocode==null){

                                        writeStartElement(null, "", "shipToGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localShipToGeocode.serialize(new javax.xml.namespace.QName("","shipToGeocode"),
                                        xmlWriter);
                                    }
                                } if (localStateTaxTracker){
                                    if (localStateTax==null){

                                        writeStartElement(null, "", "stateTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStateTax.serialize(new javax.xml.namespace.QName("","stateTax"),
                                        xmlWriter);
                                    }
                                } if (localStatusTracker){
                                            if (localStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");
                                            }
                                           localStatus.serialize(new javax.xml.namespace.QName("","status"),
                                               xmlWriter);
                                        } if (localTargetRatingServerIdTracker){
                                    if (localTargetRatingServerId==null){

                                        writeStartElement(null, "", "targetRatingServerId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetRatingServerId.serialize(new javax.xml.namespace.QName("","targetRatingServerId"),
                                        xmlWriter);
                                    }
                                } if (localTargetServerIdTracker){
                                    if (localTargetServerId==null){

                                        writeStartElement(null, "", "targetServerId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetServerId.serialize(new javax.xml.namespace.QName("","targetServerId"),
                                        xmlWriter);
                                    }
                                } if (localTaxPkgInstIdTracker){
                                    if (localTaxPkgInstId==null){

                                        writeStartElement(null, "", "taxPkgInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTaxPkgInstId.serialize(new javax.xml.namespace.QName("","taxPkgInstId"),
                                        xmlWriter);
                                    }
                                } if (localTaxTypeCodeTracker){
                                    if (localTaxTypeCode==null){

                                        writeStartElement(null, "", "taxTypeCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTaxTypeCode.serialize(new javax.xml.namespace.QName("","taxTypeCode"),
                                        xmlWriter);
                                    }
                                } if (localTotalInstallmentsTracker){
                                            if (localTotalInstallments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("totalInstallments cannot be null!!");
                                            }
                                           localTotalInstallments.serialize(new javax.xml.namespace.QName("","totalInstallments"),
                                               xmlWriter);
                                        } if (localTransactDateTracker){
                                            if (localTransactDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("transactDate cannot be null!!");
                                            }
                                           localTransactDate.serialize(new javax.xml.namespace.QName("","transactDate"),
                                               xmlWriter);
                                        } if (localUseCodeTracker){
                                    if (localUseCode==null){

                                        writeStartElement(null, "", "useCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUseCode.serialize(new javax.xml.namespace.QName("","useCode"),
                                        xmlWriter);
                                    }
                                } if (localNrcNameTracker){
                                            if (localNrcName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("nrcName cannot be null!!");
                                            }
                                           localNrcName.serialize(new javax.xml.namespace.QName("","nrcName"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","namedNrcTermInstanceObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localNrcTermInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nrcTermInstId"));
                            
                            
                                    if (localNrcTermInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("nrcTermInstId cannot be null!!");
                                    }
                                    elementList.add(localNrcTermInstId);
                                } if (localAnnotationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "annotation"));
                            
                            
                                    elementList.add(localAnnotation==null?null:
                                    localAnnotation);
                                } if (localAnnotation2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "annotation2"));
                            
                            
                                    elementList.add(localAnnotation2==null?null:
                                    localAnnotation2);
                                } if (localApplyDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyDate"));
                            
                            
                                    elementList.add(localApplyDate==null?null:
                                    localApplyDate);
                                } if (localApplyDayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyDay"));
                            
                            
                                    elementList.add(localApplyDay==null?null:
                                    localApplyDay);
                                } if (localAssociationTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "associationType"));
                            
                            
                                    if (localAssociationType==null){
                                         throw new org.apache.axis2.databinding.ADBException("associationType cannot be null!!");
                                    }
                                    elementList.add(localAssociationType);
                                } if (localAutoActivationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "autoActivation"));
                            
                            
                                    if (localAutoActivation==null){
                                         throw new org.apache.axis2.databinding.ADBException("autoActivation cannot be null!!");
                                    }
                                    elementList.add(localAutoActivation);
                                } if (localBillOrderNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billOrderNumber"));
                            
                            
                                    elementList.add(localBillOrderNumber==null?null:
                                    localBillOrderNumber);
                                } if (localBillingAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billingAccountInternalId"));
                            
                            
                                    if (localBillingAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("billingAccountInternalId cannot be null!!");
                                    }
                                    elementList.add(localBillingAccountInternalId);
                                } if (localBundleInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleInstId"));
                            
                            
                                    elementList.add(localBundleInstId==null?null:
                                    localBundleInstId);
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
                                } if (localCityTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cityTax"));
                            
                            
                                    elementList.add(localCityTax==null?null:
                                    localCityTax);
                                } if (localCountyTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "countyTax"));
                            
                            
                                    elementList.add(localCountyTax==null?null:
                                    localCountyTax);
                                } if (localCreateDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "createDt"));
                            
                            
                                    if (localCreateDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("createDt cannot be null!!");
                                    }
                                    elementList.add(localCreateDt);
                                } if (localCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyCode"));
                            
                            
                                    elementList.add(localCurrencyCode==null?null:
                                    localCurrencyCode);
                                } if (localCurrentInstallmentTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currentInstallment"));
                            
                            
                                    if (localCurrentInstallment==null){
                                         throw new org.apache.axis2.databinding.ADBException("currentInstallment cannot be null!!");
                                    }
                                    elementList.add(localCurrentInstallment);
                                } if (localCustomerOrderNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "customerOrderNumber"));
                            
                            
                                    elementList.add(localCustomerOrderNumber==null?null:
                                    localCustomerOrderNumber);
                                } if (localDateNrcJournalableTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateNrcJournalable"));
                            
                            
                                    elementList.add(localDateNrcJournalable==null?null:
                                    localDateNrcJournalable);
                                } if (localFederalTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "federalTax"));
                            
                            
                                    elementList.add(localFederalTax==null?null:
                                    localFederalTax);
                                } if (localFlexibleCycleDurationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "flexibleCycleDuration"));
                            
                            
                                    elementList.add(localFlexibleCycleDuration==null?null:
                                    localFlexibleCycleDuration);
                                } if (localGeoAreaIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "geoAreaId"));
                            
                            
                                    elementList.add(localGeoAreaId==null?null:
                                    localGeoAreaId);
                                } if (localInventoryIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inventoryId"));
                            
                            
                                    elementList.add(localInventoryId==null?null:
                                    localInventoryId);
                                } if (localInventoryIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inventoryIdResets"));
                            
                            
                                    elementList.add(localInventoryIdResets==null?null:
                                    localInventoryIdResets);
                                } if (localLastProcessedDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastProcessedDt"));
                            
                            
                                    if (localLastProcessedDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("lastProcessedDt cannot be null!!");
                                    }
                                    elementList.add(localLastProcessedDt);
                                } if (localNoBillTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noBill"));
                            
                            
                                    if (localNoBill==null){
                                         throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                    }
                                    elementList.add(localNoBill);
                                } if (localNrcCategoryTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nrcCategory"));
                            
                            
                                    if (localNrcCategory==null){
                                         throw new org.apache.axis2.databinding.ADBException("nrcCategory cannot be null!!");
                                    }
                                    elementList.add(localNrcCategory);
                                } if (localNrcTermIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nrcTermId"));
                            
                            
                                    if (localNrcTermId==null){
                                         throw new org.apache.axis2.databinding.ADBException("nrcTermId cannot be null!!");
                                    }
                                    elementList.add(localNrcTermId);
                                } if (localOfferInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offerInstId"));
                            
                            
                                    elementList.add(localOfferInstId==null?null:
                                    localOfferInstId);
                                } if (localOrderNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "orderNumber"));
                            
                            
                                    elementList.add(localOrderNumber==null?null:
                                    localOrderNumber);
                                } if (localOtherTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "otherTax"));
                            
                            
                                    elementList.add(localOtherTax==null?null:
                                    localOtherTax);
                                } if (localParentAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountInternalId"));
                            
                            
                                    elementList.add(localParentAccountInternalId==null?null:
                                    localParentAccountInternalId);
                                } if (localParentServiceInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentServiceInternalId"));
                            
                            
                                    elementList.add(localParentServiceInternalId==null?null:
                                    localParentServiceInternalId);
                                } if (localParentServiceInternalIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentServiceInternalIdResets"));
                            
                            
                                    elementList.add(localParentServiceInternalIdResets==null?null:
                                    localParentServiceInternalIdResets);
                                } if (localPostActiveChgAppliedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "postActiveChgApplied"));
                            
                            
                                    if (localPostActiveChgApplied==null){
                                         throw new org.apache.axis2.databinding.ADBException("postActiveChgApplied cannot be null!!");
                                    }
                                    elementList.add(localPostActiveChgApplied);
                                } if (localProcessErrorCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "processErrorCode"));
                            
                            
                                    elementList.add(localProcessErrorCode==null?null:
                                    localProcessErrorCode);
                                } if (localProcessingStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "processingStatus"));
                            
                            
                                    if (localProcessingStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("processingStatus cannot be null!!");
                                    }
                                    elementList.add(localProcessingStatus);
                                } if (localProfileIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "profileId"));
                            
                            
                                    elementList.add(localProfileId==null?null:
                                    localProfileId);
                                } if (localRateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rate"));
                            
                            
                                    elementList.add(localRate==null?null:
                                    localRate);
                                } if (localRateDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rateDt"));
                            
                            
                                    if (localRateDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("rateDt cannot be null!!");
                                    }
                                    elementList.add(localRateDt);
                                } if (localRedirectAccountNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "redirectAccountNo"));
                            
                            
                                    elementList.add(localRedirectAccountNo==null?null:
                                    localRedirectAccountNo);
                                } if (localRedirectInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "redirectInactiveDt"));
                            
                            
                                    elementList.add(localRedirectInactiveDt==null?null:
                                    localRedirectInactiveDt);
                                } if (localRedirectTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "redirectType"));
                            
                            
                                    if (localRedirectType==null){
                                         throw new org.apache.axis2.databinding.ADBException("redirectType cannot be null!!");
                                    }
                                    elementList.add(localRedirectType);
                                } if (localRetryCountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "retryCount"));
                            
                            
                                    if (localRetryCount==null){
                                         throw new org.apache.axis2.databinding.ADBException("retryCount cannot be null!!");
                                    }
                                    elementList.add(localRetryCount);
                                } if (localSalesChannelIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "salesChannelId"));
                            
                            
                                    elementList.add(localSalesChannelId==null?null:
                                    localSalesChannelId);
                                } if (localShipFromGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "shipFromGeocode"));
                            
                            
                                    elementList.add(localShipFromGeocode==null?null:
                                    localShipFromGeocode);
                                } if (localShipToGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "shipToGeocode"));
                            
                            
                                    elementList.add(localShipToGeocode==null?null:
                                    localShipToGeocode);
                                } if (localStateTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "stateTax"));
                            
                            
                                    elementList.add(localStateTax==null?null:
                                    localStateTax);
                                } if (localStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "status"));
                            
                            
                                    if (localStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                } if (localTargetRatingServerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetRatingServerId"));
                            
                            
                                    elementList.add(localTargetRatingServerId==null?null:
                                    localTargetRatingServerId);
                                } if (localTargetServerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetServerId"));
                            
                            
                                    elementList.add(localTargetServerId==null?null:
                                    localTargetServerId);
                                } if (localTaxPkgInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "taxPkgInstId"));
                            
                            
                                    elementList.add(localTaxPkgInstId==null?null:
                                    localTaxPkgInstId);
                                } if (localTaxTypeCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "taxTypeCode"));
                            
                            
                                    elementList.add(localTaxTypeCode==null?null:
                                    localTaxTypeCode);
                                } if (localTotalInstallmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "totalInstallments"));
                            
                            
                                    if (localTotalInstallments==null){
                                         throw new org.apache.axis2.databinding.ADBException("totalInstallments cannot be null!!");
                                    }
                                    elementList.add(localTotalInstallments);
                                } if (localTransactDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "transactDate"));
                            
                            
                                    if (localTransactDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("transactDate cannot be null!!");
                                    }
                                    elementList.add(localTransactDate);
                                } if (localUseCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "useCode"));
                            
                            
                                    elementList.add(localUseCode==null?null:
                                    localUseCode);
                                } if (localNrcNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nrcName"));
                            
                            
                                    if (localNrcName==null){
                                         throw new org.apache.axis2.databinding.ADBException("nrcName cannot be null!!");
                                    }
                                    elementList.add(localNrcName);
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
        public static NamedNrcTermInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NamedNrcTermInstanceObject object =
                new NamedNrcTermInstanceObject();

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
                    
                            if (!"namedNrcTermInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NamedNrcTermInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrcTermInstId").equals(reader.getName())){
                                
                                                object.setNrcTermInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","annotation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAnnotation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAnnotation(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","annotation2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAnnotation2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAnnotation2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","applyDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setApplyDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setApplyDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","applyDay").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setApplyDay(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setApplyDay(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","associationType").equals(reader.getName())){
                                
                                                object.setAssociationType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","autoActivation").equals(reader.getName())){
                                
                                                object.setAutoActivation(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billOrderNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillOrderNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillOrderNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billingAccountInternalId").equals(reader.getName())){
                                
                                                object.setBillingAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bundleInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBundleInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBundleInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cityTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCityTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCityTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","countyTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCountyTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCountyTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","createDt").equals(reader.getName())){
                                
                                                object.setCreateDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currencyCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCurrencyCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCurrencyCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currentInstallment").equals(reader.getName())){
                                
                                                object.setCurrentInstallment(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","customerOrderNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustomerOrderNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustomerOrderNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dateNrcJournalable").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDateNrcJournalable(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDateNrcJournalable(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","federalTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFederalTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFederalTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","flexibleCycleDuration").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFlexibleCycleDuration(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFlexibleCycleDuration(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","geoAreaId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGeoAreaId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGeoAreaId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inventoryId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInventoryId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInventoryId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inventoryIdResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInventoryIdResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInventoryIdResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastProcessedDt").equals(reader.getName())){
                                
                                                object.setLastProcessedDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","noBill").equals(reader.getName())){
                                
                                                object.setNoBill(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrcCategory").equals(reader.getName())){
                                
                                                object.setNrcCategory(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrcTermId").equals(reader.getName())){
                                
                                                object.setNrcTermId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offerInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOfferInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOfferInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","orderNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOrderNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOrderNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","otherTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOtherTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOtherTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountInternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentAccountInternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentServiceInternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentServiceInternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentServiceInternalIdResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentServiceInternalIdResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","postActiveChgApplied").equals(reader.getName())){
                                
                                                object.setPostActiveChgApplied(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","processErrorCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProcessErrorCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProcessErrorCode(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","processingStatus").equals(reader.getName())){
                                
                                                object.setProcessingStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","profileId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProfileId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProfileId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRate(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rateDt").equals(reader.getName())){
                                
                                                object.setRateDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","redirectAccountNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRedirectAccountNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRedirectAccountNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","redirectInactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRedirectInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRedirectInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","redirectType").equals(reader.getName())){
                                
                                                object.setRedirectType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","retryCount").equals(reader.getName())){
                                
                                                object.setRetryCount(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","salesChannelId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSalesChannelId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSalesChannelId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","shipFromGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setShipFromGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setShipFromGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","shipToGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setShipToGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setShipToGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","stateTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStateTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStateTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","status").equals(reader.getName())){
                                
                                                object.setStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetRatingServerId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetRatingServerId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetRatingServerId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetServerId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetServerId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetServerId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","taxPkgInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTaxPkgInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTaxPkgInstId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","taxTypeCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTaxTypeCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTaxTypeCode(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totalInstallments").equals(reader.getName())){
                                
                                                object.setTotalInstallments(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","transactDate").equals(reader.getName())){
                                
                                                object.setTransactDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","useCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUseCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUseCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrcName").equals(reader.getName())){
                                
                                                object.setNrcName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    