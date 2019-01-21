/**
 * Product108.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product108  implements java.io.Serializable {
    private Account[] accountList;

    private co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList;

    private co.ke.transunion.crbws.ws.BouncedCheque[] bouncedChequeList;

    private Collateral[] collateralList;

    private co.ke.transunion.crbws.ws.CreditApplication[] creditApplicationList;

    private co.ke.transunion.crbws.ws.DirectorShip[] directorshipList;

    private co.ke.transunion.crbws.ws.DisputeStatement[] disputeStatementList;

    private Email[] emailList;

    private Employment[] employmentList;

    private Fraud[] fraudList;

    private Guarantor[] guarantorList;

    private Header header;

    private co.ke.transunion.crbws.ws.PersonalProfile personalProfile;

    private Phone[] phoneList;

    private co.ke.transunion.crbws.ws.PhysicalAddress[] physicalAddressList;

    private co.ke.transunion.crbws.ws.PostalAddress[] postalAddressList;

    private co.ke.transunion.crbws.ws.RecentEnquiry[] recentEnquiryList;

    private Integer responseCode;

    private co.ke.transunion.crbws.ws.Shareholding[] shareholdingList;

    private co.ke.transunion.crbws.ws.Summary108 summary;

    public Product108() {
    }

    public Product108(
           Account[] accountList,
           co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList,
           co.ke.transunion.crbws.ws.BouncedCheque[] bouncedChequeList,
           Collateral[] collateralList,
           co.ke.transunion.crbws.ws.CreditApplication[] creditApplicationList,
           co.ke.transunion.crbws.ws.DirectorShip[] directorshipList,
           co.ke.transunion.crbws.ws.DisputeStatement[] disputeStatementList,
           Email[] emailList,
           Employment[] employmentList,
           Fraud[] fraudList,
           Guarantor[] guarantorList,
           Header header,
           co.ke.transunion.crbws.ws.PersonalProfile personalProfile,
           Phone[] phoneList,
           co.ke.transunion.crbws.ws.PhysicalAddress[] physicalAddressList,
           co.ke.transunion.crbws.ws.PostalAddress[] postalAddressList,
           co.ke.transunion.crbws.ws.RecentEnquiry[] recentEnquiryList,
           Integer responseCode,
           co.ke.transunion.crbws.ws.Shareholding[] shareholdingList,
           co.ke.transunion.crbws.ws.Summary108 summary) {
           this.accountList = accountList;
           this.alsoKnownAsList = alsoKnownAsList;
           this.bouncedChequeList = bouncedChequeList;
           this.collateralList = collateralList;
           this.creditApplicationList = creditApplicationList;
           this.directorshipList = directorshipList;
           this.disputeStatementList = disputeStatementList;
           this.emailList = emailList;
           this.employmentList = employmentList;
           this.fraudList = fraudList;
           this.guarantorList = guarantorList;
           this.header = header;
           this.personalProfile = personalProfile;
           this.phoneList = phoneList;
           this.physicalAddressList = physicalAddressList;
           this.postalAddressList = postalAddressList;
           this.recentEnquiryList = recentEnquiryList;
           this.responseCode = responseCode;
           this.shareholdingList = shareholdingList;
           this.summary = summary;
    }


    /**
     * Gets the accountList value for this Product108.
     * 
     * @return accountList
     */
    public Account[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this Product108.
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
     * Gets the alsoKnownAsList value for this Product108.
     * 
     * @return alsoKnownAsList
     */
    public co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] getAlsoKnownAsList() {
        return alsoKnownAsList;
    }


    /**
     * Sets the alsoKnownAsList value for this Product108.
     * 
     * @param alsoKnownAsList
     */
    public void setAlsoKnownAsList(co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList) {
        this.alsoKnownAsList = alsoKnownAsList;
    }

    public co.ke.transunion.crbws.ws.AlsoKnownAsConsumer getAlsoKnownAsList(int i) {
        return this.alsoKnownAsList[i];
    }

    public void setAlsoKnownAsList(int i, co.ke.transunion.crbws.ws.AlsoKnownAsConsumer _value) {
        this.alsoKnownAsList[i] = _value;
    }


    /**
     * Gets the bouncedChequeList value for this Product108.
     * 
     * @return bouncedChequeList
     */
    public co.ke.transunion.crbws.ws.BouncedCheque[] getBouncedChequeList() {
        return bouncedChequeList;
    }


    /**
     * Sets the bouncedChequeList value for this Product108.
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
     * Gets the collateralList value for this Product108.
     * 
     * @return collateralList
     */
    public Collateral[] getCollateralList() {
        return collateralList;
    }


    /**
     * Sets the collateralList value for this Product108.
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
     * Gets the creditApplicationList value for this Product108.
     * 
     * @return creditApplicationList
     */
    public co.ke.transunion.crbws.ws.CreditApplication[] getCreditApplicationList() {
        return creditApplicationList;
    }


    /**
     * Sets the creditApplicationList value for this Product108.
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
     * Gets the directorshipList value for this Product108.
     * 
     * @return directorshipList
     */
    public co.ke.transunion.crbws.ws.DirectorShip[] getDirectorshipList() {
        return directorshipList;
    }


    /**
     * Sets the directorshipList value for this Product108.
     * 
     * @param directorshipList
     */
    public void setDirectorshipList(co.ke.transunion.crbws.ws.DirectorShip[] directorshipList) {
        this.directorshipList = directorshipList;
    }

    public co.ke.transunion.crbws.ws.DirectorShip getDirectorshipList(int i) {
        return this.directorshipList[i];
    }

    public void setDirectorshipList(int i, co.ke.transunion.crbws.ws.DirectorShip _value) {
        this.directorshipList[i] = _value;
    }


    /**
     * Gets the disputeStatementList value for this Product108.
     * 
     * @return disputeStatementList
     */
    public co.ke.transunion.crbws.ws.DisputeStatement[] getDisputeStatementList() {
        return disputeStatementList;
    }


    /**
     * Sets the disputeStatementList value for this Product108.
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
     * Gets the emailList value for this Product108.
     * 
     * @return emailList
     */
    public Email[] getEmailList() {
        return emailList;
    }


    /**
     * Sets the emailList value for this Product108.
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
     * Gets the employmentList value for this Product108.
     * 
     * @return employmentList
     */
    public Employment[] getEmploymentList() {
        return employmentList;
    }


    /**
     * Sets the employmentList value for this Product108.
     * 
     * @param employmentList
     */
    public void setEmploymentList(Employment[] employmentList) {
        this.employmentList = employmentList;
    }

    public Employment getEmploymentList(int i) {
        return this.employmentList[i];
    }

    public void setEmploymentList(int i, Employment _value) {
        this.employmentList[i] = _value;
    }


    /**
     * Gets the fraudList value for this Product108.
     * 
     * @return fraudList
     */
    public Fraud[] getFraudList() {
        return fraudList;
    }


    /**
     * Sets the fraudList value for this Product108.
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
     * Gets the guarantorList value for this Product108.
     * 
     * @return guarantorList
     */
    public Guarantor[] getGuarantorList() {
        return guarantorList;
    }


    /**
     * Sets the guarantorList value for this Product108.
     * 
     * @param guarantorList
     */
    public void setGuarantorList(Guarantor[] guarantorList) {
        this.guarantorList = guarantorList;
    }

    public Guarantor getGuarantorList(int i) {
        return this.guarantorList[i];
    }

    public void setGuarantorList(int i, Guarantor _value) {
        this.guarantorList[i] = _value;
    }


    /**
     * Gets the header value for this Product108.
     * 
     * @return header
     */
    public Header getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Product108.
     * 
     * @param header
     */
    public void setHeader(Header header) {
        this.header = header;
    }


    /**
     * Gets the personalProfile value for this Product108.
     * 
     * @return personalProfile
     */
    public co.ke.transunion.crbws.ws.PersonalProfile getPersonalProfile() {
        return personalProfile;
    }


    /**
     * Sets the personalProfile value for this Product108.
     * 
     * @param personalProfile
     */
    public void setPersonalProfile(co.ke.transunion.crbws.ws.PersonalProfile personalProfile) {
        this.personalProfile = personalProfile;
    }


    /**
     * Gets the phoneList value for this Product108.
     * 
     * @return phoneList
     */
    public Phone[] getPhoneList() {
        return phoneList;
    }


    /**
     * Sets the phoneList value for this Product108.
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
     * Gets the physicalAddressList value for this Product108.
     * 
     * @return physicalAddressList
     */
    public co.ke.transunion.crbws.ws.PhysicalAddress[] getPhysicalAddressList() {
        return physicalAddressList;
    }


    /**
     * Sets the physicalAddressList value for this Product108.
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
     * Gets the postalAddressList value for this Product108.
     * 
     * @return postalAddressList
     */
    public co.ke.transunion.crbws.ws.PostalAddress[] getPostalAddressList() {
        return postalAddressList;
    }


    /**
     * Sets the postalAddressList value for this Product108.
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
     * Gets the recentEnquiryList value for this Product108.
     * 
     * @return recentEnquiryList
     */
    public co.ke.transunion.crbws.ws.RecentEnquiry[] getRecentEnquiryList() {
        return recentEnquiryList;
    }


    /**
     * Sets the recentEnquiryList value for this Product108.
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
     * Gets the responseCode value for this Product108.
     * 
     * @return responseCode
     */
    public Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product108.
     * 
     * @param responseCode
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the shareholdingList value for this Product108.
     * 
     * @return shareholdingList
     */
    public co.ke.transunion.crbws.ws.Shareholding[] getShareholdingList() {
        return shareholdingList;
    }


    /**
     * Sets the shareholdingList value for this Product108.
     * 
     * @param shareholdingList
     */
    public void setShareholdingList(co.ke.transunion.crbws.ws.Shareholding[] shareholdingList) {
        this.shareholdingList = shareholdingList;
    }

    public co.ke.transunion.crbws.ws.Shareholding getShareholdingList(int i) {
        return this.shareholdingList[i];
    }

    public void setShareholdingList(int i, co.ke.transunion.crbws.ws.Shareholding _value) {
        this.shareholdingList[i] = _value;
    }


    /**
     * Gets the summary value for this Product108.
     * 
     * @return summary
     */
    public co.ke.transunion.crbws.ws.Summary108 getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Product108.
     * 
     * @param summary
     */
    public void setSummary(co.ke.transunion.crbws.ws.Summary108 summary) {
        this.summary = summary;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Product108)) return false;
        Product108 other = (Product108) obj;
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
            ((this.creditApplicationList==null && other.getCreditApplicationList()==null) || 
             (this.creditApplicationList!=null &&
              java.util.Arrays.equals(this.creditApplicationList, other.getCreditApplicationList()))) &&
            ((this.directorshipList==null && other.getDirectorshipList()==null) || 
             (this.directorshipList!=null &&
              java.util.Arrays.equals(this.directorshipList, other.getDirectorshipList()))) &&
            ((this.disputeStatementList==null && other.getDisputeStatementList()==null) || 
             (this.disputeStatementList!=null &&
              java.util.Arrays.equals(this.disputeStatementList, other.getDisputeStatementList()))) &&
            ((this.emailList==null && other.getEmailList()==null) || 
             (this.emailList!=null &&
              java.util.Arrays.equals(this.emailList, other.getEmailList()))) &&
            ((this.employmentList==null && other.getEmploymentList()==null) || 
             (this.employmentList!=null &&
              java.util.Arrays.equals(this.employmentList, other.getEmploymentList()))) &&
            ((this.fraudList==null && other.getFraudList()==null) || 
             (this.fraudList!=null &&
              java.util.Arrays.equals(this.fraudList, other.getFraudList()))) &&
            ((this.guarantorList==null && other.getGuarantorList()==null) || 
             (this.guarantorList!=null &&
              java.util.Arrays.equals(this.guarantorList, other.getGuarantorList()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.personalProfile==null && other.getPersonalProfile()==null) || 
             (this.personalProfile!=null &&
              this.personalProfile.equals(other.getPersonalProfile()))) &&
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
            ((this.shareholdingList==null && other.getShareholdingList()==null) || 
             (this.shareholdingList!=null &&
              java.util.Arrays.equals(this.shareholdingList, other.getShareholdingList()))) &&
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
        if (getDirectorshipList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirectorshipList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDirectorshipList(), i);
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
        if (getEmploymentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmploymentList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEmploymentList(), i);
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
        if (getGuarantorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuarantorList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGuarantorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getPersonalProfile() != null) {
            _hashCode += getPersonalProfile().hashCode();
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
        if (getShareholdingList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShareholdingList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShareholdingList(), i);
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
        new org.apache.axis.description.TypeDesc(Product108.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product108"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "alsoKnownAsConsumer"));
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
        elemField.setFieldName("creditApplicationList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditApplicationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "creditApplication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directorshipList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directorshipList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "directorShip"));
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
        elemField.setFieldName("employmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "employment"));
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
        elemField.setFieldName("guarantorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guarantorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "guarantor"));
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
        elemField.setFieldName("personalProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "personalProfile"));
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
        elemField.setFieldName("shareholdingList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shareholdingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "shareholding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary108"));
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
