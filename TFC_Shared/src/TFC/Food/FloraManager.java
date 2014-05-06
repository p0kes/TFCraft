package TFC.Food;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import TFC.TFCItems;
import TFC.Core.TFC_Time;

public class FloraManager
{
	private static final FloraManager instance = new FloraManager();
	private List floraList;

	public static final FloraManager getInstance()
	{
		return instance;
	}

	public FloraManager()
	{
		floraList = new ArrayList();
	}

	public void addIndex(FloraIndex index)
	{
		floraList.add(index);
	}

	public FloraIndex findMatchingIndex(String input)
	{
		for (int k = 0; k < floraList.size(); k++)
		{
			FloraIndex tempIndex = (FloraIndex)floraList.get(k);
			if (tempIndex.type.equalsIgnoreCase(input))
			{
				return tempIndex;
			}
		}

		return null;
	}


	static
	{
		instance.addIndex(new FloraIndex("red apple", TFC_Time.April,TFC_Time.May,TFC_Time.October,TFC_Time.November,new ItemStack(TFCItems.RedApple,1)));
		instance.addIndex(new FloraIndex("banana", TFC_Time.April,TFC_Time.May,TFC_Time.September,TFC_Time.September,new ItemStack(TFCItems.Banana,1)));
		instance.addIndex(new FloraIndex("orange", TFC_Time.February,TFC_Time.April,TFC_Time.November,TFC_Time.November,new ItemStack(TFCItems.Orange,1)));
		instance.addIndex(new FloraIndex("green apple", TFC_Time.May,TFC_Time.June,TFC_Time.October,TFC_Time.November,new ItemStack(TFCItems.GreenApple,1)));
		instance.addIndex(new FloraIndex("lemon", TFC_Time.May,TFC_Time.June,TFC_Time.August,TFC_Time.August,new ItemStack(TFCItems.Lemon,1)));
		instance.addIndex(new FloraIndex("olive", TFC_Time.June,TFC_Time.June,TFC_Time.October,TFC_Time.October,new ItemStack(TFCItems.Olive,1)));
		instance.addIndex(new FloraIndex("cherry", TFC_Time.April,TFC_Time.April,TFC_Time.June,TFC_Time.June,new ItemStack(TFCItems.Cherry,1)));
		instance.addIndex(new FloraIndex("peach", TFC_Time.April,TFC_Time.May,TFC_Time.September,TFC_Time.September,new ItemStack(TFCItems.Peach,1)));
		instance.addIndex(new FloraIndex("plum", TFC_Time.May,TFC_Time.June,TFC_Time.July,TFC_Time.August,new ItemStack(TFCItems.Plum,1)));
		//instance.addIndex(new FloraIndex("cacao", TFCSeasons.June,TFCSeasons.June,TFCSeasons.October,TFCSeasons.October,new ItemStack(TFCItems.Cacao,1)));

		//Berry Bushes
		instance.addIndex(new FloraIndex("Wintergreen", TFC_Time.September,TFC_Time.October,
				new ItemStack(TFCItems.WintergreenBerry,1)).setHangTime(5).setTemp(-18, 28).setBioTemp(0, 20).setRain(500,4000).setEVT(0f, 1));
		instance.addIndex(new FloraIndex("Blueberry", TFC_Time.July,TFC_Time.September,
				new ItemStack(TFCItems.Blueberry,1)).setHangTime(2).setTemp(0, 32).setBioTemp(5, 25).setRain(125,1000));
		instance.addIndex(new FloraIndex("Raspberry", TFC_Time.July,TFC_Time.August,
				new ItemStack(TFCItems.Raspberry,1)).setHangTime(2).setTemp(0, 30).setBioTemp(5, 25).setRain(250,2000));
		instance.addIndex(new FloraIndex("Strawberry", TFC_Time.May,TFC_Time.June,
				new ItemStack(TFCItems.Strawberry,1)).setHangTime(2).setTemp(0, 27).setBioTemp(5, 25).setRain(500,2000));
		instance.addIndex(new FloraIndex("Blackberry", TFC_Time.June,TFC_Time.September,
				new ItemStack(TFCItems.Blackberry,1)).setHangTime(2).setTemp(0, 30).setBioTemp(5, 25).setRain(125,4000).setEVT(0.25f, 4));
		instance.addIndex(new FloraIndex("Bunchberry", TFC_Time.July,TFC_Time.September,
				new ItemStack(TFCItems.Bunchberry,1)).setHangTime(2).setTemp(0, 18).setBioTemp(0, 20).setRain(125,2000));
		instance.addIndex(new FloraIndex("Cranberry", TFC_Time.September,TFC_Time.November,
				new ItemStack(TFCItems.Cranberry,1)).setHangTime(3).setTemp(2, 18).setBioTemp(0, 25).setRain(1000,4000));
		instance.addIndex(new FloraIndex("Snowberry", TFC_Time.August,TFC_Time.September,
				new ItemStack(TFCItems.Snowberry,1)).setHangTime(3).setTemp(0, 18).setBioTemp(0, 20).setRain(250,4000).setEVT(0.125f, 4));
		instance.addIndex(new FloraIndex("Elderberry", TFC_Time.August,TFC_Time.September,
				new ItemStack(TFCItems.Elderberry,1)).setHangTime(2).setTemp(0, 28).setBioTemp(5, 25).setRain(250,2000));
		instance.addIndex(new FloraIndex("Gooseberry", TFC_Time.May,TFC_Time.July,
				new ItemStack(TFCItems.Gooseberry,1)).setHangTime(2).setTemp(0, 28).setBioTemp(5, 25).setRain(250,2000));
		instance.addIndex(new FloraIndex("Cloudberry", TFC_Time.July,TFC_Time.August,
				new ItemStack(TFCItems.Cloudberry,1)).setHangTime(2).setTemp(0, 18).setBioTemp(0, 20).setRain(250,1000).setEVT(0.125f, 4));
	}

}
