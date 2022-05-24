package dependencyInjuctionWithoutXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("test")
public class TestImpl implements Test  {
	
    @Autowired
	private Address address;
	

	public void setAddress(Address address) {
		this.address = address;
	}
    public void display1()
    {
    	System.out.println("student is reading book");
    }
	@Override
	public void display() {
		System.out.println(address.getName());
		
	}
	



	

}
