/**
 * Product153.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product153  implements java.io.Serializable {
    private Account[] accountList;

    private co.ke.transunion.crbws.ws.AlsoKnownAsCorporate[] alsoKnownAsList;

    private co.ke.transunion.crbws.ws.BouncedCheque[] bouncedChequeList;

    private Collateral[] collateralList;

    private co.ke.transunion.crbws.ws.CorporateProfile corporateProfile;

    private co.ke.transunion.crbws.ws.CreditApplication[] creditApplicationList;

    private Director[] directorList;

    private co.ke.transunion.crbws.ws.DisputeStatement[] disputeStatementList;

    private Email[] emailList;

    private Fraud[] fraudList;

    private Guarantee[] guaranteeList;

    private Header header;

    private Phone[] phoneList;

    private co.ke.transunion.crbws.ws.PhysicalAddress[] physicalAddressList;

    private co.ke.transunion.crbws.ws.PostalAddress[] postalAddressList;

    private co.ke.transunion.crbws.ws.RecentEnquiry[] recentEnquiryList;

    private Integer responseCode;

    private co.ke.transunion.crbws.ws.Shareholder[] shareholderList;

    private co.ke.transunion.crbws.ws.Summary153 summary;

    public Product153() {
    }

    public Product153(
           Account[] accountList,
           co.ke.transunion.crbws.ws.AlsoKnownAsCorporate[] alsoKnownAsList,
           co.ke.transunion.crbws.ws.BouncedCheque[] bouncedChequeList,
           Collateral[] collateralList,
           co.ke.transunion.crbws.ws.CorporateProfile corporateProfile,
           co.ke.transunion.crbws.ws.CreditApplication[] creditApplicationList,
           Director[] directorList,
           co.ke.transunion.crbws.ws.DisputeStatement[] disputeStatementList,
           Email[] emailList,
           Fraud[] fraudList,
           Guarantee[] guaranteeList,
           Header header,
           Phone[] phoneList,
           co.ke.transunion.crbws.ws.PhysicalAddress[] physicalAddressList,
           co.ke.transunion.crbws.ws.PostalAddress[] postalAddressList,
           co.ke.transunion.crbws.ws.RecentEnquiry[] recentEnquiryList,
           Integer responseCode,
           co.ke.transunion.crbws.ws.Shareholder[] shareholderList,
           co.ke.transunion.crbws.ws.Summary153 summary) {
           this.accountList = accountList;
           this.alsoKnownAsList = alsoKnownAsList;
           this.bouncedChequeList = bouncedChequeList;
           this.collateralList = collateralList;
           this.corporateProfile = corporateProfile;
           this.creditApplicationList = creditApplicationList;
           this.directorList = directorList;
           this.disputeStatementList = disputeStatementList;
           this.emailList = emailList;
           this.fraudList = fraudList;
           this.guaranteeList = guaranteeList;
           this.header = header;
           this.phoneList = phoneList;
           this.physicalAddressList = physicalAddressList;
           this.postalAddressList = postalAddressList;
           this.recentEnquiryList = recentEnquiryList;
           this.responseCode = responseCode;
           this.shareholderList = shareholderList;
           this.summary = summary;
    }


    /**
     * Gets the accountList value for this Product153.
     * 
     * @return accountList
     */
    public Account[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this Product153.
     * 
     * @param accountList
     */
    public void setAccountList(Account[] accountList) {
        this.accountList = accountList;
    }

    public Account getAccountList(int i) {
        return this.accountList[i];
    }

    public void setAccountList(int i, Account _value) {
        this.accountList[i] = _value;
    }


    /**
     * Gets the alsoKnownAsList value for this Product153.
     * 
     * @return alsoKnownAsList
     */
    public co.ke.transunion.crbws.ws.AlsoKnownAsCorporate[] getAlsoKnownAsList() {
        return alsoKnownAsList;
    }


    /**
     * Sets the alsoKnownAsList value for this Product153.
     * 
     * @param alsoKnownAsList
     */
    public void setAlsoKnownAsList(co.ke.transunion.crbws.ws.AlsoKnownAsCorporate[] alsoKnownAsList) {
        this.alsoKnownAsList = alsoKnownAsList;
    }

    public co.ke.transunion.crbws.ws.AlsoKnownAsCorporate getAlsoKnownAsList(int i) {
        return this.alsoKnownAsList[i];
    }

    public void setAlsoKnownAsList(int i, co.ke.transunion.crbws.ws.AlsoKnownAsCorporate _value) {
        this.alsoKnownAsList[i] = _value;
    }


    /**
     * Gets the bouncedChequeList value for this Product153.
     * 
     * @return bouncedChequeList
     */
    public co.ke.transunion.crbws.ws.BouncedCheque[] getBouncedChequeList() {
        return bouncedChequeList;
    }


    /**
     * Sets the bouncedChequeList value for this Product153.
     * 
     * @param bouncedChequeList
     */
    public void setBouncedChequeList(co.ke.transunion.crbws.ws.BouncedCheque[] bouncedChequeList) {
        this.bouncedChequeList = bouncedChequeList;
    }

    public co.ke.transunion.crbws.ws.BouncedCheque getBouncedChequeList(int i) {
        return this.bouncedChequeList[i];
    }

    public void setBouncedChequeList(int i, co.ke.transunion.crbws.ws.BouncedCheque _value) {
        this.bouncedChequeList[i] = _value;
    }


    /**
     * Gets the collateralList value for this Product153.
     * 
     * @return collateralList
     */
    public Collateral[] getCollateralList() {
        return collateralList;
    }


    /**
     * Sets the collateralList value for this Product153.
     * 
     * @param collateralList
     */
    public void setCollateralList(Collateral[] collateralList) {
        this.collateralList = collateralList;
    }

    public Collateral getCollateralList(int i) {
        return this.collateralList[i];
    }

    public void setCollateralList(int i, Collateral _value) {
        this.collateralList[i] = _value;
    }


    /**
     * Gets the corporateProfile value for this Product153.
     * 
     * @return corporateProfile
     */
    public co.ke.transunion.crbws.ws.CorporateProfile getCorporateProfile() {
        return corporateProfile;
    }


    /**
     * Sets the corporateProfile value for this Product153.
     * 
     * @param corporateProfile
     */
    public void setCorporateProfile(co.ke.transunion.crbws.ws.CorporateProfile corporateProfile) {
        this.corporateProfile = corporateProfile;
    }


    /**
     * Gets the creditApplicationList value for this Product153.
     * 
     * @return creditApplicationList
     */
    public co.ke.transunion.crbws.ws.CreditApplication[] getCreditApplicationList() {
        return creditApplicationList;
    }


    /**
     * Sets the creditApplicationList value for this Product153.
     * 
     * @param creditApplicationList
     */
    public void setCreditApplicationList(co.ke.transunion.crbws.ws.CreditApplication[] creditApplicationList) {
        this.creditApplicationList = creditApplicationList;
    }

    public co.ke.transunion.crbws.ws.CreditApplication getCreditApplicationList(int i) {
        return this.creditApplicationList[i];
    }

    public void setCreditApplicationList(int i, co.ke.transunion.crbws.ws.CreditApplication _value) {
        this.creditApplicationList[i] = _value;
    }


    /**
     * Gets the directorList value for this Product153.
     * 
     * @return directorList
     */
    public Director[] getDirectorList() {
        return directorList;
    }


    /**
     * Sets the directorList value for this Product153.
     * 
     * @param directorList
     */
    public void setDirectorList(Director[] directorList) {
        this.directorList = directorList;
    }

    public Director getDirectorList(int i) {
        return this.directorList[i];
    }

    public void setDirectorList(int i, Director _value) {
        this.directorList[i] = _value;
    }


    /**
     * Gets the disputeStatementList value for this Product153.
     * 
     * @return disputeStatementList
     */
    public co.ke.transunion.crbws.ws.DisputeStatement[] getDisputeStatementList() {
        return disputeStatementList;
    }


    /**
     * Sets the disputeStatementList value for this Product153.
     * 
     * @param disputeStatementList
     */
    public void setDisputeStatementList(co.ke.transunion.crbws.ws.DisputeStatement[] disputeStatementList) {
        this.disputeStatementList = disputeStatementList;
    }

    public co.ke.transunion.crbws.ws.DisputeStatement getDisputeStatementList(int i) {
        return this.disputeStatementList[i];
    }

    public void setDisputeStatementList(int i, co.ke.transunion.crbws.ws.DisputeStatement _value) {
        this.disputeStatementList[i] = _value;
    }


    /**
     * Gets the emailList value for this Product153.
     * 
     * @return emailList
     */
    public Email[] getEmailList() {
        return emailList;
    }


    /**
     * Sets the emailList value for this Product153.
     * 
     * @param emailList
     */
    public void setEmailList(Email[] emailList) {
        this.emailList = emailList;
    }

    public Email getEmailList(int i) {
        return this.emailList[i];
    }

    public void setEmailList(int i, Email _value) {
        this.emailList[i] = _value;
    }


    /**
     * Gets the fraudList value for this Product153.
     * 
     * @return fraudList
     */
    public Fraud[] getFraudList() {
        return fraudList;
    }


    /**
     * Sets the fraudList value for this Product153.
     * 
     * @param fraudList
     */
    public void setFraudList(Fraud[] fraudList) {
        this.fraudList = fraudList;
    }

    public Fraud getFraudList(int i) {
        return this.fraudList[i];
    }

    public void setFraudList(int i, Fraud _value) {
        this.fraudList[i] = _value;
    }


    /**
     * Gets the guaranteeList value for this Product153.
     * 
     * @return guaranteeList
     */
    public Guarantee[] getGuaranteeList() {
        return guaranteeList;
    }


    /**
     * Sets the guaranteeList value for this Product153.
     * 
     * @param guaranteeList
     */
    public void setGuaranteeList(Guarantee[] guaranteeList) {
        this.guaranteeList = guaranteeList;
    }

    public Guarantee getGuaranteeList(int i) {
        return this.guaranteeList[i];
    }

    public void setGuaranteeList(int i, Guarantee _value) {
        this.guaranteeList[i] = _value;
    }


    /**
     * Gets the header value for this Product153.
     * 
     * @return header
     */
    public Header getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Product153.
     * 
     * @param header
     */
    public void setHeader(Header header) {
        this.header = header;
    }


    /**
     * Gets the phoneList value for this Product153.
     * 
     * @return phoneList
     */
    public Phone[] getPhoneList() {
        return phoneList;
    }


    /**
     * Sets the phoneList value for this Product153.
     * 
     * @param phoneList
     */
    public void setPhoneList(Phone[] phoneList) {
        this.phoneList = phoneList;
    }

    public Phone getPhoneList(int i) {
        return this.phoneList[i];
    }

    public void setPhoneList(int i, Phone _value) {
        this.phoneList[i] = _value;
    }


    /**
     * Gets the physicalAddressList value for this Product153.
     * 
     * @return physicalAddressList
     */
    public co.ke.transunion.crbws.ws.PhysicalAddress[] getPhysicalAddressList() {
        return physicalAddressList;
    }


    /**
     * Sets the physicalAddressList value for this Product153.
     * 
     * @param physicalAddressList
     */
    public void setPhysicalAddressList(co.ke.transunion.crbws.ws.PhysicalAddress[] physicalAddressList) {
        this.physicalAddressList = physicalAddressList;
    }

    public co.ke.transunion.crbws.ws.PhysicalAddress getPhysicalAddressList(int i) {
        return this.physicalAddressList[i];
    }

    public void setPhysicalAddressList(int i, co.ke.transunion.crbws.ws.PhysicalAddress _value) {
        this.physicalAddressList[i] = _value;
    }


    /**
     * Gets the postalAddressList value for this Product153.
     * 
     * @return postalAddressList
     */
    public co.ke.transunion.crbws.ws.PostalAddress[] getPostalAddressList() {
        return postalAddressList;
    }


    /**
     * Sets the postalAddressList value for this Product153.
     * 
     * @param postalAddressList
     */
    public void setPostalAddressList(co.ke.transunion.crbws.ws.PostalAddress[] postalAddressList) {
        this.postalAddressList = postalAddressList;
    }

    public co.ke.transunion.crbws.ws.PostalAddress getPostalAddressList(int i) {
        return this.postalAddressList[i];
    }

    public void setPostalAddressList(int i, co.ke.transunion.crbws.ws.PostalAddress _value) {
        this.postalAddressList[i] = _value;
    }


    /**
     * Gets the recentEnquiryList value for this Product153.
     * 
     * @return recentEnquiryList
     */
    public co.ke.transunion.crbws.ws.RecentEnquiry[] getRecentEnquiryList() {
        return recentEnquiryList;
    }


    /**
     * Sets the recentEnquiryList value for this Product153.
     * 
     * @param recentEnquiryList
     */
    public void setRecentEnquiryList(co.ke.transunion.crbws.ws.RecentEnquiry[] recentEnquiryList) {
        this.recentEnquiryList = recentEnquiryList;
    }

    public co.ke.transunion.crbws.ws.RecentEnquiry getRecentEnquiryList(int i) {
        return this.recentEnquiryList[i];
    }

    public void setRecentEnquiryList(int i, co.ke.transunion.crbws.ws.RecentEnquiry _value) {
        this.recentEnquiryList[i] = _value;
    }


    /**
     * Gets the responseCode value for this Product153.
     * 
     * @return responseCode
     */
    public Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product153.
     * 
     * @param responseCode
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the shareholderList value for this Product153.
     * 
     * @return shareholderList
     */
    public co.ke.transunion.crbws.ws.Shareholder[] getShareholderList() {
        return shareholderList;
    }


    /**
     * Sets the shareholderList value for this Product153.
     * 
     * @param shareholderList
     */
    public void setShareholderList(co.ke.transunion.crbws.ws.Shareholder[] shareholderList) {
        this.shareholderList = shareholderList;
    }

    public co.ke.transunion.crbws.ws.Shareholder getShareholderList(int i) {
        return this.shareholderList[i];
    }

    public void setShareholderList(int i, co.ke.transunion.crbws.ws.Shareholder _value) {
        this.shareholderList[i] = _value;
    }


    /**
     * Gets the summary value for this Product153.
     * 
     * @return summary
     */
    public co.ke.transunion.crbws.ws.Summary153 getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Product153.
     * 
     * @param summary
     */
    public void setSummary(co.ke.transunion.crbws.ws.Summary153 summary) {
        this.summary = summary;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Product153)) return false;
        Product153 other = (Product153) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountList==null && other.getAccountList()==null) || 
             (this.accountList!=null &&
              java.util.Arrays.equals(this.accountList, other.getAccountList()))) &&
            ((this.alsoKnownAsList==null && other.getAlsoKnownAsList()==null) || 
             (this.alsoKnownAsList!=null &&
              java.util.Arrays.equals(this.alsoKnownAsList, other.getAlsoKnownAsList()))) &&
            ((this.bouncedChequeList==null && other.getBouncedChequeList()==null) || 
             (this.bouncedChequeList!=null &&
              java.util.Arrays.equals(this.bouncedChequeList, other.getBouncedChequeList()))) &&
            ((this.collateralList==null && other.getCollateralList()==null) || 
             (this.collateralList!=null &&
              java.util.Arrays.equals(this.collateralList, other.getCollateralList()))) &&
            ((this.corporateProfile==null && other.getCorporateProfile()==null) || 
             (this.corporateProfile!=null &&
              this.corporateProfile.equals(other.getCorporateProfile()))) &&
            ((this.creditApplicationList==null && other.getCreditApplicationList()==null) || 
             (this.creditApplicationList!=null &&
              java.util.Arrays.equals(this.creditApplicationList, other.getCreditApplicationList()))) &&
            ((this.directorList==null && other.getDirectorList()==null) || 
             (this.directorList!=null &&
              java.util.Arrays.equals(this.directorList, other.getDirectorList()))) &&
            ((this.disputeStatementList==null && other.getDisputeStatementList()==null) || 
             (this.disputeStatementList!=null &&
              java.util.Arrays.equals(this.disputeStatementList, other.getDisputeStatementList()))) &&
            ((this.emailList==null && other.getEmailList()==null) || 
             (this.emailList!=null &&
              java.util.Arrays.equals(this.emailList, other.getEmailList()))) &&
            ((this.fraudList==null && other.getFraudList()==null) || 
             (this.fraudList!=null &&
              java.util.Arrays.equals(this.fraudList, other.getFraudList()))) &&
            ((this.guaranteeList==null && other.getGuaranteeList()==null) || 
             (this.guaranteeList!=null &&
              java.util.Arrays.equals(this.guaranteeList, other.getGuaranteeList()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.phoneList==null && other.getPhoneList()==null) || 
             (this.phoneList!=null &&
              java.util.Arrays.equals(this.phoneList, other.getPhoneList()))) &&
            ((this.physicalAddressList==null && other.getPhysicalAddressList()==null) || 
             (this.physicalAddressList!=null &&
              java.util.Arrays.equals(this.physicalAddressList, other.getPhysicalAddressList()))) &&
            ((this.postalAddressList==null && other.getPostalAddressList()==null) || 
             (this.postalAddressList!=null &&
              java.util.Arrays.equals(this.postalAddressList, other.getPostalAddressList()))) &&
            ((this.recentEnquiryList==null && other.getRecentEnquiryList()==null) || 
             (this.recentEnquiryList!=null &&
              java.util.Arrays.equals(this.recentEnquiryList, other.getRecentEnquiryList()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.shareholderList==null && other.getShareholderList()==null) || 
             (this.shareholderList!=null &&
              java.util.Arrays.equals(this.shareholderList, other.getShareholderList()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAccountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlsoKnownAsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlsoKnownAsList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAlsoKnownAsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBouncedChequeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBouncedChequeList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBouncedChequeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCollateralList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollateralList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCollateralList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorporateProfile() != null) {
            _hashCode += getCorporateProfile().hashCode();
        }
        if (getCreditApplicationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditApplicationList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCreditApplicationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirectorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirectorList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDirectorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisputeStatementList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisputeStatementList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDisputeStatementList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEmailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFraudList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFraudList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFraudList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGuaranteeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuaranteeList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGuaranteeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getPhoneList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPhoneList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhysicalAddressList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalAddressList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPhysicalAddressList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostalAddressList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostalAddressList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPostalAddressList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecentEnquiryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecentEnquiryList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRecentEnquiryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getShareholderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShareholderList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShareholderList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product153.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product153"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alsoKnownAsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alsoKnownAsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "alsoKnownAsCorporate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncedChequeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bouncedChequeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "bouncedCheque"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collateralList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collateralList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "collateral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporateProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "corporateProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditApplicationList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditApplicationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "creditApplication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "director"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputeStatementList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disputeStatementList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "disputeStatement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "email"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fraudList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "fraud"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "guarantee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "header"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "phone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "physicalAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "physicalAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "postalAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recentEnquiryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recentEnquiryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "recentEnquiry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareholderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shareholderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "shareholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary153"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
