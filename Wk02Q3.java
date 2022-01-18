public class Wk02Q3 
{
    public static void main(String[] args) 
    {
        long tms = System.currentTimeMillis();
        long ts = tms/1000; //Total seconds
        long cs = ts%60;    //Current second
        long tm = (ts/60) + (8*60);    //Total minutes GMT +8
        long cm = tm%60;    //Current minute
        long th = tm/60;    //Total hours
        long ch = th%24;    //Current hour

        System.out.print("Current time is " + ch + ":" + cm + ":"+ cs + " GMT");
    }
}
