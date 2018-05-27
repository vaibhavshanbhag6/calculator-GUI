

public class Calculation extends Exception {
private double ans;
private double product;


public Calculation() {
	super();
	this.ans = 0;
	this.product = 1;
	
}


public void init()
{
	this.ans = 0;
	this.product = 1;
	
}



public void setSum(double a) {
	
	ans=ans+a;
}



public void setProduct(double b) {
	if(ans==0)
	{
	product=product*b;
	ans=product;
	}
	else
	ans=ans*b;
}



public void setDivision(int count,double c) {
	if(count==1)
		ans=c;
	else
		ans=ans/c;
	

}



public void setSubtraction(double a,double d) {
	
	ans=a-d;
	
}

public double getAns()
{
	return ans;
}

public void setAns(double an)
{
	ans=an;
}


}
