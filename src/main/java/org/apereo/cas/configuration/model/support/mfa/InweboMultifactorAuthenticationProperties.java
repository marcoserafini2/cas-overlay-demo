package org.apereo.cas.configuration.model.support.mfa;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apereo.cas.configuration.model.core.util.ClientCertificateProperties;
import org.apereo.cas.configuration.support.RequiredProperty;
import org.apereo.cas.configuration.support.RequiresModule;

import java.io.Serial;

/**
 * The Inwebo MFA properties.
 *
 * @author Jerome LELEU
 * @since 6.4.0
 */
@RequiresModule(name = "cas-server-support-inwebo-mfa")
@Getter
@Setter
@Accessors(chain = true)
@JsonFilter("InweboMultifactorProperties")
public class InweboMultifactorAuthenticationProperties extends BaseMultifactorAuthenticationProviderProperties {

    /**
     * Provider id by default.
     */
    public static final String DEFAULT_IDENTIFIER = "mfa-inwebo";

    @Serial
    private static final long serialVersionUID = -942637204816051814L;

    /**
     * The service API url.
     */
    @RequiredProperty
    private String serviceApiUrl = "https://api.myinwebo.com/FS?";

    /**
     * Console admin API url.
     */
    @RequiredProperty
    private String consoleAdminUrl = "https://api.myinwebo.com/v2/services/ConsoleAdmin";

    /**
     * The Inwebo service id.
     */
    @RequiredProperty
    private Long serviceId;

    /**
     * The client certificate.
     */
    @RequiredProperty
    private ClientCertificateProperties clientCertificate = new ClientCertificateProperties();

    /**
     * The alias of the secured site.
     */
    @RequiredProperty
    private String siteAlias;

    /**
     * The description of the secured site.
     */
    private String siteDescription = "my secured site";

    /**
     * Indicates whether this provider should support trusted devices.
     */
    private boolean trustedDeviceEnabled;

    // custo
    /**
     * Whether the push notification (mobile/desktop) is enabled.
     */
    private boolean pushEnabled = true;

    /**
     * The browser authenticator to use (or none)
     */
    private BrowserAuthenticatorTypes browserAuthenticator = BrowserAuthenticatorTypes.M_ACCESS_WEB;

    /**
     * Browser authenticator types.
     */
    public enum BrowserAuthenticatorTypes {
        NONE, VIRTUAL_AUTHENTICATOR, M_ACCESS_WEB
    }
    // custo

    public InweboMultifactorAuthenticationProperties() {
        setId(DEFAULT_IDENTIFIER);
    }
}
