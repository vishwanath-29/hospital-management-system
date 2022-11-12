public class Hospital_Exception extends Exception{
    String Message;
    Hospital_Exception(int i)
    {
        if (i==1)
            Message="\nAGE ";
        else if(i==2)
            Message="\nCONTACT NO ";
        if(i==3)
            Message="\nPINCODE ";

    }
}
