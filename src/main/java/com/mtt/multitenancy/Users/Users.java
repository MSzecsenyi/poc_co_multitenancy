package com.mtt.multitenancy.Users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table
public class Users {
    @Column(name="CUSTOMER_FIELD1")
    private String customerField1;
    @Column(name="CUSTOMER_FIELD2")
    private String customerField2;
    @Column(name="CUSTOMER_FIELD3")
    private String customerField3;
    @Column(name="CUSTOMER_FIELD4")
    private String customerField4;
    @Column(name="CUSTOMER_FIELD5")
    private String customerField5;
    @Column(length = 100)
    private String email;
    @Column(name="EMAIL_DAILY_SUM_ABOUTOPENTASKS")
    private Long emailDailySumAboutopentasks;
    @Column(name="EMAIL_WHENNEWTASK")
    private Long emailWhennewtask;
    @Column(name="END_WORKING")
    private Timestamp endWorking;
    @Column(name="GROUP_ID")
    private Long groupId;
    @Column(name="LDAP_AUTHENTICATION")
    private Long ldapAuthentication;
    @Column(name="OFFICE_ID")
    private Long officeId;
    @Column(name="ORG_ID")
    private Long orgId;
    @Column(name="OSS_USERNAME")
    private String ossUsername;
    @Column(name="OUTSORCING_ID")
    private Long outsorcingId;
    @Column(name="PASSWORD_EXPIRE")
    private Timestamp passwordExpire;
    private String reftag;
    @Column(name="SALARY_BASE")
    private Long salaryBase;
    @Column(name="SALARY_MOTIVATING")
    private Long salaryMotivating;
    @Column(name="START_WORKING")
    private Timestamp startWorking;
    @Column(name="SUBSTITUTE_FROM")
    private Timestamp substituteFrom;
    @Column(name="SUBSTITUTE_TO")
    private Timestamp substituteTo;
    @Column(name="SUBSTITUTE_USER_ID")
    private Long substituteUserId;
    @Column(name="SUBSTITUTOR_DEF_USER_ID")
    private Long substitutorDefUserId;
    @Column(name="TABLE_ID", length = 20)
    private String tableId;
    @Column(name="UPPER_USER_ID")
    private Long upperUserId;
    @Column(name="USER_ACCOUNT_DISABLE")
    private Long userAccountDisable;
    @Column(name="USER_CALLMASTER_ID")
    private Long userCallmasterId;
    @Column(name="USER_COMPANY_ID", length = 50)
    private String userCompanyId;
    @Column(name="USER_CONTACT_WHERE", length = 1000)
    private String userContactWhere;
    @Column(name="USER_CONTACT_WHERE_2", length = 1000)
    private String userContactWhere2;
    @Column(name="USER_CONTACT_WHERE_DISPLAY", length = 1000)
    private String userContactWhereDisplay;
    @Column(name="USER_CUSTOMER_WHERE", length = 1000)
    private String userCustomerWhere;
    @Column(name="USER_FULLNAME", length = 80)
    private String userFullname;
    @Id
    @Column(name="USER_ID", nullable = false)
    private Long userId;
    @Column(name="USER_JOB_STATUS")
    private Long userJobStatus;
    @Column(name="USER_NAME", length = 20)
    private String userName;
    @Column(name="USER_PHONE", length = 100)
    private String userPhone;
    @Column(name="USER_REMARK", length = 50)
    private String userRemark;
    /*    @Column(name="USER_SIGNATURE")
        private String userSignature;*/
    @Column(name="WFM_REGISTRATION")
    private Long wfmRegistration;
    @Column(name="WINDOWS_USERNAME")
    private String windowsUsername;
    @Column(name="LANGUAGE_CODE")
    private String languageCode;
    /*  @OneToMany(mappedBy = "users")
      private List<Contact> contactList;
      @OneToMany(mappedBy = "users")
      private List<Process> processList;
  */
    @Column(name="AUTH_METHOD", length = 3)
    private String authMethod;

    @Column(name="PASSWORD_HASH", length = 100)
    private String passwordHash;

    @Column(name="CUSTOMER_PERSON_ID")
    private Long customerPersonId;

    @Column(name = "WRONG_PWD_COUNT")
    private Long wrongPwdCount;
    @Column(name = "WRONG_PWD_DISABLED")
    private String wrongPwdDisabled;

    public Users() {}

    public Users(String customerField1, String customerField2,
                 String customerField3, String customerField4,
                 String customerField5, String email,
                 Long emailDailySumAboutopentasks, Long emailWhennewtask,
                 Timestamp endWorking, Long groupId, Long ldapAuthentication,
                 Long officeId, Long orgId, String ossUsername,
                 Long outsorcingId, Timestamp passwordExpire, String reftag,
                 Long salaryBase, Long salaryMotivating,
                 Timestamp startWorking, Timestamp substituteFrom,
                 Timestamp substituteTo, Long substituteUserId,
                 Long substitutorDefUserId, String tableId, Long upperUserId,
                 Long userAccountDisable, Long userCallmasterId,
                 String userCompanyId, String userContactWhere,
                 String userContactWhere2, String userContactWhereDisplay,
                 String userCustomerWhere, String userFullname, Long userId,
                 Long userJobStatus, String userName, String userPhone,
                 String userRemark, String userSignature, Long wfmRegistration,
                 String windowsUsername, String authMethod, String passwordHash, String languageCode,
                 Long wrongPwdCount, String wrongPwdDisabled) {
        this.customerField1 = customerField1;
        this.customerField2 = customerField2;
        this.customerField3 = customerField3;
        this.customerField4 = customerField4;
        this.customerField5 = customerField5;
        this.email = email;
        this.emailDailySumAboutopentasks = emailDailySumAboutopentasks;
        this.emailWhennewtask = emailWhennewtask;
        this.endWorking = endWorking;
        this.groupId = groupId;
        this.ldapAuthentication = ldapAuthentication;
        this.officeId = officeId;
        this.orgId = orgId;
        this.ossUsername = ossUsername;
        this.outsorcingId = outsorcingId;
        this.passwordExpire = passwordExpire;
        this.reftag = reftag;
        this.salaryBase = salaryBase;
        this.salaryMotivating = salaryMotivating;
        this.startWorking = startWorking;
        this.substituteFrom = substituteFrom;
        this.substituteTo = substituteTo;
        this.substituteUserId = substituteUserId;
        this.substitutorDefUserId = substitutorDefUserId;
        this.tableId = tableId;
        this.upperUserId = upperUserId;
        this.userAccountDisable = userAccountDisable;
        this.userCallmasterId = userCallmasterId;
        this.userCompanyId = userCompanyId;
        this.userContactWhere = userContactWhere;
        this.userContactWhere2 = userContactWhere2;
        this.userContactWhereDisplay = userContactWhereDisplay;
        this.userCustomerWhere = userCustomerWhere;
        this.userFullname = userFullname;
        this.userId = userId;
        this.userJobStatus = userJobStatus;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userRemark = userRemark;
        /*this.userSignature = userSignature;*/
        this.wfmRegistration = wfmRegistration;
        this.windowsUsername = windowsUsername;
        this.authMethod = authMethod;
        this.passwordHash = passwordHash;
        this.languageCode = languageCode;
        this.wrongPwdCount = wrongPwdCount;
        this.wrongPwdDisabled = wrongPwdDisabled;
    }
}
