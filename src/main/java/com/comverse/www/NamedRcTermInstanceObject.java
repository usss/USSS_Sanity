
/**
 * NamedRcTermInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  NamedRcTermInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NamedRcTermInstanceObject extends com.comverse.www.RcTermInstanceObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = namedRcTermInstanceObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for RcTermName
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localRcTermName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcTermNameTracker = false ;

                           public boolean isRcTermNameSpecified(){
                               return localRcTermNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getRcTermName(){
                               return localRcTermName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RcTermName
                               */
                               public void setRcTermName(com.comverse.www.StringAttributeJAXBElement param){
                            localRcTermNameTracker = param != null;
                                   
                                            this.localRcTermName=param;
                                    

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
                           namespacePrefix+":namedRcTermInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "namedRcTermInstanceObject",
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
                              if (localRcTermInstIdTracker){
                                            if (localRcTermInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rcTermInstId cannot be null!!");
                                            }
                                           localRcTermInstId.serialize(new javax.xml.namespace.QName("","rcTermInstId"),
                                               xmlWriter);
                                        } if (localActivationCodeTracker){
                                            if (localActivationCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("activationCode cannot be null!!");
                                            }
                                           localActivationCode.serialize(new javax.xml.namespace.QName("","activationCode"),
                                               xmlWriter);
                                        } if (localAdvancePeriodsTracker){
                                            if (localAdvancePeriods==null){
                                                 throw new org.apache.axis2.databinding.ADBException("advancePeriods cannot be null!!");
                                            }
                                           localAdvancePeriods.serialize(new javax.xml.namespace.QName("","advancePeriods"),
                                               xmlWriter);
                                        } if (localApplyDayTracker){
                                            if (localApplyDay==null){
                                                 throw new org.apache.axis2.databinding.ADBException("applyDay cannot be null!!");
                                            }
                                           localApplyDay.serialize(new javax.xml.namespace.QName("","applyDay"),
                                               xmlWriter);
                                        } if (localAssociationTypeTracker){
                                            if (localAssociationType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("associationType cannot be null!!");
                                            }
                                           localAssociationType.serialize(new javax.xml.namespace.QName("","associationType"),
                                               xmlWriter);
                                        } if (localAwardAmountTracker){
                                    if (localAwardAmount==null){

                                        writeStartElement(null, "", "awardAmount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAwardAmount.serialize(new javax.xml.namespace.QName("","awardAmount"),
                                        xmlWriter);
                                    }
                                } if (localAwardBalanceIdTracker){
                                    if (localAwardBalanceId==null){

                                        writeStartElement(null, "", "awardBalanceId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAwardBalanceId.serialize(new javax.xml.namespace.QName("","awardBalanceId"),
                                        xmlWriter);
                                    }
                                } if (localBillPeriodTracker){
                                    if (localBillPeriod==null){

                                        writeStartElement(null, "", "billPeriod", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillPeriod.serialize(new javax.xml.namespace.QName("","billPeriod"),
                                        xmlWriter);
                                    }
                                } if (localBillingAccountInternalIdTracker){
                                            if (localBillingAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("billingAccountInternalId cannot be null!!");
                                            }
                                           localBillingAccountInternalId.serialize(new javax.xml.namespace.QName("","billingAccountInternalId"),
                                               xmlWriter);
                                        } if (localBtPromotionPlanInstIdTracker){
                                    if (localBtPromotionPlanInstId==null){

                                        writeStartElement(null, "", "btPromotionPlanInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBtPromotionPlanInstId.serialize(new javax.xml.namespace.QName("","btPromotionPlanInstId"),
                                        xmlWriter);
                                    }
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
                                } if (localChargeCountTracker){
                                            if (localChargeCount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chargeCount cannot be null!!");
                                            }
                                           localChargeCount.serialize(new javax.xml.namespace.QName("","chargeCount"),
                                               xmlWriter);
                                        } if (localChargeOrderTracker){
                                            if (localChargeOrder==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chargeOrder cannot be null!!");
                                            }
                                           localChargeOrder.serialize(new javax.xml.namespace.QName("","chargeOrder"),
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
                                        } if (localCommitmentAmountTracker){
                                    if (localCommitmentAmount==null){

                                        writeStartElement(null, "", "commitmentAmount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCommitmentAmount.serialize(new javax.xml.namespace.QName("","commitmentAmount"),
                                        xmlWriter);
                                    }
                                } if (localCommitmentCurrencyCodeTracker){
                                    if (localCommitmentCurrencyCode==null){

                                        writeStartElement(null, "", "commitmentCurrencyCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCommitmentCurrencyCode.serialize(new javax.xml.namespace.QName("","commitmentCurrencyCode"),
                                        xmlWriter);
                                    }
                                } if (localCommitmentNrcTermIdTracker){
                                    if (localCommitmentNrcTermId==null){

                                        writeStartElement(null, "", "commitmentNrcTermId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCommitmentNrcTermId.serialize(new javax.xml.namespace.QName("","commitmentNrcTermId"),
                                        xmlWriter);
                                    }
                                } if (localCommitmentRateTracker){
                                    if (localCommitmentRate==null){

                                        writeStartElement(null, "", "commitmentRate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCommitmentRate.serialize(new javax.xml.namespace.QName("","commitmentRate"),
                                        xmlWriter);
                                    }
                                } if (localConditionDataTracker){
                                    if (localConditionData==null){

                                        writeStartElement(null, "", "conditionData", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localConditionData.serialize(new javax.xml.namespace.QName("","conditionData"),
                                        xmlWriter);
                                    }
                                } if (localConditionTypeTracker){
                                            if (localConditionType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("conditionType cannot be null!!");
                                            }
                                           localConditionType.serialize(new javax.xml.namespace.QName("","conditionType"),
                                               xmlWriter);
                                        } if (localConnectReasonTracker){
                                            if (localConnectReason==null){
                                                 throw new org.apache.axis2.databinding.ADBException("connectReason cannot be null!!");
                                            }
                                           localConnectReason.serialize(new javax.xml.namespace.QName("","connectReason"),
                                               xmlWriter);
                                        } if (localConvertedTracker){
                                            if (localConverted==null){
                                                 throw new org.apache.axis2.databinding.ADBException("converted cannot be null!!");
                                            }
                                           localConverted.serialize(new javax.xml.namespace.QName("","converted"),
                                               xmlWriter);
                                        } if (localCreateDtTracker){
                                            if (localCreateDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("createDt cannot be null!!");
                                            }
                                           localCreateDt.serialize(new javax.xml.namespace.QName("","createDt"),
                                               xmlWriter);
                                        } if (localCurrencyCodeTracker){
                                            if (localCurrencyCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                            }
                                           localCurrencyCode.serialize(new javax.xml.namespace.QName("","currencyCode"),
                                               xmlWriter);
                                        } if (localDisconnectReasonTracker){
                                    if (localDisconnectReason==null){

                                        writeStartElement(null, "", "disconnectReason", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDisconnectReason.serialize(new javax.xml.namespace.QName("","disconnectReason"),
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
                                } if (localFromDateOffsetTracker){
                                    if (localFromDateOffset==null){

                                        writeStartElement(null, "", "fromDateOffset", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFromDateOffset.serialize(new javax.xml.namespace.QName("","fromDateOffset"),
                                        xmlWriter);
                                    }
                                } if (localHasAwardRedirectsTracker){
                                            if (localHasAwardRedirects==null){
                                                 throw new org.apache.axis2.databinding.ADBException("hasAwardRedirects cannot be null!!");
                                            }
                                           localHasAwardRedirects.serialize(new javax.xml.namespace.QName("","hasAwardRedirects"),
                                               xmlWriter);
                                        } if (localHasOverrideRateTracker){
                                            if (localHasOverrideRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("hasOverrideRate cannot be null!!");
                                            }
                                           localHasOverrideRate.serialize(new javax.xml.namespace.QName("","hasOverrideRate"),
                                               xmlWriter);
                                        } if (localHasProductKeysTracker){
                                            if (localHasProductKeys==null){
                                                 throw new org.apache.axis2.databinding.ADBException("hasProductKeys cannot be null!!");
                                            }
                                           localHasProductKeys.serialize(new javax.xml.namespace.QName("","hasProductKeys"),
                                               xmlWriter);
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
                                } if (localIsServiceItemTracker){
                                            if (localIsServiceItem==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isServiceItem cannot be null!!");
                                            }
                                           localIsServiceItem.serialize(new javax.xml.namespace.QName("","isServiceItem"),
                                               xmlWriter);
                                        } if (localLastApplyDtTracker){
                                    if (localLastApplyDt==null){

                                        writeStartElement(null, "", "lastApplyDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastApplyDt.serialize(new javax.xml.namespace.QName("","lastApplyDt"),
                                        xmlWriter);
                                    }
                                } if (localLastChargedDtTracker){
                                    if (localLastChargedDt==null){

                                        writeStartElement(null, "", "lastChargedDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastChargedDt.serialize(new javax.xml.namespace.QName("","lastChargedDt"),
                                        xmlWriter);
                                    }
                                } if (localLastGenerateDtTracker){
                                    if (localLastGenerateDt==null){

                                        writeStartElement(null, "", "lastGenerateDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastGenerateDt.serialize(new javax.xml.namespace.QName("","lastGenerateDt"),
                                        xmlWriter);
                                    }
                                } if (localLastProcessedDtTracker){
                                            if (localLastProcessedDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("lastProcessedDt cannot be null!!");
                                            }
                                           localLastProcessedDt.serialize(new javax.xml.namespace.QName("","lastProcessedDt"),
                                               xmlWriter);
                                        } if (localLastRcServerIdTracker){
                                    if (localLastRcServerId==null){

                                        writeStartElement(null, "", "lastRcServerId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastRcServerId.serialize(new javax.xml.namespace.QName("","lastRcServerId"),
                                        xmlWriter);
                                    }
                                } if (localNextApplyDtTracker){
                                    if (localNextApplyDt==null){

                                        writeStartElement(null, "", "nextApplyDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextApplyDt.serialize(new javax.xml.namespace.QName("","nextApplyDt"),
                                        xmlWriter);
                                    }
                                } if (localNoBillTracker){
                                            if (localNoBill==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                            }
                                           localNoBill.serialize(new javax.xml.namespace.QName("","noBill"),
                                               xmlWriter);
                                        } if (localNumBilledLinesTracker){
                                            if (localNumBilledLines==null){
                                                 throw new org.apache.axis2.databinding.ADBException("numBilledLines cannot be null!!");
                                            }
                                           localNumBilledLines.serialize(new javax.xml.namespace.QName("","numBilledLines"),
                                               xmlWriter);
                                        } if (localNumTrunkLinesTracker){
                                            if (localNumTrunkLines==null){
                                                 throw new org.apache.axis2.databinding.ADBException("numTrunkLines cannot be null!!");
                                            }
                                           localNumTrunkLines.serialize(new javax.xml.namespace.QName("","numTrunkLines"),
                                               xmlWriter);
                                        } if (localNumberOfCycleApplicationsTracker){
                                    if (localNumberOfCycleApplications==null){

                                        writeStartElement(null, "", "numberOfCycleApplications", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNumberOfCycleApplications.serialize(new javax.xml.namespace.QName("","numberOfCycleApplications"),
                                        xmlWriter);
                                    }
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
                                } if (localParentAccountInternalIdTracker){
                                            if (localParentAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("parentAccountInternalId cannot be null!!");
                                            }
                                           localParentAccountInternalId.serialize(new javax.xml.namespace.QName("","parentAccountInternalId"),
                                               xmlWriter);
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
                                } if (localPeriodFrequencyTracker){
                                    if (localPeriodFrequency==null){

                                        writeStartElement(null, "", "periodFrequency", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPeriodFrequency.serialize(new javax.xml.namespace.QName("","periodFrequency"),
                                        xmlWriter);
                                    }
                                } if (localPostActiveChgAppliedTracker){
                                            if (localPostActiveChgApplied==null){
                                                 throw new org.apache.axis2.databinding.ADBException("postActiveChgApplied cannot be null!!");
                                            }
                                           localPostActiveChgApplied.serialize(new javax.xml.namespace.QName("","postActiveChgApplied"),
                                               xmlWriter);
                                        } if (localPrevRcTermInstInactiveDtTracker){
                                    if (localPrevRcTermInstInactiveDt==null){

                                        writeStartElement(null, "", "prevRcTermInstInactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrevRcTermInstInactiveDt.serialize(new javax.xml.namespace.QName("","prevRcTermInstInactiveDt"),
                                        xmlWriter);
                                    }
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
                                        } if (localRcAwardMapIdTracker){
                                    if (localRcAwardMapId==null){

                                        writeStartElement(null, "", "rcAwardMapId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRcAwardMapId.serialize(new javax.xml.namespace.QName("","rcAwardMapId"),
                                        xmlWriter);
                                    }
                                } if (localRcTermIdTracker){
                                            if (localRcTermId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rcTermId cannot be null!!");
                                            }
                                           localRcTermId.serialize(new javax.xml.namespace.QName("","rcTermId"),
                                               xmlWriter);
                                        } if (localRcTermInstActiveDtTracker){
                                            if (localRcTermInstActiveDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rcTermInstActiveDt cannot be null!!");
                                            }
                                           localRcTermInstActiveDt.serialize(new javax.xml.namespace.QName("","rcTermInstActiveDt"),
                                               xmlWriter);
                                        } if (localRcTermInstInactiveDtTracker){
                                    if (localRcTermInstInactiveDt==null){

                                        writeStartElement(null, "", "rcTermInstInactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRcTermInstInactiveDt.serialize(new javax.xml.namespace.QName("","rcTermInstInactiveDt"),
                                        xmlWriter);
                                    }
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
                                } if (localScheduleTracker){
                                            if (localSchedule==null){
                                                 throw new org.apache.axis2.databinding.ADBException("schedule cannot be null!!");
                                            }
                                           localSchedule.serialize(new javax.xml.namespace.QName("","schedule"),
                                               xmlWriter);
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
                                } if (localTerminationCodeTracker){
                                            if (localTerminationCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("terminationCode cannot be null!!");
                                            }
                                           localTerminationCode.serialize(new javax.xml.namespace.QName("","terminationCode"),
                                               xmlWriter);
                                        } if (localTotalChargedAmountTracker){
                                            if (localTotalChargedAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("totalChargedAmount cannot be null!!");
                                            }
                                           localTotalChargedAmount.serialize(new javax.xml.namespace.QName("","totalChargedAmount"),
                                               xmlWriter);
                                        } if (localTotalTaxAmountTracker){
                                    if (localTotalTaxAmount==null){

                                        writeStartElement(null, "", "totalTaxAmount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalTaxAmount.serialize(new javax.xml.namespace.QName("","totalTaxAmount"),
                                        xmlWriter);
                                    }
                                } if (localRcTermNameTracker){
                                            if (localRcTermName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rcTermName cannot be null!!");
                                            }
                                           localRcTermName.serialize(new javax.xml.namespace.QName("","rcTermName"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","namedRcTermInstanceObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localRcTermInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcTermInstId"));
                            
                            
                                    if (localRcTermInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("rcTermInstId cannot be null!!");
                                    }
                                    elementList.add(localRcTermInstId);
                                } if (localActivationCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "activationCode"));
                            
                            
                                    if (localActivationCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("activationCode cannot be null!!");
                                    }
                                    elementList.add(localActivationCode);
                                } if (localAdvancePeriodsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "advancePeriods"));
                            
                            
                                    if (localAdvancePeriods==null){
                                         throw new org.apache.axis2.databinding.ADBException("advancePeriods cannot be null!!");
                                    }
                                    elementList.add(localAdvancePeriods);
                                } if (localApplyDayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyDay"));
                            
                            
                                    if (localApplyDay==null){
                                         throw new org.apache.axis2.databinding.ADBException("applyDay cannot be null!!");
                                    }
                                    elementList.add(localApplyDay);
                                } if (localAssociationTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "associationType"));
                            
                            
                                    if (localAssociationType==null){
                                         throw new org.apache.axis2.databinding.ADBException("associationType cannot be null!!");
                                    }
                                    elementList.add(localAssociationType);
                                } if (localAwardAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "awardAmount"));
                            
                            
                                    elementList.add(localAwardAmount==null?null:
                                    localAwardAmount);
                                } if (localAwardBalanceIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "awardBalanceId"));
                            
                            
                                    elementList.add(localAwardBalanceId==null?null:
                                    localAwardBalanceId);
                                } if (localBillPeriodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billPeriod"));
                            
                            
                                    elementList.add(localBillPeriod==null?null:
                                    localBillPeriod);
                                } if (localBillingAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billingAccountInternalId"));
                            
                            
                                    if (localBillingAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("billingAccountInternalId cannot be null!!");
                                    }
                                    elementList.add(localBillingAccountInternalId);
                                } if (localBtPromotionPlanInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "btPromotionPlanInstId"));
                            
                            
                                    elementList.add(localBtPromotionPlanInstId==null?null:
                                    localBtPromotionPlanInstId);
                                } if (localBundleInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleInstId"));
                            
                            
                                    elementList.add(localBundleInstId==null?null:
                                    localBundleInstId);
                                } if (localChargeCountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chargeCount"));
                            
                            
                                    if (localChargeCount==null){
                                         throw new org.apache.axis2.databinding.ADBException("chargeCount cannot be null!!");
                                    }
                                    elementList.add(localChargeCount);
                                } if (localChargeOrderTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chargeOrder"));
                            
                            
                                    if (localChargeOrder==null){
                                         throw new org.apache.axis2.databinding.ADBException("chargeOrder cannot be null!!");
                                    }
                                    elementList.add(localChargeOrder);
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
                                } if (localCommitmentAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "commitmentAmount"));
                            
                            
                                    elementList.add(localCommitmentAmount==null?null:
                                    localCommitmentAmount);
                                } if (localCommitmentCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "commitmentCurrencyCode"));
                            
                            
                                    elementList.add(localCommitmentCurrencyCode==null?null:
                                    localCommitmentCurrencyCode);
                                } if (localCommitmentNrcTermIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "commitmentNrcTermId"));
                            
                            
                                    elementList.add(localCommitmentNrcTermId==null?null:
                                    localCommitmentNrcTermId);
                                } if (localCommitmentRateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "commitmentRate"));
                            
                            
                                    elementList.add(localCommitmentRate==null?null:
                                    localCommitmentRate);
                                } if (localConditionDataTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "conditionData"));
                            
                            
                                    elementList.add(localConditionData==null?null:
                                    localConditionData);
                                } if (localConditionTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "conditionType"));
                            
                            
                                    if (localConditionType==null){
                                         throw new org.apache.axis2.databinding.ADBException("conditionType cannot be null!!");
                                    }
                                    elementList.add(localConditionType);
                                } if (localConnectReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "connectReason"));
                            
                            
                                    if (localConnectReason==null){
                                         throw new org.apache.axis2.databinding.ADBException("connectReason cannot be null!!");
                                    }
                                    elementList.add(localConnectReason);
                                } if (localConvertedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "converted"));
                            
                            
                                    if (localConverted==null){
                                         throw new org.apache.axis2.databinding.ADBException("converted cannot be null!!");
                                    }
                                    elementList.add(localConverted);
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
                            
                            
                                    if (localCurrencyCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                    }
                                    elementList.add(localCurrencyCode);
                                } if (localDisconnectReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "disconnectReason"));
                            
                            
                                    elementList.add(localDisconnectReason==null?null:
                                    localDisconnectReason);
                                } if (localFlexibleCycleDurationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "flexibleCycleDuration"));
                            
                            
                                    elementList.add(localFlexibleCycleDuration==null?null:
                                    localFlexibleCycleDuration);
                                } if (localFromDateOffsetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "fromDateOffset"));
                            
                            
                                    elementList.add(localFromDateOffset==null?null:
                                    localFromDateOffset);
                                } if (localHasAwardRedirectsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hasAwardRedirects"));
                            
                            
                                    if (localHasAwardRedirects==null){
                                         throw new org.apache.axis2.databinding.ADBException("hasAwardRedirects cannot be null!!");
                                    }
                                    elementList.add(localHasAwardRedirects);
                                } if (localHasOverrideRateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hasOverrideRate"));
                            
                            
                                    if (localHasOverrideRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("hasOverrideRate cannot be null!!");
                                    }
                                    elementList.add(localHasOverrideRate);
                                } if (localHasProductKeysTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hasProductKeys"));
                            
                            
                                    if (localHasProductKeys==null){
                                         throw new org.apache.axis2.databinding.ADBException("hasProductKeys cannot be null!!");
                                    }
                                    elementList.add(localHasProductKeys);
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
                                } if (localIsServiceItemTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isServiceItem"));
                            
                            
                                    if (localIsServiceItem==null){
                                         throw new org.apache.axis2.databinding.ADBException("isServiceItem cannot be null!!");
                                    }
                                    elementList.add(localIsServiceItem);
                                } if (localLastApplyDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastApplyDt"));
                            
                            
                                    elementList.add(localLastApplyDt==null?null:
                                    localLastApplyDt);
                                } if (localLastChargedDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastChargedDt"));
                            
                            
                                    elementList.add(localLastChargedDt==null?null:
                                    localLastChargedDt);
                                } if (localLastGenerateDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastGenerateDt"));
                            
                            
                                    elementList.add(localLastGenerateDt==null?null:
                                    localLastGenerateDt);
                                } if (localLastProcessedDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastProcessedDt"));
                            
                            
                                    if (localLastProcessedDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("lastProcessedDt cannot be null!!");
                                    }
                                    elementList.add(localLastProcessedDt);
                                } if (localLastRcServerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastRcServerId"));
                            
                            
                                    elementList.add(localLastRcServerId==null?null:
                                    localLastRcServerId);
                                } if (localNextApplyDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextApplyDt"));
                            
                            
                                    elementList.add(localNextApplyDt==null?null:
                                    localNextApplyDt);
                                } if (localNoBillTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noBill"));
                            
                            
                                    if (localNoBill==null){
                                         throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                    }
                                    elementList.add(localNoBill);
                                } if (localNumBilledLinesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "numBilledLines"));
                            
                            
                                    if (localNumBilledLines==null){
                                         throw new org.apache.axis2.databinding.ADBException("numBilledLines cannot be null!!");
                                    }
                                    elementList.add(localNumBilledLines);
                                } if (localNumTrunkLinesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "numTrunkLines"));
                            
                            
                                    if (localNumTrunkLines==null){
                                         throw new org.apache.axis2.databinding.ADBException("numTrunkLines cannot be null!!");
                                    }
                                    elementList.add(localNumTrunkLines);
                                } if (localNumberOfCycleApplicationsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "numberOfCycleApplications"));
                            
                            
                                    elementList.add(localNumberOfCycleApplications==null?null:
                                    localNumberOfCycleApplications);
                                } if (localOfferInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offerInstId"));
                            
                            
                                    elementList.add(localOfferInstId==null?null:
                                    localOfferInstId);
                                } if (localParentAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountInternalId"));
                            
                            
                                    if (localParentAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("parentAccountInternalId cannot be null!!");
                                    }
                                    elementList.add(localParentAccountInternalId);
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
                                } if (localPeriodFrequencyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "periodFrequency"));
                            
                            
                                    elementList.add(localPeriodFrequency==null?null:
                                    localPeriodFrequency);
                                } if (localPostActiveChgAppliedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "postActiveChgApplied"));
                            
                            
                                    if (localPostActiveChgApplied==null){
                                         throw new org.apache.axis2.databinding.ADBException("postActiveChgApplied cannot be null!!");
                                    }
                                    elementList.add(localPostActiveChgApplied);
                                } if (localPrevRcTermInstInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevRcTermInstInactiveDt"));
                            
                            
                                    elementList.add(localPrevRcTermInstInactiveDt==null?null:
                                    localPrevRcTermInstInactiveDt);
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
                                } if (localRcAwardMapIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcAwardMapId"));
                            
                            
                                    elementList.add(localRcAwardMapId==null?null:
                                    localRcAwardMapId);
                                } if (localRcTermIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcTermId"));
                            
                            
                                    if (localRcTermId==null){
                                         throw new org.apache.axis2.databinding.ADBException("rcTermId cannot be null!!");
                                    }
                                    elementList.add(localRcTermId);
                                } if (localRcTermInstActiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcTermInstActiveDt"));
                            
                            
                                    if (localRcTermInstActiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("rcTermInstActiveDt cannot be null!!");
                                    }
                                    elementList.add(localRcTermInstActiveDt);
                                } if (localRcTermInstInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcTermInstInactiveDt"));
                            
                            
                                    elementList.add(localRcTermInstInactiveDt==null?null:
                                    localRcTermInstInactiveDt);
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
                                } if (localScheduleTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "schedule"));
                            
                            
                                    if (localSchedule==null){
                                         throw new org.apache.axis2.databinding.ADBException("schedule cannot be null!!");
                                    }
                                    elementList.add(localSchedule);
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
                                } if (localTerminationCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "terminationCode"));
                            
                            
                                    if (localTerminationCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("terminationCode cannot be null!!");
                                    }
                                    elementList.add(localTerminationCode);
                                } if (localTotalChargedAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "totalChargedAmount"));
                            
                            
                                    if (localTotalChargedAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("totalChargedAmount cannot be null!!");
                                    }
                                    elementList.add(localTotalChargedAmount);
                                } if (localTotalTaxAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "totalTaxAmount"));
                            
                            
                                    elementList.add(localTotalTaxAmount==null?null:
                                    localTotalTaxAmount);
                                } if (localRcTermNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcTermName"));
                            
                            
                                    if (localRcTermName==null){
                                         throw new org.apache.axis2.databinding.ADBException("rcTermName cannot be null!!");
                                    }
                                    elementList.add(localRcTermName);
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
        public static NamedRcTermInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NamedRcTermInstanceObject object =
                new NamedRcTermInstanceObject();

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
                    
                            if (!"namedRcTermInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NamedRcTermInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermInstId").equals(reader.getName())){
                                
                                                object.setRcTermInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","activationCode").equals(reader.getName())){
                                
                                                object.setActivationCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","advancePeriods").equals(reader.getName())){
                                
                                                object.setAdvancePeriods(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","applyDay").equals(reader.getName())){
                                
                                                object.setApplyDay(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","awardAmount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAwardAmount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAwardAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","awardBalanceId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAwardBalanceId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAwardBalanceId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billPeriod").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillPeriod(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillPeriod(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","btPromotionPlanInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBtPromotionPlanInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBtPromotionPlanInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chargeCount").equals(reader.getName())){
                                
                                                object.setChargeCount(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chargeOrder").equals(reader.getName())){
                                
                                                object.setChargeOrder(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","commitmentAmount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCommitmentAmount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCommitmentAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","commitmentCurrencyCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCommitmentCurrencyCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCommitmentCurrencyCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","commitmentNrcTermId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCommitmentNrcTermId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCommitmentNrcTermId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","commitmentRate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCommitmentRate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCommitmentRate(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","conditionData").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setConditionData(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setConditionData(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","conditionType").equals(reader.getName())){
                                
                                                object.setConditionType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","connectReason").equals(reader.getName())){
                                
                                                object.setConnectReason(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","converted").equals(reader.getName())){
                                
                                                object.setConverted(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                                object.setCurrencyCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","disconnectReason").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDisconnectReason(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDisconnectReason(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fromDateOffset").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFromDateOffset(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFromDateOffset(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hasAwardRedirects").equals(reader.getName())){
                                
                                                object.setHasAwardRedirects(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hasOverrideRate").equals(reader.getName())){
                                
                                                object.setHasOverrideRate(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hasProductKeys").equals(reader.getName())){
                                
                                                object.setHasProductKeys(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isServiceItem").equals(reader.getName())){
                                
                                                object.setIsServiceItem(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastApplyDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastApplyDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastApplyDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastChargedDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastChargedDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastChargedDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastGenerateDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastGenerateDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastGenerateDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastRcServerId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastRcServerId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastRcServerId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextApplyDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextApplyDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextApplyDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numBilledLines").equals(reader.getName())){
                                
                                                object.setNumBilledLines(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numTrunkLines").equals(reader.getName())){
                                
                                                object.setNumTrunkLines(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numberOfCycleApplications").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNumberOfCycleApplications(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNumberOfCycleApplications(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountInternalId").equals(reader.getName())){
                                
                                                object.setParentAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","periodFrequency").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPeriodFrequency(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPeriodFrequency(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevRcTermInstInactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrevRcTermInstInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrevRcTermInstInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcAwardMapId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRcAwardMapId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRcAwardMapId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermId").equals(reader.getName())){
                                
                                                object.setRcTermId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermInstActiveDt").equals(reader.getName())){
                                
                                                object.setRcTermInstActiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermInstInactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRcTermInstInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRcTermInstInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","schedule").equals(reader.getName())){
                                
                                                object.setSchedule(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","terminationCode").equals(reader.getName())){
                                
                                                object.setTerminationCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totalChargedAmount").equals(reader.getName())){
                                
                                                object.setTotalChargedAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totalTaxAmount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalTaxAmount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalTaxAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermName").equals(reader.getName())){
                                
                                                object.setRcTermName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    