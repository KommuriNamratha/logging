
public class Pricing {
public enum material{standard,above_standard,high_standard};
public static int calPrice(String mat,int total_area,boolean auto)
{
mat=mat.replace(' ','_');
int arr[]={1200,1500,1800,2500};
int k=material.valueOf(mat).ordinal();
if(k==2)
   if (auto==false)
        return total_area*arr[k];
else
    return total_area*2500;
return total_area*arr[k];
}
}
