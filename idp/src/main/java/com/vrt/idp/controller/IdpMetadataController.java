package com.vrt.idp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdpMetadataController {

    @GetMapping("/idp/metadata")
    public String metadata() {
        return """
        <EntityDescriptor entityID="http://localhost:8080/idp"
                          xmlns="urn:oasis:names:tc:SAML:2.0:metadata">
            <IDPSSODescriptor>
                <KeyDescriptor>
                    <ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
                        <!-- Public Key for signing/encryption -->
                    </ds:KeyInfo>
                </KeyDescriptor>
                <SingleSignOnService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect"
                                     Location="http://localhost:8080/idp/SSO"/>
            </IDPSSODescriptor>
        </EntityDescriptor>
        """;
    }
}
