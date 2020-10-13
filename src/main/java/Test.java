public class Test 
{
    
    public Test()
    {
        System.err.println("Hello");
    }

    /**
     * Main method.
     * 
     * @param args  Optional configuration file and path to the installation 
     *              directory. If not specified, then the user directory is 
     *              assumed and the <code>container.xml</code> is used.
     */
    public static void main(String[] args) 
    {
        new Test();
    }
    
}
