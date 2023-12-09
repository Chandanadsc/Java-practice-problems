package functionsAndEtc;

class FullTime  {
    private double basic, da, hra,gsalary;
    
    public FullTime(double basic) {
        
        this.basic =basic;
    }
    
    public void calculate() {
        this.da = this.basic * 0.4;
        this.hra = this.basic * 0.25;
       gsalary = this.basic + this.hra + this.da;
    }
    
    public String toString() {
        String output = "gross salary=" + gsalary + " basic=" + this.basic + " hra=" + this.hra + " da=" + this.da;
        return output;
    }
}