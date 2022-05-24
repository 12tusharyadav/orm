package dependencyInjuctionWithoutXml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Address {

	@Value("1")

	private int id;
	@Value("tushar")
	private String name;
	
	public String show()
	{
		return "HII";	}
	
}
