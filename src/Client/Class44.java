package Client;
import Client.sign.signlink;


public final class Class44
{

    public Class44(int i, byte abyte0[])
    {
        aByte723 = 0;
        anInt724 = 9;
        anInt725 = -29508;
        if(i != 44820)
        {
            throw new NullPointerException();
        } else
        {
            method570(abyte0, aByte723);
            return;
        }
    }

    private void method570(byte abyte0[], byte byte0)
    {
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(abyte0, 891);
        int i = class30_sub2_sub2.method412();
        int j = class30_sub2_sub2.method412();
        if(j != i)
        {
            byte abyte1[] = new byte[i];
            Class13.method225(abyte1, i, abyte0, j, 6);
            aByteArray726 = abyte1;
            class30_sub2_sub2 = new Class30_Sub2_Sub2(aByteArray726, 891);
            aBoolean732 = true;
        } else
        {
            aByteArray726 = abyte0;
            aBoolean732 = false;
        }
        nDBEntries = class30_sub2_sub2.method410();
        if(byte0 != 0)
            return;
        anIntArray728 = new int[nDBEntries];
        anIntArray729 = new int[nDBEntries];
        anIntArray730 = new int[nDBEntries];
        anIntArray731 = new int[nDBEntries];
        int k = class30_sub2_sub2.anInt1406 + nDBEntries * 10;
        for(int l = 0; l < nDBEntries; l++)
        {
            anIntArray728[l] = class30_sub2_sub2.method413();
            anIntArray729[l] = class30_sub2_sub2.method412();
            anIntArray730[l] = class30_sub2_sub2.method412();
            anIntArray731[l] = k;
            k += anIntArray730[l];
        }

    }
    
    /**
     * Looks like this loads things from the cache
     * @param cacheName The specific part of the cache to load
     * @param dbData
     * @return
     */
    public byte[] loadCache(String cacheName, byte dbData[])
    {
        int i = 0;
        cacheName = cacheName.toUpperCase();
        for(int j = 0; j < cacheName.length(); j++)
            i = (i * 61 + cacheName.charAt(j)) - 32;

        for(int entry = 0; entry < nDBEntries; entry++)
            if(anIntArray728[entry] == i)
            {
                if(dbData == null)
                    dbData = new byte[anIntArray729[entry]];
                if(!aBoolean732)
                {
                    Class13.method225(dbData, anIntArray729[entry], aByteArray726, anIntArray730[entry], anIntArray731[entry]);
                } else
                {
                    for(int l = 0; l < anIntArray729[entry]; l++)
                        dbData[l] = aByteArray726[anIntArray731[entry] + l];

                }
				return dbData;
            }

        return null;
    }

    private byte aByte723;
    private int anInt724;
    private int anInt725;
    public byte aByteArray726[];
    public int nDBEntries;
    public int anIntArray728[];
    public int anIntArray729[];
    public int anIntArray730[];
    public int anIntArray731[];
    private boolean aBoolean732;
}
