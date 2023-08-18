package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class StockApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockApiGatewayApplication.class, args);
	}

}

//http://laptop-1fne9bq7:4444/api/price/price/policyPrice/LIC
