package io.github.wesleyosantos91.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.wesleyosantos91.api.InsurancePersonApi;
import io.github.wesleyosantos91.model.ResponseInsurancePerson;
import io.github.wesleyosantos91.model.ResponseInsurancePersonClaims;
import io.github.wesleyosantos91.model.ResponseInsurancePersonMovements;
import io.github.wesleyosantos91.model.ResponseInsurancePersonPolicyInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonController implements InsurancePersonApi {

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();

        return Optional.of(mapper);
    }
    @Override
    public Optional<String> getAcceptHeader() {
        return Optional.of("application/json");
    }

    @Override
    public ResponseEntity<ResponseInsurancePerson> getInsurancePerson(String authorization, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, Integer page, Integer pageSize) {
        return InsurancePersonApi.super.getInsurancePerson(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, page, pageSize);
    }

    @Override
    public ResponseEntity<ResponseInsurancePersonClaims> getInsurancePersonpolicyIdClaims(String authorization, String policyId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent) {
        return InsurancePersonApi.super.getInsurancePersonpolicyIdClaims(authorization, policyId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
    }

    @Override
    public ResponseEntity<ResponseInsurancePersonMovements> getInsurancePersonpolicyIdMovements(String authorization, String policyId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent) {
        return InsurancePersonApi.super.getInsurancePersonpolicyIdMovements(authorization, policyId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
    }

    @Override
    public ResponseEntity<ResponseInsurancePersonPolicyInfo> getInsurancePersonpolicyIdPolicyInfo(String authorization, String policyId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent) {
        return InsurancePersonApi.super.getInsurancePersonpolicyIdPolicyInfo(authorization, policyId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
    }
}
