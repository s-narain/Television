//Selina Narain March 24 2020

public class Television
{
    private String manufacturer;
    private int screenSize;
    private boolean powerOn;
    private int channel;
    private int volume;
    
    public Television(String brand, int size)
    {
        manufacturer = brand;
        screenSize = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    
    public int getVolume()
    {
        return volume;
    }
    
    public int getChannel()
    {
        return channel;
    }
    
    public String getManufacturer()
    {
        return manufacturer;
    }
    
    public int getScreenSize()
    {
        return screenSize;
    }
    
    public void power()
    {
        //powerOn = !powerOn; ---OR
        
        if (powerOn == true)
        powerOn = false;
        else
        powerOn = true;
    }
    
    public void setChannel(int station)
    {
        channel = station;
    }
   
    public void increaseVolume()
    {
        volume = volume + 1;
    }
        
    public void decreaseVolume()
    {
        volume = volume - 1;
    }
}
