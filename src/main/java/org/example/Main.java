package org.example;

import com.google.cloud.datacatalog.v1.DataCatalogClient;
import com.google.cloud.datacatalog.v1.DataCatalogSettings;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    try {
      DataCatalogClient client = DataCatalogClient.create(
          DataCatalogSettings.newBuilder().setEndpoint("us-central1-datacatalog.googleapis.com:443")
              .build());
      System.out.println("client: " + client);
    } catch (IOException e) {
      System.out.println("IOException "+e);
    }
  }
}