package JavaBasics;

public class OverridingDrive {
	
	public static void main(String[] args) {
		
		OverridingParent p = new OverridingParent();
		OverridingChild c = new OverridingChild();
		OverridingParent pc = new OverridingChild();
		p.education();
		c.features();
		pc.education();
		
	}

}
