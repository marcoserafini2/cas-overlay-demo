package org.apereo.cas.support.inwebo.web.flow.actions;

/**
 * The webflow constants.
 *
 * @author Jerome LELEU
 * @since 6.4.0
 */
public interface WebflowConstants {
    /**
     * The pending transition.
     */
    String PENDING = "pending";
    /**
     * The push transition.
     */
    String PUSH = "push";
    // custo
    /**
     * The Virtual Authenticator transition.
     */
    String VA = "va";
    /**
     * The mAccessWeb transition.
     */
    String MA = "ma";
    // custo
    /**
     * The select transition.
     */
    String SELECT = "select";

    /**
     * The mustEnroll action.
     */
    String MUST_ENROLL = "mustEnroll";

    /**
     * The inweboSessionId flow scope parameter.
     */
    String INWEBO_SESSION_ID = "inweboSessionId";
    /**
     * The siteAlias flow scope parameter.
     */
    String SITE_ALIAS = "siteAlias";
    /**
     * The siteDescription flow scope parameter.
     */
    String SITE_DESCRIPTION = "siteDescription";
    /**
     * The login flow scope parameter.
     */
    String LOGIN = "login";
    /**
     * The browser authenticator flow scope parameter.
     */
    String BROWSER_AUTHENTICATOR = "browserAuthenticator";
    /**
     * The otp request parameter.
     */
    String OTP = "otp";
    /**
     * The pwd request parameter.
     */
    String PWD = "pwd";
}
