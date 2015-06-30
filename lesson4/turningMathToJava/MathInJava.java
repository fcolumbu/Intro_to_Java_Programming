// BlueJ project: lesson4/turningMathToJava
// Video: Arithmetic Operations 2

public class MathInJava
{
    /*
       Computes the fraction
           y
       --------
       x(1 + x)
    */
    public double uglyFraction(double x, double y)
    {
        // To do!
    }
      /*
        Computes the fraction

        (a - c)(b - d)
        --------------
        (b - c)(a - d)

        See http://en.wikipedia.org/wiki/Cross-ratio
    */
    public double crossRatio(double a, double b, double c, double d)
    {
        // To do!
        return ((a-c)*(b-d))/((b-c)*(a-d));
    }
    /*
       Computes the fraction

           1
      -----------
           1 - s
       s + -----
             n

      See http://en.wikipedia.org/wiki/Amdahl%27s_law
    */
    public double amdahlSpeedup(double s, double n)
    {
        // To do!
      
        return  1/(s + (1-s)/n);
    }
    
    /*
        Computes the fraction
        2 + x(3x - 4)
        -------------
          (x+2)(x)
    */
    public double uglierFraction(double x)
    {
        // To do!
    }

    /**
        Computes the average of four values.
        @param a the first value
        @param b the second value
        @param c the third value
        @param d the average of a, b, c, and d
    */
    public double average(int a, int b, int c, int d)
    {
        return (a+b+c+d)/4.0;
    }
}
