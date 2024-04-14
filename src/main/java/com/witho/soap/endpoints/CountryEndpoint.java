package com.witho.soap.endpoints;

import com.example.generated.GetCountryRequest;
import com.example.generated.GetCountryResponse;
import com.witho.soap.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class CountryEndpoint {

  private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

  private CountryRepository countryRepository;

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
  @ResponsePayload
  public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
    GetCountryResponse response = new GetCountryResponse();
    response.setCountry(countryRepository.findCountry(request.getName()));

    return response;
  }
}
