package designPatterns;

public class GetPlanFactory {
  public Plan getPlan(String planType) {
	  if(planType ==null)
	  {
		  return null;
	  }
	  if(planType.equalsIgnoreCase("DOMESTICPLAN"))
	  {
		  return new DomesticPLan();
	  }
	  else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
		  return new CommercialPlan();  
	  }
  }
}
